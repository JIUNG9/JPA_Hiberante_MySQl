package term.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class Actor extends MovieWorker {

//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private int Id;
private int height;
private String InstaID;
private boolean IsMain;
	
}
