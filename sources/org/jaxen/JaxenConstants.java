package org.jaxen;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JaxenConstants {
    public static final Iterator EMPTY_ITERATOR;
    public static final ListIterator EMPTY_LIST_ITERATOR;

    static {
        List list = Collections.EMPTY_LIST;
        EMPTY_ITERATOR = list.iterator();
        EMPTY_LIST_ITERATOR = list.listIterator();
    }
}
