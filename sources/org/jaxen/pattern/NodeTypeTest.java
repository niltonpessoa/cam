package org.jaxen.pattern;

import org.jaxen.Context;

public class NodeTypeTest extends NodeTest {
    public static final NodeTypeTest ATTRIBUTE_TEST = new NodeTypeTest(2);
    public static final NodeTypeTest COMMENT_TEST = new NodeTypeTest(8);
    public static final NodeTypeTest DOCUMENT_TEST = new NodeTypeTest(9);
    public static final NodeTypeTest ELEMENT_TEST = new NodeTypeTest(1);
    public static final NodeTypeTest NAMESPACE_TEST = new NodeTypeTest(13);
    public static final NodeTypeTest PROCESSING_INSTRUCTION_TEST = new NodeTypeTest(7);
    public static final NodeTypeTest TEXT_TEST = new NodeTypeTest(3);
    private short nodeType;

    public NodeTypeTest(short s) {
        this.nodeType = s;
    }

    public short getMatchType() {
        return this.nodeType;
    }

    public double getPriority() {
        return -0.5d;
    }

    public String getText() {
        short s = this.nodeType;
        return s != 1 ? s != 2 ? s != 3 ? s != 7 ? s != 8 ? s != 9 ? s != 13 ? "" : "namespace()" : "/" : "comment()" : "processing-instruction()" : "text()" : "@*" : "child()";
    }

    public boolean matches(Object obj, Context context) {
        return this.nodeType == context.getNavigator().getNodeType(obj);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append("[ type: ");
        stringBuffer.append(this.nodeType);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }
}
