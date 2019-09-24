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
public class Kocak {
  private int kocaid;
  private String anya;
  private String apa;
  private String fajta;
  private String csszam;
  private String koszam;
  private String kocatenydatum;
  

    public Kocak() {
    }

    public Kocak(String anya, String apa, String fajta,String csszam, String koszam, String kocatenydatum) {
        this.anya = anya;
        this.apa = apa;
        this.fajta = fajta;
        this.csszam = csszam;
        this.koszam = koszam;
        this.kocatenydatum = kocatenydatum;
    }

    public Kocak(int kocaid, String anya, String apa, String fajta, String csszam, String koszam, String kocatenydatum) {
        this.kocaid = kocaid;
        this.anya = anya;
        this.apa = apa;
        this.fajta = fajta;
        this.csszam = csszam;
        this.koszam = koszam;
        this.kocatenydatum =  kocatenydatum;
    } 

    public int getKocaid() {
        return kocaid;
    }

    public void setKocaid(int kocaid) {
        this.kocaid = kocaid;
    }

    public String getAnya() {
        return anya;
    }

    public void setAnya(String anya) {
        this.anya = anya;
    }

    public String getApa() {
        return apa;
    }

    public void setApa(String apa) {
        this.apa = apa;
    }

    public String getFajta() {
        return fajta;
    }

    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    public String getKoszam() {
        return koszam;
    }

    public void setKoszam(String koszam) {
        this.koszam = koszam;
    }

    public String getCsszam() {
        return csszam;
    }

    public void setCsszam(String csszam) {
        this.csszam = csszam;
    }

    public String getKocatenydatum() {
        return kocatenydatum;
    }

    public void setKocatenydatum(String kocatenydatum) {
        this.kocatenydatum = kocatenydatum;
    }

    

    @Override
    public String toString() {
        return  "kocaid=" + kocaid + ", anya=" + anya + ", apa=" + 
                      apa + ", fajta=" + fajta + ", koszam=" + koszam + ", csszam=" + csszam + ", kocatenydatum=" + kocatenydatum ;
    }
  
  
}
