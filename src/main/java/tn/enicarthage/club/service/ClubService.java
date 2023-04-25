package tn.enicarthage.club.service;
import org.springframework.stereotype.Repository;
import tn.enicarthage.club.model.Club;

import java.util.List;

@Repository
public interface ClubService {

  public Club addClub(Club club);

    public List<Club> getClub();

    public Club getClubByid(int id);

    public Club updateClub(int id , Club club);

    public void deleteClub(int id);

}
