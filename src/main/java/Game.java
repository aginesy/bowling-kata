import java.util.ArrayList;

public class Game {

    private int score = 0;
    private ArrayList<Frame> frames = new ArrayList<>();

    void roll(int pinsDown) {
        if (pinsDown == 10) {
            score += 12;
        }
        else {
            score += pinsDown;
        }

    }

//    Frame frame(int score) {
//        return new Fr
//
//    }

    int score() {
        return score;
    }

    public void start(int rolls, int pinsDown) {
        for (int i = 0; i < rolls; i++) {
            roll(pinsDown);
        }
    }
}
