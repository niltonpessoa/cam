package org.dom4j.tree;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import org.dom4j.CDATA;
import org.dom4j.Visitor;

public abstract class AbstractCDATA extends AbstractCharacterData implements CDATA {
    public void accept(Visitor visitor) {
        visitor.visit((CDATA) this);
    }

    public String asXML() {
        StringWriter stringWriter = new StringWriter();
        try {
            write(stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public short getNodeType() {
        return 4;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" [CDATA: \"");
        stringBuffer.append(getText());
        stringBuffer.append("\"]");
        return stringBuffer.toString();
    }

    public void write(Writer writer) {
        writer.write("<![CDATA[");
        if (getText() != null) {
            writer.write(getText());
        }
        writer.write("]]>");
    }
}
