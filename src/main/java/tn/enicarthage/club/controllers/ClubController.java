package tn.enicarthage.club.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.enicarthage.club.model.Club;
import tn.enicarthage.club.service.ClubService;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClubController {
 @Qualifier("clubServiceImpl")
    @Autowired
    private ClubService clubservice;
    @PostMapping("/add")
    public String addclub(@RequestBody Club club){
        clubservice.addClub(club);
        return "User Added Successfully...";
    }
    @GetMapping("/clubs")
    public List<Club> getClubs(){
        System.out.println("Clubs..");
        return clubservice.getClub();
    }
    @GetMapping("/club/{id}")
    public Club getClubById(@PathVariable("id") int id){
        return clubservice.getClubByid(id);
    }

    @PutMapping("/update/{id}")
    public String updateClub(@PathVariable("id") int id, @RequestBody Club club){
        clubservice.updateClub(id, club);
        return "Club Updated Successfully...";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteClub(@PathVariable("id") int id){
        clubservice.deleteClub(id);
        return "Club Deleted Successfully...";
    }


}