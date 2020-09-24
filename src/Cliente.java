
public class Cliente {
	
		//Atributos da classe Cliente
		private int codigo;
		private String nome;
		private String endereco;
			
		//Construtores
		//Construtore sem argumentos
		public Cliente() {
			
		}
		//Construtore com argumentos
		public Cliente(int codigo, String nome, String endereco) {
			this.codigo = codigo;
			this.nome = nome;
			this.endereco = endereco;
			
		}
		
		
		//Metodos da classe Produto
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		
}
