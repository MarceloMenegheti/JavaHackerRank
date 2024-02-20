/*Usamos os números inteiros,, epara criar a seguinte série:

Você é dadoconsultas em forma de,, e. Para cada consulta, imprima a série correspondente ao dado,, evalores como uma única linha deinteiros separados por espaço.

Formato de entrada

A primeira linha contém um número inteiro,, denotando o número de consultas.
Cada linhadoas linhas subsequentes contêm três inteiros separados por espaços que descrevem os respectivos,, evalores para essa consulta.

Restrições

Formato de saída

Para cada consulta, imprima a série correspondente em uma nova linha. Cada série deve ser impressa em ordem como uma única linha deinteiros separados por espaço.

Exemplo de entrada

2
0 2 10
5 3 5
Saída de amostra

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explicação

Temos duas dúvidas:

Nós usamos,, eproduzir algumas séries:

... e assim por diante.

Uma vez que batemos, imprimimos os primeiros dez termos como uma única linha de inteiros separados por espaço.

Nós usamos,, eproduzir algumas séries:

Em seguida, imprimimos cada elemento de nossa série como uma única linha de valores separados por espaço. */

//package challenges.Java Loops II;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        
        Scanner ler = new Scanner(System.in);
        int consultas = ler.nextInt();
        int a,b,n;

        for(int j = 0; j < consultas; j++){
            
            a = ler.nextInt();
            b = ler.nextInt();
            n = ler.nextInt();
            int k = 0;

            for(int i = 0; i < n; i++){

                a += Math.pow(2,k) * b;
                System.out.print(a + " ");
                k++;
            }
            
        System.out.println();
        }
        ler.close();
    }
}