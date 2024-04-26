package org.dom4j.rule;

import java.util.List;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.XPath;

public class Stylesheet {
    private String modeName;
    private RuleManager ruleManager = new RuleManager();

    public void addRule(Rule rule) {
        this.ruleManager.addRule(rule);
    }

    public void applyTemplates(Object obj) {
        applyTemplates(obj, this.modeName);
    }

    public void applyTemplates(Object obj, String str) {
        Object obj2;
        Mode mode = this.ruleManager.getMode(str);
        int i = 0;
        if (obj instanceof Element) {
            Element element = (Element) obj;
            int nodeCount = element.nodeCount();
            while (i < nodeCount) {
                mode.fireRule(element.node(i));
                i++;
            }
        } else if (obj instanceof Document) {
            Document document = (Document) obj;
            int nodeCount2 = document.nodeCount();
            while (i < nodeCount2) {
                mode.fireRule(document.node(i));
                i++;
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            while (i < size) {
                Object obj3 = list.get(i);
                if (obj3 instanceof Element) {
                    obj2 = (Element) obj3;
                } else if (obj3 instanceof Document) {
                    obj2 = (Document) obj3;
                } else {
                    i++;
                }
                applyTemplates(obj2, str);
                i++;
            }
        }
    }

    public void applyTemplates(Object obj, XPath xPath) {
        applyTemplates(obj, xPath, this.modeName);
    }

    public void applyTemplates(Object obj, XPath xPath, String str) {
        Mode mode = this.ruleManager.getMode(str);
        for (Node fireRule : xPath.selectNodes(obj)) {
            mode.fireRule(fireRule);
        }
    }

    public void applyTemplates(Object obj, org.jaxen.XPath xPath) {
        applyTemplates(obj, xPath, this.modeName);
    }

    public void applyTemplates(Object obj, org.jaxen.XPath xPath, String str) {
        Mode mode = this.ruleManager.getMode(str);
        for (Node fireRule : xPath.selectNodes(obj)) {
            mode.fireRule(fireRule);
        }
    }

    public void clear() {
        this.ruleManager.clear();
    }

    public String getModeName() {
        return this.modeName;
    }

    public Action getValueOfAction() {
        return this.ruleManager.getValueOfAction();
    }

    public void removeRule(Rule rule) {
        this.ruleManager.removeRule(rule);
    }

    public void run(Object obj) {
        run(obj, this.modeName);
    }

    public void run(Object obj, String str) {
        if (obj instanceof Node) {
            run((Node) obj, str);
        } else if (obj instanceof List) {
            run((List) obj, str);
        }
    }

    public void run(List list) {
        run(list, this.modeName);
    }

    public void run(List list, String str) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj instanceof Node) {
                run((Node) obj, str);
            }
        }
    }

    public void run(Node node) {
        run(node, this.modeName);
    }

    public void run(Node node, String str) {
        this.ruleManager.getMode(str).fireRule(node);
    }

    public void setModeName(String str) {
        this.modeName = str;
    }

    public void setValueOfAction(Action action) {
        this.ruleManager.setValueOfAction(action);
    }
}
