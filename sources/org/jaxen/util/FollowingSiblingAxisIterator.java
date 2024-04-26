package org.jaxen.util;

import java.util.Iterator;
import org.jaxen.Navigator;

public class FollowingSiblingAxisIterator implements Iterator {
    private Object contextNode;
    private Navigator navigator;
    private Iterator siblingIter;

    public FollowingSiblingAxisIterator(Object obj, Navigator navigator2) {
        this.contextNode = obj;
        this.navigator = navigator2;
        init();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0012 A[LOOP:0: B:3:0x0012->B:6:0x0026, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void init() {
        /*
            r2 = this;
            org.jaxen.Navigator r0 = r2.navigator
            java.lang.Object r1 = r2.contextNode
            java.lang.Object r0 = r0.getParentNode(r1)
            if (r0 == 0) goto L_0x0029
            org.jaxen.Navigator r1 = r2.navigator
            java.util.Iterator r0 = r1.getChildAxisIterator(r0)
            r2.siblingIter = r0
        L_0x0012:
            java.util.Iterator r0 = r2.siblingIter
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0031
            java.util.Iterator r0 = r2.siblingIter
            java.lang.Object r0 = r0.next()
            java.lang.Object r1 = r2.contextNode
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0012
            goto L_0x0031
        L_0x0029:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.Iterator r0 = r0.iterator()
            r2.siblingIter = r0
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jaxen.util.FollowingSiblingAxisIterator.init():void");
    }

    public boolean hasNext() {
        return this.siblingIter.hasNext();
    }

    public Object next() {
        return this.siblingIter.next();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
