///3. (1,0) Criar um programa que leia tr�s n�meros inteiros e apresente na tela o maior deles
package ava1q3;
import java.util.Scanner;

public class AVA1_Q3 {

	public static void main(String[] args) {
		Scanner teclado0 = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Deixa que eu organizo esses 3 n�meros pra voc� (crescente)!");
		System.out.println("Digite agora 3 n�meros");
		System.out.print("N�mero 1: ");
		int num1 = teclado0.nextInt();
		System.out.print("N�mero 2: ");
		int num2 = teclado1.nextInt();
		System.out.print("N�mero 3: ");
		int num3 = teclado2.nextInt();
		
		if (num1 < num2) {
			if(num2 < num3) {
				System.out.println(num1 + ", "+ num2 + ", " + num3);
				}
			else if (num1 < num3) {
				System.out.println(num1 + ", "+ num3 + ", " + num2);
			 }
			else {
				System.out.println(num3 + ", "+ num1 + ", " + num2);
			  }
		}
			else if (num2 < num3) {
				if (num1 < num3) {
					System.out.println(num2 + ", "+ num1 + ", " + num3);
				} else {
					System.out.println(num2 + ", "+ num3 + ", " + num1);
				}
			}
			else {
				System.out.println(num3 + ", "+ num2 + ", " + num1);
			}
  }
}


