package brothers.gutiperez.meeplekeeper.Games.Application.Api;

import brothers.gutiperez.meeplekeeper.Games.Domain.Game;
import brothers.gutiperez.meeplekeeper.Games.Infrastructure.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DeleteGame {
    private final GameService gameService;
    @Autowired
    public DeleteGame(GameService gameService) {
        this.gameService = gameService;
    }
    @GetMapping("/delete-game-by-id")
    public Game delete(int id) {
        return gameService.deleteGamebyId(id);
    }
}
