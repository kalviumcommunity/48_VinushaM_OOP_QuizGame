public class Player extends Person{
    private int score;
    private String level;
    private static int totalPlayers = 0;
    private static int totalPoints = 0; 

    public Player() {
        super("Unknown");
        this.score = 0;
        this.level = "Beginner";
        totalPlayers++;
    }

    public Player(String name) {
        super(name);
        this.score = 0;
        this.level = "Beginner"; 
        totalPlayers++;
    }

    public Player(String name, int score) {
        super(name);
        this.score = score;
        this.level = (score >= 50) ? "Advanced" : (score >= 20) ? "Intermediate" : "Beginner"; // Determine level based on score
        totalPlayers++;
    }

    // Constructor with name, score, and level (Overloaded Constructor)
    public Player(String name, int score, String level) {
        super(name);
        this.score = score;
        this.level = level;
        totalPlayers++;
    }

    private String determineLevel(int score) {
        if (score >= 50) return "Advanced";
        else if (score >= 20) return "Intermediate";
        else return "Beginner";
    }

    public void addPoints(int points) {
        this.score += points;
        totalPoints += points;
        this.level = determineLevel(this.score);
    }

    public void displayScore() {
        System.out.println(this.name + "'s score: " + this.score);
        System.out.println(this.name + "'s level: " + this.level);
    }

    public void resetScore() {
        this.score = 0;
        this.level = "Beginner";
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