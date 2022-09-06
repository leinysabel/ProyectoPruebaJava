import java.util.Scanner;

public class Rectangulo {
    
    int base, altura, area;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void CalculoArea() {
        area = base * altura;
    }

    public void imprimir() {
        CalculoArea();
        System.out.println("El área del rectángulo es: " + area);
    }

    
}
