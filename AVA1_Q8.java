/*8. (1.0) Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. Veja abaixo
alguns exemplos. Não fixe esses valores no código. Você pode usá-los para TESTAR seu algoritmo:*/

package ava1q8;
import java.util.Scanner;

public class AVA1_Q8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Vamos calcular a duração de um jogo?");
		System.out.print("Digite por favor o horário de início do jogo (Max 24 horas, não coloque valores negativos: ");
		int inicial = teclado.nextInt();
		System.out.print("Digite por favor o horário de término do jogo (Max 24 horas, não coloque valores negativos: ");
		int finalhora = teclado.nextInt();
		
		int a = 0;
		int b = 24;
		
		int horas_duração;
		
		if (inicial > finalhora) {
		horas_duração = (b - inicial) + finalhora;
		
		System.out.print(++horas_duração);
				}
		
		if (inicial < finalhora) {
			horas_duração = finalhora - inicial;
				System.out.print(horas_duração);
				}
		if (inicial > 25) {
			System.out.print("Selecione uma hora válida de acordo com a descrição");
				}
		else if (inicial < 0) {
			System.out.print("Selecione uma hora válida de acordo com a descrição");
		}
		else if (finalhora < 0) {
			System.out.print("Selecione uma hora válida de acordo com a descrição");
		}
		else if (finalhora > 25) {
			System.out.print("Selecione uma hora válida de acordo com a descrição");
		}
}
}
