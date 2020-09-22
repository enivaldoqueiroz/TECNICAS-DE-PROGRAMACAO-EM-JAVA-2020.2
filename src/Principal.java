public class Principal {

	public static void main(String[] args) {
		
		Cliente cli01 = new Cliente();
		cli01.setCodigo(0001);
		cli01.setNome("Jose Bernardo");
		cli01.setEndereco("Rua 2, N678");
		
		
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
		
		Entrega entrega = new Entrega();
		//Vetor de produtos = Inserindo os pedidos no indice do vetor
		entrega.setCadastrarPedido(prod01,cli01);
		
		System.out.println(entrega.getMotrarPedidoCliente(0).getNome());
		System.out.println(entrega.getMotrarPedido(0).getNome());
						
		
	}

}
