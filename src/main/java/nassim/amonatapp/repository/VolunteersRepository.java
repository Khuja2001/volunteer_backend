package nassim.amonatapp.repository;
import nassim.amonatapp.model.Volunteers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolunteersRepository extends JpaRepository<Volunteers, Integer> {
    Volunteers findByLogin(String login);
}
