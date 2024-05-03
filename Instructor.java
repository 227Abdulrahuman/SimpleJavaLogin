public class Instructor extends User {
    Instructor(String username, String password) {
        super(username, password);
    }

    



    private String [] students = {
        "- Student1",
        "- Studnet2",
        "- Studnet3",
        "- Student4"
    };


    public void showStudents() {
        for (String student : students) {
            System.out.println(student);
        }
    }
}
