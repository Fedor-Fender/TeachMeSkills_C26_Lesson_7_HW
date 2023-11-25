package Task_1;

public class Employer implements Definable {
    int codePosition2;

    public Employer(int codePosition2) {
        this.codePosition2 = codePosition2;
    }

    @Override
    public void doOutput() {
        System.out.println("Employer ");
    }
}

