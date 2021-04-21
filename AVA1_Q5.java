//5. (1,0) Criar um programa que leia a idade de um nadador e apresente a sua categoria de acordo com a tabela abaixo
package ava1q5;
import java.util.Scanner;
public class AVA1_Q5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos descobrir sua categoria de nadador!");
		
		System.out.print("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		if (idade >= 5) {
			if (idade <= 7) {
				System.out.print("Categoria: Infantil A!!");
				}
			}
		if (idade >= 8) {
			if (idade <= 10) {
				System.out.print("Categoria: Infantil B!!");
				}
			}
		if (idade >= 11) {
			if (idade <= 13) {
				System.out.print("Categoria: Juvenil A!!");
				}
			}
		if (idade >= 14) {
			if (idade <= 17) {
				System.out.print("Categoria: Juvenil B!!");
				}
			}
		if (idade >= 18) {
			System.out.print("Categoria: Adulto!!");
				}
			}

}

