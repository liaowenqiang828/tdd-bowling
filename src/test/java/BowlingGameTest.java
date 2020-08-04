import org.junit.jupiter.api.Test;

import javax.swing.text.StyledEditorKit;

import java.util.ArrayList;

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

    @Test
    void should_return_final_score_when_all_frames_did_not_hit_down_all() {
        BowlingGame bowlingGame = new BowlingGame();

        ArrayList<AFrame> tenFrames = new ArrayList<>();
        tenFrames.add(new AFrame(1, 2, 2));
        tenFrames.add(new AFrame(3, 4, 2));
        tenFrames.add(new AFrame(5, 4, 2));
        tenFrames.add(new AFrame(4, 3, 2));
        tenFrames.add(new AFrame(3, 2, 2));
        tenFrames.add(new AFrame(2, 1, 2));
        tenFrames.add(new AFrame(3, 4, 2));
        tenFrames.add(new AFrame(4, 5, 2));
        tenFrames.add(new AFrame(3, 2, 2));
        tenFrames.add(new AFrame(5, 2, 2));

        int result = bowlingGame.finalScoreOfTenFrames(tenFrames);

        assertEquals(62, result);
    }

    @Test
    void should_return_final_score_when_all_frames_did_not_hit_down_all_except_one() {
        BowlingGame bowlingGame = new BowlingGame();

        ArrayList<AFrame> tenFrames = new ArrayList<>();
        tenFrames.add(new AFrame(1, 2, 2));
        tenFrames.add(new AFrame(3, 4, 2));
        tenFrames.add(new AFrame(5, 4, 2));
        tenFrames.add(new AFrame(4, 3, 2));
        tenFrames.add(new AFrame(3, 2, 2));
        tenFrames.add(new AFrame(2, 1, 2));
        tenFrames.add(new AFrame(3, 4, 2));
        tenFrames.add(new AFrame(5, 5, 2));
        tenFrames.add(new AFrame(3, 2, 2));
        tenFrames.add(new AFrame(5, 2, 2));

        int result = bowlingGame.finalScoreOfTenFrames(tenFrames);

        assertEquals(66, result);
    }

    @Test
    void should_return_final_score_when_all_frames_did_not_hit_down_all_except_one_strike() {
        BowlingGame bowlingGame = new BowlingGame();

        ArrayList<AFrame> tenFrames = new ArrayList<>();
        tenFrames.add(new AFrame(1, 2, 2));
        tenFrames.add(new AFrame(3, 4, 2));
        tenFrames.add(new AFrame(5, 4, 2));
        tenFrames.add(new AFrame(4, 3, 2));
        tenFrames.add(new AFrame(3, 2, 2));
        tenFrames.add(new AFrame(2, 1, 2));
        tenFrames.add(new AFrame(3, 4, 2));
        tenFrames.add(new AFrame(10, 0, 1));
        tenFrames.add(new AFrame(3, 2, 2));
        tenFrames.add(new AFrame(5, 2, 2));

        int result = bowlingGame.finalScoreOfTenFrames(tenFrames);

        assertEquals(68, result);
    }

    @Test
    void should_return_final_score_when_all_frames_did_not_hit_down_all_except_two_continue_strike() {
        BowlingGame bowlingGame = new BowlingGame();

        ArrayList<AFrame> tenFrames = new ArrayList<>();
        tenFrames.add(new AFrame(1, 2, 2));
        tenFrames.add(new AFrame(3, 4, 2));
        tenFrames.add(new AFrame(5, 4, 2));
        tenFrames.add(new AFrame(4, 3, 2));
        tenFrames.add(new AFrame(3, 2, 2));
        tenFrames.add(new AFrame(2, 1, 2));
        tenFrames.add(new AFrame(3, 4, 2));
        tenFrames.add(new AFrame(10, 0, 1));
        tenFrames.add(new AFrame(10, 0, 1));
        tenFrames.add(new AFrame(5, 2, 2));

        int result = bowlingGame.finalScoreOfTenFrames(tenFrames);

        assertEquals(90, result);
    }

    @Test
    void should_return_final_score_when_all_frames_did_not_hit_down_all_except_tenth_frame_spare() {
        BowlingGame bowlingGame = new BowlingGame();

        ArrayList<AFrame> tenFrames = new ArrayList<>();
        tenFrames.add(new AFrame(1, 2, 2));
        tenFrames.add(new AFrame(3, 4, 2));
        tenFrames.add(new AFrame(5, 4, 2));
        tenFrames.add(new AFrame(4, 3, 2));
        tenFrames.add(new AFrame(3, 2, 2));
        tenFrames.add(new AFrame(2, 1, 2));
        tenFrames.add(new AFrame(3, 4, 2));
        tenFrames.add(new AFrame(4, 5, 2));
        tenFrames.add(new AFrame(3, 2, 2));
        tenFrames.add(new AFrame(5, 5, 2));

        tenFrames.add(new AFrame(5, 0, 1));

        int result = bowlingGame.finalScoreOfTenFrames(tenFrames);

        assertEquals(70, result);
    }

//    @Test
//    void should_return_final_score_when_all_frames_did_not_hit_down_all_except_tenth_frame_strike() {
//        BowlingGame bowlingGame = new BowlingGame();
//
//        ArrayList<AFrame> tenFrames = new ArrayList<>();
//        tenFrames.add(new AFrame(5, 5, 2));
//        tenFrames.add(new AFrame(3, 4, 2));
//        tenFrames.add(new AFrame(5, 4, 2));
//        tenFrames.add(new AFrame(10, 0, 1));
//        tenFrames.add(new AFrame(10, 0, 1));
//        tenFrames.add(new AFrame(5, 5, 2));
//        tenFrames.add(new AFrame(0, 10, 2));
//        tenFrames.add(new AFrame(4, 6, 2));
//        tenFrames.add(new AFrame(10, 0, 1));
//        tenFrames.add(new AFrame(10, 0, 1));
//
//        tenFrames.add(new AFrame(3, 5, 2));
//
//        int result = bowlingGame.finalScoreOfTenFrames(tenFrames);
//
//        assertEquals(159, result);
//    }
}