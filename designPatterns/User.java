public class User {
    public String name;

    User() {
        this.name = "Robot";
    }

    User(String name) {
        this.name = name;
    }

    void getUser() {
        System.out.println(name);
    }
}