package frewGames;

public class Financeiro {

	private float receita;
	private float despesa;
	private float custo;
	private float gasto;
	private float lucro;
	
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
			System.out.println("Receita insuficiente para pagar os vendedores!");
		}
	}
	
	public void pagamentoSalarialCaixa(Caixa caixa) {
		if (this.receita >= caixa.getSalario()) {
			if (this.receita >= 10000.0f) {
				float bonusSalarial = (caixa.getSalario() * 0.20f) + caixa.getSalario();
				caixa.setSalario(bonusSalarial);
				System.out.println("O salario total da caixa é de R$ " + caixa.getSalario());
			} else {
				System.out.println("O salario total da caixa é de R$ " + caixa.getSalario());
			}
		} else {
			System.out.println("Receita insuficiente para pagar os caixas!");
		}
	}
	
	public void verificaLucro() {
		float totalDespesa = this.getDespesa() + this.getCusto() + this.getGasto();
		float lucroLiquido = totalDespesa - this.getReceita();
		this.setLucro(lucroLiquido);
		System.out.println("Informações Fincanceiras");
		System.out.println("Total de Receita: R$ " + this.getReceita());
		System.out.println("Total de Despesas: R$ " + this.getDespesa());
		System.out.println("Lucro Líquido: R$ " + this.getLucro());
	}

	public float getReceita() {
		return receita;
	}

	public void setReceita(float receita) {
		this.receita = receita;
	}

	public float getDespesa() {
		return despesa;
	}

	public void setDespesa(float despesa) {
		this.despesa = despesa;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public float getGasto() {
		return gasto;
	}

	public void setGasto(float gasto) {
		this.gasto = gasto;
	}

	public float getLucro() {
		return lucro;
	}

	public void setLucro(float lucro) {
		this.lucro = lucro;
	}
}
