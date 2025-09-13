package DAY4;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        System.out.println("Enter C: ");
        int c = sc.nextInt();
        int max;
        int min;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;

        } else {
            max = c;
        }
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;

        } else {
            min = c;
        }
        int length;
        if (a < max && a > min) {
            length = a;

        } else if (b < max && b > min) {
            length = b;
        } else {
            length = c;
        }
        int hypo = max;
        int br = min;
        System.out.println("Hypotenuse: " + hypo);
        System.out.println("length:" + length);
        System.out.println("breath :" + br);
        if (hypo * hypo == length * length + br * br) {
            System.out.println("Right angled triangle");


        } else {
            System.out.println("Not a right angled triangle");
        }


    }
}
