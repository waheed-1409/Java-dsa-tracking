package DAY8;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <=n ; j++) {
                if(i == j){
                    System.out.print("*\t");

            }else {
                    System.out.print("\t");


                }





            }
            System.out.println("");



        }
    }
}
