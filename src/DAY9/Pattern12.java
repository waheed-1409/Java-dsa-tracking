package DAY9;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a+"\t");
                int c=a+b;
                a=b;
                b=c;


            }
            System.out.println(" ");
        }

    }
}
