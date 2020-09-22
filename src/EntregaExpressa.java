
public class EntregaExpressa extends Entrega{

	
	private float preco;
	
	
	
	public float getPreco() {
		return this.preco = preco *(4.0f + 2.0f);
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
