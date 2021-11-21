package term.project;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int TicketID;
	private boolean Reservable;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private User user;
	@OneToMany(mappedBy="ticket" ,fetch = FetchType.LAZY)
   private List<Screen_Seat> ScreenTicket = new ArrayList<>();
	
}
