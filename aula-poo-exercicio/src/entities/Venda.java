package entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private Long id;
	private String descricaoVenda;
	private String nomeCliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;

	private List<Produto> listaProdutos = new ArrayList<>();

	public Long getId(long l) {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = BigDecimal.valueOf(totalVenda());
		this.valorTotal = valorTotal;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void addProduto (Produto produto) {
		this.listaProdutos.add(produto);
	}
	
	private double totalVenda()  {
		double total = 0.0;
		for (Produto produto :
				listaProdutos) {
			total += produto.getValor().doubleValue();
		}
		return total;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Venda{");
		sb.append("id=").append(id);
		sb.append(", descricaoVenda='").append(descricaoVenda).append('\'');
		sb.append(", nomeCliente='").append(nomeCliente).append('\'');
		sb.append(", enderecoEntrega='").append(enderecoEntrega).append('\'');
		sb.append(", valorTotal=").append(valorTotal);
		sb.append(", listaProdutos=").append(listaProdutos);
		sb.append('}');
		return sb.toString();
	}
}
