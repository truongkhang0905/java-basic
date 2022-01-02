package Day6;

public class Categories {
    int CategoryID;
    String CategoryName;
    String Description;

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
    @Override
    public String toString() {
        return "Categories: " +
                "CategoryID: " + CategoryID +
                ", CategoryName: " + CategoryName +
                ", Description: " + Description;
    }
}
