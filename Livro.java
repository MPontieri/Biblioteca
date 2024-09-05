
public class Livro {
	private String titulo;
	private String autor;
	private Boolean disponivel;
	
	public Livro(String titulo, String autor) {
			this.titulo = titulo;
			this.autor = autor;
			this.disponivel = true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	@Override
	public String toString() {
	    return "Livro{" +
	            "Titulo:'" + titulo + '\'' +
	            ", autor:'" + autor + '\'' +
	            ", disponivel: " + disponivel +
	            '}';
	}
}
