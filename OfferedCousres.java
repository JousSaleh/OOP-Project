

public class OfferedCousres {
     private Course course;
    private String chooseTime;
    private Instructor instructor;

    // Default constructor
    public OfferedCousres() {
    }

    // Constructor with course, time, and instructor
    public OfferedCousres(Course course, String chooseTime, Instructor instructor) {
        this.course = course;
        this.chooseTime = chooseTime;
        this.instructor = instructor;
    }

    // Getter the course
    public Course getCourse() {
        return course;
    }

    // Sets the course
    public void setCourse(Course course) {
        this.course = course;
    }

    // Getter the chosen time
    public String getChooseTime() {
        return chooseTime;
    }

    // Sets the chosen time
    public void setChooseTime(String chooseTime) {
        this.chooseTime = chooseTime;
    }

    // Getter the instructor
    public Instructor getInstructor() {
        return instructor;
    }

    // Sets the instructor
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
    
    
}