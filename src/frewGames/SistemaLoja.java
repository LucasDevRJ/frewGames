package frewGames;

public interface SistemaLoja {

	public abstract void acessarInformacoesColaborador(InformacoesPessoais informacoesColaborador, MeioContato contato, Endereco endereco, Colaborador colaborador);
	
	public abstract void verificaFinanceiro(FrewGames informacoesLoja);
}
