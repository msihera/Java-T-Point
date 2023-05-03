package main.java.program.a_basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[]args){
        double orginalValue,result=0;
         int convertOrg,length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number value");
        orginalValue=scanner.nextDouble();
        convertOrg=(int)orginalValue;
        length=Integer.toString(convertOrg).length();
        //System.out.println(length);
        for (int i=1;i<=length-1;i++){
            result+=Math.pow(i,length);
        }
        System.out.println("Total Sum value "+result);
    }
}
