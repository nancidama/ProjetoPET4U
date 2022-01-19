package Projeto;

public class Sobrecarga {

	public static void main(String[] args) {
		
	Animais Cao1 = new Animais("Ted","Macho","5");
		
		Cao1.imprime();
	System.out.println("\nInforme dados do Cachorro");
	
	Cao1.setGeneroAnimal("\nTed ");
	
	Cao1.setGeneroAnimal(" \nMacho ");
	
	Cao1.setIdade("\n5");

	Cao1.imprime();
	
	}
}

