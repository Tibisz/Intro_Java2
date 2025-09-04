public class Calculator { //polimorfism static
    public int aduna(int a, int b){
        return a+b;
    }
    public int aduna(int a, int b, int c){
        return a+b+c;
    }
    public double aduna (double a, double b){
        return a+b;
    }
    public static void main (String[] args){
        Calculator c = new Calculator();
        System.out.println(c.aduna (5,5));
        System.out.println(c.aduna (5,5, 5));
        System.out.println(c.aduna (5.2 ,5.1 ));
    }
}
