package intro.cs.princeton.edu.elements.of.programming;

import algs4.cs.princeton.edu.utils.ArrayUtil;
import algs4.cs.princeton.edu.utils.MessageUtil;

/******************************************************************************
 *  Compilation:  javac Binary.java
 *  Execution:    java Binary n
 *
 *  Prints out number in binary.
 *
 *  % java Binary 5
 *  101
 *
 *  % java Binary 106
 *  1101010
 *
 *  % java Binary 0
 *  0
 *
 *  % java Binary 16
 *  10000
 *
 *  Limitations
 *  -----------
 *  Does not handle negative integers.
 *
 *  Remarks
 *  -------
 *  could use Integer.toBinaryString(N) instead.
 *
 ******************************************************************************/

public class NumberToBinaryRepresentation {

    public static void main(String[] args) {

        // read in the command-line argument
        int number = Integer.parseInt(ArrayUtil.defaultIfEmpty(args, "100000000")[0]);

        MessageUtil.log("{} / 2 is {}\n", number, number / 2);

        // set power to the largest power of 2 that is <= number
        int power = 1;
        while (power <= number / 2) {
            MessageUtil.log("trying to find power: {} <= {}", power, number / 2);
            power *= 2;
        }

        MessageUtil.log("largest power of 2 that <= of '{}' is '{}'\n", number, power);
        final StringBuilder builder = new StringBuilder();

        // check for presence of powers of 2 in number, from largest to smallest
        while (power > 0) {

            // power is not present in number
            /*if (number < power) {
                builder.append(0);
            } else {
                // power is present in number, so subtract power from number
                builder.append(1);
                number -= power;
                MessageUtil.log("number = {} - {} = {}", number + power, power, number);
            }*/

            if (power <= number) {
                // power is present in number, so subtract power from number
                builder.append(1);
                number -= power;
                MessageUtil.log("power {} IN {} (1)", power, number + power);
            } else {
                builder.append(0);
                MessageUtil.log("power {} NOT IN {} (0)", power, number);
            }

            // next smallest power of 2
            power /= 2; //
            //MessageUtil.log("next power {}", power);
        }

        System.out.println("\n" + builder);

    }

}