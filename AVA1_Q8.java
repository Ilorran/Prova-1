/*8. (1.0) Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode 
come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas. Veja abaixo
alguns exemplos. N�o fixe esses valores no c�digo. Voc� pode us�-los para TESTAR seu algoritmo:*/

package ava1q8;
import java.util.Scanner;

public class AVA1_Q8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Vamos calcular a dura��o de um jogo?");
		System.out.print("Digite por favor o hor�rio de in�cio do jogo (Max 24 horas, n�o coloque valores negativos: ");
		int inicial = teclado.nextInt();
		System.out.print("Digite por favor o hor�rio de t�rmino do jogo (Max 24 horas, n�o coloque valores negativos: ");
		int finalhora = teclado.nextInt();
		
		int a = 0;
		int b = 24;
		
		int horas_dura��o;
		
		if (inicial > finalhora) {
		horas_dura��o = (b - inicial) + finalhora;
		
		System.out.print(++horas_dura��o);
				}
		
		if (inicial < finalhora) {
			horas_dura��o = finalhora - inicial;
				System.out.print(horas_dura��o);
				}
		if (inicial > 25) {
			System.out.print("Selecione uma hora v�lida de acordo com a descri��o");
				}
		else if (inicial < 0) {
			System.out.print("Selecione uma hora v�lida de acordo com a descri��o");
		}
		else if (finalhora < 0) {
			System.out.print("Selecione uma hora v�lida de acordo com a descri��o");
		}
		else if (finalhora > 25) {
			System.out.print("Selecione uma hora v�lida de acordo com a descri��o");
		}
}
}
