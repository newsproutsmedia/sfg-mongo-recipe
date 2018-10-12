package guru.springframework.domain;

import org.springframework.data.annotation.Id;


/**
 * Created by jt on 6/13/17.
 */
public class Notes {

    @Id
    private String id;
    private String recipeNotes;

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
