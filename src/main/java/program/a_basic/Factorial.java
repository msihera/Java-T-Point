package program.a_basic;

import java.util.Scanner;

public class Factorial {
    public static void main (String[]arg){
        double orginal,result=1;
        int finalOrginal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number value ");
        orginal=scanner.nextFloat();
        finalOrginal=(int)orginal;
        for(int i=1;i<=finalOrginal;i++){
            result=result*i;
        }
        System.out.println("Factorial Number is :"+result);
    }
}
