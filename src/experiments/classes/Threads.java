package experiments.classes;

public class Threads extends Thread{
        public static int amount = 0;
        public static void main(String[] args) {
            Threads thread = new Threads();
            thread.start();
            // Wait for the thread to finish
            while(thread.isAlive()) {
                System.out.println("Waiting...");
            }
            // Update amount and print its value
            System.out.println("Main: " + amount);
            amount++;
            System.out.println("Main: " + amount);
        }
        public void run() {
            amount++;
        }
    }
