package org.dom4j;

public class XPathException extends RuntimeException {
    private String xpath;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XPathException(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "Exception occurred evaluting XPath: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.xpath = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.XPathException.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XPathException(java.lang.String r3, java.lang.Exception r4) {
        /*
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "Exception occurred evaluting XPath: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ". Exception: "
            r0.append(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4)
            r2.xpath = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.XPathException.<init>(java.lang.String, java.lang.Exception):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XPathException(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "Exception occurred evaluting XPath: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4)
            r2.xpath = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.XPathException.<init>(java.lang.String, java.lang.String):void");
    }

    public String getXPath() {
        return this.xpath;
    }
}
