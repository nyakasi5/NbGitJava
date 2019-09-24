/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Nyakas István <30/7323629>
 */
public class Tenyesztes {
    
    private int kocaid;
    private int tid;
    private String termekenyites;
    private int kanid;
    private String uhvizsgalat;
    private String uh;
    private String fialas;
    private int fialtdb;
    private int holtdb;
    private String valasztas;
    private int vdb;
    private int vholt;
    private String megjegyzes;

    public Tenyesztes() {
    }

    public Tenyesztes(int kocaid, String termekenyites, int kanid, String uhvizsgalat,String uh, String fialas, int fialtdb, int holtdb, String valasztas, int vdb, int vholt, String magjegyzes) {
        this.kocaid = kocaid;
        this.termekenyites = termekenyites;
        this.kanid = kanid;
        this.uhvizsgalat = uhvizsgalat;
        this.uh = uh;
        this.fialas = fialas;
        this.fialtdb = fialtdb;
        this.holtdb = holtdb;
        this.valasztas = valasztas;
        this.vdb = vdb;
        this.vholt = vholt;
        this.megjegyzes = megjegyzes;
    }

    public Tenyesztes(int kocaid, int tid, String termekenyites, int kanid, String uhvizsgalat,String uh, String fialas, int fialtdb, int holtdb, String valasztas, int vdb, int vholt, String megjegyzes) {
        this.kocaid = kocaid;
        this.tid = tid;
        this.termekenyites = termekenyites;
        this.kanid = kanid;
        this.uhvizsgalat = uhvizsgalat;
        this.uh= uh;
        this.fialas = fialas;
        this.fialtdb = fialtdb;
        this.holtdb = holtdb;
        this.valasztas = valasztas;
        this.vdb = vdb;
        this.vholt = vholt;
        this.megjegyzes = megjegyzes;
    }

    Tenyesztes(int kocaid, int tid, String termekenyites, int kanid, String uhvizsgalat, String uh, String fialdatum, int fialtdb, int holtdb, String valasztdatum, int valasztdb, int vholtdb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public int getKocaid() {
        return kocaid;
    }

    public void setKocaid(int kocaid) {
        this.kocaid = kocaid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTermekenyites() {
        return termekenyites;
    }

    public void setTermekenyites(String termekenyites) {
        this.termekenyites = termekenyites;
    }

    public int getKanid() {
        return kanid;
    }

    public void setKanid(int kanid) {
        this.kanid = kanid;
    }

    public String getUhvizsgalat() {
        return uhvizsgalat;
    }

    public void setUhvizsgalat(String uhvizsgalat) {
        this.uhvizsgalat = uhvizsgalat;
    }

    public String getFialas() {
        return fialas;
    }

    public void setFialas(String fialas) {
        this.fialas = fialas;
    }

    public int getFialtdb() {
        return fialtdb;
    }

    public void setFialtdb(int fdb) {
        this.fialtdb = fialtdb;
    }

    public int getHoltdb() {
        return holtdb;
    }

    public void setHoltdb(int fholt) {
        this.holtdb = holtdb;
    }

    public String getValasztas() {
        return valasztas;
    }

    public void setValasztas(String valasztas) {
        this.valasztas = valasztas;
    }

    public int getVdb() {
        return vdb;
    }

    public void setVdb(int vdb) {
        this.vdb = vdb;
    }

    public int getVholt() {
        return vholt;
    }

    public void setVholt(int vholt) {
        this.vholt = vholt;
    }

    public String getMegjegyzes() {
        return megjegyzes;
    }

    public void setMegjegyzes(String magjegyzes) {
        this.megjegyzes = megjegyzes;
    }

    @Override
    public String toString() {
        return "Tenyesztes{" + "kocaid=" + kocaid + ", tid=" + tid + ", termekenyites=" + termekenyites + ", kanid=" + kanid + ", uhvizsgalat=" + uhvizsgalat + ", uh=" + uh + " fialas=" + fialas + ", fialtdb=" + fialtdb + ", fholtdb=" + holtdb + ", valasztas=" + valasztas + ", vdb=" + vdb + ", vholt=" + vholt + ", megjegyzes=" + megjegyzes + '}';
    }

    public String getUh() {
        return uh;
    }

    public void setUh(String uh) {
        this.uh = uh;
    }
    
    
}
