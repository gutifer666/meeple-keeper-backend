package brothers.gutiperez.meeplekeeper.Games.Application.BGG;

import brothers.gutiperez.meeplekeeper.Games.Application.TransformUtils.XmlToObject;
import brothers.gutiperez.meeplekeeper.Games.Domain.Game;
import brothers.gutiperez.meeplekeeper.Games.Infrastructure.AccessToBggApi;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ShowBggGame {
    AccessToBggApi accessToBggApi = new AccessToBggApi();
    XmlToObject xmlToObject = new XmlToObject();

    @GetMapping("/show-bgg-game")
    public Game show(int id){
        String xmlResponse = accessToBggApi.connectToBggApi(String.format("https://api.geekdo.com/xmlapi/boardgame/%d?", id ));
        return xmlToObject.convert(xmlResponse);
    }

}
