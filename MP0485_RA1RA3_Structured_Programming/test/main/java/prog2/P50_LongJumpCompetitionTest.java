package main.java.prog2;

import static org.junit.Assert.*;
import org.junit.Test;

public class P50_LongJumpCompetitionTest {

    private static final int DORSAL = 0;
    private static final int BEST_MARK = 1;

    @Test(timeout = 1000)
    public void testSortByBestMark() {
        int[][] participants = {
            {101, 480},
            {102, 500},
            {103, 470}
        };

        P50_LongJumpCompetition.sortBy(participants, 3, BEST_MARK);

        assertEquals("Expected: \"103\", but got: \"" + participants[0][DORSAL] + "\"", 103, participants[0][DORSAL]);
        assertEquals("Expected: \"101\", but got: \"" + participants[1][DORSAL] + "\"", 101, participants[1][DORSAL]);
        assertEquals("Expected: \"102\", but got: \"" + participants[2][DORSAL] + "\"", 102, participants[2][DORSAL]);
    }

    @Test(timeout = 1000)
    public void testSortByDorsal() {
        int[][] participants = {
            {105, 420},
            {101, 400},
            {103, 430}
        };

        P50_LongJumpCompetition.sortBy(participants, 3, DORSAL);

        assertEquals("Expected: \"101\", but got: \"" + participants[0][DORSAL] + "\"", 101, participants[0][DORSAL]);
        assertEquals("Expected: \"103\", but got: \"" + participants[1][DORSAL] + "\"", 103, participants[1][DORSAL]);
        assertEquals("Expected: \"105\", but got: \"" + participants[2][DORSAL] + "\"", 105, participants[2][DORSAL]);
    }
}
