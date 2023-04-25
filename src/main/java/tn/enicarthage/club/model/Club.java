package tn.enicarthage.club.model;


import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
public  class Club  {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(nullable = false)
  private String image;
  @Column(nullable = false)
    private String nom;
  @Column(nullable = false)
  private String mission;
  @Column(nullable = false)
  private String password;
  @Column(nullable = false)
  private Date datecr;
  @Column(nullable = false)
  private String resp;
  @Column(nullable = false)
  private int nbmembres;

  public Club() {
  }

}
