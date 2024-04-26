package org.dom4j.jaxb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import javax.xml.bind.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class JAXBWriter extends JAXBSupport {
    private OutputFormat outputFormat;
    private XMLWriter xmlWriter;

    public JAXBWriter(String str) {
        super(str);
        this.outputFormat = new OutputFormat();
    }

    public JAXBWriter(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public JAXBWriter(String str, ClassLoader classLoader, OutputFormat outputFormat2) {
        super(str, classLoader);
        this.outputFormat = outputFormat2;
    }

    public JAXBWriter(String str, OutputFormat outputFormat2) {
        super(str);
        this.outputFormat = outputFormat2;
    }

    private XMLWriter getWriter() {
        if (this.xmlWriter == null) {
            this.xmlWriter = this.outputFormat != null ? new XMLWriter(this.outputFormat) : new XMLWriter();
        }
        return this.xmlWriter;
    }

    public void endDocument() {
        getWriter().endDocument();
    }

    public OutputFormat getOutputFormat() {
        return this.outputFormat;
    }

    public void setOutput(File file) {
        getWriter().setOutputStream(new FileOutputStream(file));
    }

    public void setOutput(OutputStream outputStream) {
        getWriter().setOutputStream(outputStream);
    }

    public void setOutput(Writer writer) {
        getWriter().setWriter(writer);
    }

    public void startDocument() {
        getWriter().startDocument();
    }

    public void write(Element element) {
        getWriter().write(marshal(element));
    }

    public void writeClose(Element element) {
        getWriter().writeClose(marshal(element));
    }

    public void writeCloseElement(org.dom4j.Element element) {
        getWriter().writeClose(element);
    }

    public void writeElement(org.dom4j.Element element) {
        getWriter().write(element);
    }

    public void writeOpen(Element element) {
        getWriter().writeOpen(marshal(element));
    }

    public void writeOpenElement(org.dom4j.Element element) {
        getWriter().writeOpen(element);
    }
}
