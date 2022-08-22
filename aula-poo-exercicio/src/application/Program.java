package application;

import entities.Produto;
import entities.Venda;

import java.math.BigDecimal;

public class Program {
	public static void main(String[] args) {

		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orientção Objeto");
		produto1.setValor(BigDecimal.valueOf(100.00));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Modulo Spring Boot");
		produto2.setValor(BigDecimal.valueOf(400.00));

		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Modulo Bancos de dados");
		produto3.setValor(BigDecimal.valueOf(250.00));



		Venda venda = new Venda();

		venda.setDescricaoVenda("Curso formação java");
		venda.setEnderecoEntrega("Entrega pelo email");
		venda.setId(1L);
		venda.setNomeCliente("Mizael Douglas");
		venda.setValorTotal(BigDecimal.valueOf(200.00));

		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.addProduto(produto3);

		System.out.println("Decrição Venda: " + venda.getDescricaoVenda());
		System.out.println();
		System.out.println("Entrega da Venda: " + venda.getEnderecoEntrega());
		System.out.println();
		System.out.println(venda);

		System.out.println();
		System.out.println("_______________________________________________________________________________________");
		System.out.println();


		for (Produto produto :
				venda.getListaProdutos()) {
			System.out.println(produto);
		}

		System.out.println();
		System.out.println("_______________________________________________________________________________________");
		System.out.println();

		System.out.println("Descriçao da venda: "
				+venda.getDescricaoVenda() + " e o total: " + venda.getValorTotal()
				);

		System.out.println();
		System.out.println("_______________________________________________________________________________________");
		System.out.println();

		System.out.println("Valor da varialvel total: " + venda.getValorTotal());





	}
}
