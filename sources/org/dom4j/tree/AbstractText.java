package org.dom4j.tree;

import java.io.Writer;
import org.dom4j.Text;
import org.dom4j.Visitor;

public abstract class AbstractText extends AbstractCharacterData implements Text {
    public void accept(Visitor visitor) {
        visitor.visit((Text) this);
    }

    public String asXML() {
        return getText();
    }

    public short getNodeType() {
        return 3;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" [Text: \"");
        stringBuffer.append(getText());
        stringBuffer.append("\"]");
        return stringBuffer.toString();
    }

    public void write(Writer writer) {
        writer.write(getText());
    }
}
