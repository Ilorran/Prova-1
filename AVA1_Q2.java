//2. (1,0) Criar um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele
//no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, calcular e
//imprimir o total a receber no final do m�s

package ava1q2;
import java.util.Scanner;

public class AVA1_Q2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Venha saber seu sal�rio fixo + vendas!!");
		System.out.print("Digite o seu nome: ");
		String nome = teclado.nextLine();
		System.out.print("Agora digite seu sal�rio fixo: ");
		float salariofixo = teclado.nextFloat();
		System.out.print("Agora digite a quantidade de vendas feitas esse m�s: ");
		float vendasmes = teclado.nextFloat();
		System.out.print("Digite agora o valor que vendeu esse m�s em dinheiro: ");
		float vendastotaldinheiro = teclado.nextFloat();
		
		double comissao;
		
		comissao =(vendastotaldinheiro * vendasmes) * 0.15 + ((salariofixo));
		
		System.out.print("Olhaaa " + nome + " seu sal�rio ser� de: " + String.format("%.2f",comissao));
	}

}
