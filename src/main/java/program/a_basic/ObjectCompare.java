package main.java.program.a_basic;

import java.util.Scanner;

public class ObjectCompare {
    public static void main(String[]args){
        ObjectCompare objectCompare= new ObjectCompare();
        objectCompare.compareByEqual();
    }
    public void compareByEqual(){
        Double x = new Double(1000);
        Double y = new Double(1000);//500
        System.out.println(x.equals(y));
    }

    public static class Factorial {
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
}
