package ru.sbt.study.java.core.annotation;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MessagePrinterTest {

    @Test
    void appliesArrowStyle() {
        assertEquals(">>> привет", MessagePrinter.applyStyle("привет", "arrow"));
    }

    @Test
    void methodAnnotationHasPriority() throws Exception {
        Method method = Messages.class.getMethod("happyBirthday");
        Print annotation = method.getAnnotation(Print.class);
        assertNotNull(annotation);
        assertEquals(Colors.PURPLE, annotation.color());
    }

    @Test
    void formatWrapsWithColorAndReset() throws Exception {
        Method method = Messages.class.getMethod("warning");
        Print annotation = method.getAnnotation(Print.class);
        String result = MessagePrinter.format("Предупреждение", annotation);
        assertTrue(result.startsWith(Colors.YELLOW));
        assertTrue(result.endsWith(Colors.RESET));
        assertTrue(result.contains("!!! Предупреждение"));
    }
}
