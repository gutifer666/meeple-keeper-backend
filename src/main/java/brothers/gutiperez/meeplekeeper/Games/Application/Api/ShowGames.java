package brothers.gutiperez.meeplekeeper.Games.Application.Api;

import brothers.gutiperez.meeplekeeper.Games.Domain.Game;
import brothers.gutiperez.meeplekeeper.Games.Infrastructure.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ShowGames {
    private final GameService gameService;
    @Autowired
    public ShowGames(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/show-games")
    public List<Game> showGames() {
        return gameService.getGames();
    }

}
