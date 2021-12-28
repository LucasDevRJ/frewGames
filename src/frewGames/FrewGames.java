package frewGames;

public class FrewGames {

	//Atributos da classe
	private String nome;
	Endereco endereco;
	Colaborador colaborador;
	Jogo jogo;
	private String cnpj;
	private float receita;
	private float custo;
	//Atributos auxiliares
	private float valorCaixa;
	private int numeroVendas;
	private int unidadesDisponiveisJogos;
	private int unidadesDisponiveisConsoles;
	
	public void cartaoLoja(Endereco endereco) {
		System.out.println("Venha comprar seus jogos na " + getNome() + "! localizado no " + endereco.getCidade() + " - " + endereco.getEndereco() + " - " + endereco.getNumero());
		System.out.println(endereco.getComplemento() + " - " + endereco.getReferencia());
	}
	
	public void venderJogo(InformacoesPessoais informacosVendedor, Vendedor vendedor, Jogo jogo, InformacoesPessoais cliente, Caixa caixa, float valorPago) {
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
			this.receita += precoJogoVendido;
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
	
	public void venderConsole(InformacoesPessoais informacoesVendedor, Vendedor vendedor, Console console, InformacoesPessoais cliente, Caixa caixa, float valorPago) {
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
			this.receita += precoConsoleVendido;
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
	
	public void pagamentoSalarialVendedor(Vendedor vendedor, InformacoesPessoais vendedorInformacoes, Console console, Jogo jogo) {
		if (this.receita >= vendedor.getSalario()) {
			float comissao = (jogo.getPreco() * vendedor.getPercentualComissao()) + (console.getPreco() * vendedor.getPercentualComissao());
			float salarioTotal = vendedor.getSalario() + (comissao * vendedor.getNumeroVendas());
			vendedor.setSalario(salarioTotal);
			System.out.println("Folha Salarial");
			System.out.println("Nome: " + vendedorInformacoes.getNome());
			System.out.println("Sobrenome: " + vendedorInformacoes.getSobrenome());
			System.out.println("Cargo: " + vendedor.getCargo());
			System.out.println("Número de Vendas: " + vendedor.getNumeroVendas());
			System.out.println("Salario Mensal Bruto: R$ "+ vendedor.getSalario());
			this.custo += salarioTotal;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void pagamentoSalarial(Caixa caixa) {
		if (this.receita >= caixa.getSalario()) {
			if (this.receita >= 10000.0f) {
				float bonusSalarial = (caixa.getSalario() * 0.10f) + caixa.getSalario();
				caixa.setSalario(bonusSalarial);
				System.out.println("O salario total da caixa é de R$ " + caixa.getSalario());
			} else {
				System.out.println("O salario total da caixa é de R$ " + caixa.getSalario());
			}
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void comprarUnidadesJogos(Jogo jogo, int unidadesDesejadas) {
		float descontoCompraAtacado = jogo.getPreco() - (jogo.getPreco() * 0.40f);
		float precoUnidades = descontoCompraAtacado * unidadesDesejadas;
		if (this.receita >= precoUnidades) {
			this.unidadesDisponiveisJogos = jogo.getUnidades();
			this.unidadesDisponiveisJogos += unidadesDesejadas;
			this.receita -= precoUnidades;
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
		} else {
			System.out.println("Receita total insuficiente!");
		}
	}
	
	public void comprarUnidadesConsoles(Console console, int unidadesDesejadas) {
		float descontoCompraAtacado = console.getPreco() - (console.getPreco() * 0.40f);
		float precoUnidades = descontoCompraAtacado * unidadesDesejadas;
		if (this.receita >= precoUnidades) {
			this.unidadesDisponiveisConsoles = console.getUnidades();
			this.unidadesDisponiveisConsoles += unidadesDesejadas;
			this.receita -= precoUnidades;
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
}
