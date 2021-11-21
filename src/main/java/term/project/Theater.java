package term.project;

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
public class Theater {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int floor;
	private String name;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SEAT_ID")
	private Seat seat;

	
}
