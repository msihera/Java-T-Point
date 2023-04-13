package program.a_basic;

public class FibonacciMultiTwoTwo {
    public static void main(String[]a){
        int first=2,second=4,sum=0,count=5;
        System.out.print(first+" "+second);
        for (int i=2;i<count;i++){
            sum=first*second;
            System.out.print(" "+sum);
            first=second;
            second=sum;
        }
    }
}
