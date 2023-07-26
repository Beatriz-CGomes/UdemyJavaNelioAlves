package model.entities;

import java.io.Serializable;
import java.util.Objects;

//implements Serializable - PARA O OBJETOS SEREM TRANSFORMADOS EM SEQUENCIA DE BYTE
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String name;
	
	public Department() {}

	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//hashCode and equals PARA QUE OS OBJETOS SEJAM COMPARADOS AO CONTEUDO E NÃO AO PONTEIROS
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}

	//PARA TER FACILIDADE NA HORA DE IMPRIMIR OS VALORES DO OBJETO
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
