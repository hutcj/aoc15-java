package advent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

public class Day02 extends PuzzleDay {

    public Day02(String puzzleInput) {
        super(puzzleInput);
    }

    public int getDay() {
        return 2;
    }

    protected void solvePuzzle(String s) {
        BufferedReader reader = new BufferedReader(new StringReader(s));
        int l = 0;
        int w = 0;
        int h = 0;
        int sideAreas[] = new int[3];
        int perimeters[] = new int[3];
        int volume = 0;
        int lowestArea = 0;
        int smallestPerimeter = 0;
        int totalArea = 0;
        int totalRibbonLength = 0;
        boolean textAvailable = true;
        String checkBuffer = "";
        try {
            do {
                checkBuffer = reader.readLine();
                if (checkBuffer == null) {
                    textAvailable = false;
                } else {
                    String line[] = checkBuffer.split("x");
                    l = Integer.parseInt(line[0]);
                    w = Integer.parseInt(line[1]);
                    h = Integer.parseInt(line[2]);
                    sideAreas[0] = l * w;
                    sideAreas[1] = w * h;
                    sideAreas[2] = h * l;
                    perimeters[0] = 2 * (l + w);
                    perimeters[1] = 2 * (w + h);
                    perimeters[2] = 2 * (h + l);
                    Arrays.sort(sideAreas);
                    Arrays.sort(perimeters);
                    lowestArea = sideAreas[0];
                    smallestPerimeter = perimeters[0];
                    volume = l * w * h;
                    totalArea += (2 * Arrays.stream(sideAreas).sum()) + lowestArea;
                    totalRibbonLength += smallestPerimeter + volume;
                }
            } while (textAvailable);
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading input string!");
            e.printStackTrace();
            System.exit(1);
        }
        this.partOneAnswer = String.valueOf(totalArea);
        this.partTwoAnswer = String.valueOf(totalRibbonLength);
    }
    
}
