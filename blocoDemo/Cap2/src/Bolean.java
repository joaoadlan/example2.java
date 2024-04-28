public class Bolean {
    public static void main(String[] args){
        boolean b;
        b = false;
        System.out.print(" b é " + b);
        b = true;
        System.out.print(" b é " + b);
        //um valor booleano pode controlar uma instrução
        if(b); System.out.print(" Isso é executavel ");

        b = false;
        if(b); System.out.print(" Isso não é executável ");
        //o resultado de operador relacional é um valor booleano
        System.out.print(" 10 > 9 é " + (10 > 9));
    }
}
