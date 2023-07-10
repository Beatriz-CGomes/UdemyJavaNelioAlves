package nelioEntites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostNovo {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date momento;
	private String titulo;
	private String comentarios;
	private Integer likes;

	private List<PostComentario> comentario = new ArrayList<>();

	public PostNovo() {
	}

	public PostNovo(Date momento, String titulo, String comentarios, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.comentarios = comentarios;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<PostComentario> getComentario() {
		return comentario;
	}

	// metados - quando tem uma list o correto é add e remover pelo metodo
	public void addComentarios(PostComentario comentario) {
		this.comentario.add(comentario);
	}

	public void removerComentario(PostComentario comentario) {
		this.comentario.remove(comentario);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n ");
		sb.append(likes);
		sb.append(", likes");
		sb.append(sdf.format(momento + "\n"));
		sb.append(comentarios + "\n");
		sb.append("Comentários: " + "/n");
		for (PostComentario cc : comentario) {
			sb.append(cc.getTexto());
		}
		return sb.toString();
	}

}
