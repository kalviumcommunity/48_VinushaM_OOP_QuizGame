public class GameStatistics {
    private static int totalPlayers = 0;
    private static int totalPoints = 0;

    public static void incrementPlayers() {
        totalPlayers++;
    }

    public static void addPoints(int points) {
        totalPoints += points;
    }

    public static void displayStatistics() {
        System.out.println("Game Statistics:");
        System.out.println("Total players: " + totalPlayers);
        System.out.println("Total points scored by all players: " + totalPoints);
    }

    public static int getTotalPlayers() {
        return totalPlayers;
    }
}
