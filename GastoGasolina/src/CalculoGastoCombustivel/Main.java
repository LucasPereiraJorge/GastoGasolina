package CalculoGastoCombustivel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos quilometros foram percorridos durante a viagem?");
        double KmTotal = scanner.nextDouble();
        double gasto;

        System.out.println("Por favor insira o valor do combustível");
        double Combustível = scanner.nextFloat();

        System.out.println("Quantos quilometros (Km) o seu automóvel faz por litro de gasolina?");
        float KmLitro = scanner.nextFloat();

        gasto = KmTotal * Combustível;

        System.out.println("O total gasto durante a viagem foi de: " + (gasto / KmLitro));
    }
}