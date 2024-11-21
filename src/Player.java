public class Player extends Person{
    private int score;
    private String level;

    public Player(String name) {
        super(name);
        this.score = 0;
        this.level = "Beginner"; 
        GameStatistics.incrementPlayers(); 
    }

    private String determineLevel(int score) {
        if (score >= 50) return "Advanced";
        else if (score >= 20) return "Intermediate";
        else return "Beginner";
    }

    public void addPoints(int points) {
        this.score += points;
        this.level = determineLevel(this.score);
        GameStatistics.addPoints(points);
    }

    public void displayScore() {
        System.out.println(this.name + "'s score: " + this.score);
        System.out.println(this.name + "'s level: " + this.level);
    }

    public void resetScore() {
        this.score = 0;
        this.level = "Beginner";
    }

}

// this pointer - current object's instance