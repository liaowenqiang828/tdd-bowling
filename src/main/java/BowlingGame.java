import java.util.ArrayList;

public class BowlingGame {

    ArrayList<AFrame> tenFrames = new ArrayList<>();
    public int finalScoreOfTenFrames (ArrayList<AFrame> tenFrames) {
        int totalScore = 0;
        int length = 0;

        if (tenFrames.size() > 10) {
            length = 10;
        } else {
            length = tenFrames.size();
        }

        for (int index = 0; index < length; index++) {
            if (tenFrames.get(index).firstThrow < 10 && tenFrames.get(index).secondThrow < 10) {
                if (tenFrames.get(index).firstThrow + tenFrames.get(index).secondThrow < 10) {
                    totalScore += (tenFrames.get(index).firstThrow + tenFrames.get(index).secondThrow);
                } else {
                    totalScore += (tenFrames.get(index).firstThrow + tenFrames.get(index).secondThrow) + tenFrames.get(index + 1).firstThrow;
                }
            } else {
                if (tenFrames.get(index).throwTimes == 2) {
                    totalScore += (tenFrames.get(index).firstThrow + tenFrames.get(index).secondThrow) + tenFrames.get(index + 1).firstThrow;
                } else {
                    if (tenFrames.get(index + 1).throwTimes == 1) {
                        totalScore += (tenFrames.get(index).firstThrow + tenFrames.get(index).secondThrow) + tenFrames.get(index + 1).firstThrow + tenFrames.get(index + 2).firstThrow;
                    } else {
                        totalScore += (tenFrames.get(index).firstThrow + tenFrames.get(index).secondThrow) + tenFrames.get(index + 1).firstThrow + tenFrames.get(index + 1).secondThrow;
                    }
                }
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
