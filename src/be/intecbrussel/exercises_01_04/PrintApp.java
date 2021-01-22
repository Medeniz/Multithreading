package be.intecbrussel.exercises_01_04;

public class PrintApp {
    public static void main(String[] args) {
        PrintThread thread1 = new PrintThread('*' , 100);
        PrintThread thread2 = new PrintThread('#', 100);
        thread1.start();
        thread2.start();

    }
}
