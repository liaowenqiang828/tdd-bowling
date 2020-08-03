import org.junit.jupiter.api.Test;

import javax.swing.text.StyledEditorKit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    void should_return_number_of_pin_when_did_not_hit_down_all_after_two_throws () {
        // Given
        BowlingGame bowlingGame = new BowlingGame();
        // When
        int scoreOfOneFrame = bowlingGame.didNotHitDownAllAfterTwoThrows(2, 3);
        // Then
        assertEquals(5, scoreOfOneFrame);
    }

    @Test
    void should_return_ten_plus_the_total_number_of_next_two_throws_pins () {
        BowlingGame bowlingGame = new BowlingGame();

        int scoreOfOneFrame = bowlingGame.hitDownAllAtFirstThrow(2, 3);

        assertEquals(15, scoreOfOneFrame);
    }

    @Test
    void should_return_ten_plus_the_pin_of_next_one_throw () {
        BowlingGame bowlingGame = new BowlingGame();

        int scoreOfOneFrame = bowlingGame.hitDownAllAfterTwoThrows(5);

        assertEquals(15, scoreOfOneFrame);
    }
}