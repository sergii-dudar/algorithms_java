package algs4.cs.princeton.edu.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MessageUtil {

    public String message(String template, Object... args) {
        return String.format(template.replaceAll(
            "\\{}", "%s"), args);
    }

    public void log(String template, Object... args) {
        System.out.println(message(template, args));
    }
}
