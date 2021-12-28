package frewGames;

public abstract class Console {

	private String nome;
	private String marca;
	private String modelo;
	private String dataLancamento;
	private String cor;
	private int armazenamento;
	private float preco;
	private int unidades;
	private boolean estaLigado;
	private boolean temJogo;
	private String jogoAtual;
	private float saldoIdAtual;
	private boolean possuiId;
	
	public void ligar(Console console) {
		if (this.isEstaLigado() == false) {
			System.out.println("O " + console.getNome() + " foi ligado!");
			this.setEstaLigado(true);
		} else {
			System.out.println("O " + console.getNome() + " já estava ligado!");
		}
	}
	
	public void criarId(Cliente cliente, String nomeId, String senhaDigitada) {
		if (cliente.getId() == null && this.isPossuiId() == false &&  cliente.getSenhaId() == null) {
			System.out.println("Conta criada com sucesso!");
			System.out.println("Sua id é " + nomeId);
			cliente.setId(nomeId);
			this.setPossuiId(true);
			cliente.setSenhaId(senhaDigitada);
		} else {
			System.out.println("Sua conta já foi criada!");
		}
	}
	
	public void logarId(Cliente cliente, String nomeId, String senhaId) {
		if (this.isPossuiId() == true) {
			if (nomeId == cliente.getId() && senhaId == cliente.getSenhaId()) {
				System.out.println("Logado com sucesso!");
				System.out.println("Bem-vindo " + cliente.getId());
			} else {
				System.out.println("Id ou senha incorretos!");
			}
		} else {
			System.out.println("Crie uma conta para poder logar!");
		}
	}
	 
	public void exibirPerfil(Cliente cliente, InformacoesPessoais informacoesCliente) {
		if (this.isPossuiId() == true) {
			System.out.println("Seu perfil");
			System.out.println("ID: " + cliente.getId());
			System.out.println("Nome: " + informacoesCliente.getNome());
			System.out.println("Sobrenome: " + informacoesCliente.getSobrenome());
			System.out.println("Data Nascimento: " + informacoesCliente.getDataNascimento());
			System.out.println("Saldo: R$ " + cliente.getSaldoId());
		}
	}
	
	public void inserirDinheiroId(Cliente cliente, float valorDesejado) {
		if (this.isPossuiId() == true) {
			System.out.println("Valor R$ " + valorDesejado + " inserido com sucesso!");
			this.saldoIdAtual += valorDesejado;
			cliente.setSaldoId(this.saldoIdAtual);
		} else {
			System.out.println("Crie uma Id para colocar dinheiro na conta!");
		}
	}
	
	public void desligar(Console console) {
		if (this.isEstaLigado() == true) {
			System.out.println("O " + console.getNome() + " foi desligado!");
			this.setEstaLigado(false);
		} else {
			System.out.println("O " + console.getNome() + " já estava ligado!");
		}
	}
	
	public void inserirJogo(Jogo jogo, Console console) {
		if (this.isEstaLigado() == true) {
			if (this.isTemJogo() == false || this.jogoAtual == null) {
				System.out.println("O " + jogo.getNome() + " foi inserido!");
				this.setTemJogo(true);
				this.setJogoAtual(jogo.getNome());
			} else {
				System.out.println("O " + console.getNome() + " já possui jogo!");
			}
		} else {
			System.out.println("Ligue primeiro o " + console.getNome() + " para inserir o " + jogo.getNome());
		}
	}
	
	public void trocarJogo(Console console, Jogo jogo, String novoJogo) {
		if (this.isEstaLigado() == true && this.isTemJogo() == true || this.getJogoAtual() != null) {
			System.out.println("O jogo " + jogo.getNome() + " foi trocado para o jogo " + novoJogo);
			this.setJogoAtual(novoJogo);
		} else {
			System.out.println("Ligue primeiro o " + console.getNome() + " e coloque algum jogo nele!");
		}
	}
	
	public void comprarJogoVirtual(Cliente cliente, String jogoDesejado, float precoJogo) {
		if (this.isPossuiId() == true) {
			if (cliente.getSaldoId() >= precoJogo) {
				System.out.println("Jogo comprado com sucesso!");
				System.out.println("Via da compra");
				System.out.println("Nome do jogo: " + jogoDesejado);
				System.out.println("Preço do Jogo: R$ " + precoJogo);
				this.saldoIdAtual = cliente.getSaldoId();
				this.saldoIdAtual -= precoJogo;
				cliente.setSaldoId(this.saldoIdAtual);
			} else {
				System.out.println("Saldo insuficiente!");
			}
		} else {
			System.out.println("Crie uma conta para inserir dinheiro nela!");
		}
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getArmazenamento() {
		return armazenamento;
	}
	
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public boolean isEstaLigado() {
		return estaLigado;
	}

	public void setEstaLigado(boolean estaLigado) {
		this.estaLigado = estaLigado;
	}

	public boolean isTemJogo() {
		return temJogo;
	}

	public void setTemJogo(boolean temJogo) {
		this.temJogo = temJogo;
	}

	public String getJogoAtual() {
		return jogoAtual;
	}

	public void setJogoAtual(String jogoAtual) {
		this.jogoAtual = jogoAtual;
	}

	public float getSaldoAtual() {
		return saldoIdAtual;
	}

	public void setSaldoAtual(float saldoAtual) {
		this.saldoIdAtual = saldoAtual;
	}

	public boolean isPossuiId() {
		return possuiId;
	}

	public void setPossuiId(boolean possuiId) {
		this.possuiId = possuiId;
	}
}
