
public class Produto {
	
	//Atributos da classe Produto
	private int codigo;
	private String nome;
	private float peso;
	
	//Construtores
	public Produto() {
		
	}
	
	public Produto(int codigo, String nome, float peso) {
		this.codigo = codigo;
		this.nome = nome;
		this.peso = peso;
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
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	

}
