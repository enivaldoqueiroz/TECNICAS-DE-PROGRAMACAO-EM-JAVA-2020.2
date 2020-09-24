public class Principal {

	public static void main(String[] args) {
		
		//Instanciando a classe Cliente
		Cliente cli01 = new Cliente();
		cli01.setCodigo(0001);
		cli01.setNome("Jose Bernardo");
		cli01.setEndereco("Rua 2, N678");
		
		Cliente cli02 = new Cliente();
		cli02.setCodigo(0001);
		cli02.setNome("Rivia Manuela");
		cli02.setEndereco("Rua 12, N280");
		
				
		//Instanciando a classe Produto
		Produto prod01 = new Produto();
		prod01.setCodigo(0001);
		prod01.setNome("Pizza a modo da casa");
		prod01.setPeso(1.0f);
		
		Produto prod02 = new Produto();
		prod02.setCodigo(0002);
		prod02.setNome("Pizza de frando");
		prod02.setPeso(1.5f);
		
		Produto prod03 = new Produto();
		prod03.setCodigo(0003);
		prod03.setNome("Pizza de frando e carne de sol");
		prod03.setPeso(2.0f);
		
		//Instanciando a classe Entrega
		Entrega entrega = new Entrega();
		//Inserindo os pedidos no indice do vetor de pedidos da classe entraga
		entrega.setCadastrarPedido(prod01,cli01,1.0f);
		entrega.setPreco(4.5f);
		entrega.setCadastrarPedido(prod02, cli02, 2.0f);
		//entrega.setPreco(5.0f);
		
		//Instanciando a classe EntregaExpressa
		EntregaExpressa entregaExpressa = new EntregaExpressa();
		//Inserindo os pedidos no indice do vetor de pedidos da classe entragaExpressa
		entregaExpressa.setCadastrarPedido(prod02,cli02,2.0f);
		entregaExpressa.setPreco(4.5f);
		
		
		
		//Exibe os pedidos da Entraga Defauld
		//Pedido do Cliente 01
				System.out.println("Nome do Cliente: " + entrega.getMotrarPedidoCliente(0).getNome());
				System.out.println("Pedido: " + entrega.getMotrarPedido(0).getNome());
				System.out.println("Nome do Cliente: " + entrega.getPreco());
				System.out.println("\n");
		
		//Pedido do Cliente 02
				System.out.println("Nome do Cliente: " + entrega.getMotrarPedidoCliente(1).getNome());
				System.out.println("Pedido: " + entrega.getMotrarPedido(1).getNome());
				System.out.println("Preço: " + entrega.getPreco());
				System.out.println("\n");
		
		
		
		//Exibe os pedidos da Entraga Expressa
		//Pedido do Cliente 02
				System.out.println("Nome do Cliente: " + entregaExpressa.getMotrarPedidoCliente(0).getNome());
				System.out.println("Pedido: " + entregaExpressa.getMotrarPedido(0).getNome());
				System.out.println("Preço: " + entregaExpressa.getPreco());		
				System.out.println("\n");
				
		//Exibe a Soma Total dos pesos de todos os pedidos da Entrega Default
				System.out.println("Soma de Todos Pesos: " + entrega.getSomaPeso());
	}

}
