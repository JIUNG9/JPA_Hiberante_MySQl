package term.project;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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


// need to make ERD
@Entity
public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String MovieName;
	private Date StartTime;
	private Date EndTime;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="MOVIE_ID")
	private Movie movie;
}
