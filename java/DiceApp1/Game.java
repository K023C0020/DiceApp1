public class Game {
    Player p1;
    Player p2;
    Dice d1;
    Dice d2;

    Game() {
        p1 = new Player();
        p2 = new Player();
        d1 = new Dice();
        d2 = new Dice();
    }

    void start() {
        int result1 = p1.turn(d1);
        int result2 = p2.turn(d2);

        judge(result1, result2);
    }

    void judge(int result1, int result2) {
        if (result1 > result2) {
            System.out.println("Player1の勝ち");
        }else if(result1 < result2) {
            System.out.println("Player2の勝ち");
        }else {
            System.out.println("あいこ");
        }
    }
}
