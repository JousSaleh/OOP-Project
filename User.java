


public abstract class User {
 // Properties for the User class
    private String Name;        //  name of the user
    private int StudentNu;      //  student number ID of the user
    private int Level;          //  level or year of the user

    // Default constructor
    public User() {
    }

    // Constructor User object with the name, student number, and level
    public User(String Name, int StudentNu, int Level) {
        this.Name = Name;          // Set the name property
        this.StudentNu = StudentNu; // Set the student number property
        this.Level = Level;        // Set the level property
    }

    // Getter method for the Name 
    public String getName() {
        return Name; // Return the name of the user
    }

    // Getter method for the StudentNu 
    public int getStudentNu() {
        return StudentNu; // Return the student number of the user
    }

    // Getter method for the Level 
    public int getLevel() {
        return Level; // Return the level of the user
    }

    // Setter method for the Name 
    public void setName(String Name) {
        this.Name = Name; // Set the name of the user
    }

    // Setter method for the StudentNu 
    public void setStudentNu(int StudentNu) {
        this.StudentNu = StudentNu; // Set the student number of the user
    }

    // Setter method for the Level 
    public void setLevel(int Level) {
        this.Level = Level; // Set the level of the user
    }
    
    // Abstract method that must be implemented by subclasses
    // This method will display the user's information
    public abstract void toSting();
}