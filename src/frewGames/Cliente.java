package frewGames;

public class Cliente {

	private InformacoesPessoais informacoesPessoais;
	private Endereco endereco;
	private MeioContato contato;
	private String id;
	private float saldoId;
	private String senhaId;
	
	public float getSaldoId() {
		return saldoId;
	}
	
	public void setSaldoId(float saldo) {
		this.saldoId = saldo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSenhaId() {
		return senhaId;
	}

	public void setSenhaId(String senhaId) {
		this.senhaId = senhaId;
	}

	public InformacoesPessoais getInformacoesPessoais() {
		return informacoesPessoais;
	}

	public void setInformacoesPessoais(InformacoesPessoais informacoesPessoais) {
		this.informacoesPessoais = informacoesPessoais;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public MeioContato getContato() {
		return contato;
	}

	public void setContato(MeioContato contato) {
		this.contato = contato;
	}
}
