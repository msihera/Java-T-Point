package program.a_basic;

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
}
