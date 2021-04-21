//(1.0)Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara
package ava1q7;
import java.util.Scanner;
public class AVA1_Q7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Vamos calcular Bhaskara?  'v/' significa raiz");
		int b;
		int a;
		int c;
		int b1;
		double bhaskara;
		double bhaskara1;
		double bhaskara2;
		double bhaskara3;
		double delta;
		
		System.out.print("Digite 'B'(PARA DELTA): ");
		b = teclado.nextInt();
		
		System.out.print("Digite 'a' PARA DELTA : ");
		a = teclado.nextInt();
		
		System.out.print("Digite 'c' PARA DELTA: ");
		c = teclado.nextInt();
		
		System.out.print("Digite 'b' PARA Bhaskara (SEM O NEGATIVO): ");
		b1 = teclado.nextInt();
		
		delta = ((b * b) - 4 * a * c);
		
		double raizquadrada = Math.sqrt(delta);
		
		bhaskara = raizquadrada;
		bhaskara1 = raizquadrada;
		
		bhaskara = ((b1 ) - raizquadrada );
		
		bhaskara1 = ((-b1 ) + raizquadrada );
		
		bhaskara2 = bhaskara1 / (2 * a);
		bhaskara3 = bhaskara / (2 * a);
		
		
		System.out.println("Raiz quadrada de Bhaskara 1 é: " + String.format("%.2f",bhaskara2));
		System.out.println("Raiz quadrada de Bhaskara 2 é: " + String.format("%.2f",bhaskara3));
	}

}
