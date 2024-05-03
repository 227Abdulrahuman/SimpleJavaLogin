public class Authentication {
    


    public static Studnet fetchValidUser(String username, String password, Studnet [] studnets) {
        for (Studnet studnet : studnets) {
            if (studnet.username.equals(username) && studnet.password.equals(password)) {
                return studnet;
            }

        }
        return null;
    }

    public static Instructor fetchValidUser(String username, String password, Instructor [] instructors) {
        for (Instructor instructor : instructors) {
            if (instructor.username.equals(username) && instructor.password.equals(password)) {
                return instructor;
            }

        }
        return null;
    }
}
