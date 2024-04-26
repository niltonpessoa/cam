package org.jaxen;

import java.util.Iterator;
import org.jaxen.util.AncestorAxisIterator;
import org.jaxen.util.AncestorOrSelfAxisIterator;
import org.jaxen.util.DescendantAxisIterator;
import org.jaxen.util.DescendantOrSelfAxisIterator;
import org.jaxen.util.FollowingAxisIterator;
import org.jaxen.util.FollowingSiblingAxisIterator;
import org.jaxen.util.PrecedingAxisIterator;
import org.jaxen.util.PrecedingSiblingAxisIterator;
import org.jaxen.util.SelfAxisIterator;

public abstract class DefaultNavigator implements Navigator {
    public Iterator getAncestorAxisIterator(Object obj) {
        return new AncestorAxisIterator(obj, this);
    }

    public Iterator getAncestorOrSelfAxisIterator(Object obj) {
        return new AncestorOrSelfAxisIterator(obj, this);
    }

    public Iterator getAttributeAxisIterator(Object obj) {
        throw new UnsupportedAxisException("attribute");
    }

    public Iterator getChildAxisIterator(Object obj) {
        throw new UnsupportedAxisException("child");
    }

    public Iterator getDescendantAxisIterator(Object obj) {
        return new DescendantAxisIterator(obj, (Navigator) this);
    }

    public Iterator getDescendantOrSelfAxisIterator(Object obj) {
        return new DescendantOrSelfAxisIterator(obj, this);
    }

    public Object getDocument(String str) {
        return null;
    }

    public Object getDocumentNode(Object obj) {
        return null;
    }

    public Object getElementById(Object obj, String str) {
        return null;
    }

    public Iterator getFollowingAxisIterator(Object obj) {
        return new FollowingAxisIterator(obj, this);
    }

    public Iterator getFollowingSiblingAxisIterator(Object obj) {
        return new FollowingSiblingAxisIterator(obj, this);
    }

    public Iterator getNamespaceAxisIterator(Object obj) {
        throw new UnsupportedAxisException("namespace");
    }

    public short getNodeType(Object obj) {
        if (isElement(obj)) {
            return 1;
        }
        if (isAttribute(obj)) {
            return 2;
        }
        if (isText(obj)) {
            return 3;
        }
        if (isComment(obj)) {
            return 8;
        }
        if (isDocument(obj)) {
            return 9;
        }
        return isProcessingInstruction(obj) ? (short) 7 : 14;
    }

    public Iterator getParentAxisIterator(Object obj) {
        throw new UnsupportedAxisException("parent");
    }

    public Object getParentNode(Object obj) {
        Iterator parentAxisIterator = getParentAxisIterator(obj);
        if (parentAxisIterator == null || !parentAxisIterator.hasNext()) {
            return null;
        }
        return parentAxisIterator.next();
    }

    public Iterator getPrecedingAxisIterator(Object obj) {
        return new PrecedingAxisIterator(obj, this);
    }

    public Iterator getPrecedingSiblingAxisIterator(Object obj) {
        return new PrecedingSiblingAxisIterator(obj, this);
    }

    public String getProcessingInstructionData(Object obj) {
        return null;
    }

    public String getProcessingInstructionTarget(Object obj) {
        return null;
    }

    public Iterator getSelfAxisIterator(Object obj) {
        return new SelfAxisIterator(obj);
    }

    public String translateNamespacePrefixToUri(String str, Object obj) {
        return null;
    }
}
