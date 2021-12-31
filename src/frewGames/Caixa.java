package frewGames;

public class Caixa extends Colaborador {

	private float valorCaixa;
	
	public void verificarValorCaixa(FrewGames loja) {
		System.out.println("O valor do caixa é 30% da receita da loja. Então:");
		System.out.println("Receita: R$ " + loja.getReceita());
		System.out.println("Valor do Caixa: R$ " + loja.getValorCaixa());
	}

	public float getValorCaixa() {
		return valorCaixa;
	}

	public void setValorCaixa(float valorCaixa) {
		this.valorCaixa = valorCaixa;
	}
}
