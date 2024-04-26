package org.dom4j.io;

import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;

class SAXModifyElementHandler implements ElementHandler {
    private ElementModifier elemModifier;
    private Element modifiedElement;

    public SAXModifyElementHandler(ElementModifier elementModifier) {
        this.elemModifier = elementModifier;
    }

    /* access modifiers changed from: protected */
    public Element getModifiedElement() {
        return this.modifiedElement;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066 A[Catch:{ Exception -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onEnd(org.dom4j.ElementPath r5) {
        /*
            r4 = this;
            org.dom4j.Element r0 = r5.getCurrent()     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Element r1 = r0.getParent()     // Catch:{ Exception -> 0x0071 }
            if (r1 == 0) goto L_0x003b
            java.lang.Object r2 = r0.clone()     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Element r2 = (org.dom4j.Element) r2     // Catch:{ Exception -> 0x0071 }
            org.dom4j.io.ElementModifier r3 = r4.elemModifier     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Element r2 = r3.modifyElement(r2)     // Catch:{ Exception -> 0x0071 }
            r4.modifiedElement = r2     // Catch:{ Exception -> 0x0071 }
            if (r2 == 0) goto L_0x0037
            org.dom4j.Element r3 = r0.getParent()     // Catch:{ Exception -> 0x0071 }
            r2.setParent(r3)     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Element r2 = r4.modifiedElement     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Document r3 = r0.getDocument()     // Catch:{ Exception -> 0x0071 }
            r2.setDocument(r3)     // Catch:{ Exception -> 0x0071 }
            int r2 = r1.indexOf(r0)     // Catch:{ Exception -> 0x0071 }
            java.util.List r1 = r1.content()     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Element r3 = r4.modifiedElement     // Catch:{ Exception -> 0x0071 }
            r1.set(r2, r3)     // Catch:{ Exception -> 0x0071 }
        L_0x0037:
            r0.detach()     // Catch:{ Exception -> 0x0071 }
            goto L_0x0062
        L_0x003b:
            boolean r1 = r0.isRootElement()     // Catch:{ Exception -> 0x0071 }
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r0.clone()     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Element r1 = (org.dom4j.Element) r1     // Catch:{ Exception -> 0x0071 }
            org.dom4j.io.ElementModifier r2 = r4.elemModifier     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Element r1 = r2.modifyElement(r1)     // Catch:{ Exception -> 0x0071 }
            r4.modifiedElement = r1     // Catch:{ Exception -> 0x0071 }
            if (r1 == 0) goto L_0x0037
            org.dom4j.Document r2 = r0.getDocument()     // Catch:{ Exception -> 0x0071 }
            r1.setDocument(r2)     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Document r1 = r0.getDocument()     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Element r2 = r4.modifiedElement     // Catch:{ Exception -> 0x0071 }
            r1.setRootElement(r2)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0037
        L_0x0062:
            boolean r0 = r5 instanceof org.dom4j.io.ElementStack     // Catch:{ Exception -> 0x0071 }
            if (r0 == 0) goto L_0x0070
            org.dom4j.io.ElementStack r5 = (org.dom4j.io.ElementStack) r5     // Catch:{ Exception -> 0x0071 }
            r5.popElement()     // Catch:{ Exception -> 0x0071 }
            org.dom4j.Element r0 = r4.modifiedElement     // Catch:{ Exception -> 0x0071 }
            r5.pushElement(r0)     // Catch:{ Exception -> 0x0071 }
        L_0x0070:
            return
        L_0x0071:
            r5 = move-exception
            org.dom4j.io.SAXModifyException r0 = new org.dom4j.io.SAXModifyException
            r0.<init>(r5)
            goto L_0x0079
        L_0x0078:
            throw r0
        L_0x0079:
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.io.SAXModifyElementHandler.onEnd(org.dom4j.ElementPath):void");
    }

    public void onStart(ElementPath elementPath) {
        this.modifiedElement = elementPath.getCurrent();
    }
}
