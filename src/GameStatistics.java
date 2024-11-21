public class GameStatistics implements StatisticsHandler{
    private static int totalPlayers = 0;
    private static int totalPoints = 0;

    public static void addPlayer() {
        totalPlayers++;
    }

    public static void addPoints(int points) {
        totalPoints += points;
    }

    @Override
    public void displayStatistics() {
        System.out.println("Game Statistics:");
        System.out.println("Total players: " + totalPlayers);
        System.out.println("Total points scored by all players: " + totalPoints);
    }

    @Override
    public int getTotalPlayers() {
        return totalPlayers;
    }
}
