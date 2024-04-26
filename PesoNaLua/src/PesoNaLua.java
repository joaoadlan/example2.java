import java.util.Scanner;

public class PesoNaLua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira o peso do objeto na Terra
        System.out.print("Digite o peso do objeto na Terra (em kg): ");
        double pesoNaTerra = scanner.nextDouble();

        // Calcula o peso do objeto na Lua
        double pesoNaLua = calcularPesoNaLua(pesoNaTerra);

        // Exibe o resultado
        System.out.println("O peso do objeto na Lua é: " + pesoNaLua + " kg");

        scanner.close();
    }

    // Método para calcular o peso do objeto na Lua
    public static double calcularPesoNaLua(double pesoNaTerra) {
        // A gravidade na Lua é aproximadamente 1/6 da gravidade na Terra
        final double gravidadeLua = 1.0 / 6.0;

        // Calcula o peso na Lua
        double pesoNaLua = pesoNaTerra * gravidadeLua;

        return pesoNaLua;
    }
}
