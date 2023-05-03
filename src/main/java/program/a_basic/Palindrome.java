package main.java.program.a_basic;

import java.util.Scanner;

public class Palindrome {
    public static void main (String[]age){
        String orginal,reverse="";
        int orgValLen;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Number Data ");
        orginal=scanner.nextLine();
        orgValLen=orginal.length();
       System.out.println(orginal+" Length :"+orgValLen);
        for(int i=orgValLen-1;i>=0;i--){
            reverse=reverse+orginal.charAt(i);
        }
        if(orginal.equals(reverse)){
            System.out.println(orginal+": is Palindrome String ");
        }
        else
            System.out.println(orginal+": is not Palindrome String ");;
    }
}
