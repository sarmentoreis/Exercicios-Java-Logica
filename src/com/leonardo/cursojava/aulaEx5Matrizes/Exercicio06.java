package com.leonardo.cursojava.aulaEx5Matrizes;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
//		Ex 6
		
		System.out.println("Jogo da velha!\n");
		
		char[][] jogo = {{'-', '-' , '-'},
		                 {'-', '-' , '-'},
		                 {'-', '-' , '-'},};
		
		//Atualizando o tabuleiro
		for(int i=0; i<jogo.length; i++) {
			for(int j=0; j<jogo[i].length; j++) {
				System.out.print(" "+jogo[i][j]+" |");
			}
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);
		boolean fimDeJogo = false;
		int jogada = 0;
		int jogador1X = 0;
		int jogador1Y = 0;
		int jogador2X = 0;
		int jogador2Y = 0;
		boolean jogadaValida = false;
		boolean linhaValida = false;
		boolean colunaValida = false;
		
		while(!fimDeJogo) {
			
			if(jogada == 9) {
				System.out.println("O jogo empatou, ninguem ganhou!!!");
				fimDeJogo = true;
				break;
			}
			
			//Jogador 1
			
			System.out.println("\nVez do jogador 1");
						
			do {
				while (!linhaValida) {
					System.out.println("\nEntre com a posicao horizontal para inserir a peca (0,1,2):");
					jogador1X = scan.nextInt();
					if (jogador1X >= 0 && jogador1X <= 2) {
						linhaValida = true;
					}else {
						System.out.println("  *Posicao horizontal invalida, digite um numero de 0 a 2.*");
					}
				}
				
				linhaValida = false;
				
				while (!colunaValida) {
					System.out.println("Entre com a posicao vertical para inserir a peca (0,1,2):");
					jogador1Y = scan.nextInt();
					if (jogador1Y >= 0 && jogador1Y <= 2) {
						colunaValida = true;
					}else {
						System.out.println("  *Posicao horizontal invalida, digite um numero de 0 a 2.*");
					}
				}
				
				colunaValida = false;
				
				if(jogo[jogador1X][jogador1Y] == 'x' || jogo[jogador1X][jogador1Y] == 'o') {
					System.out.println("  *Essa posicao ja foi ocupada, seleciona outra por gentileza.*");
				}else {
					jogadaValida = true;
				}
			} while (!jogadaValida );

			
			jogo[jogador1X][jogador1Y] = 'x';
			jogada++;
			jogadaValida = false;

			//Atualizando o tabuleiro
			
			for(int i=0; i<jogo.length; i++) {
				for(int j=0; j<jogo[i].length; j++) {
					System.out.print(" "+jogo[i][j]+" |");
				}
				System.out.println();
			}
			
			//Verificacao de vitoria.
			if((jogo[0][0] == 'x' && jogo[0][1] == 'x' && jogo[0][2] == 'x') || // linha0
				(jogo[1][0] == 'x' && jogo[1][1] == 'x' && jogo[1][2] == 'x') || // linha1
				 (jogo[2][0] == 'x' && jogo[2][1] == 'x' && jogo[2][2] == 'x') || // linha2
				  (jogo[0][0] == 'x' && jogo[1][0] == 'x' && jogo[2][0] == 'x') || // coluna0
				   (jogo[0][1] == 'x' && jogo[1][1] == 'x' && jogo[2][1] == 'x') || // coluna1
				    (jogo[0][2] == 'x' && jogo[1][2] == 'x' && jogo[2][2] == 'x') || // coluna2
				     (jogo[0][0] == 'x' && jogo[1][1] == 'x' && jogo[2][2] == 'x') || // diagonal0a2
				      (jogo[0][2] == 'x' && jogo[1][1] == 'x' && jogo[2][0] == 'x')   // diagonal2a0
				       ) {
				
				System.out.println("\nFim de jogo.");
				System.out.println("Jogador 1 vencedor!!!");
				fimDeJogo = true;
				break;
			}
			
			if(jogada == 9) {
				System.out.println("O jogo empatou, ninguem ganhou!!!");
				fimDeJogo = true;
				break;
			}
			
			
			//Jogador 2
			
			System.out.println("\nVez do jogador 2");
			
			do {
				while (!linhaValida) {
					System.out.println("Entre com a posicao horizontal para inserir a peca (0,1,2):");
					jogador2X = scan.nextInt();
					if (jogador2X >= 0 && jogador2X <= 2) {
						linhaValida = true;
					}else {
						System.out.println("  *Posicao horizontal invalida, digite um numero de 0 a 2.*");
					}
				}
				
				linhaValida = false;
				
				while (!colunaValida) {
					System.out.println("Entre com a posicao vertical para inserir a peca (0,1,2):");
					jogador2Y = scan.nextInt();
					if (jogador2Y >= 0 && jogador2Y <= 2) {
						colunaValida = true;
					}else {
						System.out.println("  *Posicao horizontal invalida, digite um numero de 0 a 2.*");
					}
				}
				
				colunaValida = false;

				if(jogo[jogador2X][jogador2Y] == 'x' || jogo[jogador2X][jogador2Y] == 'o') {
					System.out.println("  *Essa posicao ja foi ocupada, seleciona outra por gentileza.*");
				}else {
					jogadaValida = true;
				}
			} while (!jogadaValida);

			
			jogo[jogador2X][jogador2Y] = 'o';
			jogada++;
			jogadaValida = false;
			
			//Atualizando o tabuleiro
			
			for(int i=0; i<jogo.length; i++) {
				for(int j=0; j<jogo[i].length; j++) {
					System.out.print(" "+jogo[i][j]+" |");
				}
				System.out.println();
			}
			
			//Verificacao de vitoria.
			if((jogo[0][0] == 'o' && jogo[0][1] == 'o' && jogo[0][2] == 'o') || // linha0
				(jogo[1][0] == 'o' && jogo[1][1] == 'o' && jogo[1][2] == 'o') || // linha1
				 (jogo[2][0] == 'o' && jogo[2][1] == 'o' && jogo[2][2] == 'o') || // linha2
				  (jogo[0][0] == 'o' && jogo[1][0] == 'o' && jogo[2][0] == 'o') || // coluna0
				   (jogo[0][1] == 'o' && jogo[1][1] == 'o' && jogo[2][1] == 'o') || // coluna1
				    (jogo[0][2] == 'o' && jogo[1][2] == 'o' && jogo[2][2] == 'o') || // coluna2
				     (jogo[0][0] == 'o' && jogo[1][1] == 'o' && jogo[2][2] == 'o') || // diagonal0a2
				      (jogo[0][2] == 'o' && jogo[1][1] == 'o' && jogo[2][0] == 'o')   // diagonal2a0
				       ) {
				
				System.out.println("\nFim de jogo.");
				System.out.println("Jogador 2 vencedor!!!");
				fimDeJogo = true;
				break;
			}
			
		}
		
	}

}
