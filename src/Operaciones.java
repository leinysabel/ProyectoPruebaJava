public class Operaciones {
    public static void main(String[] args) throws Exception {
        int num_uno = 5;
        int num_dos = 3;
        int resultado = 0;
        int parametro = 3;

        switch(parametro){
            case 1: resultado = num_uno + num_dos;
                    System.out.println("EL resultado de la suma es: " + resultado);
                    break;
            case 2: resultado = num_uno - num_dos;
                    System.out.println("EL resultado de la resta es: " + (num_uno - num_dos));
                    break;
            case 3: resultado = num_uno * num_dos;
                    System.out.println("EL resultado de la multiplicación es: " + resultado);
                    break;
            case 4: resultado = num_uno / num_dos;
                    System.out.println("EL resultado de la división es: " + resultado);
                    break;
            default: System.out.println("Error la opción no existe");
                    break;
        }
    }
}