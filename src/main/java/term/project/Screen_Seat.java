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
@Entity

public class Screen_Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TICKET_ID")
	private Ticket ticket;
     @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEAT_ID")
	private Seat seat;
	
	
}
