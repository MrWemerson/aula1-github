package application;

import java.util.Scanner;

public class exercicioFixacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		//l� a matriz
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		//imprime matriz
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//conta as ocorr�ncias de um dado valor fornecido pelo usu�rio
		System.out.println("Informe um n�mero que pertence a matriz: ");
		int x = sc.nextInt();
		//int cont=0;
		int esq=0,dir=0,baixo=0, alto=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(x == mat[i][j]) {
					//cont++;
					System.out.println("posi��o " + i+","+j + ": ");
					
					if(j == 0) {
						System.out.println("direita: " + mat[i][j+1]);
					}else if(j == m-1) {
						System.out.println("esquerda: " + mat[i][j-1]);
					}else if(i <= j) {
						System.out.println("esquerda: " + mat[i][j-1]);
						System.out.println("direita: " + mat[i][j+1]);
					}					
					
					if(i+1 < n) {
						System.out.println("abaixo: " + mat[i+1][j]);
					}				
					
					if(i-1 >= 0) {
						System.out.println("acima: " + mat[i-1][j]);
					}
					
				}
			}
			System.out.println();
		}
		
		
		
		/*
		if(cont == 0) {
			System.out.println("O n�mero informando n�o pertence a matriz");
		}else {
			System.out.println("n�mero de vezes que " + x + " repete � igual a : " + cont);
		}
		*/
		
		sc.close();
	}

}
