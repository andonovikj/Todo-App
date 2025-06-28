import java.io.Serial;
import java.io.Serializable;

public class Task implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int id;

    private String description;
    private Category category;
    private boolean isCompleted;

    public Task (int id, String description, Category category)
    {
        this.id = id;
        this.description = description;
        this.category = category;
    }

    public int getId() { return id; }

    public String getDescription () { return description; }
    public void setDescription(String desc) { this.description = desc; }

    public Category getCategory() { return category; }
    public void setCategory(Category cat) { this.category = cat; }

    public boolean getIsCompleted() { return isCompleted; }
    public void setIsCompleted( boolean completed) { this.isCompleted = completed; }

    @Override
    public String toString() {
        return "Task: {" +
                " id: " + id +
                ", description: " + description +
                ", category: " + category +
                ", isCompleted: " + isCompleted +
                "}";
    }
}
