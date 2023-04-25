package tn.enicarthage.club.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tn.enicarthage.club.Repository.clubRepository;
import tn.enicarthage.club.dbutil.DBUtil;
import tn.enicarthage.club.exception.UserNotFoundException;
import tn.enicarthage.club.model.Club;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;


@Service
public class ClubServiceImpl implements ClubService {
    Connection connection;
   clubRepository cr;
    @Autowired
    public ClubServiceImpl(clubRepository cr) {
        this.cr = cr;
    }
   public ClubServiceImpl() throws SQLException {
       connection= DBUtil.getConnection();}
    @Override
    public Club addClub(Club club) {return cr.save(club);}
    public List<Club> getClub() {return (List<Club>) cr.findAll();}
    public Club getClubByid(int id) {return cr.findById(id).get();}
    @Override
    public Club updateClub(int id, Club club) {
        Club club1= cr.findById(id).get();
        club1.setNom(club.getNom());
        club1.setMission(club.getMission());
        club1.setResp(club.getResp());
        club1.setDatecr(club.getDatecr());
        club1.setNbmembres(club.getNbmembres());
        return cr.save(club1);}
    @Override
    public void deleteClub(int id) {cr.deleteById(id);}

}
