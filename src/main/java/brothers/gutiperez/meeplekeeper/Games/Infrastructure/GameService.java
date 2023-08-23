package brothers.gutiperez.meeplekeeper.Games.Infrastructure;

import brothers.gutiperez.meeplekeeper.Games.Domain.Game;
import brothers.gutiperez.meeplekeeper.Games.Exception.ResourceNotFoundException;
import brothers.gutiperez.meeplekeeper.Games.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;
    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game saveGame(Game game){
        return gameRepository.save(game);
    }
    public List<Game> getGames(){
        return gameRepository.findAll();
    }
    public Game getGameByObjectId(int objectId){
        return gameRepository.findByObjectId(objectId).orElseThrow();
    }
    public Game deleteGamebyId(int id){
        Game game = gameRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Game not exist with id: " + id));
        gameRepository.deleteById(id);
        return game;
    }
}
