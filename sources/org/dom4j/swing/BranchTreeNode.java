package org.dom4j.swing;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.TreeNode;
import org.dom4j.Branch;
import org.dom4j.CharacterData;
import org.dom4j.Node;

public class BranchTreeNode extends LeafTreeNode {
    protected List children;

    public BranchTreeNode() {
    }

    public BranchTreeNode(TreeNode treeNode, Branch branch) {
        super(treeNode, branch);
    }

    public BranchTreeNode(Branch branch) {
        super(branch);
    }

    public Enumeration children() {
        return new Enumeration() {
            private int index = -1;

            public boolean hasMoreElements() {
                return this.index + 1 < BranchTreeNode.this.getChildCount();
            }

            public Object nextElement() {
                BranchTreeNode branchTreeNode = BranchTreeNode.this;
                int i = this.index + 1;
                this.index = i;
                return branchTreeNode.getChildAt(i);
            }
        };
    }

    /* access modifiers changed from: protected */
    public List createChildList() {
        String text;
        Branch xmlBranch = getXmlBranch();
        int nodeCount = xmlBranch.nodeCount();
        ArrayList arrayList = new ArrayList(nodeCount);
        for (int i = 0; i < nodeCount; i++) {
            Node node = xmlBranch.node(i);
            if (!(node instanceof CharacterData) || ((text = node.getText()) != null && text.trim().length() > 0)) {
                arrayList.add(createChildTreeNode(node));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public TreeNode createChildTreeNode(Node node) {
        return node instanceof Branch ? new BranchTreeNode(this, (Branch) node) : new LeafTreeNode(this, node);
    }

    public boolean getAllowsChildren() {
        return true;
    }

    public TreeNode getChildAt(int i) {
        return (TreeNode) getChildList().get(i);
    }

    public int getChildCount() {
        return getChildList().size();
    }

    /* access modifiers changed from: protected */
    public List getChildList() {
        if (this.children == null) {
            this.children = createChildList();
        }
        return this.children;
    }

    public int getIndex(TreeNode treeNode) {
        return getChildList().indexOf(treeNode);
    }

    /* access modifiers changed from: protected */
    public Branch getXmlBranch() {
        return (Branch) this.xmlNode;
    }

    public boolean isLeaf() {
        return getXmlBranch().nodeCount() <= 0;
    }

    public String toString() {
        return this.xmlNode.getName();
    }
}
