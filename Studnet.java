public class Studnet extends User {
    public Studnet(String username, String password) {
        super(username, password);
    }


    private String [] courses  = {
        "- Java Programming",
        "- Web Development",
        "- Data Science",
        "- Machine Learning"
};

    public void showCourses()  {
        for (String Course : courses) {
            System.out.println(Course);
        }
    }
}
