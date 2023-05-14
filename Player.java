class Player{
    static int playerCount = 0;

    private String name;
    public Player(String n){
        this.name = n;
        playerCount++;
    }
}

public class PlayerTestDrive{
    public static void main(string[] args){
        System.out.println(Player.playerCount);
        Player one = new Player ("Tiger Woods");
        System.out.println(Player.playerCount);
    }
}