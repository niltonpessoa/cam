package org.jaxen;

import java.io.Serializable;
import java.util.List;
import org.jaxen.expr.Expr;
import org.jaxen.expr.XPathExpr;
import org.jaxen.function.BooleanFunction;
import org.jaxen.function.NumberFunction;
import org.jaxen.function.StringFunction;
import org.jaxen.saxpath.SAXPathException;
import org.jaxen.saxpath.XPathReader;
import org.jaxen.saxpath.XPathSyntaxException;
import org.jaxen.saxpath.helpers.XPathReaderFactory;
import org.jaxen.util.SingletonList;

public class BaseXPath implements XPath, Serializable {
    private String exprText;
    private Navigator navigator;
    private ContextSupport support;
    private XPathExpr xpath;

    protected BaseXPath(String str) {
        try {
            XPathReader createReader = XPathReaderFactory.createReader();
            JaxenHandler jaxenHandler = new JaxenHandler();
            createReader.setXPathHandler(jaxenHandler);
            createReader.parse(str);
            this.xpath = jaxenHandler.getXPathExpr();
            this.exprText = str;
        } catch (XPathSyntaxException e) {
            throw new XPathSyntaxException(e);
        } catch (SAXPathException e2) {
            throw new JaxenException((Throwable) e2);
        }
    }

    public BaseXPath(String str, Navigator navigator2) {
        this(str);
        this.navigator = navigator2;
    }

    public void addNamespace(String str, String str2) {
        NamespaceContext namespaceContext = getNamespaceContext();
        if (namespaceContext instanceof SimpleNamespaceContext) {
            ((SimpleNamespaceContext) namespaceContext).addNamespace(str, str2);
            return;
        }
        throw new JaxenException("Operation not permitted while using a custom namespace context.");
    }

    public boolean booleanValueOf(Object obj) {
        Context context = getContext(obj);
        List selectNodesForContext = selectNodesForContext(context);
        if (selectNodesForContext == null) {
            return false;
        }
        return BooleanFunction.evaluate(selectNodesForContext, context.getNavigator()).booleanValue();
    }

    /* access modifiers changed from: protected */
    public FunctionContext createFunctionContext() {
        return XPathFunctionContext.getInstance();
    }

    /* access modifiers changed from: protected */
    public NamespaceContext createNamespaceContext() {
        return new SimpleNamespaceContext();
    }

    /* access modifiers changed from: protected */
    public VariableContext createVariableContext() {
        return new SimpleVariableContext();
    }

    public String debug() {
        return this.xpath.toString();
    }

    public Object evaluate(Object obj) {
        List selectNodes = selectNodes(obj);
        if (selectNodes != null && selectNodes.size() == 1) {
            Object obj2 = selectNodes.get(0);
            if ((obj2 instanceof String) || (obj2 instanceof Number) || (obj2 instanceof Boolean)) {
                return obj2;
            }
        }
        return selectNodes;
    }

    /* access modifiers changed from: protected */
    public Context getContext(Object obj) {
        if (obj instanceof Context) {
            return (Context) obj;
        }
        Context context = new Context(getContextSupport());
        if (obj instanceof List) {
            context.setNodeSet((List) obj);
        } else {
            context.setNodeSet(new SingletonList(obj));
        }
        return context;
    }

    /* access modifiers changed from: protected */
    public ContextSupport getContextSupport() {
        if (this.support == null) {
            this.support = new ContextSupport(createNamespaceContext(), createFunctionContext(), createVariableContext(), getNavigator());
        }
        return this.support;
    }

    public FunctionContext getFunctionContext() {
        FunctionContext functionContext = getContextSupport().getFunctionContext();
        if (functionContext != null) {
            return functionContext;
        }
        FunctionContext createFunctionContext = createFunctionContext();
        getContextSupport().setFunctionContext(createFunctionContext);
        return createFunctionContext;
    }

    public NamespaceContext getNamespaceContext() {
        NamespaceContext namespaceContext = getContextSupport().getNamespaceContext();
        if (namespaceContext != null) {
            return namespaceContext;
        }
        NamespaceContext createNamespaceContext = createNamespaceContext();
        getContextSupport().setNamespaceContext(createNamespaceContext);
        return createNamespaceContext;
    }

    public Navigator getNavigator() {
        return this.navigator;
    }

    public Expr getRootExpr() {
        return this.xpath.getRootExpr();
    }

    public VariableContext getVariableContext() {
        VariableContext variableContext = getContextSupport().getVariableContext();
        if (variableContext != null) {
            return variableContext;
        }
        VariableContext createVariableContext = createVariableContext();
        getContextSupport().setVariableContext(createVariableContext);
        return createVariableContext;
    }

    public Number numberValueOf(Object obj) {
        Context context = getContext(obj);
        return NumberFunction.evaluate(selectSingleNodeForContext(context), context.getNavigator());
    }

    public List selectNodes(Object obj) {
        return selectNodesForContext(getContext(obj));
    }

    /* access modifiers changed from: protected */
    public List selectNodesForContext(Context context) {
        return this.xpath.asList(context);
    }

    public Object selectSingleNode(Object obj) {
        List selectNodes = selectNodes(obj);
        if (selectNodes.isEmpty()) {
            return null;
        }
        return selectNodes.get(0);
    }

    /* access modifiers changed from: protected */
    public Object selectSingleNodeForContext(Context context) {
        List selectNodesForContext = selectNodesForContext(context);
        if (selectNodesForContext.isEmpty()) {
            return null;
        }
        return selectNodesForContext.get(0);
    }

    public void setFunctionContext(FunctionContext functionContext) {
        getContextSupport().setFunctionContext(functionContext);
    }

    public void setNamespaceContext(NamespaceContext namespaceContext) {
        getContextSupport().setNamespaceContext(namespaceContext);
    }

    public void setVariableContext(VariableContext variableContext) {
        getContextSupport().setVariableContext(variableContext);
    }

    public String stringValueOf(Object obj) {
        Context context = getContext(obj);
        Object selectSingleNodeForContext = selectSingleNodeForContext(context);
        return selectSingleNodeForContext == null ? "" : StringFunction.evaluate(selectSingleNodeForContext, context.getNavigator());
    }

    public String toString() {
        return this.exprText;
    }

    public String valueOf(Object obj) {
        return stringValueOf(obj);
    }
}
