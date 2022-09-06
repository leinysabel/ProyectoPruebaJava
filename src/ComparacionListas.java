import java.util.Scanner;

public class ComparacionListas {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];

        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("Ingresa el primer arreglo: ");
        int r = 0;
        for (int index = 0; index < a.length; index++) {
            System.out.println("Ingresa el nodo #: " + index+1);
            a[index] = entrada.nextInt();
            r = index++;
            System.out.println("Elemento # " + r + ":" + a[index]);
        }

        System.out.println("Ingresa el segundo arreglo: ");
        for (int index = 0; index < b.length; index++) {
            System.out.println("Ingresa el nodo #: " + index+1);
            b[index] = entrada.nextInt();
            System.out.println("Elemento # " + (index +1) + ":" + b[index]);
        }

    }
}