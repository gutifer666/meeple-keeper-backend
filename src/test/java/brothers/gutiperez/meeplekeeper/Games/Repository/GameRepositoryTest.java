package brothers.gutiperez.meeplekeeper.Games.Repository;

import brothers.gutiperez.meeplekeeper.Games.Domain.Game;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GameRepositoryTest {
    @Autowired
    private GameRepository gameRepository;

    @Test
    void saveMethod(){
        Game game = new Game(1, "description", "name", "yearPublished", 1, 2, 3, 4, "designer", "imageUrl", "thumbnailUrl");
        Game gameSaved = gameRepository.save(game);
        System.out.println(gameSaved.getId());
        System.out.println(gameSaved);

    }

    @Test
    void updateUsingSaveMethod(){
        int id = 5;
        Game game = gameRepository.findById(id).orElseThrow();
        System.out.println(game);
        game.setAge(10);
        gameRepository.save(game);
        System.out.println(game);
    }

    @Test
    void deleteById(){
        int id = 5;
        Game game = gameRepository.findById(id).orElseThrow();
        System.out.println(game);
        gameRepository.deleteById(id);
        System.out.println(game);
    }
}