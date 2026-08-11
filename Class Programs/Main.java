class FootballPlayer {
    void playRole() {
        System.out.println("The player performs a general role on the pitch.");
    }
}

class Striker extends FootballPlayer {
    @Override
    void playRole() {
        System.out.println("The Striker leads the attack and scores goals!");
    }
}

class Goalkeeper extends FootballPlayer {
    @Override
    void playRole() {
        System.out.println("The Goalkeeper guards the net and uses hands to save shots.");
    }
}

public class Main {
    public static void main(String[] args) {
        FootballPlayer player1 = new Striker();
        FootballPlayer player2 = new Goalkeeper();

        player1.playRole();
        player2.playRole();
    }
}