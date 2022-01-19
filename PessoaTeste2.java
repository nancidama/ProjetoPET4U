package Projeto;

public class PessoaTeste2 {

	public  static  void  main ( String [] args ) {
		Scanner leia =  new  Scanner ( System . in);
		String nome =  " " , sobrenome =  " " , genero =  " " , telefone =  " " , endereco =  " " , cpf =  " " ;
		int idade =  18 ;
		Pessoa2 pessoa1 =  new  Pessoa2 (nome, sobrenome, genero, idade, cpf, telefone, endereco);

		
		Sistema . fora . println( " \n ================= BEM-VINDE A PET4U ================= " );
		Sistema . fora . println( " \n Você está cada vez mais perto do seu PET! Mas antes, queremos conhecer um \r\n "
				+  " um pouco, nos fale quem é você para podermos apresentar nossas opções: " );
		Sistema . fora . println( " \n Qual é o seu nome? " );
		nome = leia . Next();
		pessoa1 . setNome(nome);
		Sistema . fora . println( " \n Qual é o seu sobrenome? " );
		sobrenome = leia . Next();
		pessoa1 . setSobrenome(sobrenome);
		Sistema . fora . println( " \n Informe o seu gênero: " );
		genero = leia . Next();
		pessoa1 . setGenero(genero);
		Sistema . fora . println( " \n Qual é a sua idade? " );
		idade = leia . nextInt();
		pessoa1 . setIdade(idade);
		Sistema . fora . println( " \n Qual é o seu CPF? **Entre apenas com números** " );
		cpf = leia . Next();
		pessoa1 . setCpf(cpf);
		Sistema . fora . println( " \n Qual é o seu telefone? **Entre apenas com números** " );
		telefone = leia . Next();
		pessoa1 . setTelefone(telefone);
		leia . próximaLinha();
		Sistema . fora . println( " \n Informe seu endereço: " );
		endereçar = leia . próximaLinha();
		pessoa1 . setEndereco(endereco);
		
		if (idade < 18 )
		{
			Sistema . fora . println( " \ possui o suficiente na disponibilidade, " + nome + "  não idade sobrenome + " você ainda pode adotar um amicão na amicão sobrenome +  "
					+  " Assim complete 18 anos, que deve completar por você. " );
		}
		senão
		{
		pessoa1 . imprimirInfo();
        leia . Fechar();
		}
	}

}
}
