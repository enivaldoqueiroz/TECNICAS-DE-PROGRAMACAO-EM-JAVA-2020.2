
public class Entrega extends Produto{

	//Atributos da classe Produto
	private int codigo;
	private String data;
	private Cliente cliente[] = new Cliente[3]; 	//Agregação da classe Cliente
	private float preco;
	private Produto produto[] = new Produto[3];	//Agregação da classe Produto
	private int indice = 0;
	
	//Construtores
	public Entrega() {
		
	}
	public Entrega(int codigo, String data, float preco) {
		this.codigo = codigo;
		this.data = data;
		this.preco = preco;
		
	}
	
	//Metodos da classe Produto
	
	//Metodo para inserção dos pedidos no vetor Produto
	public void setCadastrarPedido(Produto p, Cliente c) {
		this.produto[indice] = p;
		this.cliente[indice] = c;
		indice++;
	}
	
	//Metodo para retornar os pedidos cadastrados
	public Produto getMotrarPedido(int indice) {
		return this.produto[indice];
	}
	//Metodo para retornar os pedidos cadastrados do cliente
	public Cliente getMotrarPedidoCliente(int indice) {
		return this.cliente[indice];
	}
	
	
	
	//Outros Metodos 
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
	public Cliente[] getCliente() {
		return cliente;
	}
	public Produto[] getProduto() {
		return produto;
	}
	public void setProduto(Produto[] produto) {
		this.produto = produto;
	}
	public float getPreco() {
		return this.preco = preco * 4.0f;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
