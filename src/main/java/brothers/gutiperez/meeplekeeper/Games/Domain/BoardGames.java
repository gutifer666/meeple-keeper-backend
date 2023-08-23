package brothers.gutiperez.meeplekeeper.Games.Domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "boardgames")
public class BoardGames {
    private List<BoardGame> boardgames = new ArrayList<>();

    @XmlElement(name = "boardgame")
    public List<BoardGame> getBoardgames() {
        return boardgames;
    }

    public void setBoardgames(List<BoardGame> boardgames) {
        this.boardgames = boardgames;
    }
}

