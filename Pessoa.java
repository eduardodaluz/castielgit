class Pessoa {

	String nome;
	int idade;
	String telefone;

	public Pessoa(String nome, int idade, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String mensagem() {
		return "Meu nome é " + nome + ", e minha idade é " + idade + "ano(s)";
	}
}
