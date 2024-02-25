package algs4.cs.princeton.edu.fundamentals.examples;

import algs4.cs.princeton.edu.utils.libs.StdDraw;
import algs4.cs.princeton.edu.utils.libs.StdRandom;

import java.util.Arrays;

public class DrawExamples {

    public static void main(String[] args) {
        //functionValues();
        arrayOfValues();
    }

    public static void functionValues() {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }

    public static void arrayOfValues() {
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
            a[i] = StdRandom.random();

        Arrays.sort(a);

        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
