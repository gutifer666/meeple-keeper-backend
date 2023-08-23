package brothers.gutiperez.meeplekeeper.Games.Domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class BoardGame {

    private int objectId;
    private String name;
    private String yearPublished;
    private final String baseUrl = "https://api.geekdo.com/xmlapi/boardgame/";


    @XmlAttribute(name = "objectid")
    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "yearpublished")
    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }
    public String getUrlGame() {
        return baseUrl + objectId + "?";
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "objectId=" + objectId +
                ", name='" + name + '\'' +
                ", yearPublished='" + yearPublished + '\'' +
                ", urlGame='" + getUrlGame() + '\'' +
                '}';
    }
}
