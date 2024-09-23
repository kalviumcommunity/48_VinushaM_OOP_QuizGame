public class Player {
    private String name;
    private int score;

    private static int totalPlayers = 0;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        totalPlayers++;
    }

    public void addPoints(int points) {
        this.score += points;
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
}

// this pointer - current object's instance