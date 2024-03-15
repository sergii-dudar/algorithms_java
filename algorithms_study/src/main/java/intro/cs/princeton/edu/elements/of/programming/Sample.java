package intro.cs.princeton.edu.elements.of.programming;

import algs4.cs.princeton.edu.utils.ArrayUtil;

/******************************************************************************
 *  Compilation:  javac Sample.java
 *  Execution:    java Sample m n
 *
 *  This program takes two command-line arguments m and n and produces
 *  a random sample of m of the integers from 0 to n-1.
 *
 *  % java Sample 6 49
 *  10 20 0 46 40 6
 *
 *  % java Sample 10 1000
 *  656 488 298 534 811 97 813 156 424 109
 *
 ******************************************************************************/
public class Sample {

    public static void main(String[] args) {
        args = ArrayUtil.defaultInputIfEmpty(args, "6 49");
        int numberOfSamplingEls = Integer.parseInt(args[0]);    // choose this many elements
        int length = Integer.parseInt(args[1]);    // from 0, 1, ..., n-1

        // create permutation 0, 1, ..., n-1
        int[] perm = new int[length];
        for (int i = 0; i < length; i++) {
            perm[i] = i;
        }

        // create random sample in perm[0], perm[1], ..., perm[m-1]
        for (int i = 0; i < numberOfSamplingEls; i++) {

            // random integer between i and n-1
            int r = i + (int) (Math.random() * (length - i));

            // swap elements at indices i and r
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }

        // print results
        for (int i = 0; i < numberOfSamplingEls; i++)
            System.out.print(perm[i] + " ");
        System.out.println();
    }

}