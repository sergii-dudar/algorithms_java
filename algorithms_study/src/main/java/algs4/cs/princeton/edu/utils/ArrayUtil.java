package algs4.cs.princeton.edu.utils;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.ArrayUtils;

@UtilityClass
public class ArrayUtil {

    public static String[] defaultIfEmpty(String[] args, String... def) {
        return ArrayUtils.isEmpty(args) ? def : args;
    }
}
