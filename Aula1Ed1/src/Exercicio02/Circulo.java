/*
 * Copyright (c) Todos os Direitos Reservados 2021
 * @author :Guilherme Antônio Ramos da Silva
 * @Matricula: 2019101202010264
 * @Email: guilherme.ramos@estudante.ifgoiano.edu.br
 * @Telefone: (64) 99344-1336
 *
 */

package Exercicio02;

public class Circulo {

        private Ponto ponto;
        private int raio;


        //Construct 01
        public Circulo() {
            this.ponto.setX(0);
            this.ponto.setY(0);
            this.raio       = 0;
        }
        //Construct 02
        public Circulo(int x, int y, int r)
        {
            Ponto p = new Ponto();
            p.setX(x);
            p.setY(y);
            this.ponto = p;
            this.raio       = r;
        }

    public void setPonto(int x, int y) {
        this.ponto = new Ponto(x, y);
    }

    public void setRaio(int raio) {
        this.raio = raio;
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
                "  X=" + ponto.getX() +
                ", Y=" + ponto.getY() +
                ", raio=" + raio +
                '}';
    }
}

