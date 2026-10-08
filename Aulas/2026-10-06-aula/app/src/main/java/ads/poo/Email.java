package ads.poo;

public class Email {
    private String email;
    private final static String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    public Email(String email) {

        if (email.matches(eR)) {
            this.email = email;
        } else {
            this.email = "";
        }
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        if (email.matches(eR)) {
            this.email = email;
        }
    }

    @Override
    public String toString() {
        return "Email: " + email;
    }

}
