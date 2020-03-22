package application;

import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//abaixo a leitura do N
		int n = sc.nextInt();
		
		//Como a gente cria matriz em Java ?
		
		//os dois abre e fecha colchetes que indicam que será um arranjo bidimensional 
		int[][] mat = new int[n][n];//esta linha instancia a matriz na memória. 
		
		//Como que faço para ler a matriz, ler os elementos da matriz ?
		//vamos ter que fazer dois for, o primeiro for vai percorrer as linhas, e para cada linha eu vou ter o segundo for, que percorre as colunas
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		//Como faço para imprimir a matriz ?
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				System.out.print(mat[i][j] + " ");							
			}
			System.out.println();
			
		}
		
		//Como faço para mostrar a diagonal principal ?
		
		System.out.println("Main diagonal");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		//Como faço para contar o número de elementos negativos da matriz ?
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for(int j=0; j<n ; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		
		//E a propriedade LENGHT ?
		
		for(int i=0; i < mat.length; i++) {
			for(int j=0; j < mat[i].length; j++) {
				System.out.print("Length ");							
			}
			System.out.println();			
		}
		
		
		sc.close();
	}

}
