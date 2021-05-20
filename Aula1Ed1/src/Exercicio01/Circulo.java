/*
 * Copyright (c) Todos os Direitos Reservados 2021
 * @author :Guilherme Antônio Ramos da Silva
 * @Matricula: 2019101202010264
 * @Email: guilherme.ramos@estudante.ifgoiano.edu.br
 * @Telefone: (64) 99344-1336
 *
 */



package Exercicio01;

public class Circulo {
    private int centrox;
    private int centroy;
    private int raio;



    //Construct 01
    public Circulo() {
        this.centrox    = 0;
        this.centroy    = 0;
        this.raio       = 0;
    }
    //Construct 02
    public Circulo(int x, int y, int r)
    {
        this.centrox    = x;
        this.centroy    = y;
        this.raio       = r;
    }

    public int getCentrox() {
        return centrox;
    }

    public int getCentroy() {
        return centroy;
    }

    public int getRaio() {
        return raio;
    }


    public double area()
    {
        double area = 0;
        area = (Math.PI * Math.pow(this.raio,2));
        return area;

    }
    public double circunferencia()
    {
        double circunferencia = 0;
        circunferencia =(2* Math.PI * this.raio);
        return circunferencia;
    }

    public int diametro()
    {
        int diametro = 0;
        diametro = 2 * this.raio;
        return diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centrox=" + centrox +
                ", centroy=" + centroy +
                ", raio=" + raio +
                '}';
    }
}
