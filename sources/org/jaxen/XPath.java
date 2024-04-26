package org.jaxen;

import java.util.List;

public interface XPath {
    void addNamespace(String str, String str2);

    boolean booleanValueOf(Object obj);

    Object evaluate(Object obj);

    FunctionContext getFunctionContext();

    NamespaceContext getNamespaceContext();

    Navigator getNavigator();

    VariableContext getVariableContext();

    Number numberValueOf(Object obj);

    List selectNodes(Object obj);

    Object selectSingleNode(Object obj);

    void setFunctionContext(FunctionContext functionContext);

    void setNamespaceContext(NamespaceContext namespaceContext);

    void setVariableContext(VariableContext variableContext);

    String stringValueOf(Object obj);

    String valueOf(Object obj);
}
