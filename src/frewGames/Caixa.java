package frewGames;

public class Caixa extends Colaborador {

	private float valorCaixa;
	
	public void verificarValorCaixa(FrewGames loja) {
		System.out.println("O valor do caixa é 30% da receita da loja, logo ele possui R$ " + loja.getValorCaixa());
	}

	public float getValorCaixa() {
		return valorCaixa;
	}

	public void setValorCaixa(float valorCaixa) {
		this.valorCaixa = valorCaixa;
	}
}
