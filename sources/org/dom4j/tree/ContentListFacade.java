package org.dom4j.tree;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.dom4j.IllegalAddException;
import org.dom4j.Node;

public class ContentListFacade extends AbstractList {
    private AbstractBranch branch;
    private List branchContent;

    public ContentListFacade(AbstractBranch abstractBranch, List list) {
        this.branch = abstractBranch;
        this.branchContent = list;
    }

    public void add(int i, Object obj) {
        this.branch.childAdded(asNode(obj));
        this.branchContent.add(i, obj);
    }

    public boolean add(Object obj) {
        this.branch.childAdded(asNode(obj));
        return this.branchContent.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        int size = this.branchContent.size();
        for (Object add : collection) {
            add(i, add);
            size--;
            i++;
        }
        return size == this.branchContent.size();
    }

    public boolean addAll(Collection collection) {
        int size = this.branchContent.size();
        for (Object add : collection) {
            add(add);
            size++;
        }
        return size == this.branchContent.size();
    }

    /* access modifiers changed from: protected */
    public Node asNode(Object obj) {
        if (obj instanceof Node) {
            return (Node) obj;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("This list must contain instances of Node. Invalid type: ");
        stringBuffer.append(obj);
        throw new IllegalAddException(stringBuffer.toString());
    }

    public void clear() {
        Iterator it = iterator();
        while (it.hasNext()) {
            this.branch.childRemoved(asNode(it.next()));
        }
        this.branchContent.clear();
    }

    public boolean contains(Object obj) {
        return this.branchContent.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.branchContent.containsAll(collection);
    }

    public Object get(int i) {
        return this.branchContent.get(i);
    }

    /* access modifiers changed from: protected */
    public List getBackingList() {
        return this.branchContent;
    }

    public int indexOf(Object obj) {
        return this.branchContent.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.branchContent.isEmpty();
    }

    public int lastIndexOf(Object obj) {
        return this.branchContent.lastIndexOf(obj);
    }

    public Object remove(int i) {
        Object remove = this.branchContent.remove(i);
        if (remove != null) {
            this.branch.childRemoved(asNode(remove));
        }
        return remove;
    }

    public boolean remove(Object obj) {
        this.branch.childRemoved(asNode(obj));
        return this.branchContent.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        for (Object asNode : collection) {
            this.branch.childRemoved(asNode(asNode));
        }
        return this.branchContent.removeAll(collection);
    }

    public Object set(int i, Object obj) {
        this.branch.childAdded(asNode(obj));
        return this.branchContent.set(i, obj);
    }

    public int size() {
        return this.branchContent.size();
    }

    public Object[] toArray() {
        return this.branchContent.toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return this.branchContent.toArray(objArr);
    }
}
