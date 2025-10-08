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
        //Está dando erro pois massa é private e não pode ser acessada dessa forma

        //Questão 2
        //Agora massa pode ser acessada já que é public, mas o 2 nesse caso está como String, tendo uma disparidade com o tipo de dado (float)


        System.out.println("=== VALORES INICIAIS ===");
        System.out.printf("Massa: %.1f kg\n", c1.getMassa());
        System.out.printf("Volume: %.2f m³\n", c1.getVolume());
        System.out.printf("Densidade: %.1f kg/m³\n", c1.getDensidade());
        System.out.printf("Altura: %.2f m\n", c1.getAltura());
        System.out.printf("IMC: %.15f\n", c1.calcularIMC());

        c1.setVolume(10);
        //Questão 3
        //Por estar privada, não é possível utilizar o método nessa classe

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
