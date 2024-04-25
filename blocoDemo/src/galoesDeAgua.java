public class galoesDeAgua {
    public static void main(String[] args){
        double galoes, litros;
        int counter;
        counter = 0;
        for(galoes = 1; galoes <= 100; galoes++){
            litros = galoes * 3.7854;
                    System.out.println(galoes + "galoes is " + litros + "litros");
            counter++;
            //cada décima linha, exibe uma linha em branco
            if(counter == 10){
                System.out.println();
                counter = 0; //zera o contador de linhas

            }
        }
    }
}
