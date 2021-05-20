/*
 * Copyright (c) Todos os Direitos Reservados 2021
 * @author :Guilherme Antônio Ramos da Silva
 * @Matricula: 2019101202010264
 * @Email: guilherme.ramos@estudante.ifgoiano.edu.br
 * @Telefone: (64) 99344-1336
 *
 */

package Exercicio02;

public class TesteCirculos {
    public static void main(String[] args)
    {
        //Cria vetor01 com 5 Objetos Circulo
        Circulo vet01[] = new Circulo[5];

        //imprime x, y , raio de cada objeto
        for (int i =0; i<5;i++)
        {
           vet01[i] = new Circulo(i+3,i+5,i+8);
            System.out.println("Vetor01 "+i+": "+vet01[i]);
        }
        System.out.println("********************************");
        //Cria vetor02 com 5 Objetos Circulo
        Circulo vet02[] = new Circulo[vet01.length];

        //Copia o vet01 para o vet02
        for (int i =0; i<5;i++)
        {
             vet02[i]= vet01[i];
        }
        //imprime ambos os vetores
        for (int i =0; i<5;i++)
        {
            System.out.println("Vetor01 "+i+": "+vet01[i]);
            System.out.println("Vetor02 "+i+": "+vet02[i]);
        }
        System.out.println("********************************");
        Circulo vet03[] = new Circulo[vet01.length];
        for (int i =0; i<5;i++)
        {
            vet03[i]= vet01[i];
        }
        //Altera o VAlor do Raio para o vet01
        for (int i =0; i<5;i++)
        {
             vet01[i].setRaio(i+99);
        }
        //Imprime os 3 vetores
        for (int i =0; i<5;i++)
        {
            System.out.println("Vetor01 "+i+": "+vet01[i]);
            System.out.println("Vetor02 "+i+": "+vet02[i]);
            System.out.println("Vetor03 "+i+": "+vet03[i]);
        }

    }
}
