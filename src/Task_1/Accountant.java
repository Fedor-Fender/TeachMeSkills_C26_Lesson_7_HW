package Task_1;

public class Accountant implements Definable {
    int codePosition3;
// to create constructor
    public Accountant(int codePosition3) {
        this.codePosition3 = codePosition3;
    }
// to call method of interface
    public void doOutput() {
        System.out.println("Accountant ");
    }
}
