package org.dom4j.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;
import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.Text;
import org.dom4j.tree.NamespaceStack;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.XMLFilterImpl;

public class XMLWriter extends XMLFilterImpl implements LexicalHandler {
    protected static final OutputFormat DEFAULT_FORMAT = new OutputFormat();
    protected static final String[] LEXICAL_HANDLER_NAMES = {"http://xml.org/sax/properties/lexical-handler", "http://xml.org/sax/handlers/LexicalHandler"};
    private static final String PAD_TEXT = " ";
    private boolean autoFlush;
    private StringBuffer buffer;
    private boolean charsAdded;
    private boolean escapeText;
    private OutputFormat format;
    private boolean inDTD;
    private int indentLevel;
    private char lastChar;
    private boolean lastElementClosed;
    protected int lastOutputNodeType;
    private LexicalHandler lexicalHandler;
    private int maximumAllowedCharacter;
    private NamespaceStack namespaceStack;
    private Map namespacesMap;
    protected boolean preserve;
    private boolean resolveEntityRefs;
    private boolean showCommentsInDTDs;
    protected Writer writer;

    public XMLWriter() {
        this.resolveEntityRefs = true;
        this.lastElementClosed = false;
        this.preserve = false;
        this.namespaceStack = new NamespaceStack();
        this.escapeText = true;
        this.indentLevel = 0;
        this.buffer = new StringBuffer();
        this.charsAdded = false;
        this.format = DEFAULT_FORMAT;
        this.writer = new BufferedWriter(new OutputStreamWriter(System.out));
        this.autoFlush = true;
        this.namespaceStack.push(Namespace.NO_NAMESPACE);
    }

    public XMLWriter(OutputStream outputStream) {
        this.resolveEntityRefs = true;
        this.lastElementClosed = false;
        this.preserve = false;
        this.namespaceStack = new NamespaceStack();
        this.escapeText = true;
        this.indentLevel = 0;
        this.buffer = new StringBuffer();
        this.charsAdded = false;
        OutputFormat outputFormat = DEFAULT_FORMAT;
        this.format = outputFormat;
        this.writer = createWriter(outputStream, outputFormat.getEncoding());
        this.autoFlush = true;
        this.namespaceStack.push(Namespace.NO_NAMESPACE);
    }

    public XMLWriter(OutputStream outputStream, OutputFormat outputFormat) {
        this.resolveEntityRefs = true;
        this.lastElementClosed = false;
        this.preserve = false;
        this.namespaceStack = new NamespaceStack();
        this.escapeText = true;
        this.indentLevel = 0;
        this.buffer = new StringBuffer();
        this.charsAdded = false;
        this.format = outputFormat;
        this.writer = createWriter(outputStream, outputFormat.getEncoding());
        this.autoFlush = true;
        this.namespaceStack.push(Namespace.NO_NAMESPACE);
    }

    public XMLWriter(Writer writer2) {
        this(writer2, DEFAULT_FORMAT);
    }

    public XMLWriter(Writer writer2, OutputFormat outputFormat) {
        this.resolveEntityRefs = true;
        this.lastElementClosed = false;
        this.preserve = false;
        this.namespaceStack = new NamespaceStack();
        this.escapeText = true;
        this.indentLevel = 0;
        this.buffer = new StringBuffer();
        this.charsAdded = false;
        this.writer = writer2;
        this.format = outputFormat;
        this.namespaceStack.push(Namespace.NO_NAMESPACE);
    }

    public XMLWriter(OutputFormat outputFormat) {
        this.resolveEntityRefs = true;
        this.lastElementClosed = false;
        this.preserve = false;
        this.namespaceStack = new NamespaceStack();
        this.escapeText = true;
        this.indentLevel = 0;
        this.buffer = new StringBuffer();
        this.charsAdded = false;
        this.format = outputFormat;
        this.writer = createWriter(System.out, outputFormat.getEncoding());
        this.autoFlush = true;
        this.namespaceStack.push(Namespace.NO_NAMESPACE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b A[Catch:{ IOException -> 0x008f }, LOOP:0: B:33:0x0065->B:35:0x006b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void characters(char[] r7, int r8, int r9) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0093
            int r0 = r7.length
            if (r0 == 0) goto L_0x0093
            if (r9 > 0) goto L_0x0009
            goto L_0x0093
        L_0x0009:
            java.lang.String r0 = java.lang.String.valueOf(r7, r8, r9)     // Catch:{ IOException -> 0x008f }
            boolean r1 = r6.escapeText     // Catch:{ IOException -> 0x008f }
            if (r1 == 0) goto L_0x0015
            java.lang.String r0 = r6.escapeElementEntities(r0)     // Catch:{ IOException -> 0x008f }
        L_0x0015:
            org.dom4j.io.OutputFormat r1 = r6.format     // Catch:{ IOException -> 0x008f }
            boolean r1 = r1.isTrimText()     // Catch:{ IOException -> 0x008f }
            r2 = 3
            r3 = 1
            if (r1 == 0) goto L_0x007b
            int r1 = r6.lastOutputNodeType     // Catch:{ IOException -> 0x008f }
            java.lang.String r4 = " "
            r5 = 32
            if (r1 != r2) goto L_0x0031
            boolean r1 = r6.charsAdded     // Catch:{ IOException -> 0x008f }
            if (r1 != 0) goto L_0x0031
            java.io.Writer r1 = r6.writer     // Catch:{ IOException -> 0x008f }
        L_0x002d:
            r1.write(r5)     // Catch:{ IOException -> 0x008f }
            goto L_0x005e
        L_0x0031:
            boolean r1 = r6.charsAdded     // Catch:{ IOException -> 0x008f }
            if (r1 == 0) goto L_0x0040
            char r1 = r6.lastChar     // Catch:{ IOException -> 0x008f }
            boolean r1 = java.lang.Character.isWhitespace(r1)     // Catch:{ IOException -> 0x008f }
            if (r1 == 0) goto L_0x0040
            java.io.Writer r1 = r6.writer     // Catch:{ IOException -> 0x008f }
            goto L_0x002d
        L_0x0040:
            int r1 = r6.lastOutputNodeType     // Catch:{ IOException -> 0x008f }
            if (r1 != r3) goto L_0x005e
            org.dom4j.io.OutputFormat r1 = r6.format     // Catch:{ IOException -> 0x008f }
            boolean r1 = r1.isPadText()     // Catch:{ IOException -> 0x008f }
            if (r1 == 0) goto L_0x005e
            boolean r1 = r6.lastElementClosed     // Catch:{ IOException -> 0x008f }
            if (r1 == 0) goto L_0x005e
            r1 = 0
            char r1 = r7[r1]     // Catch:{ IOException -> 0x008f }
            boolean r1 = java.lang.Character.isWhitespace(r1)     // Catch:{ IOException -> 0x008f }
            if (r1 == 0) goto L_0x005e
            java.io.Writer r1 = r6.writer     // Catch:{ IOException -> 0x008f }
            r1.write(r4)     // Catch:{ IOException -> 0x008f }
        L_0x005e:
            java.lang.String r1 = ""
            java.util.StringTokenizer r5 = new java.util.StringTokenizer     // Catch:{ IOException -> 0x008f }
            r5.<init>(r0)     // Catch:{ IOException -> 0x008f }
        L_0x0065:
            boolean r0 = r5.hasMoreTokens()     // Catch:{ IOException -> 0x008f }
            if (r0 == 0) goto L_0x0080
            java.io.Writer r0 = r6.writer     // Catch:{ IOException -> 0x008f }
            r0.write(r1)     // Catch:{ IOException -> 0x008f }
            java.io.Writer r0 = r6.writer     // Catch:{ IOException -> 0x008f }
            java.lang.String r1 = r5.nextToken()     // Catch:{ IOException -> 0x008f }
            r0.write(r1)     // Catch:{ IOException -> 0x008f }
            r1 = r4
            goto L_0x0065
        L_0x007b:
            java.io.Writer r1 = r6.writer     // Catch:{ IOException -> 0x008f }
            r1.write(r0)     // Catch:{ IOException -> 0x008f }
        L_0x0080:
            r6.charsAdded = r3     // Catch:{ IOException -> 0x008f }
            int r0 = r8 + r9
            int r0 = r0 - r3
            char r0 = r7[r0]     // Catch:{ IOException -> 0x008f }
            r6.lastChar = r0     // Catch:{ IOException -> 0x008f }
            r6.lastOutputNodeType = r2     // Catch:{ IOException -> 0x008f }
            super.characters(r7, r8, r9)     // Catch:{ IOException -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r7 = move-exception
            r6.handleException(r7)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.io.XMLWriter.characters(char[], int, int):void");
    }

    public void close() {
        this.writer.close();
    }

    public void comment(char[] cArr, int i, int i2) {
        if (this.showCommentsInDTDs || !this.inDTD) {
            try {
                this.charsAdded = false;
                writeComment(new String(cArr, i, i2));
            } catch (IOException e) {
                handleException(e);
            }
        }
        LexicalHandler lexicalHandler2 = this.lexicalHandler;
        if (lexicalHandler2 != null) {
            lexicalHandler2.comment(cArr, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public Writer createWriter(OutputStream outputStream, String str) {
        return new BufferedWriter(new OutputStreamWriter(outputStream, str));
    }

    /* access modifiers changed from: protected */
    public int defaultMaximumAllowedCharacter() {
        String encoding = this.format.getEncoding();
        return (encoding == null || !encoding.equals("US-ASCII")) ? -1 : 127;
    }

    public void endCDATA() {
        try {
            this.writer.write("]]>");
        } catch (IOException e) {
            handleException(e);
        }
        LexicalHandler lexicalHandler2 = this.lexicalHandler;
        if (lexicalHandler2 != null) {
            lexicalHandler2.endCDATA();
        }
    }

    public void endDTD() {
        this.inDTD = false;
        LexicalHandler lexicalHandler2 = this.lexicalHandler;
        if (lexicalHandler2 != null) {
            lexicalHandler2.endDTD();
        }
    }

    public void endDocument() {
        super.endDocument();
        if (this.autoFlush) {
            try {
                flush();
            } catch (IOException unused) {
            }
        }
    }

    public void endElement(String str, String str2, String str3) {
        try {
            this.charsAdded = false;
            this.indentLevel--;
            if (this.lastElementClosed) {
                writePrintln();
                indent();
            }
            writeClose(str3);
            this.lastOutputNodeType = 1;
            this.lastElementClosed = true;
            super.endElement(str, str2, str3);
        } catch (IOException e) {
            handleException(e);
        }
    }

    public void endEntity(String str) {
        LexicalHandler lexicalHandler2 = this.lexicalHandler;
        if (lexicalHandler2 != null) {
            lexicalHandler2.endEntity(str);
        }
    }

    public void endPrefixMapping(String str) {
        super.endPrefixMapping(str);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String escapeAttributeEntities(java.lang.String r11) {
        /*
            r10 = this;
            org.dom4j.io.OutputFormat r0 = r10.format
            char r0 = r0.getAttributeQuoteCharacter()
            int r1 = r11.length()
            r2 = 0
            r3 = 0
            r6 = r2
            r4 = 0
            r5 = 0
        L_0x000f:
            if (r4 >= r1) goto L_0x0083
            char r7 = r11.charAt(r4)
            r8 = 9
            if (r7 == r8) goto L_0x0069
            r8 = 10
            if (r7 == r8) goto L_0x0069
            r8 = 13
            if (r7 == r8) goto L_0x0069
            r8 = 34
            if (r7 == r8) goto L_0x0064
            r8 = 60
            if (r7 == r8) goto L_0x0061
            r8 = 62
            if (r7 == r8) goto L_0x005e
            r8 = 38
            if (r7 == r8) goto L_0x005b
            r8 = 39
            if (r7 == r8) goto L_0x0056
            r8 = 32
            if (r7 < r8) goto L_0x003f
            boolean r8 = r10.shouldEncodeChar(r7)
            if (r8 == 0) goto L_0x0069
        L_0x003f:
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            java.lang.String r9 = "&#"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = ";"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            goto L_0x006a
        L_0x0056:
            if (r0 != r8) goto L_0x0069
            java.lang.String r7 = "&apos;"
            goto L_0x006a
        L_0x005b:
            java.lang.String r7 = "&amp;"
            goto L_0x006a
        L_0x005e:
            java.lang.String r7 = "&gt;"
            goto L_0x006a
        L_0x0061:
            java.lang.String r7 = "&lt;"
            goto L_0x006a
        L_0x0064:
            if (r0 != r8) goto L_0x0069
            java.lang.String r7 = "&quot;"
            goto L_0x006a
        L_0x0069:
            r7 = r2
        L_0x006a:
            if (r7 == 0) goto L_0x0080
            if (r6 != 0) goto L_0x0072
            char[] r6 = r11.toCharArray()
        L_0x0072:
            java.lang.StringBuffer r8 = r10.buffer
            int r9 = r4 - r5
            r8.append(r6, r5, r9)
            java.lang.StringBuffer r5 = r10.buffer
            r5.append(r7)
            int r5 = r4 + 1
        L_0x0080:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0083:
            if (r5 != 0) goto L_0x0086
            return r11
        L_0x0086:
            if (r5 >= r1) goto L_0x0094
            if (r6 != 0) goto L_0x008e
            char[] r6 = r11.toCharArray()
        L_0x008e:
            java.lang.StringBuffer r11 = r10.buffer
            int r4 = r4 - r5
            r11.append(r6, r5, r4)
        L_0x0094:
            java.lang.StringBuffer r11 = r10.buffer
            java.lang.String r11 = r11.toString()
            java.lang.StringBuffer r0 = r10.buffer
            r0.setLength(r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.io.XMLWriter.escapeAttributeEntities(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0071 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String escapeElementEntities(java.lang.String r10) {
        /*
            r9 = this;
            int r0 = r10.length()
            r1 = 0
            r2 = 0
            r5 = r1
            r3 = 0
            r4 = 0
        L_0x0009:
            if (r3 >= r0) goto L_0x0074
            char r6 = r10.charAt(r3)
            r7 = 9
            if (r6 == r7) goto L_0x0051
            r7 = 10
            if (r6 == r7) goto L_0x0051
            r7 = 13
            if (r6 == r7) goto L_0x0051
            r7 = 38
            if (r6 == r7) goto L_0x004e
            r7 = 60
            if (r6 == r7) goto L_0x004b
            r7 = 62
            if (r6 == r7) goto L_0x0048
            r7 = 32
            if (r6 < r7) goto L_0x0031
            boolean r7 = r9.shouldEncodeChar(r6)
            if (r7 == 0) goto L_0x005a
        L_0x0031:
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            java.lang.String r8 = "&#"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ";"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            goto L_0x005b
        L_0x0048:
            java.lang.String r6 = "&gt;"
            goto L_0x005b
        L_0x004b:
            java.lang.String r6 = "&lt;"
            goto L_0x005b
        L_0x004e:
            java.lang.String r6 = "&amp;"
            goto L_0x005b
        L_0x0051:
            boolean r7 = r9.preserve
            if (r7 == 0) goto L_0x005a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            goto L_0x005b
        L_0x005a:
            r6 = r1
        L_0x005b:
            if (r6 == 0) goto L_0x0071
            if (r5 != 0) goto L_0x0063
            char[] r5 = r10.toCharArray()
        L_0x0063:
            java.lang.StringBuffer r7 = r9.buffer
            int r8 = r3 - r4
            r7.append(r5, r4, r8)
            java.lang.StringBuffer r4 = r9.buffer
            r4.append(r6)
            int r4 = r3 + 1
        L_0x0071:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0074:
            if (r4 != 0) goto L_0x0077
            return r10
        L_0x0077:
            if (r4 >= r0) goto L_0x0085
            if (r5 != 0) goto L_0x007f
            char[] r5 = r10.toCharArray()
        L_0x007f:
            java.lang.StringBuffer r10 = r9.buffer
            int r3 = r3 - r4
            r10.append(r5, r4, r3)
        L_0x0085:
            java.lang.StringBuffer r10 = r9.buffer
            java.lang.String r10 = r10.toString()
            java.lang.StringBuffer r0 = r9.buffer
            r0.setLength(r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.io.XMLWriter.escapeElementEntities(java.lang.String):java.lang.String");
    }

    public void flush() {
        this.writer.flush();
    }

    public LexicalHandler getLexicalHandler() {
        return this.lexicalHandler;
    }

    public int getMaximumAllowedCharacter() {
        if (this.maximumAllowedCharacter == 0) {
            this.maximumAllowedCharacter = defaultMaximumAllowedCharacter();
        }
        return this.maximumAllowedCharacter;
    }

    /* access modifiers changed from: protected */
    public OutputFormat getOutputFormat() {
        return this.format;
    }

    public Object getProperty(String str) {
        int i = 0;
        while (true) {
            String[] strArr = LEXICAL_HANDLER_NAMES;
            if (i >= strArr.length) {
                return super.getProperty(str);
            }
            if (strArr[i].equals(str)) {
                return getLexicalHandler();
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public void handleException(IOException iOException) {
        throw new SAXException(iOException);
    }

    public void ignorableWhitespace(char[] cArr, int i, int i2) {
        super.ignorableWhitespace(cArr, i, i2);
    }

    /* access modifiers changed from: protected */
    public void indent() {
        String indent = this.format.getIndent();
        if (indent != null && indent.length() > 0) {
            for (int i = 0; i < this.indentLevel; i++) {
                this.writer.write(indent);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void installLexicalHandler() {
        XMLReader parent = getParent();
        Objects.requireNonNull(parent, "No parent for filter");
        int i = 0;
        while (true) {
            String[] strArr = LEXICAL_HANDLER_NAMES;
            if (i < strArr.length) {
                try {
                    parent.setProperty(strArr[i], this);
                    return;
                } catch (SAXNotRecognizedException | SAXNotSupportedException unused) {
                    i++;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean isElementSpacePreserved(Element element) {
        Attribute attribute = element.attribute("space");
        return attribute != null ? "xml".equals(attribute.getNamespacePrefix()) && "preserve".equals(attribute.getText()) : this.preserve;
    }

    public boolean isEscapeText() {
        return this.escapeText;
    }

    /* access modifiers changed from: protected */
    public boolean isExpandEmptyElements() {
        return this.format.isExpandEmptyElements();
    }

    /* access modifiers changed from: protected */
    public boolean isNamespaceDeclaration(Namespace namespace) {
        return (namespace == null || namespace == Namespace.XML_NAMESPACE || namespace.getURI() == null || this.namespaceStack.contains(namespace)) ? false : true;
    }

    public void notationDecl(String str, String str2, String str3) {
        super.notationDecl(str, str2, str3);
    }

    public void parse(InputSource inputSource) {
        installLexicalHandler();
        super.parse(inputSource);
    }

    public void println() {
        this.writer.write(this.format.getLineSeparator());
    }

    public void processingInstruction(String str, String str2) {
        try {
            indent();
            this.writer.write("<?");
            this.writer.write(str);
            this.writer.write(PAD_TEXT);
            this.writer.write(str2);
            this.writer.write("?>");
            writePrintln();
            this.lastOutputNodeType = 7;
            super.processingInstruction(str, str2);
        } catch (IOException e) {
            handleException(e);
        }
    }

    public boolean resolveEntityRefs() {
        return this.resolveEntityRefs;
    }

    public void setDocumentLocator(Locator locator) {
        super.setDocumentLocator(locator);
    }

    public void setEscapeText(boolean z) {
        this.escapeText = z;
    }

    public void setIndentLevel(int i) {
        this.indentLevel = i;
    }

    public void setLexicalHandler(LexicalHandler lexicalHandler2) {
        Objects.requireNonNull(lexicalHandler2, "Null lexical handler");
        this.lexicalHandler = lexicalHandler2;
    }

    public void setMaximumAllowedCharacter(int i) {
        this.maximumAllowedCharacter = i;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.writer = createWriter(outputStream, this.format.getEncoding());
        this.autoFlush = true;
    }

    public void setProperty(String str, Object obj) {
        int i = 0;
        while (true) {
            String[] strArr = LEXICAL_HANDLER_NAMES;
            if (i >= strArr.length) {
                super.setProperty(str, obj);
                return;
            } else if (strArr[i].equals(str)) {
                setLexicalHandler((LexicalHandler) obj);
                return;
            } else {
                i++;
            }
        }
    }

    public void setResolveEntityRefs(boolean z) {
        this.resolveEntityRefs = z;
    }

    public void setWriter(Writer writer2) {
        this.writer = writer2;
        this.autoFlush = false;
    }

    /* access modifiers changed from: protected */
    public boolean shouldEncodeChar(char c) {
        int maximumAllowedCharacter2 = getMaximumAllowedCharacter();
        return maximumAllowedCharacter2 > 0 && c > maximumAllowedCharacter2;
    }

    public void startCDATA() {
        try {
            this.writer.write("<![CDATA[");
        } catch (IOException e) {
            handleException(e);
        }
        LexicalHandler lexicalHandler2 = this.lexicalHandler;
        if (lexicalHandler2 != null) {
            lexicalHandler2.startCDATA();
        }
    }

    public void startDTD(String str, String str2, String str3) {
        this.inDTD = true;
        try {
            writeDocType(str, str2, str3);
        } catch (IOException e) {
            handleException(e);
        }
        LexicalHandler lexicalHandler2 = this.lexicalHandler;
        if (lexicalHandler2 != null) {
            lexicalHandler2.startDTD(str, str2, str3);
        }
    }

    public void startDocument() {
        try {
            writeDeclaration();
            super.startDocument();
        } catch (IOException e) {
            handleException(e);
        }
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        try {
            this.charsAdded = false;
            writePrintln();
            indent();
            this.writer.write("<");
            this.writer.write(str3);
            writeNamespaces();
            writeAttributes(attributes);
            this.writer.write(">");
            this.indentLevel++;
            this.lastOutputNodeType = 1;
            this.lastElementClosed = false;
            super.startElement(str, str2, str3, attributes);
        } catch (IOException e) {
            handleException(e);
        }
    }

    public void startEntity(String str) {
        try {
            writeEntityRef(str);
        } catch (IOException e) {
            handleException(e);
        }
        LexicalHandler lexicalHandler2 = this.lexicalHandler;
        if (lexicalHandler2 != null) {
            lexicalHandler2.startEntity(str);
        }
    }

    public void startPrefixMapping(String str, String str2) {
        if (this.namespacesMap == null) {
            this.namespacesMap = new HashMap();
        }
        this.namespacesMap.put(str, str2);
        super.startPrefixMapping(str, str2);
    }

    public void unparsedEntityDecl(String str, String str2, String str3, String str4) {
        super.unparsedEntityDecl(str, str2, str3, str4);
    }

    public void write(Object obj) {
        if (obj instanceof Node) {
            write((Node) obj);
        } else if (obj instanceof String) {
            write((String) obj);
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                write(list.get(i));
            }
        } else if (obj != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid object: ");
            stringBuffer.append(obj);
            throw new IOException(stringBuffer.toString());
        }
    }

    public void write(String str) {
        writeString(str);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Attribute attribute) {
        writeAttribute(attribute);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(CDATA cdata) {
        writeCDATA(cdata.getText());
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Comment comment) {
        writeComment(comment.getText());
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Document document) {
        writeDeclaration();
        if (document.getDocType() != null) {
            indent();
            writeDocType(document.getDocType());
        }
        int nodeCount = document.nodeCount();
        for (int i = 0; i < nodeCount; i++) {
            writeNode(document.node(i));
        }
        writePrintln();
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(DocumentType documentType) {
        writeDocType(documentType);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Element element) {
        writeElement(element);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Entity entity) {
        writeEntity(entity);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Namespace namespace) {
        writeNamespace(namespace);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Node node) {
        writeNode(node);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(ProcessingInstruction processingInstruction) {
        writeProcessingInstruction(processingInstruction);
        if (this.autoFlush) {
            flush();
        }
    }

    public void write(Text text) {
        writeString(text.getText());
        if (this.autoFlush) {
            flush();
        }
    }

    /* access modifiers changed from: protected */
    public void writeAttribute(Attribute attribute) {
        this.writer.write(PAD_TEXT);
        this.writer.write(attribute.getQualifiedName());
        this.writer.write("=");
        char attributeQuoteCharacter = this.format.getAttributeQuoteCharacter();
        this.writer.write(attributeQuoteCharacter);
        writeEscapeAttributeEntities(attribute.getValue());
        this.writer.write(attributeQuoteCharacter);
        this.lastOutputNodeType = 2;
    }

    /* access modifiers changed from: protected */
    public void writeAttribute(Attributes attributes, int i) {
        char attributeQuoteCharacter = this.format.getAttributeQuoteCharacter();
        this.writer.write(PAD_TEXT);
        this.writer.write(attributes.getQName(i));
        this.writer.write("=");
        this.writer.write(attributeQuoteCharacter);
        writeEscapeAttributeEntities(attributes.getValue(i));
        this.writer.write(attributeQuoteCharacter);
    }

    /* access modifiers changed from: protected */
    public void writeAttributes(Element element) {
        int attributeCount = element.attributeCount();
        for (int i = 0; i < attributeCount; i++) {
            Attribute attribute = element.attribute(i);
            Namespace namespace = attribute.getNamespace();
            if (!(namespace == null || namespace == Namespace.NO_NAMESPACE || namespace == Namespace.XML_NAMESPACE)) {
                if (!namespace.getURI().equals(this.namespaceStack.getURI(namespace.getPrefix()))) {
                    writeNamespace(namespace);
                    this.namespaceStack.push(namespace);
                }
            }
            String name = attribute.getName();
            if (name.startsWith("xmlns:")) {
                String substring = name.substring(6);
                if (this.namespaceStack.getNamespaceForPrefix(substring) == null) {
                    String value = attribute.getValue();
                    this.namespaceStack.push(substring, value);
                    writeNamespace(substring, value);
                }
            } else if (!name.equals("xmlns")) {
                char attributeQuoteCharacter = this.format.getAttributeQuoteCharacter();
                this.writer.write(PAD_TEXT);
                this.writer.write(attribute.getQualifiedName());
                this.writer.write("=");
                this.writer.write(attributeQuoteCharacter);
                writeEscapeAttributeEntities(attribute.getValue());
                this.writer.write(attributeQuoteCharacter);
            } else if (this.namespaceStack.getDefaultNamespace() == null) {
                String value2 = attribute.getValue();
                this.namespaceStack.push((String) null, value2);
                writeNamespace((String) null, value2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void writeAttributes(Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            writeAttribute(attributes, i);
        }
    }

    /* access modifiers changed from: protected */
    public void writeCDATA(String str) {
        this.writer.write("<![CDATA[");
        if (str != null) {
            this.writer.write(str);
        }
        this.writer.write("]]>");
        this.lastOutputNodeType = 4;
    }

    /* access modifiers changed from: protected */
    public void writeClose(String str) {
        this.writer.write("</");
        this.writer.write(str);
        this.writer.write(">");
    }

    public void writeClose(Element element) {
        writeClose(element.getQualifiedName());
    }

    /* access modifiers changed from: protected */
    public void writeComment(String str) {
        if (this.format.isNewlines()) {
            println();
            indent();
        }
        this.writer.write("<!--");
        this.writer.write(str);
        this.writer.write("-->");
        this.lastOutputNodeType = 8;
    }

    /* access modifiers changed from: protected */
    public void writeDeclaration() {
        String encoding = this.format.getEncoding();
        if (!this.format.isSuppressDeclaration()) {
            if (encoding.equals("UTF8")) {
                this.writer.write("<?xml version=\"1.0\"");
                if (!this.format.isOmitEncoding()) {
                    this.writer.write(" encoding=\"UTF-8\"");
                }
            } else {
                this.writer.write("<?xml version=\"1.0\"");
                if (!this.format.isOmitEncoding()) {
                    Writer writer2 = this.writer;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(" encoding=\"");
                    stringBuffer.append(encoding);
                    stringBuffer.append("\"");
                    writer2.write(stringBuffer.toString());
                }
            }
            this.writer.write("?>");
            if (this.format.isNewLineAfterDeclaration()) {
                println();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void writeDocType(String str, String str2, String str3) {
        boolean z;
        this.writer.write("<!DOCTYPE ");
        this.writer.write(str);
        if (str2 == null || str2.equals("")) {
            z = false;
        } else {
            this.writer.write(" PUBLIC \"");
            this.writer.write(str2);
            this.writer.write("\"");
            z = true;
        }
        if (str3 != null && !str3.equals("")) {
            if (!z) {
                this.writer.write(" SYSTEM");
            }
            this.writer.write(" \"");
            this.writer.write(str3);
            this.writer.write("\"");
        }
        this.writer.write(">");
        writePrintln();
    }

    /* access modifiers changed from: protected */
    public void writeDocType(DocumentType documentType) {
        if (documentType != null) {
            documentType.write(this.writer);
            writePrintln();
        }
    }

    /* access modifiers changed from: protected */
    public void writeElement(Element element) {
        int nodeCount = element.nodeCount();
        String qualifiedName = element.getQualifiedName();
        writePrintln();
        indent();
        this.writer.write("<");
        this.writer.write(qualifiedName);
        int size = this.namespaceStack.size();
        Namespace namespace = element.getNamespace();
        if (isNamespaceDeclaration(namespace)) {
            this.namespaceStack.push(namespace);
            writeNamespace(namespace);
        }
        boolean z = true;
        for (int i = 0; i < nodeCount; i++) {
            Node node = element.node(i);
            if (node instanceof Namespace) {
                Namespace namespace2 = (Namespace) node;
                if (isNamespaceDeclaration(namespace2)) {
                    this.namespaceStack.push(namespace2);
                    writeNamespace(namespace2);
                }
            } else if ((node instanceof Element) || (node instanceof Comment)) {
                z = false;
            }
        }
        writeAttributes(element);
        this.lastOutputNodeType = 1;
        if (nodeCount <= 0) {
            writeEmptyElementClose(qualifiedName);
        } else {
            this.writer.write(">");
            if (z) {
                writeElementContent(element);
            } else {
                this.indentLevel++;
                writeElementContent(element);
                this.indentLevel--;
                writePrintln();
                indent();
            }
            this.writer.write("</");
            this.writer.write(qualifiedName);
            this.writer.write(">");
        }
        while (this.namespaceStack.size() > size) {
            this.namespaceStack.pop();
        }
        this.lastOutputNodeType = 1;
    }

    /* access modifiers changed from: protected */
    public void writeElementContent(Element element) {
        boolean isTrimText = this.format.isTrimText();
        boolean z = this.preserve;
        if (isTrimText) {
            boolean isElementSpacePreserved = isElementSpacePreserved(element);
            this.preserve = isElementSpacePreserved;
            isTrimText = !isElementSpacePreserved;
        }
        if (isTrimText) {
            int nodeCount = element.nodeCount();
            Text text = null;
            StringBuffer stringBuffer = null;
            boolean z2 = true;
            for (int i = 0; i < nodeCount; i++) {
                Node node = element.node(i);
                if (!(node instanceof Text)) {
                    char c = 'a';
                    if (!z2 && this.format.isPadText()) {
                        if (Character.isWhitespace(stringBuffer != null ? stringBuffer.charAt(0) : text != null ? text.getText().charAt(0) : 'a')) {
                            this.writer.write(PAD_TEXT);
                        }
                    }
                    if (text != null) {
                        if (stringBuffer != null) {
                            writeString(stringBuffer.toString());
                            stringBuffer = null;
                        } else {
                            writeString(text.getText());
                        }
                        if (this.format.isPadText()) {
                            if (stringBuffer != null) {
                                c = stringBuffer.charAt(stringBuffer.length() - 1);
                            } else if (text != null) {
                                String text2 = text.getText();
                                c = text2.charAt(text2.length() - 1);
                            }
                            if (Character.isWhitespace(c)) {
                                this.writer.write(PAD_TEXT);
                            }
                        }
                        text = null;
                    }
                    writeNode(node);
                    z2 = false;
                } else if (text == null) {
                    text = (Text) node;
                } else {
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer(text.getText());
                    }
                    stringBuffer.append(((Text) node).getText());
                }
            }
            if (text != null) {
                if (!z2 && this.format.isPadText()) {
                    if (Character.isWhitespace(stringBuffer != null ? stringBuffer.charAt(0) : text.getText().charAt(0))) {
                        this.writer.write(PAD_TEXT);
                    }
                }
                writeString(stringBuffer != null ? stringBuffer.toString() : text.getText());
            }
        } else {
            int nodeCount2 = element.nodeCount();
            Node node2 = null;
            for (int i2 = 0; i2 < nodeCount2; i2++) {
                Node node3 = element.node(i2);
                if (node3 instanceof Text) {
                    writeNode(node3);
                    node2 = node3;
                } else {
                    if (node2 != null && this.format.isPadText()) {
                        String text3 = node2.getText();
                        if (Character.isWhitespace(text3.charAt(text3.length() - 1))) {
                            this.writer.write(PAD_TEXT);
                        }
                    }
                    writeNode(node3);
                    node2 = null;
                }
            }
        }
        this.preserve = z;
    }

    /* access modifiers changed from: protected */
    public void writeEmptyElementClose(String str) {
        Writer writer2;
        String str2;
        if (!this.format.isExpandEmptyElements()) {
            writer2 = this.writer;
            str2 = "/>";
        } else {
            this.writer.write("></");
            this.writer.write(str);
            writer2 = this.writer;
            str2 = ">";
        }
        writer2.write(str2);
    }

    /* access modifiers changed from: protected */
    public void writeEntity(Entity entity) {
        if (!resolveEntityRefs()) {
            writeEntityRef(entity.getName());
        } else {
            this.writer.write(entity.getText());
        }
    }

    /* access modifiers changed from: protected */
    public void writeEntityRef(String str) {
        this.writer.write("&");
        this.writer.write(str);
        this.writer.write(";");
        this.lastOutputNodeType = 5;
    }

    /* access modifiers changed from: protected */
    public void writeEscapeAttributeEntities(String str) {
        if (str != null) {
            this.writer.write(escapeAttributeEntities(str));
        }
    }

    /* access modifiers changed from: protected */
    public void writeNamespace(String str, String str2) {
        Writer writer2;
        String str3;
        if (str == null || str.length() <= 0) {
            writer2 = this.writer;
            str3 = " xmlns=\"";
        } else {
            this.writer.write(" xmlns:");
            this.writer.write(str);
            writer2 = this.writer;
            str3 = "=\"";
        }
        writer2.write(str3);
        this.writer.write(str2);
        this.writer.write("\"");
    }

    /* access modifiers changed from: protected */
    public void writeNamespace(Namespace namespace) {
        if (namespace != null) {
            writeNamespace(namespace.getPrefix(), namespace.getURI());
        }
    }

    /* access modifiers changed from: protected */
    public void writeNamespaces() {
        Map map = this.namespacesMap;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                writeNamespace((String) entry.getKey(), (String) entry.getValue());
            }
            this.namespacesMap = null;
        }
    }

    /* access modifiers changed from: protected */
    public void writeNode(Node node) {
        switch (node.getNodeType()) {
            case 1:
                writeElement((Element) node);
                return;
            case 2:
                writeAttribute((Attribute) node);
                return;
            case 3:
                writeNodeText(node);
                return;
            case 4:
                writeCDATA(node.getText());
                return;
            case 5:
                writeEntity((Entity) node);
                return;
            case 7:
                writeProcessingInstruction((ProcessingInstruction) node);
                return;
            case 8:
                writeComment(node.getText());
                return;
            case 9:
                write((Document) node);
                return;
            case 10:
                writeDocType((DocumentType) node);
                return;
            case 13:
                return;
            default:
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Invalid node type: ");
                stringBuffer.append(node);
                throw new IOException(stringBuffer.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void writeNodeText(Node node) {
        String text = node.getText();
        if (text != null && text.length() > 0) {
            if (this.escapeText) {
                text = escapeElementEntities(text);
            }
            this.lastOutputNodeType = 3;
            this.writer.write(text);
            this.lastChar = text.charAt(text.length() - 1);
        }
    }

    public void writeOpen(Element element) {
        this.writer.write("<");
        this.writer.write(element.getQualifiedName());
        writeAttributes(element);
        this.writer.write(">");
    }

    /* access modifiers changed from: protected */
    public void writePrintln() {
        if (this.format.isNewlines()) {
            String lineSeparator = this.format.getLineSeparator();
            if (this.lastChar != lineSeparator.charAt(lineSeparator.length() - 1)) {
                this.writer.write(this.format.getLineSeparator());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void writeProcessingInstruction(ProcessingInstruction processingInstruction) {
        this.writer.write("<?");
        this.writer.write(processingInstruction.getName());
        this.writer.write(PAD_TEXT);
        this.writer.write(processingInstruction.getText());
        this.writer.write("?>");
        writePrintln();
        this.lastOutputNodeType = 7;
    }

    /* access modifiers changed from: protected */
    public void writeString(String str) {
        if (str != null && str.length() > 0) {
            if (this.escapeText) {
                str = escapeElementEntities(str);
            }
            if (this.format.isTrimText()) {
                StringTokenizer stringTokenizer = new StringTokenizer(str);
                boolean z = true;
                while (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    if (z) {
                        z = false;
                        if (this.lastOutputNodeType != 3) {
                            this.writer.write(nextToken);
                            this.lastOutputNodeType = 3;
                            this.lastChar = nextToken.charAt(nextToken.length() - 1);
                        }
                    }
                    this.writer.write(PAD_TEXT);
                    this.writer.write(nextToken);
                    this.lastOutputNodeType = 3;
                    this.lastChar = nextToken.charAt(nextToken.length() - 1);
                }
                return;
            }
            this.lastOutputNodeType = 3;
            this.writer.write(str);
            this.lastChar = str.charAt(str.length() - 1);
        }
    }
}
