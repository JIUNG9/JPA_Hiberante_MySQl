package term.project;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Movie extends DateSupperMappedClass {
	
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public String MovieName;
	public LocalDateTime ReleaseDate;
	public Genre genre;
	public int RunningTime;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="MOVIEWORKER_ID")
	private List<MovieWorker> woker =new ArrayList<MovieWorker>();
	

	
	
		
	
}
