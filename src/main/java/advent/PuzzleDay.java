package advent;

public abstract class PuzzleDay {
    protected String partOneAnswer = "";
    protected String partTwoAnswer = "";
    public PuzzleDay(String puzzleInput) {
        solvePuzzle(puzzleInput);
    }
    public abstract int getDay();
    protected abstract void solvePuzzle(String input);
    public String partOne() {
        return this.partOneAnswer;
    }
    public String partTwo() {
        return this.partTwoAnswer;
    }
}
