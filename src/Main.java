import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework8");
        System.out.println("Задача 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = new int[]{3, 2, 1};
        //double[] weights = new double[]{1.57, 7.654, 9.986};
        //weights[0] = 1.57;
        //double fractionalNumber = weights[0];
        //for (int i = 0; i < weights.length; i++) {
        //System.out.println(weights[i]);

        System.out.println("Задача 2");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i]);
            if (i != one.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i]);
            if (i != two.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < three.length; i++) {
            System.out.print(three[i]);
            if (i != three.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = one.length - 1; i > -1; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = two.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(two[i]);
            } else {
                System.out.print(two[i] + ",");
            }
        }
        System.out.println();

        for (int i = three.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(three[i]);
            } else {

                System.out.print(three[i] + ",");
            }
        }
        for (int i = two.length - 1; i > -1; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }

        System.out.println();


        System.out.println("Задача 4");
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i]++;
            }
        }
        System.out.println(Arrays.toString(one));

        for (int i = 0; i < two.length; i++) {
            if (two[i] % 2 != 0) {
                two[i]++;
            }
            System.out.print(two[i] + " ");
        }
    }
}




