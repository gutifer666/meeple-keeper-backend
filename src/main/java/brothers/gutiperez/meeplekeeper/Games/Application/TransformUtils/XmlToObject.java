package brothers.gutiperez.meeplekeeper.Games.Application.TransformUtils;

import brothers.gutiperez.meeplekeeper.Games.Domain.Game;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import java.io.StringReader;

public class XmlToObject {
    public Game convert(String xml) {
        Game game;
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource source = new InputSource(new StringReader(xml));
            Document document = builder.parse(source);

            Element boardgameElement = (Element) document.getElementsByTagName("boardgame").item(0);
            game = new Game(
                    Integer.parseInt(boardgameElement.getAttribute("objectid")),
                    boardgameElement.getElementsByTagName("description").item(0).getTextContent(),
                    boardgameElement.getElementsByTagName("name").item(0).getTextContent(),
                    boardgameElement.getElementsByTagName("yearpublished").item(0).getTextContent(),
                    Integer.parseInt(boardgameElement.getElementsByTagName("minplayers").item(0).getTextContent()),
                    Integer.parseInt(boardgameElement.getElementsByTagName("maxplayers").item(0).getTextContent()),
                    Integer.parseInt(boardgameElement.getElementsByTagName("playingtime").item(0).getTextContent()),
                    Integer.parseInt(boardgameElement.getElementsByTagName("age").item(0).getTextContent()),
                    boardgameElement.getElementsByTagName("boardgamedesigner").item(0).getTextContent(),
                    boardgameElement.getElementsByTagName("image").item(0).getTextContent(),
                    boardgameElement.getElementsByTagName("thumbnail").item(0).getTextContent()
            );
            return game;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
