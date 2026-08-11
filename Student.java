

import java.util.ArrayList;
import java.util.List;


public class Student extends User implements CourseMangment {

    // ArrayList for OfferedCoisres
    public List<OfferedCousres> RC = new ArrayList<>();

    // empty constructor
    public Student() {
    }

    // Constructor with name, student number, and level
    public Student(String Name, int StudentNu, int Level) {
        super(Name, StudentNu, Level);
    }

    @Override
    // Assigns a course to the student
    public void AssignCourse(Course course, String chooseTime, Instructor instructor) {
        for (OfferedCousres oc : RC) {
            // Check if the course is already registered
            if (oc.getCourse().getCourseN().equals(course.getCourseN())) {
                System.out.println("You have already registered for the course: " + course.getCourseN());
                return;
            }
        }

        // Register the course
        OfferedCousres offeredCousres = new OfferedCousres(course, chooseTime, instructor);
        RC.add(offeredCousres);

        // Show that the course has been registered
        System.out.println("Registered successfully:");
        System.out.println("Course: " + course.getCourseN() + "\n ****");
        System.out.println("Selected instructor: " + instructor.getIName() + "\n ****");
        System.out.println("Selected time: " + chooseTime + "\n ****");
    }

    @Override
    // Removes course 
    public void RemoveCourse(String CourseN) {
        for (int i = 0; i < RC.size(); i++) {
            OfferedCousres oc = RC.get(i);
            // Check if the course exists
            if (oc.getCourse().getCourseN().equals(CourseN)) {
                RC.remove(i); // Remove the course
                System.out.println("Course registration deleted successfully");
                return;
            }
        }
        // print Course not found
        System.out.println("Course not found");
    }

    // Shows the list of registered courses
    public void Viewschedule() {
        System.out.println("Registered Courses:");
        for (OfferedCousres oc : RC) {
            System.out.println(oc.getCourse().getCourseN() + " with " + oc.getInstructor().getIName() + " at " + oc.getChooseTime());
        }
    }

    @Override
    // Prints student info
    public void toSting() {
        System.out.println("Student name: " + getName() + "\n" +
                   "Student Number: " + getStudentNu() + "\n" +
                   "Student Level: " + getLevel());
    }
    
}