package org.dom4j.rule.pattern;

import org.dom4j.Node;
import org.dom4j.NodeFilter;
import org.dom4j.rule.Pattern;

public class DefaultPattern implements Pattern {
    private NodeFilter filter;

    public DefaultPattern(NodeFilter nodeFilter) {
        this.filter = nodeFilter;
    }

    public short getMatchType() {
        return 0;
    }

    public String getMatchesNodeName() {
        return null;
    }

    public double getPriority() {
        return 0.5d;
    }

    public Pattern[] getUnionPatterns() {
        return null;
    }

    public boolean matches(Node node) {
        return this.filter.matches(node);
    }
}
