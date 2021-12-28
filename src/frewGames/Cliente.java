package frewGames;

public class Cliente {

	InformacoesPessoais informacoesPessoais;
	Endereco endereco;
	MeioContato contato;
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
}
