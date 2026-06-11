package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    @org.junit.jupiter.api.DisplayName("거터 게임은 0점이다")
    void gutterGame() {
        Game game = new Game();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }
}
