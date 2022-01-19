package Projeto;

public class Animais {

	private String nome;
	private String idade;
	private String GeneroAnimal;
	
	public Animais(String nome, String string, String string2) {
	System.out.println("Entre com os dados do seu Amicão...sz");
		this.nome = nome;
	}
	public void Animais(String nome, String idade, String GeneroAnimal) {
		this.idade = idade;
		this.nome = nome;
		this.GeneroAnimal = GeneroAnimal;
		}
	

	public void imprime(){
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.GeneroAnimal);}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getGeneroAnimal() {
		return GeneroAnimal;
	}

	public void setGeneroAnimal(String generoAnimal) {
		GeneroAnimal = generoAnimal;
	}
	}	