//(2.0)Crie um programa que simule uma calculadora simples capaz de realizar as operações básicas. O programa 
//deve receber 3 dados: dois números e um caractere. Este caractere poderá ser '+', '-', ‘*' ou '/' , e representarão a 
//operação matemática que você deseja realizar entre os números.


package q1_ava1;
import java.util.Scanner;

public class AVA1_q1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner teclado0 = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		Scanner teclado4 = new Scanner(System.in);
		Scanner teclado5 = new Scanner(System.in);
		Scanner teclado6 = new Scanner(System.in);
		Scanner teclado7 = new Scanner(System.in);
		Scanner teclado8 = new Scanner(System.in);
		System.out.println("Vamos brincar de calcular?");
		System.out.println("Vamos lá, com nosso programinha, deixarei abaixo uma lista ");
		System.out.println("de informações necessárias para o uso do mesmo.");
		System.out.println("Qual opção gostaria de realizar?");
		System.out.println("[ + ] - Adição / DIGITE '1' UMA VEZ ");
		System.out.println("[ - ] - Subtração / DIGITE '2' DUAS VEZES ");
		System.out.println("[ / ] - Divisão / DIGITE '3' 3 VEZES ");
		System.out.println("[ * ] - Multiplição / DIGITE '4' QUATRO VEZES ");
		System.out.print("Digite: ");
		
		int selectedObject = teclado.nextInt();
		
		int mais;
		mais = selectedObject;
		 
		if (mais == 1.1) {	
			System.out.print("Agora selecione o valor 1 a ser somado: ");
			float first1 = teclado.nextInt();
			System.out.print("Agora selecione o valor 2 a ser somado: ");
			float second1 = teclado.nextInt();
			
			
			float mais1;
			float mais2;
			float mais3;

			
			mais1 = first1;
			mais2 = second1;	 
			mais3 = (mais1 + mais2);
				System.out.print("Resultado: " + mais3);
				}
		
		int selectedObject1 = teclado0.nextInt();		
		int menos;
		menos = selectedObject1;

		
		if (menos == 2.1) {
			System.out.print("Agora selecione o valor 1 a ser subtraído: ");
			float first2 = teclado1.nextFloat();
			System.out.print("Agora selecione o valor 2 a ser subtraído: ");
			float second2 = teclado2.nextFloat();
			
			float menos1;
			float menos2;
			float menos3;
			
			menos1 = first2;
			menos2 = second2;
			menos3 = (menos1 - menos2);
			
			System.out.print("Resultado: " + menos3);	
				}
		

		int selectedObject2 = teclado5.nextInt();		
		int divisao;
		divisao = selectedObject2;

		
		if (divisao == 3.1) {
			System.out.print("Agora selecione o valor 1 a ser dividido: ");
			float first3 = teclado3.nextFloat();
			System.out.print("Agora selecione o valor 2 a ser dividido: ");
			float second3 = teclado4.nextFloat();
			
			float divisao1;
			float divisao2;
			float divisao3;
			
			divisao1 = first3;
			divisao2 = second3;
			divisao3 = (divisao1 / divisao2);
			
			System.out.print("Resultado: " + divisao3);	
				}
		
		int selectedObject3 = teclado8.nextInt();		
		int multi;
		multi = selectedObject3;

		
		if (multi == 4) {
			System.out.print("Agora selecione o valor 1 a ser multiplicado: ");
			float first4 = teclado6.nextFloat();
			System.out.print("Agora selecione o valor 2 a ser multiplicado: ");
			float second4 = teclado7.nextFloat();
			
			float multi1;
			float multi2;
			float multi3;
			
			multi1 = first4;
			multi2 = second4;
			multi3 = (multi1 * multi2);
			
			System.out.print("Resultado: " + multi3);	
				}	
	}

}
