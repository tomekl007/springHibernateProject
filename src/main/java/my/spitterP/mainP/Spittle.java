package my.spitterP.mainP;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import my.spitterP.mainP.Spitter;

//@Table(name = "spittle")
@Entity
public class Spittle {
  private Long id;
  private Spitter spitter;
  private String text;
  private Date when;

  public Spittle() {
    this.spitter = new Spitter();  // HARD-CODED FOR NOW
    this.spitter.setId((long)1);
  }
  @Id
  public Long getId() {
    return this.id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getText() {
    return this.text;
  }
  
  public void setText(String text) {
    this.text = text;
  }
  
  public Date getWhen() {
    return this.when;
  }

  public void setWhen(Date when) {
    this.when = when;
  }

  @ManyToOne
 @JoinColumn(name = "SPITTER_ID")
  public Spitter getSpitter() {
    return this.spitter;
  }

  public void setSpitter(Spitter spitter) {
    this.spitter = spitter;
  }
}
