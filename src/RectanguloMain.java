import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el valor de la base: ");
        int base = entrada.nextInt();

        System.out.println("Ingresa el valor de la altura: ");
        int altura = entrada.nextInt();

        Rectangulo area = new Rectangulo(base, altura);
        area.imprimir();

    }
}
