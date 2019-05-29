import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
//        System.out.printf("R = %d\n", 4 - ( 5 - 17 ) / ( 2 * 3 ));
//        System.out.printf("7 / 2 = %d\n", 7 / 2 );
//        System.out.printf("resto da divisão = %d\n", 7 % 2 );
//        System.out.printf("letra = %c\n", 'f' );
//        System.out.printf("palavra = %s\n", "Java" );
//        System.out.printf("Real = %f\n", 6.78 / 1.75 );
//        System.out.printf("Real = %.2f\n", 6.78 / 1.75 );
//
//        if(4<5){
//            System.out.println("é");
//        }else{
//            System.out.println("não");
//        }

//            int salario = 1000;
//            double aumento = 0.015;
//            double novoSalario = salario + (salario * aumento);
//
//            for(int i = 1996; i < 2019; i++){
//
//                aumento = aumento * 2;
//                novoSalario = novoSalario + (novoSalario * aumento);
//                System.out.println(novoSalario);

//            int a = 40;
//            int b = 100;
//
//            for(int i = a; i <= b; i = i + 2){
//                System.out.println(i);
//        }

//        int soma = 0;
//        for(int i = 0; i <= 100; i += 2){
//            soma = soma + i;
//            System.out.println(soma);
//        }

//        int primo = 25;
//        boolean ehPrimo = true;
//            for(int i = 2; i < primo; i++){
//                int conta = primo % i;
//                if(conta == 0){
//                    System.out.println("Ele não é primo");
//                    ehPrimo = false;
//                }
//            }
//
//            if(ehPrimo){
//                System.out.println("O numero " + primo + " é primo");
//            } else {
//                System.out.println("O numero " + primo + " não é primo");
//            }

        int[] primo = new int[9];
        primo[0] = 4;
        primo[1] = 3;
        primo[2] = 8;
        primo[3] = 14;
        primo[4] = 35;
        primo[5] = 5;
        primo[6] = 16;
        primo[7] = 13;
        primo[8] = 12;

        for(int i = 0; i < primo.length; i++) {
            for (int j = 2; j <= primo[i]; j++) {
                int conta = primo[i] % j;
                if ((conta == 0)) {
                    System.out.println(primo[i] + " não é primo e está no indice " + i);
                    break;
                } else if (primo[i] / j == 1) {
                    System.out.println(primo[i] + " é primo e está no indice " + i);
                    break;
                }
            }
        }
    }
}
