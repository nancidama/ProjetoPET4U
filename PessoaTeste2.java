package Projeto;

public class PessoaTeste2 {

	public  static  void  main ( String [] args ) {
		Scanner leia =  new  Scanner ( System . in);
		String nome =  " " , sobrenome =  " " , genero =  " " , telefone =  " " , endereco =  " " , cpf =  " " ;
		int idade =  18 ;
		Pessoa2 pessoa1 =  new  Pessoa2 (nome, sobrenome, genero, idade, cpf, telefone, endereco);

		
		Sistema . fora . println( " \n ================= BEM-VINDE A PET4U ================= " );
		Sistema . fora . println( " \n Voc� est� cada vez mais perto do seu PET! Mas antes, queremos conhecer um \r\n "
				+  " um pouco, nos fale quem � voc� para podermos apresentar nossas op��es: " );
		Sistema . fora . println( " \n Qual � o seu nome? " );
		nome = leia . Next();
		pessoa1 . setNome(nome);
		Sistema . fora . println( " \n Qual � o seu sobrenome? " );
		sobrenome = leia . Next();
		pessoa1 . setSobrenome(sobrenome);
		Sistema . fora . println( " \n Informe o seu g�nero: " );
		genero = leia . Next();
		pessoa1 . setGenero(genero);
		Sistema . fora . println( " \n Qual � a sua idade? " );
		idade = leia . nextInt();
		pessoa1 . setIdade(idade);
		Sistema . fora . println( " \n Qual � o seu CPF? **Entre apenas com n�meros** " );
		cpf = leia . Next();
		pessoa1 . setCpf(cpf);
		Sistema . fora . println( " \n Qual � o seu telefone? **Entre apenas com n�meros** " );
		telefone = leia . Next();
		pessoa1 . setTelefone(telefone);
		leia . pr�ximaLinha();
		Sistema . fora . println( " \n Informe seu endere�o: " );
		endere�ar = leia . pr�ximaLinha();
		pessoa1 . setEndereco(endereco);
		
		if (idade < 18 )
		{
			Sistema . fora . println( " \ possui o suficiente na disponibilidade, " + nome + "  n�o idade sobrenome + " voc� ainda pode adotar um amic�o na amic�o sobrenome +  "
					+  " Assim complete 18 anos, que deve completar por voc�. " );
		}
		sen�o
		{
		pessoa1 . imprimirInfo();
        leia . Fechar();
		}
	}

}
}
