package brothers.gutiperez.meeplekeeper.Games.Application.Api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DeleteGameTest {
    @Autowired
    private DeleteGame deleteGame;
    @Autowired


    @Test
    void delete_game_by_id() {
        deleteGame.delete(1);
    }
}