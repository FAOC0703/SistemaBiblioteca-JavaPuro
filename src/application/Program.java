package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> titulo = new ArrayList<>();
		List<String> autor = new ArrayList<>();
		List<Integer> ano = new ArrayList<>();
		List<Integer> quantidade = new ArrayList<>();
		int option = -1;
		
		do {
			System.out.println("==============================");
			
			System.out.println("       SISTEMA BIBLIOTECA");
			System.out.println("==============================");
			System.out.println();
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Listar livros");
			System.out.println("3 - Buscar livro");
			System.out.println("4 - Emprestar livro");
			System.out.println("5 - Devolver livro");
			System.out.println("6 - Remover livro");
			System.out.println("0 - Sair");
			System.out.println();
			System.out.print("Escolha uma opção: ");
			option = sc.nextInt();
			
			if(option == 0) {
				System.out.println("Encerrando programa!");
			} else if(option == 1) {
				System.out.print("Quantos livros deseja cadastrar: ");
				int n =sc.nextInt();
				
				cadastrarLivros(n, titulo, autor, ano, quantidade, sc);
			}
			
		} while(option != 0);
		
		
		sc.close();
	}
	
	public static void cadastrarLivros(int n, List<String> titulo, List<String> autor, List<Integer> ano, List<Integer> quantidade, Scanner sc) {
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Titulo: ");
			String title = sc.nextLine();
			System.out.print("Autor: ");
			String author = sc.nextLine();
			System.out.print("Ano de Publicação: ");
			int anoPublicacao = sc.nextInt();
			System.out.print("Quantidade Disponível: ");
			int quantDisponivel = sc.nextInt();
			titulo.add(title);
			autor.add(author);
			ano.add(anoPublicacao);
			quantidade.add(quantDisponivel);
		}
	}
}
