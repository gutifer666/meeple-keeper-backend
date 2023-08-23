package brothers.gutiperez.meeplekeeper.Games.Application.Api;

import brothers.gutiperez.meeplekeeper.Games.Domain.Game;
import brothers.gutiperez.meeplekeeper.Games.Infrastructure.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ShowGame {
    private final GameService gameService;
    @Autowired
    public ShowGame(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/show-game")
    public Game showGame(int gameId) {
        return gameService.getGameByObjectId(gameId);
    }
}
