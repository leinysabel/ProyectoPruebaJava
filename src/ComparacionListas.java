import java.util.Scanner;

public class ComparacionListas {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];

        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("Ingresa el primer arreglo: ");
        for (int index = 0; index < a.length; index++) {
            System.out.print((index+1) + ". Ingresa el nodo: ");
            a[index] = entrada.nextInt();
        }

        System.out.println(" \n Ingresa el segundo arreglo: ");
        for (int index = 0; index < b.length; index++) {
            System.out.print((index+1) + ". Ingresa el nodo: ");
            b[index] = entrada.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }

        System.out.println("El arreglo mezclado es: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ", ");
        }
        entrada.close();
    }
}