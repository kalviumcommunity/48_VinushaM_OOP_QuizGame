public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
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
}

// this pointer - current object's instance