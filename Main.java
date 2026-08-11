

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //ask user to add there one info and Received by Scanner
        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();

        int studentN = 0;
        while (true) {
            try {
                System.out.print("Enter your student Number: ");
                studentN = scanner.nextInt();
                scanner.nextLine();

                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer for student number.");
                scanner.next(); // clear the invalid input
            }
        }
        int studentLevel = 0;
        while (true) {
            try {
                System.out.print("Enter your Level: ");
                studentLevel = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer for student level.");
                scanner.next(); // clear the invalid input
            }
        }
            //Storing user information in an object
            Student student1 = new Student(studentName, studentN, studentLevel);
            
            //fill course class data using object
            Course course1 = new Course("Algorithm", 3, 101);
            Course course2 = new Course("OOP", 4, 102);
            Course course3 = new Course("Web Devlopment", 2, 103);
            Course course4 = new Course("Discrete structures", 4, 104);
            Course course5 = new Course("Phyics", 3, 105);

            //fill Instructor class data using object
            Instructor Instructor1 = new Instructor("Dr. Azhar Hassan");
            Instructor Instructor2 = new Instructor("Dr. yumna fatani");
            Instructor Instructor3 = new Instructor("Dr. Mariam Alghamd");
            Instructor Instructor4 = new Instructor("Dr. shahad alzahrani");

            //Fill in the time constructor in the course class
            course1.setClassTime1("2:15 PM - 4:15PM");
            course2.setClassTime1("4:15 PM - 6:15");
            course3.setClassTime1("12:15 PM - 2:15PM");
            course4.setClassTime1("2:15PM - 4:15 PM");

            
            course1.setClassTime2("8:00 AM - 10:00 AM");
            course2.setClassTime2("10:00 AM - 12:00 PM");
            course3.setClassTime2("12:00 PM - 2:00PM");
            course4.setClassTime2("2:00PM - 4:00 PM");


            Boolean run = true;
            while (run) {
                //The home page to specify the user's desire
                System.out.println("\nWelcome to UQU System:");
                System.out.println("**************************");
                System.out.println("1. Register for a course");
                System.out.println("2. View schedule");
                System.out.println("3. Remove a course");
                System.out.println("4. Display Information");
                System.out.println("5. Exit");

                System.out.println("**************************");

                int choice = scanner.nextInt();
                scanner.nextLine();
                //After storing the student’s wish, it is processed via Switch
                switch (choice) {
                    //case one if the user chooses to register a course
                    case 1:
                        boolean continueRegistering = true;

                        while (continueRegistering) {
                            // Display available courses and their details 
                            System.out.println("Available Courses:");
                            System.out.println("1. " + course1.getCourseN() + " - " + course1.getCreditHours() + " Credit Hours" + " - " + course1.getCourseCode() + " CourseCode");
                            System.out.println("2. " + course2.getCourseN() + " - " + course2.getCreditHours() + " Credit Hours" + " - " + course2.getCourseCode() + " CourseCode");
                            System.out.println("3. " + course3.getCourseN() + " - " + course3.getCreditHours() + " Credit Hours" + " - " + course3.getCourseCode() + " CourseCode");
                            System.out.println("4. " + course4.getCourseN() + " - " + course4.getCreditHours() + " Credit Hours" + " - " + course4.getCourseCode() + " CourseCode");
                            System.out.println("5. " + course5.getCourseN() + " - " + course5.getCreditHours() + " Credit Hours" + " - " + course5.getCourseCode() + " CourseCode");
                            
                            int courseChoice = 0;
                            try {
                                System.out.println("Choose a course (1-5):");
                                courseChoice = scanner.nextInt(); 
                                scanner.nextLine();

                            } catch (InputMismatchException e) {
                                // Handle invalid input
                                System.out.println("Invalid input! Please enter a number between 1 and 5.");
                                scanner.next(); // clear the invalid input
                                continue;
                            }
                            Course chosenCourse = null;
                            try {
                                // Assign the chosen course based on the user's input
                                switch (courseChoice) {
                                    case 1:
                                        chosenCourse = course1;
                                        break;
                                    case 2:
                                        chosenCourse = course2;
                                        break;
                                    case 3:
                                        chosenCourse = course3;
                                        break;
                                    case 4:
                                        chosenCourse = course4;
                                        break;
                                    case 5:
                                        chosenCourse = course5;
                                        break;
                                    default:
                                        throw new ArrayIndexOutOfBoundsException();  // Handle invalid course selection

                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Invalid course choice.");
                                continue;
                            }
                            // Display available professors
                            System.out.println("Available professor");
                            System.out.println("1. " + Instructor1.getIName());
                            System.out.println("2. " + Instructor2.getIName());
                            System.out.println("3. " + Instructor3.getIName());
                            System.out.println("4. " + Instructor4.getIName());

                            int InstructorChoice = 0;
                            try {
                                System.out.println("Choose a professor");
                                InstructorChoice = scanner.nextInt();
                                scanner.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input! Please enter a number between 1 and 4.");
                                scanner.next(); // clear the invalid input
                                continue;
                            }

                            Instructor chooseInstructor = null;
                            try {
                                // Assign the chosen professor based on the user's input
                                switch (InstructorChoice) {
                                    case 1:
                                        chooseInstructor = Instructor1;
                                        break;
                                    case 2:
                                        chooseInstructor = Instructor2;
                                        break;
                                    case 3:
                                        chooseInstructor = Instructor3;
                                        break;
                                    case 4:
                                        chooseInstructor = Instructor4;
                                        break;
                                    default:
                                        throw new ArrayIndexOutOfBoundsException();
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Invalid professor choice.");
                                continue;
                            }
                             //Display available class times
                            System.out.println("Available Times for " + chosenCourse.getCourseN() + ":");
                            System.out.println("1. " + chosenCourse.getClassTime1());
                            System.out.println("2. " + chosenCourse.getClassTime2());

                            int timeChoice = 0;
                            try {
                                System.out.println("Choose a time for the course (1-2):");
                                timeChoice = scanner.nextInt();
                                scanner.nextLine();
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input! Please enter a number between 1 and 2.");
                                scanner.next(); // clear the invalid input
                                continue;
                            }

                            String chosenTime = null;
                            try {
                                // Assign the chosen time based on the user's input
                                switch (timeChoice) {
                                    case 1:
                                        chosenTime = chosenCourse.getClassTime1();
                                        break;
                                    case 2:
                                        chosenTime = chosenCourse.getClassTime2();
                                        break;
                                    default:
                                        throw new ArrayIndexOutOfBoundsException();
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("Invalid time choice.");
                                continue;
                            }
                            // Assign the course, time, and instructor to the student
                            student1.AssignCourse(chosenCourse, chosenTime, chooseInstructor);
                            // Ask the user if they want to register for another course
                            System.out.print("Do you want to register for another course? (yes/no): ");
                            String response = scanner.nextLine();
                            if (!response.equalsIgnoreCase("yes")) {
                                continueRegistering = false;
                            }

                        }
                        break;
                        
                    //case two if the user chooses to view there schedule
                    case 2:
                        student1.Viewschedule();
                        break;
                   //casw thre it the user chooses to delete a course by its name
                    case 3:
                        System.out.print("Enter Course Name: ");
                        String coursenum = scanner.nextLine();
                        student1.RemoveCourse(coursenum);
                        break;
                    //case four if the user want to print therw info
                    case 4:
                        student1.toSting();
                        break;
                    //case five its the last step it the user want to exit the system
                    case 5:
                        run = false;
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }

