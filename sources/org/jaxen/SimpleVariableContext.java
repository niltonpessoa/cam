package org.jaxen;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SimpleVariableContext implements VariableContext, Serializable {
    private Map variables = new HashMap();

    public Object getVariableValue(String str, String str2, String str3) {
        QualifiedName qualifiedName = new QualifiedName(str, str3);
        if (this.variables.containsKey(qualifiedName)) {
            return this.variables.get(qualifiedName);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Variable {");
        stringBuffer.append(str);
        stringBuffer.append("}");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str3);
        throw new UnresolvableException(stringBuffer.toString());
    }

    public void setVariableValue(String str, Object obj) {
        this.variables.put(new QualifiedName((String) null, str), obj);
    }

    public void setVariableValue(String str, String str2, Object obj) {
        this.variables.put(new QualifiedName(str, str2), obj);
    }
}
