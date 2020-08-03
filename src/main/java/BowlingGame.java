public class BowlingGame {



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
