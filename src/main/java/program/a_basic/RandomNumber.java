package main.java.program.a_basic;

public class RandomNumber {
    public static void main(String[]args){
        RandomNumber randomNumber=new RandomNumber();
        //Generate random int value from 200 to 400
        System.out.println(randomNumber.randomData(400,200));
    }
    public double randomData(){
        return Math.random();
    }
    public int randomData(int maxRange,int minRange){
        return (int)Math.random()*(maxRange-minRange+1)+minRange;
    }
}
