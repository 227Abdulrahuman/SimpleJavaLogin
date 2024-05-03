import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Studnet[] studnets = {
            new Studnet("student1", "stuPass1"),
            new Studnet("student2", "stuPass2"),
            new Studnet("student3", "stuPass3"),
            new Studnet("student4", "stuPass4"),
        };
        Instructor[] instructors = {
            new Instructor("instructor1", "instPass1"),
            new Instructor("instructor2", "instPass2"),
            new Instructor("instructor3", "instPass3"),
            new Instructor("instructor4", "instPass4")
        };

        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        

        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();


        Studnet validStudnet = Authentication.fetchValidUser(username, password, studnets);
        Instructor validInstructor = Authentication.fetchValidUser(username, password, instructors);

        if (validStudnet != null) {
            System.out.println("Login successfull!, List of Courses: ");
            validStudnet.showCourses();
        }
        else if (validInstructor != null) {
            System.out.println("Login successfull!, List of Students: ");
            validInstructor.showStudents();
        }

        else {
            System.out.println("Invalid username, or password. Please try again");
        }

   
    }
}
