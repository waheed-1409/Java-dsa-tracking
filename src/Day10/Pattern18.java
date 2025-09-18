package Day10;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sp=0;
        int st=n;
        for (int i=1;i<=n;i++){
            for (int j = 1; j <=sp ; j++) {
                System.out.print("\t");

            }
            for (int j = 1; j <=st ; j++) {
                if(i>1 && i<=n/2 && j > 1 && j<st){
                    System.out.print("\t");
                }else {
                    System.out.print("*\t");
                }
            }

            if(i<=n/2){
                st=st-2;
                sp++;

            }else {
                st=st+2;
                sp--;
            }
            System.out.println();
        }

    }
}
