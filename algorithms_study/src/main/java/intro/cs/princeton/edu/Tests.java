package intro.cs.princeton.edu;

import algs4.cs.princeton.edu.utils.MessageUtil;

public class Tests {

    public static void main(String[] args) {
        // System.out.println(10 ^ 6); // 1010 XOR 0110 = 1100 = 12
        //System.out.println(Math.round(6e5));


        //System.out.println('b');
        //System.out.println('b' + 'c'); //197
        //System.out.println("" + 'b' + 'c'); //bc
        //System.out.println((char) ('a' + 4));

        //System.out.println((Math.sqrt(2) * Math.sqrt(2)));

        double x = 0;
        double y = 0;

        do {  // Scale x and y to be random in (-1, 1).
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;
        } while (x * x + y * y > 1.0);

        MessageUtil.log("x = {}, y = {}", x, y);
    }
}
