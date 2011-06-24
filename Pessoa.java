class Pessoa {

	String nome;
	int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String mensagem() {
		return "Meu nome é " + nome + ", e minha idade é " + idade + "ano(s)";
	}
}
