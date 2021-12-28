package frewGames;

public class Vendedor extends Colaborador {

	private float percentualComissao;
	private int numeroVendas;
	
	public void pedirAumentoSalarial(FrewGames loja, Vendedor vendedor, InformacoesPessoais informacoesVendedor) {
		float aumento;
		float salarioAumentado;
		if (vendedor.getNumeroVendas() >= 10) {
			aumento = 200.0f;
			salarioAumentado = aumento + vendedor.getSalario();
			System.out.println("Merece aumento salarial!");
			System.out.println("Seu aumento salarial é de R$ " + aumento);
			System.out.println("Nome: " + informacoesVendedor.getNome());
			System.out.println("Sobrenome: " + informacoesVendedor.getSobrenome());
			System.out.println("Cargo: " + this.getCargo());
			System.out.println("Número de Vendas: " + vendedor.getNumeroVendas());
			System.out.println("Salario: R$ " + vendedor.getSalario());
			vendedor.setSalario(salarioAumentado);
			System.out.println("Salario Bruto: R$ " + vendedor.getSalario());
			this.setMereceAumentoSalarial(true);
		} else if (vendedor.getNumeroVendas() >= 20) {
			aumento = 400.0f;
			salarioAumentado = aumento + vendedor.getSalario();
			System.out.println("Merece aumento salarial!");
			System.out.println("Seu aumento salarial é de R$ " + aumento);
			System.out.println("Nome: " + informacoesVendedor.getNome());
			System.out.println("Sobrenome: " + informacoesVendedor.getSobrenome());
			System.out.println("Cargo: " + this.getCargo());
			System.out.println("Número de Vendas: " + vendedor.getNumeroVendas());
			System.out.println("Salario: R$ " + vendedor.getSalario());
			vendedor.setSalario(salarioAumentado);
			System.out.println("Salario Bruto: R$ " + vendedor.getSalario());
			this.setMereceAumentoSalarial(true);
		} else if (vendedor.getNumeroVendas() >= 30) {
			aumento = 600.0f;
			salarioAumentado = aumento + vendedor.getSalario();
			System.out.println("Merece aumento salarial!");
			System.out.println("Seu aumento salarial é de R$ " + aumento);
			System.out.println("Nome: " + informacoesVendedor.getNome());
			System.out.println("Sobrenome: " + informacoesVendedor.getSobrenome());
			System.out.println("Cargo: " + this.getCargo());
			System.out.println("Número de Vendas: " + vendedor.getNumeroVendas());
			System.out.println("Salario: R$ " + vendedor.getSalario());
			vendedor.setSalario(salarioAumentado);
			System.out.println("Salario Bruto: R$ " + vendedor.getSalario());
			this.setMereceAumentoSalarial(true);
		} else {
			System.out.println("Aumento não merecido! Venda pelo menos 10 unidades para se ter um aumento!");
			System.out.println("Nome: " + informacoesVendedor.getNome());
			System.out.println("Sobrenome: " + informacoesVendedor.getSobrenome());
			System.out.println("Cargo: " + this.getCargo());
			System.out.println("Número de Vendas: " + vendedor.getNumeroVendas());
			System.out.println("Salario Bruto: " + this.getSalario());
			this.setMereceAumentoSalarial(false);
		}
	}
	
	public float getPercentualComissao() {
		return percentualComissao;
	}
	
	public void setPercentualComissao(float percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	
	public int getNumeroVendas() {
		return numeroVendas;
	}
	
	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}
}
