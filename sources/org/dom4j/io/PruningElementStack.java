package org.dom4j.io;

import org.dom4j.Element;
import org.dom4j.ElementHandler;

class PruningElementStack extends ElementStack {
    private ElementHandler elementHandler;
    private int matchingElementIndex;
    private String[] path;

    public PruningElementStack(String[] strArr, ElementHandler elementHandler2) {
        this.path = strArr;
        this.elementHandler = elementHandler2;
        checkPath();
    }

    public PruningElementStack(String[] strArr, ElementHandler elementHandler2, int i) {
        super(i);
        this.path = strArr;
        this.elementHandler = elementHandler2;
        checkPath();
    }

    private void checkPath() {
        String[] strArr = this.path;
        if (strArr.length >= 2) {
            this.matchingElementIndex = strArr.length - 2;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Invalid path of length: ");
        stringBuffer.append(this.path.length);
        stringBuffer.append(" it must be greater than 2");
        throw new RuntimeException(stringBuffer.toString());
    }

    /* access modifiers changed from: protected */
    public void pathMatches(Element element, Element element2) {
        this.elementHandler.onEnd(this);
        element.remove(element2);
    }

    public Element popElement() {
        Element popElement = super.popElement();
        int i = this.lastElementIndex;
        if (i == this.matchingElementIndex && i >= 0 && validElement(popElement, i + 1)) {
            int i2 = 0;
            Element element = null;
            Element element2 = null;
            while (true) {
                if (i2 > this.lastElementIndex) {
                    element = element2;
                    break;
                }
                element2 = this.stack[i2];
                if (!validElement(element2, i2)) {
                    break;
                }
                i2++;
            }
            if (element != null) {
                pathMatches(element, popElement);
            }
        }
        return popElement;
    }

    /* access modifiers changed from: protected */
    public boolean validElement(Element element, int i) {
        String str = this.path[i];
        String name = element.getName();
        if (str == name) {
            return true;
        }
        if (str == null || name == null) {
            return false;
        }
        return str.equals(name);
    }
}
