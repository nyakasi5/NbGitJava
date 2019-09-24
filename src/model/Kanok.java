/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 *
 * @author Nyakas István <30/7323629>
 */
public class Kanok {
  private int kanid;
  private String kannev;
  private String kfajta;
  private String kbekerules;

    public Kanok() {
    }
//Add
    public Kanok(String kannev, String kfajta, String kbekerules) {
        this.kannev = kannev;
        this.kfajta = kfajta;
        this.kbekerules = kbekerules;
    }
//Update
    public Kanok(int kanid, String kannev, String kfajta, String kbekerules) {
        this.kanid = kanid;
        this.kannev = kannev;
        this.kfajta = kfajta;
        this.kbekerules = kbekerules;
    }

    public int getKanid() {
        return kanid;
    }

    public void setKanid(int kanid) {
        this.kanid = kanid;
    }

    public String getKannev() {
        return kannev;
    }

    public void setKannev(String kannev) {
        this.kannev = kannev;
    }

    public String getKanfajta() {
        return kfajta;
    }

    public void setKanfajta(String kanfajta) {
        this.kfajta = kanfajta;
    }

    public String getKbekerules() {
        return kbekerules;
    }

    public void setKbekerules(String kbekerules) {
        this.kbekerules = kbekerules;
    }

    @Override
    public String toString() {
        return "Kanok{" + "kanid=" + kanid + ", kannev=" + kannev + ", kfajta=" + kfajta + ", kbekerules=" + kbekerules + '}';
    }

    
  
}
