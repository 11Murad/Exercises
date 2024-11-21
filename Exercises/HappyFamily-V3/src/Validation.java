public class Validation {


    public static void checkValidations(String name) {
        if (name == null) {
            throw new RuntimeException("Null name:" + name);
        } else if (name.isBlank()) {
            throw new RuntimeException("Blank name:" + name);
        } else if (name.length() > 50) {
            throw new RuntimeException("Name too long:" + name);
        } else if (!name.matches("[a-zA-Z ]+")) {
            throw new RuntimeException("Invalid name format:" + name);
        }
    }

}
