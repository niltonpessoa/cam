package org.dom4j.jaxb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;
import org.dom4j.io.SAXReader;
import org.xml.sax.InputSource;

public class JAXBReader extends JAXBSupport {
    private boolean pruneElements;
    private SAXReader reader;

    private class PruningElementHandler implements ElementHandler {
        public PruningElementHandler() {
        }

        public void onEnd(ElementPath elementPath) {
            elementPath.getCurrent().detach();
        }

        public void onStart(ElementPath elementPath) {
        }
    }

    private class UnmarshalElementHandler implements ElementHandler {
        private JAXBObjectHandler handler;
        private JAXBReader jaxbReader;

        public UnmarshalElementHandler(JAXBReader jAXBReader, JAXBObjectHandler jAXBObjectHandler) {
            this.jaxbReader = jAXBReader;
            this.handler = jAXBObjectHandler;
        }

        public void onEnd(ElementPath elementPath) {
            try {
                Element current = elementPath.getCurrent();
                javax.xml.bind.Element unmarshal = this.jaxbReader.unmarshal(current);
                if (this.jaxbReader.isPruneElements()) {
                    current.detach();
                }
                this.handler.handleObject(unmarshal);
            } catch (Exception e) {
                throw new JAXBRuntimeException(e);
            }
        }

        public void onStart(ElementPath elementPath) {
        }
    }

    public JAXBReader(String str) {
        super(str);
    }

    public JAXBReader(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    private SAXReader getReader() {
        if (this.reader == null) {
            this.reader = new SAXReader();
        }
        return this.reader;
    }

    public void addHandler(String str, ElementHandler elementHandler) {
        getReader().addHandler(str, elementHandler);
    }

    public void addObjectHandler(String str, JAXBObjectHandler jAXBObjectHandler) {
        getReader().addHandler(str, new UnmarshalElementHandler(this, jAXBObjectHandler));
    }

    public boolean isPruneElements() {
        return this.pruneElements;
    }

    public Document read(File file) {
        return getReader().read(file);
    }

    public Document read(File file, Charset charset) {
        try {
            return getReader().read((Reader) new InputStreamReader(new FileInputStream(file), charset));
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        } catch (FileNotFoundException e2) {
            throw new DocumentException(e2.getMessage(), e2);
        }
    }

    public Document read(InputStream inputStream) {
        try {
            return getReader().read(inputStream);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(InputStream inputStream, String str) {
        try {
            return getReader().read(inputStream);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(Reader reader2) {
        try {
            return getReader().read(reader2);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(Reader reader2, String str) {
        try {
            return getReader().read(reader2);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(String str) {
        try {
            return getReader().read(str);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(URL url) {
        try {
            return getReader().read(url);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public Document read(InputSource inputSource) {
        try {
            return getReader().read(inputSource);
        } catch (JAXBRuntimeException e) {
            Throwable cause = e.getCause();
            throw new DocumentException(cause.getMessage(), cause);
        }
    }

    public void removeHandler(String str) {
        getReader().removeHandler(str);
    }

    public void removeObjectHandler(String str) {
        getReader().removeHandler(str);
    }

    public void resetHandlers() {
        getReader().resetHandlers();
    }

    public void setPruneElements(boolean z) {
        this.pruneElements = z;
        if (z) {
            getReader().setDefaultHandler(new PruningElementHandler());
        }
    }
}
