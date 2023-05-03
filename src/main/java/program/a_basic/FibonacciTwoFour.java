package main.java.program.a_basic;

public class FibonacciTwoFour {
    public static void main(String[]arg){
        int firstNum=2,secondNum=4,sum=0,counter=10;
        System.out.print(firstNum+" "+secondNum);
        for (int i=2;i<counter;i++){
            sum=firstNum+secondNum;
            System.out.print(" "+sum);
            firstNum=secondNum;
            secondNum=sum;
        }
    }

    public static class Ascii {
        public static void main(String[]args){
            char avalueString='a';
            int avalInt=avalueString;
            System.out.println(avalueString+": Value Shows as ASCII :"+avalInt);
        }
    }
}
