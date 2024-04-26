package org.dom4j.tree;

import java.io.Writer;
import org.dom4j.Comment;
import org.dom4j.Element;
import org.dom4j.Visitor;

public abstract class AbstractComment extends AbstractCharacterData implements Comment {
    public void accept(Visitor visitor) {
        visitor.visit((Comment) this);
    }

    public String asXML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<!--");
        stringBuffer.append(getText());
        stringBuffer.append("-->");
        return stringBuffer.toString();
    }

    public short getNodeType() {
        return 8;
    }

    public String getPath(Element element) {
        Element parent = getParent();
        if (parent == null || parent == element) {
            return "comment()";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(parent.getPath(element));
        stringBuffer.append("/comment()");
        return stringBuffer.toString();
    }

    public String getUniquePath(Element element) {
        Element parent = getParent();
        if (parent == null || parent == element) {
            return "comment()";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(parent.getUniquePath(element));
        stringBuffer.append("/comment()");
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" [Comment: \"");
        stringBuffer.append(getText());
        stringBuffer.append("\"]");
        return stringBuffer.toString();
    }

    public void write(Writer writer) {
        writer.write("<!--");
        writer.write(getText());
        writer.write("-->");
    }
}
