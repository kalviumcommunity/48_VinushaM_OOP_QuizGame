public class Player {
    private String name;
    private int score;

    private static int totalPlayers = 0;
    private static int totalPoints = 0; 

    public Player(String name) {
        this.name = name;
        this.score = 0;
        totalPlayers++;
    }

    public void addPoints(int points) {
        this.score += points;
        totalPoints += points;
    }

    public void displayScore() {
        System.out.println(this.name + "'s score: " + this.score);
    }

    public void resetScore() {
        this.score = 0;
    }

    public static int getTotalPlayers() {
        return totalPlayers;
    }
    
    public static void displayGameStatistics() {
        System.out.println("Game Statistics:");
        System.out.println("Total players: " + totalPlayers);
        System.out.println("Total points scored by all players: " + totalPoints);
    }
}

// this pointer - current object's instance