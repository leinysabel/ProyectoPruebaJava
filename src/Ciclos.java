public class Ciclos {
    public static void main(String[] args) {
        
        int i = 1; int j = 99;

        System.out.println("Serie con for: ");
        for(i = 1; i <= 5; i++) {
            if (i < 5) {
                System.out.println(i + ",");
                System.out.println(j + ",");
            } else {
                System.out.println(i + ",");
                System.out.println(j);
            }
            j--;
        }

        System.out.println("Serie con while: ");
        i = 1; j = 99;

        while(i <= 5){
            if (i < 5) {
                System.out.println(i + ",");
                System.out.println(j + ",");
            } else {
                System.out.println(i + ",");
                System.out.println(j);
            }
            i++;
            j--;
        }

        System.out.println("\n Serie con do while: ");
        i = 1; j = 99;

        do {
            if (i < 5) {
                System.out.println(i + ",");
                System.out.println(j + ",");
            } else {
                System.out.println(i + ",");
                System.out.println(j);
            }
            i++;
            j--;
        } while (i <= 5);
    }
}
