package brothers.gutiperez.meeplekeeper.Games.Domain;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int objectId;
    @Column(length = 10000)
    private String description;
    private String name;
    private String yearPublished;
    private int minPlayers;
    private int maxPlayers;
    private int playingTime;
    private int age;
    private String designer;
    private String imageUrl;
    private String thumbnailUrl;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @UpdateTimestamp
    private LocalDateTime lastUpdated;

    protected Game() {
    }

    public Game(int objectId, String description, String name, String yearPublished, int minPlayers, int maxPlayers,
                int playingTime, int age, String designer, String imageUrl, String thumbnailUrl) {
            this.objectId = objectId;
            this.description = description;
            this.name = name;
            this.yearPublished = yearPublished;
            this.minPlayers = minPlayers;
            this.maxPlayers = maxPlayers;
            this.playingTime = playingTime;
            this.age = age;
            this.designer = designer;
            this.imageUrl = imageUrl;
            this.thumbnailUrl = thumbnailUrl;

        }

    public int getId() {
        return id;
    }
    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @Override
    public String toString() {
        return "Game{" +
                "Id=" + id +
                "objectId=" + objectId +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", yearPublished='" + yearPublished + '\'' +
                ", minPlayers=" + minPlayers +
                ", maxPlayers=" + maxPlayers +
                ", playingTime=" + playingTime +
                ", age=" + age +
                ", designer='" + designer + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                '}';
    }
}
