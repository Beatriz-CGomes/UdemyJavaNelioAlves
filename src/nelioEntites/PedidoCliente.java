package nelioEntites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PedidoCliente {

	private static SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
	
	private String nome;
	private String email;
	private Date dataNascimento;

	public PedidoCliente() {
	}

	public String getNome() {
		return nome;
	}

	public PedidoCliente(String nome, String email, Date dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return nome + " ( " + sdf.format(dataNascimento) + ") +  " + email;
	}

}
