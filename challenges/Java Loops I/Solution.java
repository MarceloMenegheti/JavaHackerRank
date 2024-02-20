/* Objetivo
Neste desafio, usaremos loops para nos ajudar a fazer algumas contas simples.

Tarefa
Dado um número inteiro,, imprima seu primeiromúltiplos. Cada múltiplo(onde) deve ser impresso em uma nova linha no formato: N x i = result.

Formato de entrada

Um único número inteiro,.

Restrições

Formato de saída

Imprimirlinhas de saída; cada linha(onde) contém odena forma:
N x i = result.

Exemplo de entrada

2
Saída de amostra

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20 */

//package challenges.Java Loops I;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner ler =new Scanner(System.in);

        int number = ler.nextInt();

        for (int i = 1 ; i < 11 ; i++){
            System.out.println(number + " x " + i + " = " + number * i);
        }

    }
}
