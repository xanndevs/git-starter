public class Tester{
    public static void main(String args[]){
        System.out.println("Less gooooo!!!");
        System.out.println("iki sayının toplamı (3, 4)", topla(3, 4));

    }

    public int topla(int x, int y){
        return x+y;
    }

    public double topla(double x, double y){
        return y + x;
    }

    public int cikar(int x, int y){
        return x-y;
    }
    public int carp(int x, int y){
        return x*y;
    }
    public float bol(int x, int y){
        return x/y;
    }
}