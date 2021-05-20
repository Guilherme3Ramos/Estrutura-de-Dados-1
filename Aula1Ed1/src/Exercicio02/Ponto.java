/*
 * Copyright (c) Todos os Direitos Reservados 2021
 * Powered by Guilherme Antônio Ramos da Silva
 * Matricula: 2019101202010264
 * Email: guilherme.ramos@estudante.ifgoiano.edu.br
 * Telefone: (64) 99344-1336
 *
 */

package Exercicio02;

public class Ponto {
    private int x;
    private int y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Ponto.Ponto{" +
                 x +
                ", " + y +
                '}';
    }

    public void deslocar(int dx, int dy)
    {
        this.x += dx;
        this.y += dy;
    }

    public double distancia (Ponto p)
    {
        return 0.0;
    }
}
