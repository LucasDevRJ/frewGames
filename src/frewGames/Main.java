package frewGames;

public class Main {

	public static void main(String[] args) {
		
		//Criando o objeto InformacoesPessoais e setando atributos
		InformacoesPessoais informacoesCliente = new InformacoesPessoais();
		informacoesCliente.setNome("Carlos");
		informacoesCliente.setSobrenome("Vieira");
		informacoesCliente.setCpf("222.222.222-22");
		informacoesCliente.setDataNascimento("17/02/2004");
		informacoesCliente.setNacionalidade("brasileiro");
		informacoesCliente.setRg("111.333.22");
		
		//Criando o objeto Endereco e setando atributos
		Endereco enderecoCliente = new Endereco();
		enderecoCliente.setPais("Brasil");
		enderecoCliente.setCidade("Rio de Janeiro");
		enderecoCliente.setEstado("Rio de Janeiro");
		enderecoCliente.setBairro("Taquara");
		enderecoCliente.setEndereco("Rua dos Munhecas");
		enderecoCliente.setNumero(1210);
		enderecoCliente.setComplemento("Casa número 15");
		enderecoCliente.setReferencia("Próximo ao mercado Guanabara");
		enderecoCliente.setCep(23223222);
		
		//Criando o objeto MeioContato e setando atributos
		MeioContato contatoCliente = new MeioContato();
		contatoCliente.setEmail("carlosvieira@outlook.com");
		contatoCliente.setCelular(33333333);
		contatoCliente.setTelefone(444444444);
		contatoCliente.setFacebook("www.facebook/carlosvieira.com.br");
		contatoCliente.setInstagram("www.instagram/vieiracarlos.com.br");
		contatoCliente.setWhatsapp(33333333);
		
		//Criando objeto Cliente
		Cliente cliente = new Cliente();
		cliente.setEndereco(enderecoCliente);
		cliente.setInformacoesPessoais(informacoesCliente);
		cliente.setContato(contatoCliente);
		
		InformacoesPessoais informacoesCliente2 = new InformacoesPessoais();
		informacoesCliente2.setNome("Lúcio");
		informacoesCliente2.setSobrenome("Lima");
		informacoesCliente2.setCpf("333.222.333-22");
		informacoesCliente2.setDataNascimento("16/06/2001");
		informacoesCliente2.setNacionalidade("brasileiro");
		informacoesCliente2.setRg("333.222-33");
		
		Endereco enderecoCliente2 = new Endereco();
		enderecoCliente2.setPais("Brasil");
		enderecoCliente2.setCidade("Rio de Janeiro");
		enderecoCliente2.setEstado("Rio de Janeiro");
		enderecoCliente2.setBairro("Guerrengue");
		enderecoCliente2.setEndereco("Rua Aristoncio");
		enderecoCliente2.setNumero(530);
		enderecoCliente2.setComplemento("Casa número 2");
		enderecoCliente2.setReferencia("Vila de casa");
		enderecoCliente2.setCep(22222222);
		
		MeioContato contatoCliente2 = new MeioContato();
		contatoCliente2.setEmail("luciolima@live.com");
		contatoCliente2.setCelular(44433334);
		contatoCliente2.setTelefone(222222222);
		contatoCliente2.setFacebook("www.facebook/luciolima.com.br");
		contatoCliente2.setInstagram("www.instagram/luciolima.com.br");
		contatoCliente2.setWhatsapp(44433334);
		
		Cliente cliente2 = new Cliente();
		cliente2.setEndereco(enderecoCliente2);
		cliente2.setInformacoesPessoais(informacoesCliente2);
		cliente2.setContato(contatoCliente2);
		
		InformacoesPessoais informacoesCliente3 = new InformacoesPessoais();
		informacoesCliente3.setNome("Rafael");
		informacoesCliente3.setSobrenome("Rodolfo");
		informacoesCliente3.setCpf("333.111.333-00");
		informacoesCliente3.setDataNascimento("23/02/1997");
		informacoesCliente3.setNacionalidade("brasileiro");
		informacoesCliente3.setRg("111.222-33");
		
		Endereco enderecoCliente3 = new Endereco();
		enderecoCliente3.setPais("Brasil");
		enderecoCliente3.setCidade("Rio de Janeiro");
		enderecoCliente3.setEstado("Rio de Janeiro");
		enderecoCliente3.setBairro("Tijuca");
		enderecoCliente3.setEndereco("Rua Aristencola");
		enderecoCliente3.setNumero(530);
		enderecoCliente3.setComplemento("apartamento 302");
		enderecoCliente3.setReferencia("Condominio luxoso");
		enderecoCliente3.setCep(33322222);
		
		MeioContato contatoCliente3 = new MeioContato();
		contatoCliente3.setEmail("rafaelrodolfo@gmail.com");
		contatoCliente3.setCelular(11112222);
		contatoCliente3.setTelefone(111112222);
		contatoCliente3.setFacebook("www.facebook/rafaelrodolfo.com.br");
		contatoCliente3.setInstagram("www.instagram/rafaelrodolfo.com.br");
		contatoCliente3.setWhatsapp(11112222);
		
		Cliente cliente3 = new Cliente();
		cliente3.setEndereco(enderecoCliente3);
		cliente3.setInformacoesPessoais(informacoesCliente3);
		cliente3.setContato(contatoCliente3);
		
		InformacoesPessoais informacoesCliente4 = new InformacoesPessoais();
		informacoesCliente4.setNome("Gabriel");
		informacoesCliente4.setSobrenome("Pereira");
		informacoesCliente4.setCpf("222.444.666-11");
		informacoesCliente4.setDataNascimento("10/09/2006");
		informacoesCliente4.setNacionalidade("brasileiro");
		informacoesCliente4.setRg("222.111-33");
		
		Endereco enderecoCliente4 = new Endereco();
		enderecoCliente4.setPais("Brasil");
		enderecoCliente4.setCidade("Rio de Janeiro");
		enderecoCliente4.setEstado("Rio de Janeiro");
		enderecoCliente4.setBairro("Cacatal");
		enderecoCliente4.setEndereco("Rua Enelsom");
		enderecoCliente4.setNumero(9800);
		enderecoCliente4.setComplemento("apartamento 310");
		enderecoCliente4.setReferencia("Condominio fafará");
		enderecoCliente4.setCep(44441111);
		
		MeioContato contatoCliente4 = new MeioContato();
		contatoCliente4.setEmail("gabrielpereira@gmail.com");
		contatoCliente4.setCelular(44443222);
		contatoCliente4.setTelefone(444555453);
		contatoCliente4.setFacebook("www.facebook/gabrielpereira.com.br");
		contatoCliente4.setInstagram("www.instagram/gabrielpereira.com.br");
		contatoCliente4.setWhatsapp(44443222);
		
		Cliente cliente4 = new Cliente();
		cliente4.setEndereco(enderecoCliente4);
		cliente4.setInformacoesPessoais(informacoesCliente4);
		cliente4.setContato(contatoCliente4);
		
		//Criando o objeto Jogo e setando atributos
		Jogo jogo = new Jogo();
		jogo.setNome("GTA IV");
		jogo.setPreco(130.0f);
		jogo.setDataLancamento("12/08/2008");
		jogo.setGenero("Violência");
		jogo.setFaixaEtaria(18);
		jogo.setDescricao("Jogo de ação com violência em mundo aberto.");
		jogo.setUnidades(10);
		
		Jogo jogo2 = new Jogo();
		jogo2.setNome("FIFA 21");
		jogo2.setPreco(140.0f);
		jogo2.setDataLancamento("20/11/2020");
		jogo2.setFaixaEtaria(4);
		jogo2.setDescricao("Jogo de futebol.");
		jogo2.setGenero("Esporte");
		jogo2.setUnidades(8);
		
		Jogo jogo3 = new Jogo();
		jogo3.setNome("Mortal Kombat");
		jogo3.setPreco(110.0f);
		jogo3.setDataLancamento("08/03/2008");
		jogo3.setFaixaEtaria(18);
		jogo3.setDescricao("Jogo de luta com gore.");
		jogo3.setGenero("Luta");
		jogo3.setUnidades(6);
		
		Jogo jogo4 = new Jogo();
		jogo4.setNome("Bully");
		jogo4.setPreco(70.0f);
		jogo4.setDataLancamento("03/05/2006");
		jogo4.setFaixaEtaria(18);
		jogo4.setDescricao("Jogo de mundo aberto com violência.");
		jogo4.setGenero("Aventura em mundo aberto");
		jogo4.setUnidades(9);
		
		//Criando o objeto InformacoesVendedor e setando atributos
		InformacoesPessoais informacoesVendedor = new InformacoesPessoais();
		informacoesVendedor.setNome("Júlio");
		informacoesVendedor.setSobrenome("Gomes");
		informacoesVendedor.setCpf("35633465433");
		informacoesVendedor.setDataNascimento("12/03/1997");
		informacoesVendedor.setRg("232322342");
		informacoesVendedor.setNacionalidade("brasileiro");
		
		//Criando objeto MeioContato e setando atributos
		MeioContato contatoVendedor = new MeioContato();
		contatoVendedor.setEmail("juliogomees@gmail.com");
		contatoVendedor.setCelular(21232345);
		contatoVendedor.setTelefone(11232343);
		contatoVendedor.setFacebook("www.facebook/juliogomeess.com.br");
		contatoVendedor.setInstagram("www.instagram/juliogomeess.com.br");
		contatoVendedor.setWhatsapp(21232345);
		
		//Criando obejto Endereco e setando atributos
		Endereco enderecoVendedor = new Endereco();
		enderecoVendedor.setPais("Brasil");
		enderecoVendedor.setCidade("Rio de Janeiro");
		enderecoVendedor.setEstado("Rio de Janeiro");
		enderecoVendedor.setBairro("Tanque");
		enderecoVendedor.setEndereco("Rua dos Asfaltos");
		enderecoVendedor.setNumero(1440);
		enderecoVendedor.setComplemento("Casa número 08");
		enderecoVendedor.setReferencia("Próximo a praça da bandeira");
		enderecoVendedor.setCep(23435334);
		
		//Criando o objeto Vendedor e setando atributos
		Vendedor vendedor = new Vendedor();
		vendedor.setContato(contatoVendedor);
		vendedor.setEndereco(enderecoVendedor);
		vendedor.setInformacoesPessoais(informacoesVendedor);
		vendedor.setSalario(1800.0f);
		vendedor.setPercentualComissao(0.05f);
		vendedor.setCargo("vendedor");
		
		InformacoesPessoais informacoesVendedor2 = new InformacoesPessoais();
		informacoesVendedor2.setNome("Rodolfo");
		informacoesVendedor2.setSobrenome("Silveira");
		informacoesVendedor2.setCpf("122.333.222-11");
		informacoesVendedor2.setDataNascimento("14/02/1995");
		informacoesVendedor2.setRg("222.111-33");
		informacoesVendedor2.setNacionalidade("brasileiro");
		
		Vendedor vendedor2 = new Vendedor();
		vendedor2.setSalario(1800.0f);
		vendedor2.setPercentualComissao(0.05f);
		vendedor2.setCargo("vendedor");
		
		//Criando o objeto PlayStation e setando atributos
		PlayStation playstation = new PlayStation();
		playstation.setNome("PlayStation");
		playstation.setMarca("Sony");
		playstation.setCor("Preto");
		playstation.setModelo("Slim");
		playstation.setArmazenamento(1);
		playstation.setDataLancamento("12/06/2012");
		playstation.setPreco(2300.0f);
		playstation.setEhEdicaoEspecial(false);
		playstation.setUnidades(7);
		playstation.setEstaLigado(false);
		playstation.setTemJogo(false);
		
		//Criando o objeto Xbox e setando atributos
		Xbox xbox = new Xbox();
		xbox.setNome("Xbox");
		xbox.setMarca("Microsoft");
		xbox.setCor("Preto");
		xbox.setModelo("Slim");
		xbox.setArmazenamento(1);
		xbox.setDataLancamento("12/06/2008");
		xbox.setPreco(1600.0f);
		xbox.setUnidades(5);
		xbox.setEhEdicaoEspecial(false);
		
		//Criando objeto Nintendo e setando atributos
		Nintendo nintendo = new Nintendo();
		nintendo.setNome("Nintendo");
		nintendo.setMarca("Nintendo");
		nintendo.setCor("Azul");
		nintendo.setModelo("Fat");
		nintendo.setArmazenamento(1);
		nintendo.setDataLancamento("11/04/2009");
		nintendo.setPreco(1200.0f);
		nintendo.setEhEdicaoEspecial(false);
		
		//Criando objeto InformacoesPessoais para o Objeto Gerente
		InformacoesPessoais informacoesGerente = new InformacoesPessoais();
		informacoesGerente.setNome("Lúcio");
		informacoesGerente.setSobrenome("Silva");
		informacoesGerente.setNacionalidade("brasileiro");
		informacoesGerente.setCpf("211.333.212-11");
		informacoesGerente.setRg("122.323-32");
		informacoesGerente.setDataNascimento("11/02/1996");
		
		//Criando o objeto Gerente e setando atributos
		Gerente gerente = new Gerente();
		gerente.setCargo("gerente");
		gerente.setSalario(3000.0f);
		
		//Criando objeto InformacoesCaixa e setando atributos
		InformacoesPessoais informacoesCaixa = new InformacoesPessoais();
		informacoesCaixa.setNome("Melissa");
		informacoesCaixa.setSobrenome("Petrovic");
		informacoesCaixa.setDataNascimento("11/06/2002");
		informacoesCaixa.setCpf("223.222.111-11");
		informacoesCaixa.setRg("122.332-11");
		informacoesCaixa.setNacionalidade("brasileira");
		
		//Criando o objeto MeioContato para o objeto Caixa
		MeioContato contatoCaixa = new MeioContato();
		contatoCaixa.setEmail("melissaaa@gmail.com");
		contatoCaixa.setCelular(34234223);
		contatoCaixa.setTelefone(342322342);
		contatoCaixa.setFacebook("www.facebook/melissaaapetrovic.com.br");
		contatoCaixa.setInstagram("www.instagram/melisaaapetrovic.com.br");
		contatoCaixa.setWhatsapp(34234223);
		
		//Criando objeto Endereco para o objeto Caixa
		Endereco enderecoCaixa = new Endereco();
		enderecoCaixa.setPais("Brasil");
		enderecoCaixa.setCidade("Rio de Janeiro");
		enderecoCaixa.setEstado("Rio de Janeiro");
		enderecoCaixa.setBairro("Taquara");
		enderecoCaixa.setEndereco("Rua dos Planaltos");
		enderecoCaixa.setNumero(1930);
		enderecoCaixa.setComplemento("Casa número 11");
		enderecoCaixa.setReferencia("Próximo ao shopping");
		enderecoCaixa.setCep(24323211);
		
		//Criando objeto Caixa e setando atributos
		Caixa caixa = new Caixa();
		caixa.setSalario(2000.0f);
		caixa.setCargo("caixa");
		
		//Criando objeto InformacoesPessoais para o objeto Caixa
		InformacoesPessoais informacoesCaixa2 = new InformacoesPessoais();
		informacoesCaixa2.setNome("Joana");
		informacoesCaixa2.setSobrenome("Lima");
		informacoesCaixa2.setDataNascimento("04/06/1999");
		informacoesCaixa2.setCpf("232.322.333-22");
		informacoesCaixa2.setRg("223.443-11");
		informacoesCaixa2.setNacionalidade("brasileira");
		
		//Criando objeto Caixa e setando atributos
		Caixa caixa2 = new Caixa();
		caixa2.setCargo("caixa");
		
		//Criando objeto Financeiro
		Financeiro financeiro = new Financeiro();
		financeiro.setDespesa(300.0f);
		financeiro.setGasto(200.0f);
		
		//criando objeto Endereco e setando os atributos
		Endereco enderecoLoja = new Endereco();
		enderecoLoja.setPais("Brasil");
		enderecoLoja.setCidade("Rio de Janeiro");
		enderecoLoja.setEstado("Rio de Janeiro");
		enderecoLoja.setBairro("Freguesia");
		enderecoLoja.setCep(23434545);
		enderecoLoja.setComplemento("Sala 403, bloco 3");
		enderecoLoja.setReferencia("Próximo ao shopping");
		enderecoLoja.setNumero(3004);
		enderecoLoja.setEndereco("Rua Alcantra");
				
		//Criando objeto LojaVideoGame e setando valor
		FrewGames loja = new FrewGames();
		loja.setNome("Frew Games");
		loja.setCnpj("11.111.111/1111-11");
		loja.setEndereco(enderecoLoja);
		loja.setColaborador(vendedor);
		
		//Chamada de métodos da classe Loja
		loja.cartaoLoja(enderecoLoja);
		System.out.println();
		loja.venderConsole(informacoesVendedor, vendedor, xbox, informacoesCliente4, caixa, financeiro, 1700.0f);
		System.out.println();
		loja.venderJogo(informacoesVendedor, vendedor, jogo, informacoesCliente, caixa, financeiro, 150);
		System.out.println();
		loja.venderJogo(informacoesVendedor2, vendedor2, jogo, informacoesCliente2, caixa, financeiro, 200);
		System.out.println();
		loja.venderJogo(informacoesVendedor, vendedor, jogo, informacoesCliente2, caixa2, financeiro, 130);
		System.out.println();
		loja.venderJogo(informacoesVendedor2, vendedor2, jogo4, informacoesCliente3, caixa2, financeiro, 70);
		loja.comprarUnidadesJogos(jogo4, 2, financeiro);
		System.out.println();
		loja.comprarUnidadesJogos(jogo2, 4, financeiro);
		System.out.println();
		loja.venderJogo(informacoesVendedor, vendedor2, jogo2, informacoesCliente3, caixa, financeiro, 200);
		System.out.println();
		loja.venderJogo(informacoesVendedor2, vendedor, jogo4, informacoesCliente4, caixa, financeiro, 70);
		System.out.println();
		loja.venderConsole(informacoesVendedor, vendedor, playstation, informacoesCliente, caixa, financeiro, 2300);
		System.out.println();
		loja.venderConsole(informacoesVendedor2, vendedor2, playstation, informacoesCliente2, caixa, financeiro, 2300);
		System.out.println();
		loja.venderConsole(informacoesVendedor2, vendedor2, playstation, informacoesCliente4, caixa, financeiro, 2300);
		System.out.println();
		loja.venderJogo(informacoesVendedor, vendedor, jogo, informacoesCliente2, caixa, financeiro, 200);
		System.out.println();
		loja.venderConsole(informacoesVendedor2, vendedor2, xbox, informacoesCliente4, caixa, financeiro, 1700);
		System.out.println();
		loja.venderConsole(informacoesVendedor2, vendedor2, nintendo, informacoesCliente4, caixa, financeiro, 1200);
		System.out.println();
		loja.venderConsole(informacoesVendedor2, vendedor2, playstation, informacoesCliente2, caixa2, financeiro, 2300);
		System.out.println();
		loja.comprarUnidadesConsoles(xbox, 2, financeiro);
		System.out.println();
		
		//Chamada dos métodos do Financeiro
		financeiro.pagamentoSalarialVendedor(vendedor, informacoesVendedor, playstation, jogo);
		System.out.println();
		financeiro.pagamentoSalarialVendedor(vendedor2, informacoesVendedor2, xbox, jogo);
		System.out.println();
		financeiro.pagamentoSalarialCaixa(caixa, informacoesCaixa);
		System.out.println();
		financeiro.verificaLucro();
		System.out.println();
		
		//Chamada de métodos da Classe PlayStation
		playstation.ligar(playstation);
		System.out.println();
		playstation.inserirJogo(jogo, playstation);
		System.out.println();
		playstation.criarId(cliente, "Van Guard", "aaa");
		System.out.println();
		playstation.logarId(cliente, "Van Guard", "aaa");
		System.out.println();
		playstation.inserirDinheiroId(cliente, 200.0f);
		System.out.println();
		playstation.comprarJogoVirtual(cliente, "Uncharted", 120.0f);
		System.out.println();
		playstation.exibirPerfil(cliente, informacoesCliente);
		System.out.println();
		playstation.trocarJogo(playstation, jogo, "The Last of Us");
		System.out.println();
		
		//Chamada de métodos da Classe Jogo
		jogo.jogar(playstation, jogo);
		System.out.println();
		
		//Chamada de métodos das Classes Colaborador
		caixa.verificarValorCaixa(loja);
		System.out.println();
		gerente.verificaFinanceiro(financeiro);
		System.out.println();
		vendedor.pedirAumentoSalarial(loja, vendedor, informacoesVendedor);
		System.out.println();
		gerente.acessarInformacoesColaborador(informacoesVendedor, contatoVendedor, enderecoVendedor, vendedor);
		System.out.println();
		gerente.acessarInformacoesColaborador(informacoesCaixa, contatoCaixa, enderecoCaixa, caixa);
		System.out.println();
	}
}
