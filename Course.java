


        public class Course {
            //Define private variables of type String and integer
	    private String CourseN;
	    private int CreditHours;
	    private int CourseCode;
	    private String ClassTime1;
	    private String ClassTime2;
            // Create a default constructor, which allows creating objects without Parameters.
	    public Course() {
	    }
              //Access and modify private variables
	    public Course(String CourseN, int CreditHours, int CourseCode) {
	        this.CourseN = CourseN;
	        this.CreditHours = CreditHours;
	        this.CourseCode = CourseCode;
	    }

	    public Course(String ClassTime1, String ClassTime2) {
	        this.ClassTime1 = ClassTime1;
	        this.ClassTime2 = ClassTime2;
	    }

	    public String getCourseN() {//Returns the name of the course.
	        return CourseN;
	    }

	    public void setCourseN(String CourseN) {// Sets the name of the course..
	        this.CourseN = CourseN;
	    }

	    public int getCreditHours() {//Returns the number of credit hours.
	        return CreditHours;
	    }

	    public void setCreditHours(int CreditHours) {// Sets the number of credit hours
	        this.CreditHours = CreditHours;
	    }

	    public int getCourseCode() {//Returns the course code
	        return CourseCode;
	    }

	    public void setCourseCode(int CourseCode) {//Sets the course code
	        this.CourseCode = CourseCode;
	    }

	    public String getClassTime1() {//Returns the first class time
	        return ClassTime1;
	    }

	    public void setClassTime1(String ClassTime1) {//Sets the first class time
	        this.ClassTime1 = ClassTime1;
	    }

	    public String getClassTime2() {//Returns the second class time
	        return ClassTime2;
	    }

	    public void setClassTime2(String ClassTime2) {//Sets the second class time
	        this.ClassTime2 = ClassTime2;
	    }
  
}