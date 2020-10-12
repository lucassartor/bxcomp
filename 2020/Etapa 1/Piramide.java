import java.util.Scanner;

class Piramide {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testes = Integer.parseInt(sc.nextLine());

        Integer[] i = new Integer[testes];
        Integer[] j = new Integer[testes];

        for (int a = 0; a < testes; a++) {
            i[a] = sc.nextInt();
            j[a] = sc.nextInt();
        }

        sc.close();

        for (int a = 0; a < testes; a++) {
            switch (i[a]) {
                case 5:
                    if (j[a] == 4 || j[a] == 5)
                        System.out.println("Esse deve ser preenchido!");
                    else
                        System.out.println("Ei, isso nao vai formar um triangulo!");

                    break;

                case 6:
                    if (j[a] == 3 || j[a] == 4 || j[a] == 5 || j[a] == 6)
                        System.out.println("Esse deve ser preenchido!");
                    else
                        System.out.println("Ei, isso nao vai formar um triangulo!");
                    break;

                case 7:
                    if (j[a] == 2 || j[a] == 3 || j[a] == 4 || j[a] == 5 || j[a] == 6 || j[a] == 7)
                        System.out.println("Esse deve ser preenchido!");
                    else
                        System.out.println("Ei, isso nao vai formar um triangulo!");
                    break;

                case 8:
                    if (j[a] == 1 || j[a] == 2 || j[a] == 3 || j[a] == 4 || j[a] == 5 || j[a] == 6 || j[a] == 7 || j[a] == 8)
                        System.out.println("Esse deve ser preenchido!");
                    else
                        System.out.println("Ei, isso nao vai formar um triangulo!");
                    break;

                case 9:
                    System.out.println("Esse deve ser preenchido!");
                    break;

                default:
                    System.out.println("Ei, isso nao vai formar um triangulo!");
                    break;
            }
        }
    }
}
