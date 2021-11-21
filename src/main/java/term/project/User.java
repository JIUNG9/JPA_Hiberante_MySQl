package term.project;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
class User extends DateSupperMappedClass{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int UserId;
	public String name;
	public int age;
	public String address;
	@OneToMany(mappedBy="user", cascade = CascadeType.REMOVE )
	private List<Ticket> ticket = new ArrayList<Ticket>();

	
	
	
	
}
