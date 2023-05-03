package main.java.program.a_basic;

import java.util.Scanner;

public class Pattern {
    public static void main(String[]args){
    Pattern pattern=new Pattern();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Your Pattern Character");
        String patternChar=scanner.nextLine();
        System.out.println("Input No of Row of Pattern");
        int columnNo=scanner.nextInt();
    pattern.patternString(patternChar,columnNo);
    }
    public void patternString(String patternChar,int columnNo){
        //outer loop for rows
        for (int i=0;i<columnNo;i++){
            //inner loop for rows
            for(int j=0;j<=i;j++){
                System.out.print(patternChar);
            }
            System.out.println();
        }
    }
}
