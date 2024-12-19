public class Player {
    int turn(Dice d) {
        d.roll();
        return d.getme();
    }
}
