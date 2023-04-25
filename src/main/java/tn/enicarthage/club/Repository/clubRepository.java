package tn.enicarthage.club.Repository;
import org.springframework.data.repository.CrudRepository;
import tn.enicarthage.club.model.Club;
import org.springframework.stereotype.Repository;
@Repository
public interface clubRepository extends CrudRepository<Club, Integer> { }
