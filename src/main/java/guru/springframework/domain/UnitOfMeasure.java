package guru.springframework.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by jt on 6/13/17.
 */
@Document
public class UnitOfMeasure {

    @Id
    private String id;
    private String description;

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
