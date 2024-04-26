package org.jaxen.javabean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jaxen.BaseXPath;
import org.jaxen.Context;

public class JavaBeanXPath extends BaseXPath {
    public JavaBeanXPath(String str) {
        super(str, DocumentNavigator.getInstance());
    }

    public Object evaluate(Object obj) {
        Object evaluate = super.evaluate(obj);
        if (evaluate instanceof Element) {
            return ((Element) evaluate).getObject();
        }
        if (!(evaluate instanceof Collection)) {
            return evaluate;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (Collection) evaluate) {
            if (next instanceof Element) {
                next = ((Element) next).getObject();
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public Context getContext(Object obj) {
        if (obj instanceof Context) {
            return (Context) obj;
        }
        if (obj instanceof Element) {
            return super.getContext(obj);
        }
        if (!(obj instanceof List)) {
            return super.getContext(new Element((Element) null, "root", obj));
        }
        ArrayList arrayList = new ArrayList();
        for (Object element : (List) obj) {
            arrayList.add(new Element((Element) null, "root", element));
        }
        return super.getContext(arrayList);
    }
}
