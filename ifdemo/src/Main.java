public class Main{

    public static void main(String[] args){
        int a, b, c;
        a = 2;
        b = 5;

        if (a>b) System.out.println("a is less than be b");
        if (a==b) System.out.println("this won't diplayed");
        System.out.println();

        c = a - b;
        System.out.println("c contians -3");
        if (c >= 0) System.out.println("c is non-negative");
        if (c < 0) System.out.println("c is negative");

    }
}