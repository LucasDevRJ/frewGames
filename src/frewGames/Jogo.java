package frewGames;

public class Jogo {

	private String nome;
	private String dataLancamento;
	private int faixaEtaria;
	private String genero;
	private String descricao;
	private float preco;
	private int unidades;
	
	public void jogar(Console console, Jogo jogo) {
		if (console.isEstaLigado() == true && console.isTemJogo() == true) {
			System.out.println("Você está jogando " + console.getJogoAtual());
		} else {
			System.out.println("Ligue o console e/ou coloque um jogo nele!");
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
}
