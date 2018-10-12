package guru.springframework.commands;

/**
 * Created by jt on 6/21/17.
 */
public class UnitOfMeasureCommand {
    private String id;
    private String description;

    public UnitOfMeasureCommand() {
    }

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
