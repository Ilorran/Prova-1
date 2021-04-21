//2. (1,0) Criar um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
//no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e
//imprimir o total a receber no final do mês

package ava1q2;
import java.util.Scanner;

public class AVA1_Q2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Venha saber seu salário fixo + vendas!!");
		System.out.print("Digite o seu nome: ");
		String nome = teclado.nextLine();
		System.out.print("Agora digite seu salário fixo: ");
		float salariofixo = teclado.nextFloat();
		System.out.print("Agora digite a quantidade de vendas feitas esse mês: ");
		float vendasmes = teclado.nextFloat();
		System.out.print("Digite agora o valor que vendeu esse mês em dinheiro: ");
		float vendastotaldinheiro = teclado.nextFloat();
		
		double comissao;
		
		comissao =(vendastotaldinheiro * vendasmes) * 0.15 + ((salariofixo));
		
		System.out.print("Olhaaa " + nome + " seu salário será de: " + String.format("%.2f",comissao));
	}

}
