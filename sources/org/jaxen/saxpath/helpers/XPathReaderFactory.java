package org.jaxen.saxpath.helpers;

import org.jaxen.saxpath.SAXPathException;
import org.jaxen.saxpath.XPathReader;

public class XPathReaderFactory {
    protected static final String DEFAULT_DRIVER = "org.jaxen.saxpath.base.XPathReader";
    public static final String DRIVER_PROPERTY = "org.saxpath.driver";
    private static boolean USE_DEFAULT = true;
    static /* synthetic */ Class class$org$jaxen$saxpath$XPathReader;
    static /* synthetic */ Class class$org$jaxen$saxpath$helpers$XPathReaderFactory;

    static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static XPathReader createReader() {
        boolean z;
        String str;
        SAXPathException sAXPathException;
        try {
            str = System.getProperty(DRIVER_PROPERTY);
            z = false;
        } catch (SecurityException unused) {
            z = true;
            str = null;
        }
        if (str == null || str.length() == 0) {
            if (USE_DEFAULT) {
                str = DEFAULT_DRIVER;
            } else if (z) {
                throw sAXPathException;
            } else {
                sAXPathException = new SAXPathException("Property org.saxpath.driver not set");
                throw sAXPathException;
            }
        }
        return createReader(str);
    }

    public static XPathReader createReader(String str) {
        try {
            Class cls = class$org$jaxen$saxpath$helpers$XPathReaderFactory;
            if (cls == null) {
                cls = class$("org.jaxen.saxpath.helpers.XPathReaderFactory");
                class$org$jaxen$saxpath$helpers$XPathReaderFactory = cls;
            }
            Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
            Class cls3 = class$org$jaxen$saxpath$XPathReader;
            if (cls3 == null) {
                cls3 = class$("org.jaxen.saxpath.XPathReader");
                class$org$jaxen$saxpath$XPathReader = cls3;
            }
            if (cls3.isAssignableFrom(cls2)) {
                try {
                    XPathReader xPathReader = (XPathReader) cls2.newInstance();
                    if (xPathReader != null) {
                        return xPathReader;
                    }
                    throw new SAXPathException("Unable to create XPathReader");
                } catch (IllegalAccessException e) {
                    throw new SAXPathException((Throwable) e);
                } catch (InstantiationException e2) {
                    throw new SAXPathException((Throwable) e2);
                }
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Class [");
                stringBuffer.append(str);
                stringBuffer.append("] does not implement the org.jaxen.saxpath.XPathReader interface.");
                throw new SAXPathException(stringBuffer.toString());
            }
        } catch (ClassNotFoundException e3) {
            throw new SAXPathException((Throwable) e3);
        }
    }
}
