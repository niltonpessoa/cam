package org.dom4j.io;

import java.util.ArrayList;
import java.util.HashMap;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

class DispatchHandler implements ElementHandler {
    private boolean atRoot = true;
    private ElementHandler defaultHandler;
    private ArrayList handlerStack = new ArrayList();
    private HashMap handlers = new HashMap();
    private String path = "/";
    private ArrayList pathStack = new ArrayList();

    public void addHandler(String str, ElementHandler elementHandler) {
        this.handlers.put(str, elementHandler);
    }

    public boolean containsHandler(String str) {
        return this.handlers.containsKey(str);
    }

    public int getActiveHandlerCount() {
        return this.handlerStack.size();
    }

    public ElementHandler getHandler(String str) {
        return (ElementHandler) this.handlers.get(str);
    }

    public String getPath() {
        return this.path;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEnd(org.dom4j.ElementPath r5) {
        /*
            r4 = this;
            java.util.HashMap r0 = r4.handlers
            r1 = 1
            if (r0 == 0) goto L_0x0025
            java.lang.String r2 = r4.path
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0025
            java.util.HashMap r0 = r4.handlers
            java.lang.String r2 = r4.path
            java.lang.Object r0 = r0.get(r2)
            org.dom4j.ElementHandler r0 = (org.dom4j.ElementHandler) r0
            java.util.ArrayList r2 = r4.handlerStack
            int r3 = r2.size()
            int r3 = r3 - r1
            r2.remove(r3)
        L_0x0021:
            r0.onEnd(r5)
            goto L_0x0032
        L_0x0025:
            java.util.ArrayList r0 = r4.handlerStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0032
            org.dom4j.ElementHandler r0 = r4.defaultHandler
            if (r0 == 0) goto L_0x0032
            goto L_0x0021
        L_0x0032:
            java.util.ArrayList r5 = r4.pathStack
            int r0 = r5.size()
            int r0 = r0 - r1
            java.lang.Object r5 = r5.remove(r0)
            java.lang.String r5 = (java.lang.String) r5
            r4.path = r5
            java.util.ArrayList r5 = r4.pathStack
            int r5 = r5.size()
            if (r5 != 0) goto L_0x004b
            r4.atRoot = r1
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.io.DispatchHandler.onEnd(org.dom4j.ElementPath):void");
    }

    public void onStart(ElementPath elementPath) {
        ElementHandler elementHandler;
        Element current = elementPath.getCurrent();
        this.pathStack.add(this.path);
        if (this.atRoot) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.path);
            stringBuffer.append(current.getName());
            this.path = stringBuffer.toString();
            this.atRoot = false;
        } else {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.path);
            stringBuffer2.append("/");
            stringBuffer2.append(current.getName());
            this.path = stringBuffer2.toString();
        }
        HashMap hashMap = this.handlers;
        if (hashMap != null && hashMap.containsKey(this.path)) {
            elementHandler = (ElementHandler) this.handlers.get(this.path);
            this.handlerStack.add(elementHandler);
        } else if (!this.handlerStack.isEmpty() || (elementHandler = this.defaultHandler) == null) {
            return;
        }
        elementHandler.onStart(elementPath);
    }

    public ElementHandler removeHandler(String str) {
        return (ElementHandler) this.handlers.remove(str);
    }

    public void resetHandlers() {
        this.atRoot = true;
        this.path = "/";
        this.pathStack.clear();
        this.handlerStack.clear();
        this.handlers.clear();
        this.defaultHandler = null;
    }

    public void setDefaultHandler(ElementHandler elementHandler) {
        this.defaultHandler = elementHandler;
    }
}
