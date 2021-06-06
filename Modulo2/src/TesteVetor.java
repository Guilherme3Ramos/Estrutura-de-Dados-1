/*
 * Copyright (c) Todos os Direitos Reservados 2021
 * @author :Guilherme Antônio Ramos da Silva
 * @Matricula: 2019101202010264
 * @Email: guilherme.ramos@estudante.ifgoiano.edu.br
 * @Telefone: (64) 99344-1336
 *
 */

public class TesteVetor
{
    public static void main(String[] args)
    {
        Vetor vet = new Vetor(10);

        vet.adiciona("João");
        vet.adiciona("Maria");
        vet.adiciona("Jonas");
        vet.adiciona("José");
        vet.adiciona("Abadia");
        vet.adiciona("Guilherme");
        vet.adiciona("Duda");

        System.out.println("\n**************************** VETOR PREENCHIDO **********************************");
        System.out.println("vet: " + vet);

        System.out.println("\n*********************** {BUSCA NO VETOR POR POSIÇÃO}  **************************");
        System.out.println("Nome na Posição é: " + vet.busca(5));

        System.out.println("\n*********************** {BUSCA NO VETOR POR ELEMENTO}  *************************");
        System.out.println("Posição da busca é: "+vet.busca("Abadia"));

        System.out.println("\n*********************** {ADICIONA ELEMNTO NO VETOR POR POSIÇÃO}  ***************");
       if( vet.adiciona(9,"Waldivino"))
        {
            System.out.println("vet: " + vet);
        }
        System.out.println("\n*********************** {REMOVE DO VETOR NA POSIÇÃO}  **************************");
       vet.remove(1);

        System.out.println("Após Exclusão, vet: " + vet);

        System.out.println("\n********************************************************************************");
    }
}
