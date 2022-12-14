package entities;

import java.math.BigDecimal;

public class Produto {

	private Long id;
	private String nome;
	private BigDecimal valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Produto{");
		sb.append("id=").append(id);
		sb.append(", nome='").append(nome).append('\'');
		sb.append(", valor=").append(valor);
		sb.append('}');
		return sb.toString();
	}
}
