import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> carsList = new ArrayList<>();
        for (int carNumber = 1; carNumber <= 3; carNumber++) {
            String carName = "";
            int carSpeed = 0;
            while (carName.isEmpty()) {
                System.out.println("Введите название машины " + carNumber + ": ");
                carName = scanner.nextLine();
            }
            while (carSpeed <= 0 || carSpeed > 250) {
                System.out.println("Введите скорость машины");
                System.out.println("Скорость должна быть в диапазоне от 1 до 250 км/ч: ");
                try {
                    carSpeed = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException ignored) {}
            }
            carsList.add(new Car(carName, carSpeed));
            System.out.println("Машина " + carName + " со скоростью " + carSpeed + " км/ч добавлена в гонку");
            System.out.println();
        }
        System.out.println("Самая быстрая машина: " + Race.getWinner(carsList));
        System.out.println();
    }
}