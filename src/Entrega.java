
public class Entrega {

	//Atributos da classe Produto
	private int codigo;
	private String data;
	private Cliente cliente;
	private float preco;
	private Produto[] produto;
	
	//Construtores
	public Entrega() {
		
	}
	public Entrega(int codigo, String data, Cliente cliente, float preco, Produto[] produto) {
		this.codigo = codigo;
		this.data = data;
		this.cliente = cliente;
		this.preco = preco;
		this.produto = produto;
	}
	
	//Metodos da classe Produto
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Produto[] getProduto() {
		return produto;
	}
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
