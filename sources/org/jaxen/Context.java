package org.jaxen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Context implements Serializable {
    private ContextSupport contextSupport;
    private List nodeSet = Collections.EMPTY_LIST;
    private int position;
    private int size;

    public Context(ContextSupport contextSupport2) {
        this.contextSupport = contextSupport2;
    }

    public Context duplicate() {
        Context context = new Context(getContextSupport());
        List nodeSet2 = getNodeSet();
        if (nodeSet2 != null) {
            ArrayList arrayList = new ArrayList(nodeSet2.size());
            arrayList.addAll(nodeSet2);
            context.setNodeSet(arrayList);
        }
        return context;
    }

    public ContextSupport getContextSupport() {
        return this.contextSupport;
    }

    public Function getFunction(String str, String str2, String str3) {
        return getContextSupport().getFunction(str, str2, str3);
    }

    public Navigator getNavigator() {
        return getContextSupport().getNavigator();
    }

    public List getNodeSet() {
        return this.nodeSet;
    }

    public int getPosition() {
        return this.position;
    }

    public int getSize() {
        return this.size;
    }

    public Object getVariableValue(String str, String str2, String str3) {
        return getContextSupport().getVariableValue(str, str2, str3);
    }

    public void setContextSupport(ContextSupport contextSupport2) {
        this.contextSupport = contextSupport2;
    }

    public void setNodeSet(List list) {
        this.nodeSet = list;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public String translateNamespacePrefixToUri(String str) {
        return getContextSupport().translateNamespacePrefixToUri(str);
    }
}
