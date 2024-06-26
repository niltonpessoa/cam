package org.dom4j.jaxb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.ElementModifier;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXModifier;
import org.dom4j.io.XMLWriter;
import org.xml.sax.InputSource;

public class JAXBModifier extends JAXBSupport {
    private SAXModifier modifier;
    private HashMap modifiers;
    private OutputFormat outputFormat;
    private boolean pruneElements;
    private XMLWriter xmlWriter;

    private class JAXBElementModifier implements ElementModifier {
        private JAXBModifier jaxbModifier;
        private JAXBObjectModifier objectModifier;

        public JAXBElementModifier(JAXBModifier jAXBModifier, JAXBObjectModifier jAXBObjectModifier) {
            this.jaxbModifier = jAXBModifier;
            this.objectModifier = jAXBObjectModifier;
        }

        public Element modifyElement(Element element) {
            return this.jaxbModifier.marshal(this.objectModifier.modifyObject(this.jaxbModifier.unmarshal(element)));
        }
    }

    public JAXBModifier(String str) {
        super(str);
        this.modifiers = new HashMap();
        this.outputFormat = new OutputFormat();
    }

    public JAXBModifier(String str, ClassLoader classLoader) {
        super(str, classLoader);
        this.modifiers = new HashMap();
        this.outputFormat = new OutputFormat();
    }

    public JAXBModifier(String str, ClassLoader classLoader, OutputFormat outputFormat2) {
        super(str, classLoader);
        this.modifiers = new HashMap();
        this.outputFormat = outputFormat2;
    }

    public JAXBModifier(String str, OutputFormat outputFormat2) {
        super(str);
        this.modifiers = new HashMap();
        this.outputFormat = outputFormat2;
    }

    private XMLWriter createXMLWriter() {
        if (this.xmlWriter == null) {
            this.xmlWriter = new XMLWriter(this.outputFormat);
        }
        return this.xmlWriter;
    }

    private SAXModifier getModifier() {
        if (this.modifier == null) {
            this.modifier = new SAXModifier(isPruneElements());
        }
        return this.modifier;
    }

    private XMLWriter getXMLWriter() {
        return this.xmlWriter;
    }

    private SAXModifier installModifier() {
        SAXModifier sAXModifier = new SAXModifier(isPruneElements());
        this.modifier = sAXModifier;
        sAXModifier.resetModifiers();
        for (Map.Entry entry : this.modifiers.entrySet()) {
            getModifier().addModifier((String) entry.getKey(), new JAXBElementModifier(this, (JAXBObjectModifier) entry.getValue()));
        }
        this.modifier.setXMLWriter(getXMLWriter());
        return this.modifier;
    }

    public void addObjectModifier(String str, JAXBObjectModifier jAXBObjectModifier) {
        this.modifiers.put(str, jAXBObjectModifier);
    }

    public boolean isPruneElements() {
        return this.pruneElements;
    }

    public Document modify(File file) {
        return installModifier().modify(file);
    }

    public Document modify(File file, Charset charset) {
        try {
            return installModifier().modify((Reader) new InputStreamReader(new FileInputStream(file), charset));
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        } catch (FileNotFoundException e2) {
            throw new DocumentException(e2.getMessage(), e2);
        }
    }

    public Document modify(InputStream inputStream) {
        try {
            return installModifier().modify(inputStream);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(InputStream inputStream, String str) {
        try {
            return installModifier().modify(inputStream);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(Reader reader) {
        try {
            return installModifier().modify(reader);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(Reader reader, String str) {
        try {
            return installModifier().modify(reader);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(String str) {
        try {
            return installModifier().modify(str);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(URL url) {
        try {
            return installModifier().modify(url);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document modify(InputSource inputSource) {
        try {
            return installModifier().modify(inputSource);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public void removeObjectModifier(String str) {
        this.modifiers.remove(str);
        getModifier().removeModifier(str);
    }

    public void resetObjectModifiers() {
        this.modifiers.clear();
        getModifier().resetModifiers();
    }

    public void setOutput(File file) {
        createXMLWriter().setOutputStream(new FileOutputStream(file));
    }

    public void setOutput(OutputStream outputStream) {
        createXMLWriter().setOutputStream(outputStream);
    }

    public void setOutput(Writer writer) {
        createXMLWriter().setWriter(writer);
    }

    public void setPruneElements(boolean z) {
        this.pruneElements = z;
    }
}
