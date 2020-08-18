package de.tk;

import static org.xmlunit.assertj.XmlAssert.assertThat;

import org.junit.jupiter.api.Test;

class XmlunitAssertjTest {
    @Test
    void test() {
        assertThat("<foo>bar</foo>").hasXPath("/foo");
        assertThat("<foo>bar</foo>").valueByXPath("/foo/text()").isEqualTo("bar");
    }
}
