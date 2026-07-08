package ru.sbt.study.java.core.annotation;

import java.lang.reflect.Method;

public class MessagePrinter {

    public static void print(Object object) {
        Class<?> clazz = object.getClass();
        Print classAnnotation = clazz.getAnnotation(Print.class);
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.getReturnType() != String.class || method.getParameterCount() != 0) {
                continue;
            }
            Print annotation = method.getAnnotation(Print.class);
            if (annotation == null) {
                annotation = classAnnotation;
            }
            try {
                String text = (String) method.invoke(object);
                System.out.println(format(text, annotation));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    static String format(String text, Print annotation) {
        if (annotation == null) {
            return text;
        }
        return annotation.color() + applyStyle(text, annotation.style()) + Colors.RESET;
    }

    static String applyStyle(String text, String style) {
        switch (style) {
            case "arrow":
                return ">>> " + text;
            case "hurray":
                return "\\o/ " + text + " \\o/";
            case "!":
                return "!!! " + text;
            default:
                return text;
        }
    }
}
