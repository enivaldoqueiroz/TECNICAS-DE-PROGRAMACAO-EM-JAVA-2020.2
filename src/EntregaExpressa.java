
public class EntregaExpressa extends Entrega{

	//Atributos da classe Entrega Expressa
	private float preco;
	
	//Construtores
	//Construtore sem argumentos
	public EntregaExpressa () {
		
	}
	//Construtore com argumentos
	public EntregaExpressa (float preco) {
		this.preco = preco;
	}
	
	//Metodos da classe Entrega Expressa
	public float getPreco() {
		return this.preco = preco *(4.0f + 2.0f);
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
