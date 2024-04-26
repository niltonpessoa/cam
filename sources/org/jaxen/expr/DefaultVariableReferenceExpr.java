package org.jaxen.expr;

import org.jaxen.Context;

class DefaultVariableReferenceExpr extends DefaultExpr implements VariableReferenceExpr {
    private String prefix;
    private String variableName;

    public DefaultVariableReferenceExpr(String str, String str2) {
        this.prefix = str;
        this.variableName = str2;
    }

    public void accept(Visitor visitor) {
        visitor.visit((VariableReferenceExpr) this);
    }

    public Object evaluate(Context context) {
        return context.getVariableValue(context.translateNamespacePrefixToUri(getPrefix()), getPrefix(), getVariableName());
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getText() {
        String prefix2 = getPrefix();
        if (prefix2 == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("$");
            stringBuffer.append(getVariableName());
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("$");
        stringBuffer2.append(prefix2);
        stringBuffer2.append(":");
        stringBuffer2.append(getVariableName());
        return stringBuffer2.toString();
    }

    public String getVariableName() {
        return this.variableName;
    }

    public String toString() {
        StringBuffer stringBuffer;
        String str = "[(DefaultVariableReferenceExpr): ";
        if (getPrefix() == null) {
            stringBuffer = new StringBuffer();
        } else {
            stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(getPrefix());
            str = ":";
        }
        stringBuffer.append(str);
        stringBuffer.append(getVariableName());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
