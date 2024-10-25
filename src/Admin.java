// Admin.java
public class Admin extends Person {  // Hierarchical Inheritance
    public Admin(String name) {
        super(name);
    }

    public void viewPlayerStatistics(Player player) {
        System.out.println("Admin " + this.name + " viewing stats for player: " + player.getName());
        player.displayScore();
    }

    public void viewGameStatistics() {
        Player.displayGameStatistics();
    }
}
