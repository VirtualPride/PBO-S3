package tugassemester3;

public class TugasSemester3 {

    public static void main(String[] args) {
        Agent agent = new Agent();
        Agent agent2 = new Agent("cobaagent",100);
        Player player = new Player();
        Player player2 = new Player(10,5);
        agent.info();
        agent2.info();
        player.InfoPlayer();
        player2.InfoPlayer();
        
    }
}
