package brothers.gutiperez.meeplekeeper.Games.Application.Api;

import brothers.gutiperez.meeplekeeper.Games.Application.TransformUtils.XmlToObject;
import brothers.gutiperez.meeplekeeper.Games.Domain.Game;
import brothers.gutiperez.meeplekeeper.Games.Infrastructure.GameService;
import brothers.gutiperez.meeplekeeper.Games.Infrastructure.AccessToBggApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SaveBggGame {
    AccessToBggApi accessToBggApi = new AccessToBggApi();
    XmlToObject xmlToObject = new XmlToObject();
    private final GameService gameService;
    @Autowired
    public SaveBggGame(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/save-bgg-game")
    public Game saveBggGame(int objectId) {
        String xmlResponse = accessToBggApi.connectToBggApi(String.format("https://api.geekdo.com/xmlapi/boardgame/%d?", objectId));
        Game game = xmlToObject.convert(xmlResponse);
        return gameService.saveGame(game);
    }
}
