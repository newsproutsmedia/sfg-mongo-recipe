package guru.springframework.commands;

/**
 * Created by jt on 6/21/17.
 */
public class NotesCommand {
    private String id;
    private String recipeNotes;

    public NotesCommand() {
    }

    public String getId() {
        return this.id;
    }

    public String getRecipeNotes() {
        return this.recipeNotes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }
}
