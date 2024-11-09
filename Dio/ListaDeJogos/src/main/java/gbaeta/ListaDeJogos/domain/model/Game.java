package gbaeta.ListaDeJogos.domain.model;

import org.h2.store.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/**
 * @author GuilhermeBaeta
 */

@Entity(name = "tb_platform")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	@Column(name = "genre", nullable = false, length = 50)
	private String genre;
	
	@Column(name = "release_date")
	private Data releaseDate;
	
	@Column(name = "developer", length = 100)
	private String developer;
	
	@Column(name = "description", length = 500)
	private String description;
	
	@Column(name = "progress")
	private Float progress;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Data getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Data releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getProgress() {
		return progress;
	}
	public void setProgress(Float progress) {
		this.progress = progress;
	}
	
	
}
