import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class GameTest {

    Game game = new Game();

    @BeforeEach
    void initializeGame() {
        Game game = new Game();
    }

    @Test
    void gutterRolls() {
        // When
        game.start(20, 0);

        // Then
        assertThat(game.score()).isEqualTo(0);
    }

    @Test
    void scoreIs20WhenEachFrameHas1PinDown() {
        // When
        game.start(20, 1);

        // Then
        assertThat(game.score()).isEqualTo(20);

    }

    @Test
    void score1strikeWith2RollsBonusAndGutterRolls() {
        // When

        game.roll(10); // frame ended
        game.roll(2);
        for (int i = 0; i < 16; i++) {
            game.roll(0);
        }
        // Then
        assertThat(game.score()).isEqualTo(14);
    }

    @Test
    void score1Spare1RollAndGutterRolls() {
        game.roll(4);
        game.roll(6); // frame ended
        game.roll(3);
        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        // Then
        assertThat(game.score()).isEqualTo(16);

    }
}