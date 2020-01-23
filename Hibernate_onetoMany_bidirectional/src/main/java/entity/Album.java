package entity;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name="Album")
@NoArgsConstructor

public class Album
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String albumname;
	
	@Column(name = "date")
	private LocalDate date;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="photo_id")
	private Photo photo;
	
	@OneToMany(mappedBy = "album", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Songs> lst;


	public Album(String albumname, LocalDate date) {
		super();
		this.albumname = albumname;
		this.date = date;
	}
	
	public void add(Songs s)
	{
		if(lst ==null)
		{
			lst = new ArrayList<Songs>();
		}
		System.out.println(s);
		lst.add(s);
		
		s.setAlbum(this);
	}
	
	
	
	

}
