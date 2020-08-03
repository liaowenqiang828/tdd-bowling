import java.util.ArrayList;

public class BowlingGame {

    ArrayList<AFrame> tenFrames = new ArrayList<>();
    public int finalScoreOfTenFrames (ArrayList<AFrame> tenFrames) {
        int totalScore = 0;

        for (int index = 0; index < tenFrames.size(); index++) {
            if (tenFrames.get(index).firstThrow + tenFrames.get(index).secondThrow < 10) {
                totalScore += (tenFrames.get(index).firstThrow + tenFrames.get(index).secondThrow);
            }
        }
        return totalScore;
    }

    public int didNotHitDownAllAfterTwoThrows(int firstThrow, int secondThrow) {
        return firstThrow + secondThrow;
    }

    public int hitDownAllAtFirstThrow(int nextOneThrowPin, int nextTwoThrowPin) {
        return 10 + nextOneThrowPin + nextTwoThrowPin;
    }

    public int hitDownAllAfterTwoThrows(int nextOneThrowPin) {
        return 10 + nextOneThrowPin;
    }

}
