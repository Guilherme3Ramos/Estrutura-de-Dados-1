/*
 * Copyright (c) Todos os Direitos Reservados 2021
 * @author :Guilherme Antônio Ramos da Silva
 * @Matricula: 2019101202010264
 * @Email: guilherme.ramos@estudante.ifgoiano.edu.br
 * @Telefone: (64) 99344-1336
 *
 */


package Exercicio01;

public class Main {

    public static void main(String[] args)
    {
        Circulo c1 = new Circulo();
        System.out.println("Circilo com valores zerados");
        System.out.println("Aréa: " + c1.area());
        System.out.println("Circunfêrencia: "+ c1.circunferencia());
        System.out.println("Diâmetro: "+ c1.diametro());
        System.out.println("******************************************************");

        Circulo c2 = new Circulo(10,5,31);

        System.out.println("Circilo com valores Atribuidos");
        System.out.println("Aréa: " + c2.area());
        System.out.println("Circunfêrencia: "+ c2.circunferencia());
        System.out.println("Diâmetro: "+ c2.diametro());


    }
}
