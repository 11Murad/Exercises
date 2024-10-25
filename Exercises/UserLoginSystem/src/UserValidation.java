public class UserValidation {

    public boolean validateUser(User user) {
        if (user.getUsername().isBlank() || user.getUsername() == null || user.getUsername().length() > 10) {
            return false;
        }
        return true;
    }
    public boolean validatePassword(String password) {
        if (password == null || password.length() <=8) {
            return false;
        }
        return true;
    }
}
