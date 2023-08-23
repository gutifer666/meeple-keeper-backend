package brothers.gutiperez.meeplekeeper.Games.Repository;

import brothers.gutiperez.meeplekeeper.Games.Domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// Don't need to add the @Repository annotation because JpaRepository already has it
public interface GameRepository extends JpaRepository<Game, Integer> {
    Optional<Game> findByObjectId(int objectId);
}
