package de.tk;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.xml.transform.Source;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Node;
import org.xmlunit.builder.Input;
import org.xmlunit.xpath.JAXPXPathEngine;
import org.xmlunit.xpath.XPathEngine;

class XmlunitCoreTest {
    @Test
    void test() {
        Source source = Input.fromString("<foo>bar</foo>").build();
        XPathEngine xpath = new JAXPXPathEngine();
        Iterable<Node> allMatches = xpath.selectNodes("/foo", source);

        assertTrue(allMatches.iterator().hasNext());

        String content = xpath.evaluate("/foo/text()", source);

        assertEquals("bar", content);
    }
}
