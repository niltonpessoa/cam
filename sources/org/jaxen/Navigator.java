package org.jaxen;

import java.io.Serializable;
import java.util.Iterator;

public interface Navigator extends Serializable {
    Iterator getAncestorAxisIterator(Object obj);

    Iterator getAncestorOrSelfAxisIterator(Object obj);

    Iterator getAttributeAxisIterator(Object obj);

    String getAttributeName(Object obj);

    String getAttributeNamespaceUri(Object obj);

    String getAttributeQName(Object obj);

    String getAttributeStringValue(Object obj);

    Iterator getChildAxisIterator(Object obj);

    String getCommentStringValue(Object obj);

    Iterator getDescendantAxisIterator(Object obj);

    Iterator getDescendantOrSelfAxisIterator(Object obj);

    Object getDocument(String str);

    Object getDocumentNode(Object obj);

    Object getElementById(Object obj, String str);

    String getElementName(Object obj);

    String getElementNamespaceUri(Object obj);

    String getElementQName(Object obj);

    String getElementStringValue(Object obj);

    Iterator getFollowingAxisIterator(Object obj);

    Iterator getFollowingSiblingAxisIterator(Object obj);

    Iterator getNamespaceAxisIterator(Object obj);

    String getNamespacePrefix(Object obj);

    String getNamespaceStringValue(Object obj);

    short getNodeType(Object obj);

    Iterator getParentAxisIterator(Object obj);

    Object getParentNode(Object obj);

    Iterator getPrecedingAxisIterator(Object obj);

    Iterator getPrecedingSiblingAxisIterator(Object obj);

    String getProcessingInstructionData(Object obj);

    String getProcessingInstructionTarget(Object obj);

    Iterator getSelfAxisIterator(Object obj);

    String getTextStringValue(Object obj);

    boolean isAttribute(Object obj);

    boolean isComment(Object obj);

    boolean isDocument(Object obj);

    boolean isElement(Object obj);

    boolean isNamespace(Object obj);

    boolean isProcessingInstruction(Object obj);

    boolean isText(Object obj);

    XPath parseXPath(String str);

    String translateNamespacePrefixToUri(String str, Object obj);
}
