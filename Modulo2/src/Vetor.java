/*
 * Copyright (c) Todos os Direitos Reservados 2021
 * @author :Guilherme Antônio Ramos da Silva
 * @Matricula: 2019101202010264
 * @Email: guilherme.ramos@estudante.ifgoiano.edu.br
 * @Telefone: (64) 99344-1336
 *
 */


import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;
    private int tam_max = 100;

    public String[] getElementos() {
        return elementos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setElementos(String[] elementos) {
        this.elementos = elementos;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Vetor()
    {
        this.elementos = new String[this.tam_max];
        this.tamanho = 0;
    }

    public Vetor(int capacidade)
    {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento)
    {
        try
        {
            if(this.elementos.length <= this.tamanho)
            {
                throw new Exception("vetor cheio");
            }else
            {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
                return true;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

    }

    public boolean adiciona(int posicao ,  String elemento)
    {
        try
        {
            if(this.elementos.length < posicao)
            {
                throw new Exception("Posição Invalida");
            }

            if(this.elementos[posicao] != null)
            {
                for (int i = this.tamanho - 1; i >= posicao; i-=1)
                {
                    this.elementos[i + 1] = this.elementos[i];
                }
                this.elementos[posicao] = elemento;
                this.tamanho++;
                return true;
            }
            else
            {
                this.adiciona(elemento);
                return true;
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public String busca(int posicao)
    {
        try
        {
            if(this.elementos.length < posicao)
            {
                throw new Exception("Posição Invalida");
            }
            else
            {
                return this.elementos[posicao];
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }

    }

    public int busca(String elemento)
    {
        try
        {
            int tam = -1;
            for(int i =0 ; i <= this.tamanho; i++)
            {
                if(this.elementos[i] == elemento)
                {
                   tam = i;
                }
            }
            return tam;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return -1;
        }

    }

    public int tamanho()
    {
        return this.tamanho;
    }

    public void remove(int posicao)
    {
        try
        {
            if(this.elementos.length < posicao)
            {
                throw new Exception("Posição Invalida");
            }
            else
            {
                for (int i = posicao; i < this.tamanho - 1; i++)
                {
                    this.elementos[i] = this.elementos[i + 1];
                }
                this.tamanho--;

            }

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }
    }

    @Override
    public String toString() {
        String str =" [ ";
        for(int i=0; i< this.tamanho;i++)
        {
            str = str + (elementos[i] + " ");
        }
        str = str + " ]";
        return str;
    }
}
