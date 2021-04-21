///3. (1,0) Criar um programa que leia três números inteiros e apresente na tela o maior deles
package ava1q3;
import java.util.Scanner;

public class AVA1_Q3 {

	public static void main(String[] args) {
		Scanner teclado0 = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("Deixa que eu vejo o maior pra você!");
		System.out.println("Digite agora 3 números");
		System.out.print("Número 1: ");
		int num1 = teclado0.nextInt();
		System.out.print("Número 2: ");
		int num2 = teclado1.nextInt();
		System.out.print("Número 3: ");
		int num3 = teclado2.nextInt();
		
			if ((num1 > num2) && (num1 > num3)) {
				System.out.println(num1);
						 	 }
			else if((num2 > num1) && (num2 > num3)) {
				System.out.println(num2);
							 }
			else if ((num3 > num1) && (num3 > num2)) {
				System.out.println(num3);
							 }		 										
 }
}



