import java.util.ArrayList;

public class Race {
    private static String winner;
    public static String getWinner(ArrayList<Car> carsList) {
        int longestDistance = 0;
        for (int index = 0; index < carsList.size(); index++) {
            int distance = carsList.get(index).carSpeed * 24;
            if (distance > longestDistance) {
                longestDistance = distance;
                winner = carsList.get(index).carName;
            }
        }
        return winner;
    }
}