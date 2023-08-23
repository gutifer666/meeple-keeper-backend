package brothers.gutiperez.meeplekeeper.Games.Application.TransformUtils;

import brothers.gutiperez.meeplekeeper.Games.Domain.BoardGame;
import brothers.gutiperez.meeplekeeper.Games.Domain.BoardGames;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.List;

public class SearchToList {
    public List<BoardGame> parseXml(String xmlContent) {
        try {
            JAXBContext context = JAXBContext.newInstance(BoardGames.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            StringReader reader = new StringReader(xmlContent);
            BoardGames boardgames = (BoardGames) unmarshaller.unmarshal(reader);

            return boardgames.getBoardgames();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
