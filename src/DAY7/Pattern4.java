package DAY7;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        int sp=0;
        int st=n;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            sp++;
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            st--;
            System.out.println("");
        }

    }
}
