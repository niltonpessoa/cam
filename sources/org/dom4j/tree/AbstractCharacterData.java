package org.dom4j.tree;

import org.dom4j.CharacterData;
import org.dom4j.Element;

public abstract class AbstractCharacterData extends AbstractNode implements CharacterData {
    public void appendText(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getText());
        stringBuffer.append(str);
        setText(stringBuffer.toString());
    }

    public String getPath(Element element) {
        Element parent = getParent();
        if (parent == null || parent == element) {
            return "text()";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(parent.getPath(element));
        stringBuffer.append("/text()");
        return stringBuffer.toString();
    }

    public String getUniquePath(Element element) {
        Element parent = getParent();
        if (parent == null || parent == element) {
            return "text()";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(parent.getUniquePath(element));
        stringBuffer.append("/text()");
        return stringBuffer.toString();
    }
}
