package brothers.gutiperez.meeplekeeper.Games.Application.BGG;

import brothers.gutiperez.meeplekeeper.Games.Application.TransformUtils.SearchToList;
import brothers.gutiperez.meeplekeeper.Games.Domain.BoardGame;
import brothers.gutiperez.meeplekeeper.Games.Infrastructure.AccessToBggApi;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class SearchBggGame {
    AccessToBggApi accessToBggApi = new AccessToBggApi();
    SearchToList searchToList = new SearchToList();

    @GetMapping ("/search-bgg-game")
    public List<BoardGame> search(String name) {
        String xmlResponse;
        List<BoardGame> boardGames;

        xmlResponse = accessToBggApi.connectToBggApi("https://api.geekdo.com/xmlapi/search?search=" + name);
        return boardGames = searchToList.parseXml(xmlResponse);

    }
}
