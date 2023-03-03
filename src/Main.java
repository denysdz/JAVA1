import java.util.Random;

public class Main {
    private static void task1 () {
        double y = 0;
        double x = 30;
        while (x <= 50) {
            y = Math.pow((Math.pow(x, 2)+2*x), 0.7);
            System.out.println("y = " + y);
            x += 2.5;
        }
    }

    private static void task2 () {
        double y = 0;
        double x = 2;
        while (x <= 4) {
            if (x < 4) {
                y = Math.sin(x + 3);
            } else {
                y = Math.log(x+2);
            }
            System.out.println("y = " + y);
            x += 0.25;
        }
    }

    private static void task3 () {
        int N1 = 10;
        int N2 = 10;
        int min = -5;
        int max = 8;
        double A[][] = new double[N1][N2];
        System.out.println("Generated massive: ");
        for (int i=0; i<N1; i++) {
            String line = "";
            for (int j=0; j<N2; j++) {
                A[i][j] = new Random().nextInt((max - min) + 1) + min;
                line += "[" + A[i][j] + "] ";
            }
            System.out.println(line);
        }
        double maxElement = A[0][0];
        for (int i = 0; i < N1; i++) {
            if (A[i][i] > maxElement) {
                maxElement = A[i][i];
            }
        }
        for (int i = 0; i < N1; i++) {
            if (A[i][N1 - 1 - i] > max) {
                maxElement = A[i][N1 - 1 - i];
            }
        }
        System.out.println("Max diaglonals element value: " + maxElement);
    }

    public static void main(String[] args) {
        System.out.println("Task 1: ");
        task1();
        System.out.println("Task 2: ");
        task2();
        System.out.println("Task 3: ");
        task3();
    }


}