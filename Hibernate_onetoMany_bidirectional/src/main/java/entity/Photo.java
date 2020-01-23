package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "photo")
public class Photo {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="Url")
	private String Url;
	
//	bi directional mapping
	@OneToOne(mappedBy = "photo", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH})
	private Album album;
	
	
	Photo(){}


	public Photo(String url) {
		super();
		Url = url;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUrl() {
		return Url;
	}


	public void setUrl(String url) {
		Url = url;
	}


	public Album getAlbum() {
		return album;
	}


	public void setAlbum(Album album) {
		this.album = album;
	}


	
	
	
}
	

	