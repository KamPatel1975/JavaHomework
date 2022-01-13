import com.sun.deploy.security.SelectableSecurityManager;

public class Voting {
    public static void main (String[]args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("Person is legal age to Vote");
        } else
            System.out.println("Person is not at legal age to Vote");


    }

}

