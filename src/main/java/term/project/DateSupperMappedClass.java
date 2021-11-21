package term.project;
import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@MappedSuperclass
public class DateSupperMappedClass {
	   private LocalDateTime createdDate;
	   private LocalDateTime lastModifiedDate;

	   
	   public void setLocalDateTime(LocalDateTime date) {
		   createdDate=date;
		   }
	   public void setlastModifiedDate(LocalDateTime date) {
		   lastModifiedDate=date;
		   }
}
