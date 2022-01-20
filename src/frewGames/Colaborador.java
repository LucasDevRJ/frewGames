package frewGames;

public abstract class Colaborador {

	private InformacoesPessoais informacoesPessoais;
	private MeioContato contato;
	private float salario;
	private String cargo;
	private Endereco endereco;
	private boolean mereceAumentoSalarial;
	 
	public MeioContato getContato() {
		return contato;
	}
	
	public void setContato(MeioContato contato) {
		this.contato = contato;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public boolean isMereceAumentoSalarial() {
		return mereceAumentoSalarial;
	}

	public void setMereceAumentoSalarial(boolean mereceAumentoSalarial) {
		this.mereceAumentoSalarial = mereceAumentoSalarial;
	}

	public InformacoesPessoais getInformacoesPessoais() {
		return informacoesPessoais;
	}

	public void setInformacoesPessoais(InformacoesPessoais informacoesPessoais) {
		this.informacoesPessoais = informacoesPessoais;
	}
}
