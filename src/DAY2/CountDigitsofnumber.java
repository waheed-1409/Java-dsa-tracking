package DAY2;

import java.util.Scanner;

public class CountDigitsofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int count =0;

        while(n!=0){
            n= n/10;
            count ++;
        }



        System.out.println("NUMBER OF DIGITS ARE: "+count);


    }
}
