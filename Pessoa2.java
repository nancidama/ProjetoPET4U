package Projeto;

public class Pessoa2 {

	 nome da string privada ;
		private  String sobrenome;
		 gênero String privado ;
		 idade int privada ;
		privado  String cpf;
		 String telefone privado ;
		private  String endereco;

		public  Pessoa2 ( String  nome , String  sobrenome , String  genero , int idade , String cpf , String telefone , String endereco )    
		{
			isso . nome = nome;
			isso . sobrenome = sobrenome;
			isso . genero = genero;
			isso . idade = idade;
			isso . cpf = cpf;
			isso . telefone = telefone;
			isso . endereco = endereco;
		}

		public  String  getNome () {
			devolva  isso . nome;
		}

		public  void  setNome ( String  nome ) {
			isso . nome = nome;
		}

		public  String  getSobrenome () {
			return sobrenome;
		}

		public  void  setSobrenome ( String  sobrenome ) {
			isso . sobrenome = sobrenome;
		}

		public  String  getGenero () {
			retornar genero;
		}

		public  void  setGenero ( String  genero ) {
			isso . genero = genero;
		}

		public  int  getIdade () {
			retornar idade;
		}

		public  void  setIdade ( int  idade ) {
			isso . idade = idade;
		}

		public  String  getCpf () {
			retornar cpf;
		}

		public  void  setCpf ( String  cpf ) {
			isso . cpf = cpf;
		}

		public  String  getTelefone () {
			retornar telefone;
		}

		public  void  setTelefone ( String  telefone ) {
			isso . telefone = telefone;
		}

		public  String  getEndereco () {
			devolva  isso . endereço;
		}

		public  void  setEndereco ( String  endereco ) {
			isso . endereco = endereco;
		}

		public  void  imprimirInfo () {
			Sistema . fora . println( " \n *****Bem vinde "  + getNome() +  "  "  + getSobrenome()
					+  " ao PET4U! Estamos muito felizes por você querer fazer a diferença e formar uma "
					+  " família com nossos amicões!***** " );
			Sistema . fora . print( " \n Podemos garantir dados antes de continuarmos? " );
			Sistema . fora . println( " \n Seu nome completo é: "  + getNome() +  "  "  + getSobrenome());
			Sistema . fora . println( " \n Você é do gênero: "  + getGenero());
			Sistema . fora . println( " \n Sua idade é: "  + getIdade() +  " anos. " );
			Sistema . fora . println( " \n Seu telefone é: "  + getTelefone());
			Sistema . fora . println( " \n Seu endereço é: "  + getEndereco());

		}
		
	}

}
