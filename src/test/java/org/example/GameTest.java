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

    @Test
    @org.junit.jupiter.api.DisplayName("모든 투구가 1점이면 총점은 20이다")
    void allOnes() {
        Game game = new Game();
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }

    @Test
    @org.junit.jupiter.api.DisplayName("스페어 후 다음 투구 점수가 보너스로 더해진다")
    void oneSpare() {
        Game game = new Game();
        game.roll(5);
        game.roll(5); // spare
        game.roll(3); // bonus
        for (int i = 0; i < 17; i++) {
            game.roll(0);
        }
        assertEquals(16, game.score());
    }

    @Test
    @org.junit.jupiter.api.DisplayName("스트라이크 후 다음 두 투구 점수가 보너스로 더해진다")
    void oneStrike() {
        Game game = new Game();
        game.roll(10); // strike
        game.roll(3);
        game.roll(4); // bonus
        for (int i = 0; i < 16; i++) {
            game.roll(0);
        }
        assertEquals(24, game.score());
    }

    @Test
    @org.junit.jupiter.api.DisplayName("퍼펙트 게임은 300점이다")
    void perfectGame() {
        Game game = new Game();
        for (int i = 0; i < 12; i++) {
            game.roll(10);
        }
        assertEquals(300, game.score());
    }
}
