package main.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");
        System.out.print("Digite a massa inicial (kg): ");
        float massa = sc.nextFloat();
        System.out.print("Digite o volume inicial (m³): ");
        float volume = sc.nextFloat();
        System.out.print("Digite a densidade inicial (kg/m³): ");
        float densidade = sc.nextFloat();
        System.out.print("Digite a altura inicial (m): ");
        float altura = sc.nextFloat();

        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);
        c1.massa = "2"; 
        //Questão 1
        //Ocorrência: Essa nova linha tenta alterar o valor de massa diretamente, mas não consegue.
        //Conclusão: Já que massa é um valor privado, ela não pode ser acessada diretamente, por isso é impossível alterá-la dessa forma. Para isso é necessário o método setter.

        //Questão 2
        //Ocorrência: A linha c1.massa = "2" agora possui permissão para alterar o valor de massa.
        //Conclusão: Ao alterar o modificador de acesso para public, é possível alterar o valor de massa, porém o tipo de dado provido é diferente do que é aceito. Nesse caso, c1.massa tenta inserir uma String como valor, mas massa é do tipo float.


        System.out.println("=== VALORES INICIAIS ===");
        System.out.printf("Massa: %.1f kg\n", c1.getMassa());
        System.out.printf("Volume: %.2f m³\n", c1.getVolume());
        System.out.printf("Densidade: %.1f kg/m³\n", c1.getDensidade());
        System.out.printf("Altura: %.2f m\n", c1.getAltura());
        System.out.printf("IMC: %.15f\n", c1.calcularIMC());

        c1.setVolume(10);
        //Questão 3
        //Ocorrência: O modificador de acesso foi alterado, impedindo outras classes de usarem o método.
        //Conclusão: Com essa alteração, é possível notar que o uso do método setVolume não funciona mais na classe Main pois ela não possui mais a permissão. Na classe CorpoHumano, também não há nenhum uso local para o método também, anulando-o.

        while (true) {
        System.out.printf("Digite uma nova massa: ");
        c1.setMassa(sc.nextFloat());
        System.out.printf("Digite uma nova altura: ");
        c1.setAltura(sc.nextDouble());

        System.out.println("=== NOVOS VALORES ===");
        System.out.printf("Nova massa: %.1f kg\n", c1.getMassa());
        System.out.printf("Nova altura: %.2f m\n", c1.getAltura());
        System.out.printf("Novo IMC: %.15f\n", c1.calcularIMC());
        }
    }
}
