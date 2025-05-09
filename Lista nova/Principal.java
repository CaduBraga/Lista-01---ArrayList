import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== Seja bem vindo ao programa de listas ===");

		List<TelefoneCelular> telefoneCelular = new ArrayList<>();
		List<TV> televisao = new ArrayList<>();
		List<Casa> casa = new ArrayList<>();
		List<Aluno> aluno = new ArrayList<>();
		List<Livro> livro = new ArrayList<>();
		List<AnimalDeEstimacao> animal = new ArrayList<>();
		List<Bicicleta> bicicleta = new ArrayList<>();
		List<Filme> filme = new ArrayList<>();
		List<Musica> musica = new ArrayList<>();
		List<JogoVideogame> jogo = new ArrayList<>();
		List<BolsaDeValores> bolsa = new ArrayList<>();

		boolean continuar = true;
		while (continuar) {

			System.out.println("O que você deseja fazer?");
			System.out.println("1 - Inserir itens numa lista");
			System.out.println("2 - Acessar uma lista");
			System.out.println("3 - Remover itens de uma lista");
			System.out.println("4 - Encerrar o programa");
			System.out.print("> ");
			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {

				case 1:
					System.out.println("Em qual lista você deseja inserir dados?");
					System.out.println("1 - Telefone Celular");
					System.out.println("2 - TV");
					System.out.println("3 - Casa");
					System.out.println("4 - Aluno");
					System.out.println("5 - Livro");
					System.out.println("6 - Animal de Estimação");
					System.out.println("7 - Bicicleta");
					System.out.println("8 - Filme");
					System.out.println("9 - Música");
					System.out.println("10 - Jogo de Videogame");
					System.out.println("11 - Bolsa de Valores");
					System.out.println("12 - Voltar");
					System.out.print("> ");
					int listaOpcao = scanner.nextInt();
					scanner.nextLine();

					switch (listaOpcao) {
						case 1:
							TelefoneCelular novoTelefone = new TelefoneCelular();
							novoTelefone.preencherDados(scanner);
							telefoneCelular.add(novoTelefone);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 2:
							TV novaTelevisao = new TV();
							novaTelevisao.preencherDados(scanner);
							televisao.add(novaTelevisao);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 3:
							Casa novaCasa = new Casa();
							novaCasa.preencherDados(scanner);
							casa.add(novaCasa);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 4:
							Aluno novoAluno = new Aluno();
							novoAluno.preencherDados(scanner);
							aluno.add(novoAluno);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 5:
							Livro novoLivro = new Livro();
							novoLivro.preencherDados(scanner);
							livro.add(novoLivro);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 6:
							AnimalDeEstimacao novoAnimal = new AnimalDeEstimacao();
							novoAnimal.preencherDados(scanner);
							animal.add(novoAnimal);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 7:
							Bicicleta novaBicicleta = new Bicicleta();
							novaBicicleta.preencherDados(scanner);
							bicicleta.add(novaBicicleta);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 8:
							Filme novoFilme = new Filme();
							novoFilme.preencherDados(scanner);
							filme.add(novoFilme);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 9:
							Musica novaMusica = new Musica();
							novaMusica.preencherDados(scanner);
							musica.add(novaMusica);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 10:
							JogoVideogame novoJogo = new JogoVideogame();
							novoJogo.preencherDados(scanner);
							jogo.add(novoJogo);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 11:
							BolsaDeValores novaBolsa = new BolsaDeValores();
							novaBolsa.preencherDados(scanner);
							bolsa.add(novaBolsa);
							System.out.println("Item adicionado com sucesso!");
							break;
						case 12:
							break;
						default:
							System.out.println("Opção inválida.");
					}
					break;
				case 2:

					break;
				case 3:

				case 4:
					System.out.println("Encerrando o programa...");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace(); // Em caso de interrupção da thread, exibe o erro
					}
					System.out.println("=== Programa encerrado ===");
					continuar = false;
					break;
				default:
					System.out.println("ERRO! Digite um número válido.");
			}
		}
		scanner.close();
	}
}