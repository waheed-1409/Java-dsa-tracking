package DAY1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int t =sc.nextInt();
        for(int i=0;i<=t;i++){
            int  n=sc.nextInt();
            int count=0;
            for(int num=1;num<=n;num++){
                if (n % num == 0) {
                    count ++;
                }
            }
            if(count==2){
                System.out.println("prime");
            }
            else{
                System.out.println("Not prime");
            }

        }

    }

}
