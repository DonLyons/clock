import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Clock");
        System.out.println("2. Stopwatch");
        System.out.println("3. Timer");
        System.out.print("Choice (0 - Exit): ");

        int choice = 0;
        try { 
        choice = Integer.valueOf(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid input.");
            scanner.close();
            return;
        } 

        // Call corresponding program function
        switch (choice) {
            case 1:
                // Call clock
            case 2:
                stopwatch();
            case 3:
                timer();
        }

        scanner.close();
    }

    // Creates stopwatch instance, facilitates ticking loop
    public static void stopwatch() {
        Stopwatch stopwatch = new Stopwatch();

        while (true) {
            System.out.println(stopwatch);
            stopwatch.advance();
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
            
        }
    }

    // Creates and poplates a timer instance, facilitates ticking loop
    public static void timer() {
        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Timer (mm:ss): ");
        String input = scanner.nextLine();
        
        // Extract Input
        String[] parts = input.split(":");
        int minutes = Integer.valueOf(parts[0]);
        int seconds = Integer.valueOf(parts[1]);

        // Start timer
        Timer timer = new Timer(minutes, seconds);

        // Tick until 00:00:00 has been reached
        while (timer.getMillies() > 0 || timer.getSeconds() > 0 || timer.getMinutes() > 0) {
            timer.decrement();
            System.out.println(timer);
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
            
        }
        scanner.close();
    }
}
