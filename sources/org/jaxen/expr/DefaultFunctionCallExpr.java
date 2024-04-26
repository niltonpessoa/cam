package org.jaxen.expr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jaxen.Context;

public class DefaultFunctionCallExpr extends DefaultExpr implements FunctionCallExpr {
    private String functionName;
    private List parameters = new ArrayList();
    private String prefix;

    public DefaultFunctionCallExpr(String str, String str2) {
        this.prefix = str;
        this.functionName = str2;
    }

    public void accept(Visitor visitor) {
        visitor.visit((FunctionCallExpr) this);
    }

    public void addParameter(Expr expr) {
        this.parameters.add(expr);
    }

    public Object evaluate(Context context) {
        return context.getFunction(context.translateNamespacePrefixToUri(getPrefix()), getPrefix(), getFunctionName()).call(context, evaluateParams(context));
    }

    public List evaluateParams(Context context) {
        List parameters2 = getParameters();
        int size = parameters2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(((Expr) parameters2.get(i)).evaluate(context));
        }
        return arrayList;
    }

    public String getFunctionName() {
        return this.functionName;
    }

    public List getParameters() {
        return this.parameters;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getText() {
        StringBuffer stringBuffer = new StringBuffer();
        String prefix2 = getPrefix();
        if (prefix2 != null && prefix2.length() > 0) {
            stringBuffer.append(prefix2);
            stringBuffer.append(":");
        }
        stringBuffer.append(getFunctionName());
        stringBuffer.append("(");
        Iterator it = getParameters().iterator();
        while (it.hasNext()) {
            stringBuffer.append(((Expr) it.next()).getText());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public Expr simplify() {
        List parameters2 = getParameters();
        int size = parameters2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(((Expr) parameters2.get(i)).simplify());
        }
        this.parameters = arrayList;
        return this;
    }

    public String toString() {
        StringBuffer stringBuffer;
        String str = "[(DefaultFunctionCallExpr): ";
        if (getPrefix() == null) {
            stringBuffer = new StringBuffer();
        } else {
            stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(getPrefix());
            str = ":";
        }
        stringBuffer.append(str);
        stringBuffer.append(getFunctionName());
        stringBuffer.append("(");
        stringBuffer.append(getParameters());
        stringBuffer.append(") ]");
        return stringBuffer.toString();
    }
}
