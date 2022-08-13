package beecrowd;

import java.util.Scanner;
import java.text.DecimalFormat;
public class LinhaMatriz {
	static int[][] Matriz = new int[12][12];
	static Scanner console = new Scanner(System.in);
	static DecimalFormat format = new DecimalFormat("0.00");
	static int operacao = 0;
	static int index = 0;

	static void mostrarMenu() {
		System.out.println("\n\n");
		System.out.println("\t Menu");
		System.out.println("[ 1 ] Mostrar matriz: ");
		System.out.println("[ 2 ] Editar linha: ");
		System.out.println("[ 3 ] Somar linha: ");
		System.out.println("[ 4 ] Média da linha: ");
		System.out.println("[ 0 ] Sair do Menu: ");
		System.out.println("\n Digite a opção:");

		byte opcao = console.nextByte();
		switch (opcao) {
		case 0:
			System.err.println("Saiu do Menu");
			System.exit(opcao);
			break;
		case 1:
			mostrar();
			break;
		case 2:
			System.out.println("Digite a linha que deseja editar:");
			index = console.nextInt();
			setLinha(index);
			break;
		case 3:
			System.out.println("Qual linha deseja somar: ");
			index = console.nextInt();
			System.out.println("Resultado: " + soma());
			break;
		case 4:
			System.out.println("Qual linha deseja fazer a média: ");
			index = console.nextInt();
			System.out.println("Resultado: " + format.format(media()));
			break;
		default:
			System.err.println("Opção inválida");
			mostrarMenu();
			break;
		}
		mostrarMenu();
	}
	
	
	
	
	
	static public void mostrar() {
		for (int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz[i].length; j++) {
				System.out.print(Matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static public void setLinha(int index) {
		int coluna = 0;
		int num = 0;
		for (int j = 0; j < Matriz.length; j++) {
			System.out.println("Digite número da coluna " + (coluna + j));
			num = console.nextInt();
			Matriz[index][j] = num;
		}
	}

	static public double soma() {
		double soma = 0.0;
		for (int j = 0; j < Matriz[index].length; j++) {
			soma += Matriz[index][j];
		}
		return soma;
	}
	static public double media() {
		double media = 0;
		for (int j = 0; j < Matriz[index].length; j++) {
			media = soma() / Matriz.length;
		}
		return media;
	}

	public static void main(String[] args) {
		mostrarMenu();

	
	
	
	
	}

}
