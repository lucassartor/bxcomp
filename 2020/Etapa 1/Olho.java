import java.util.Scanner;

class Olho {
    public static int mdc(int dividendo, int divisor) {

        if ((dividendo % divisor == 0)) {
            return divisor;
        } else {
            return mdc(divisor, (dividendo % divisor));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testes = Integer.parseInt(sc.nextLine());
        
        Integer[] x = new Integer[testes];
        Integer[] y = new Integer[testes];


        for (int i = 0; i < testes; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        sc.close();
        
        for (int i = 0; i < testes; i++) {
            int z = mdc(x[i], y[i]);

            if(z > 1 && (x[i] > 0 && y[i] > 0))
                System.out.println("A pocao podera ser feita e seu maior fator comum eh " + z + ".");
            
            else
                System.out.println("Nao sera possivel produzir a pocao.");

        }
    }
}