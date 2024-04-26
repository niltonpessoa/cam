package org.jaxen;

import java.util.HashMap;

public class SimpleFunctionContext implements FunctionContext {
    private HashMap functions = new HashMap();

    public Function getFunction(String str, String str2, String str3) {
        QualifiedName qualifiedName = new QualifiedName(str, str3);
        if (this.functions.containsKey(qualifiedName)) {
            return (Function) this.functions.get(qualifiedName);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Function ");
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str3);
        throw new UnresolvableException(stringBuffer.toString());
    }

    public void registerFunction(String str, String str2, Function function) {
        this.functions.put(new QualifiedName(str, str2), function);
    }
}
