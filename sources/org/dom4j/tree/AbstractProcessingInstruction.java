package org.dom4j.tree;

import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.dom4j.Element;
import org.dom4j.ProcessingInstruction;
import org.dom4j.Visitor;

public abstract class AbstractProcessingInstruction extends AbstractNode implements ProcessingInstruction {
    private String getName(StringTokenizer stringTokenizer) {
        StringBuffer stringBuffer = new StringBuffer(stringTokenizer.nextToken());
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("=")) {
                break;
            }
            stringBuffer.append(nextToken);
        }
        return stringBuffer.toString().trim();
    }

    private String getValue(StringTokenizer stringTokenizer) {
        String nextToken = stringTokenizer.nextToken();
        StringBuffer stringBuffer = new StringBuffer();
        while (stringTokenizer.hasMoreTokens() && !nextToken.equals("'") && !nextToken.equals("\"")) {
            nextToken = stringTokenizer.nextToken();
        }
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken2 = stringTokenizer.nextToken();
            if (nextToken.equals(nextToken2)) {
                break;
            }
            stringBuffer.append(nextToken2);
        }
        return stringBuffer.toString();
    }

    public void accept(Visitor visitor) {
        visitor.visit((ProcessingInstruction) this);
    }

    public String asXML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<?");
        stringBuffer.append(getName());
        stringBuffer.append(" ");
        stringBuffer.append(getText());
        stringBuffer.append("?>");
        return stringBuffer.toString();
    }

    public String getName() {
        return getTarget();
    }

    public short getNodeType() {
        return 7;
    }

    public String getPath(Element element) {
        Element parent = getParent();
        if (parent == null || parent == element) {
            return "processing-instruction()";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(parent.getPath(element));
        stringBuffer.append("/processing-instruction()");
        return stringBuffer.toString();
    }

    public String getUniquePath(Element element) {
        Element parent = getParent();
        if (parent == null || parent == element) {
            return "processing-instruction()";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(parent.getUniquePath(element));
        stringBuffer.append("/processing-instruction()");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    public Map parseValues(String str) {
        HashMap hashMap = new HashMap();
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ='\"", true);
        while (stringTokenizer.hasMoreTokens()) {
            String name = getName(stringTokenizer);
            if (stringTokenizer.hasMoreTokens()) {
                hashMap.put(name, getValue(stringTokenizer));
            }
        }
        return hashMap;
    }

    public boolean removeValue(String str) {
        return false;
    }

    public void setName(String str) {
        setTarget(str);
    }

    public void setValue(String str, String str2) {
        throw new UnsupportedOperationException("This PI is read-only and cannot be modified");
    }

    public void setValues(Map map) {
        throw new UnsupportedOperationException("This PI is read-only and cannot be modified");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" [ProcessingInstruction: &");
        stringBuffer.append(getName());
        stringBuffer.append(";]");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    public String toString(Map map) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry entry : map.entrySet()) {
            stringBuffer.append((String) entry.getKey());
            stringBuffer.append("=\"");
            stringBuffer.append((String) entry.getValue());
            stringBuffer.append("\" ");
        }
        stringBuffer.setLength(stringBuffer.length() - 1);
        return stringBuffer.toString();
    }

    public void write(Writer writer) {
        writer.write("<?");
        writer.write(getName());
        writer.write(" ");
        writer.write(getText());
        writer.write("?>");
    }
}
