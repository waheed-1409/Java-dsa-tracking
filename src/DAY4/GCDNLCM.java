package DAY4;

import java.util.Scanner;

public class GCDNLCM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enetr num1: ");
        int num1=sc.nextInt();
        System.out.println("Enetr num2: ");
        int num2=sc.nextInt();
        int orn1=num1;
        int orn2=num2;
        if(num1 % num2 !=0){
            int rem =num1 % num2;
            num1=num2;
            num2=rem;
        }
        int gcd=num2;
        System.out.println(gcd);
        int lcm=(orn1 * orn2) / gcd;

        System.out.println(lcm);


    }
}
