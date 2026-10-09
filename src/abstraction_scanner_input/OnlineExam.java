package abstraction_scanner_input;

public abstract class OnlineExam {
    abstract void startExam();

    void showInstructions() {
        System.out.println("Read the Questions Properly and Answer.");
        System.out.println("Each Question Carries one mark.");
    }

}
