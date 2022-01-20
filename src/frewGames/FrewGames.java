package frewGames;

public class FrewGames {

	//Atributos da classe
	private String nome;
	private Endereco endereco;
	private Colaborador colaborador;
	private Jogo jogo;
	private String cnpj;
	//Atributos auxiliares
	private float receita;
	private float custo;
	private float valorCaixa;
	private int numeroVendas;
	private int unidadesDisponiveisJogos;
	private int unidadesDisponiveisConsoles;
	
	public void cartaoLoja(Endereco endereco) {
		System.out.println("Venha comprar seus jogos na " + getNome() + "! localizado no " + endereco.getCidade() + " - " + endereco.getEndereco() + " - " + endereco.getNumero());
		System.out.println(endereco.getComplemento() + " - " + endereco.getReferencia());
	}
	
	public void venderJogo(InformacoesPessoais informacosVendedor, Vendedor vendedor, Jogo jogo, InformacoesPessoais cliente, Caixa caixa, Financeiro financeiro, float valorPago) {
		if (caixa.getValorCaixa() <= valorPago || valorPago >= jogo.getPreco()) {
			float troco = valorPago - jogo.getPreco();
			System.out.println("Jogo Vendido!"); 
			System.out.println("Via da compra:");
			System.out.println("CNPJ: " + getCnpj());
			System.out.println("Comprador: " + cliente.getNome() + " - " + cliente.getCpf());
			System.out.println("Vendedor: " + informacosVendedor.getNome() + " - " + informacosVendedor.getCpf());
			System.out.println("Jogo: " + jogo.getNome());
			System.out.println("Preço da compra: " + jogo.getPreco());
			System.out.println("Valor pago: " + valorPago);
			System.out.println("Troco: " + troco);
			float precoJogoVendido = jogo.getPreco();
			this.receita = financeiro.getReceita();
			this.receita += precoJogoVendido;
			financeiro.setReceita(this.receita);
			this.valorCaixa =  (jogo.getPreco() * 0.30f) + this.valorCaixa;
			caixa.setValorCaixa(this.valorCaixa);
			this.numeroVendas = vendedor.getNumeroVendas();
			this.numeroVendas++;
			vendedor.setNumeroVendas(this.numeroVendas);
			this.unidadesDisponiveisJogos = jogo.getUnidades();
			this.unidadesDisponiveisJogos--;
			jogo.setUnidades(unidadesDisponiveisJogos);
			if (troco > 0.0f) {
				this.valorCaixa = this.valorCaixa - troco;
				caixa.setValorCaixa(this.valorCaixa);
			}
		} else {
			System.out.println("Troco insuficiente ou saldo insuficiente!");
		}
	}
	
	public void venderConsole(InformacoesPessoais informacoesVendedor, Vendedor vendedor, Console console, InformacoesPessoais cliente, Caixa caixa, Financeiro financeiro, float valorPago) {
		if (caixa.getValorCaixa() <= valorPago || valorPago >= console.getPreco()) {
			float troco = valorPago - console.getPreco();
			System.out.println("Console Vendido!");
			System.out.println("Via da compra:");
			System.out.println("CNPJ: " + getCnpj());
			System.out.println("Comprador: " + cliente.getNome() + " - " + cliente.getCpf());
			System.out.println("Vendedor: " + informacoesVendedor.getNome() + " - " + informacoesVendedor.getCpf());
			System.out.println("Console: " + console.getNome());
			System.out.println("Preço da compra: " + console.getPreco());
			System.out.println("Valor pago: " + valorPago);
			System.out.println("Troco: " + troco);
			float precoConsoleVendido = console.getPreco();
			this.receita = financeiro.getReceita();
			this.receita += precoConsoleVendido;
			financeiro.setReceita(this.receita);
			this.valorCaixa =  (console.getPreco() * 0.30f) + this.valorCaixa;
			caixa.setValorCaixa(this.valorCaixa);
			this.unidadesDisponiveisJogos = console.getUnidades();
			this.unidadesDisponiveisJogos--;
			console.setUnidades(unidadesDisponiveisJogos);
			this.numeroVendas = vendedor.getNumeroVendas();
			this.numeroVendas++;
			vendedor.setNumeroVendas(this.numeroVendas);
			if (troco > 0.0f) {
				float valorCaixaAtual = caixa.getValorCaixa() - troco;
				caixa.setValorCaixa(valorCaixaAtual);
			}
		} else {
			System.out.println("Troco indisponivel ou saldo insuficiente!");
		}
	}
	
	public void comprarUnidadesJogos(Jogo jogo, int unidadesDesejadas, Financeiro financeiro) {
		float descontoCompraAtacado = jogo.getPreco() - (jogo.getPreco() * 0.40f);
		float precoUnidades = descontoCompraAtacado * unidadesDesejadas;
		if (financeiro.getReceita() >= precoUnidades) {
			this.unidadesDisponiveisJogos = jogo.getUnidades();
			this.unidadesDisponiveisJogos += unidadesDesejadas;
			this.custo = financeiro.getCusto();
			this.custo += precoUnidades;
			financeiro.setCusto(this.custo);
			jogo.setUnidades(this.unidadesDisponiveisJogos);
			System.out.println("Unidades Compradas com Sucesso!");
			System.out.println("Informações sobre o jogo");
			System.out.println("Nome do Jogo: " + jogo.getNome());
			System.out.println("Data da Lançamento: " + jogo.getDataLancamento());
			System.out.println("Genero: " + jogo.getGenero());
			System.out.println("Descrição: " + jogo.getDescricao());
			System.out.println("Preço: " + jogo.getPreco());
			System.out.println("Via da compra");
			System.out.println("Unidades Compradas: " + unidadesDesejadas);
			System.out.println("Valor total: " + precoUnidades);
			System.out.println("Unidades Disponiveis: " + jogo.getUnidades());
			System.out.println("Total de custo R$ " + financeiro.getCusto());
		} else {
			System.out.println("Não há receita suficiente para comprar os jogos!");
		}
	}
	
	public void comprarUnidadesConsoles(Console console, int unidadesDesejadas, Financeiro financeiro) {
		float descontoCompraAtacado = console.getPreco() - (console.getPreco() * 0.40f);
		float precoUnidades = descontoCompraAtacado * unidadesDesejadas;
		if (financeiro.getReceita() >= precoUnidades) {
			this.unidadesDisponiveisConsoles = console.getUnidades();
			this.unidadesDisponiveisConsoles += unidadesDesejadas;
			this.custo = financeiro.getCusto();
			this.custo += precoUnidades;
			financeiro.setCusto(this.custo);
			console.setUnidades(this.unidadesDisponiveisConsoles);
			System.out.println("Unidades Compradas com Sucesso!");
			System.out.println("Informações sobre o console");
			System.out.println("Nome: " + console.getNome());
			System.out.println("Data da Lançamento: " + console.getDataLancamento());
			System.out.println("Marca: " + console.getMarca());
			System.out.println("Modelo: " + console.getModelo());
			System.out.println("Cor: " + console.getCor());
			System.out.println("Armazenamento: " + console.getArmazenamento());
			System.out.println("Preço: " + console.getPreco());
			System.out.println("Via da compra");
			System.out.println("Unidades Compradas: " + unidadesDesejadas);
			System.out.println("Valor total: " + precoUnidades);
			System.out.println("Unidades Disponiveis: " + console.getUnidades());
		} else {
			System.out.println("Receita total insuficiente!");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public float getReceita() {
		return receita;
	}

	public void setReceita(float receita) {
		this.receita = receita;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public float getValorCaixa() {
		return valorCaixa;
	}

	public void setValorCaixa(float valorCaixa) {
		this.valorCaixa = valorCaixa;
	}

	public int getNumeroVendas() {
		return numeroVendas;
	}

	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}

	public int getUnidadesDisponiveis() {
		return unidadesDisponiveisJogos;
	}

	public void setUnidadesDisponiveis(int unidadesDisponiveis) {
		this.unidadesDisponiveisJogos = unidadesDisponiveis;
	}

	public int getUnidadesDisponiveisConsoles() {
		return unidadesDisponiveisConsoles;
	}

	public void setUnidadesDisponiveisConsoles(int unidadesDisponiveisConsoles) {
		this.unidadesDisponiveisConsoles = unidadesDisponiveisConsoles;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public int getUnidadesDisponiveisJogos() {
		return unidadesDisponiveisJogos;
	}

	public void setUnidadesDisponiveisJogos(int unidadesDisponiveisJogos) {
		this.unidadesDisponiveisJogos = unidadesDisponiveisJogos;
	}
}
