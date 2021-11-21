package term.project;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)

public class GenreConverter implements AttributeConverter<Genre, String> {
	@Override
    public String convertToDatabaseColumn(Genre genre) {
        switch (genre) {
        case Romance:
            return "Romance";
 
        case Thriller:
            return "Thriller";
 
        case Action:
            return "Action";
 
       
        }
		return null;
    }
 
    @Override
    public Genre convertToEntityAttribute(String dbData) {
        switch (dbData) {
        case "R":
            return Genre.Romance;
 
        case "T":
            return Genre.Thriller;
 
        case "A":
            return Genre.Action;
 
     
 
        default:
            // ignore unknown values
            return null;
        }
    }

	
	}
 


