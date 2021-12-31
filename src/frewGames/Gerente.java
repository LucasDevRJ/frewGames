package frewGames;

public class Gerente extends Colaborador implements SistemaLoja{

	@Override
	public void acessarInformacoesColaborador(InformacoesPessoais informacoesColaborador, MeioContato contato, Endereco endereco, Colaborador colaborador) {
		System.out.println("Informações do Pessoais do Colaborador");
		System.out.println("Nome: " + informacoesColaborador.getNome());
		System.out.println("Sobrenome: " + informacoesColaborador.getSobrenome());
		System.out.println("Data de Nascimento: " + informacoesColaborador.getDataNascimento());
		System.out.println("Cargo: " + colaborador.getCargo());
		System.out.println("Salario Bruto: " + colaborador.getSalario());
		System.out.println("CPF: " + informacoesColaborador.getCpf());
		System.out.println("RG: " + informacoesColaborador.getRg());
		System.out.println("Meios de Contato");
		System.out.println("E-mail: " + contato.getEmail());
		System.out.println("Celular: " + contato.getCelular());
		System.out.println("Telefone: " + contato.getTelefone());
		System.out.println("Facebook: " + contato.getFacebook());
		System.out.println("Instagram: " + contato.getInstagram());
		System.out.println("WhatsApp: " + contato.getWhatsapp());
		System.out.println("Endereço");
		System.out.println("País: " + endereco.getPais());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Estado: " + endereco.getEstado());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Endereço: " + endereco.getEndereco());
		System.out.println("Número: " + endereco.getNumero());
		System.out.println("Complemento: " + endereco.getEndereco());
		System.out.println("Referência: " + endereco.getReferencia());
		System.out.println("CEP: " + endereco.getCep());
	}

	@Override
	public void verificaFinanceiro(Financeiro financeiro) {
		System.out.println("Informações Financeiras da Loja");
		System.out.println("Total de Receita R$ " + financeiro.getReceita());
		System.out.println("Total de Despesas R$ " + financeiro.getDespesa());
		System.out.println("Total de Custos R$ " + financeiro.getCusto());
		System.out.println("Total de Gastos R$ " + financeiro.getGasto());
		System.out.println("Total de Custo R$ " + financeiro.getCusto());
	}
}
