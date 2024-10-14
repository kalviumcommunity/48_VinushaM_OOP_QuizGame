public class Player {
    private String name;
    private int score;
    private String level;
    private static int totalPlayers = 0;
    private static int totalPoints = 0; 

    public Player() {
        this.name = "Unknown";
        this.score = 0;
        this.level = "Beginner";
        totalPlayers++;
    }

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.level = "Beginner"; 
        totalPlayers++;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
        this.level = (score >= 50) ? "Advanced" : (score >= 20) ? "Intermediate" : "Beginner"; // Determine level based on score
        totalPlayers++;
    }

    // Accessor (Getter) for name
    public String getName() {
        return name;
    }

    // Mutator (Setter) for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor for score
    public int getScore() {
        return score;
    }

    // Mutator for score
    public void setScore(int score) {
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void addPoints(int points) {
        this.score += points;
        totalPoints += points;
        if (this.score >= 50) {
            this.level = "Advanced";
        } else if (this.score >= 20) {
            this.level = "Intermediate";
        }
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