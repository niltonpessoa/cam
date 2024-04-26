package org.jaxen.function.ext;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.jaxen.Context;
import org.jaxen.Function;
import org.jaxen.Navigator;
import org.jaxen.function.StringFunction;

public class MatrixConcatFunction implements Function {

    public static class MatrixEnum implements Enumeration {
        private int m_currIdx = -1;
        private int m_maxSize = 0;
        private ArrayList m_source;

        public MatrixEnum(ArrayList arrayList) {
            this.m_source = arrayList;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int size = ((ArrayList) it.next()).size();
                if (size > this.m_maxSize) {
                    this.m_maxSize = size;
                }
            }
        }

        public MatrixEnum(ArrayList arrayList, int i) {
            this.m_source = arrayList;
            this.m_maxSize = i;
        }

        public boolean hasMoreElements() {
            int i = this.m_maxSize;
            if (i == 0) {
                return false;
            }
            int i2 = this.m_currIdx + 1;
            this.m_currIdx = i2;
            return i2 < i;
        }

        public Object nextElement() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.m_source.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = (ArrayList) it.next();
                int size = arrayList2.size();
                int i = this.m_currIdx;
                arrayList.add(i < size ? arrayList2.get(i) : size > 0 ? arrayList2.get(size - 1) : "");
            }
            return arrayList;
        }
    }

    public static Object evaluate(List list, Navigator navigator) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            ArrayList arrayList2 = new ArrayList();
            if (next instanceof List) {
                List list2 = (List) next;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(StringFunction.evaluate(list2.get(i), navigator));
                }
            } else {
                arrayList2.add(StringFunction.evaluate(next, navigator));
            }
            arrayList.add(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        MatrixEnum matrixEnum = new MatrixEnum(arrayList);
        while (matrixEnum.hasMoreElements()) {
            Object nextElement = matrixEnum.nextElement();
            if (nextElement instanceof List) {
                StringBuffer stringBuffer = new StringBuffer(127);
                for (Object append : (List) nextElement) {
                    stringBuffer.append(append);
                }
                nextElement = stringBuffer.toString();
            }
            arrayList3.add(nextElement);
        }
        return arrayList3;
    }

    public Object call(Context context, List list) {
        if (list.size() >= 2) {
            return evaluate(list, context.getNavigator());
        }
        return null;
    }
}
