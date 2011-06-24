class Pessoa {

	String nome;
	int idade;
	String nacionalidade;

	public Pessoa(String nome, int idade, String nacionalidade) {
		this.nome = nome;
		this.idade = idade;
		this.nacionalidade = nacionalidade;
	}

	public String mensagem() {
		return "Meu nome é " + nome + ", e minha idade é " + idade + "ano(s)";
	}
}
