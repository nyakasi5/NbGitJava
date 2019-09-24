/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nyakas István <30/7323629>
 */
public class Dbmodel implements Imodel {

    private Connection conn;
    private PreparedStatement pstmtGetAllKanok;
    private PreparedStatement pstmtRemoveKanok;
    private PreparedStatement pstmtUpdateKanok;
    private PreparedStatement pstmtAddKanok;
    
    private PreparedStatement pstmtGetAllKocak;
    private PreparedStatement pstmtRemoveKocak;
    private PreparedStatement pstmtUpdateKocak;
    private PreparedStatement pstmtAddKocak;
   
    private PreparedStatement pstmtGetAllTenyesztes;
    private PreparedStatement pstmtRemoveTenyesztes;
    private PreparedStatement pstmtUpdateTenyesztes;
    private PreparedStatement pstmtAddTenyesztes;

    
    public Dbmodel(Connection conn) throws SQLException {
        this.conn = conn;
        pstmtGetAllKanok = conn.prepareStatement("SELECT * FROM kanok");
        pstmtRemoveKanok = conn.prepareStatement("DELETE FROM kanok WHERE kanid=?");
        pstmtUpdateKanok = conn.prepareStatement("UPDATE kanok SET kannev=?, kfajta=?, kbekerules=? WHERE kanid=?");
        pstmtAddKanok = conn.prepareStatement("INSERT INTO kanok (kannev, kfajta, kbekerules) VALUES(?,?,?)");
        
        pstmtGetAllKocak = conn.prepareStatement("SELECT * FROM kocak");
        pstmtRemoveKocak = conn.prepareStatement("DELETE FROM kocak WHERE kocaid=?");
        pstmtUpdateKocak = conn.prepareStatement("UPDATE kocak SET kocaid=?,anya=?, apa=?, fajta=?,"
                      + " csszam=?,koszam=?,kocatenydatum=?,kanid=? WHERE id=?");
        pstmtAddKocak = conn.prepareStatement("INSERT INTO kocak ( anya, apa, fajta,"
                      + " csszam, koszam, kocatenydatum, kanid) VALUES(?,?,?,?,?,?,?)");
       
        pstmtGetAllTenyesztes = conn.prepareStatement("SELECT * FROM tenyesztes");
        pstmtRemoveTenyesztes = conn.prepareStatement("DELETE FROM tenyesztes WHERE tid=?");
        pstmtUpdateTenyesztes = conn.prepareStatement("UPDATE tenyesztes SET kocaid=?, tid=?, ternekenyites=?, kanid=?,"
                      + " uhvizsgalat=?, uh=?, fialasdatum=?, fialasdb=?, holtdb=?, valasztdatum=?, valasztdb=?,"
                      + " valasztholt=?, megjegyzes=? WHERE id=?");
        pstmtAddTenyesztes = conn.prepareStatement("INSERT INTO tenyesztes ( tid, ternekenyites, kanid, uhvizsgalat, "
                      + "uh, fialasdatum, fialasdb, holtdb, valasztdatum, valasztdb, valasztholt, megjegyzes) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
    }
    @Override
    public List<Kanok> getAllKanok() throws SQLException {
        List<Kanok> kanok = new ArrayList<>();
        ResultSet rs = pstmtGetAllKanok.executeQuery();
        
        while(rs.next()) {
            int kanid = rs.getInt("kanid");
            String kannev = rs.getString("kannev");
            String kfajta = rs.getString("kfajta");
            String kbekerules = rs.getString("kbekerules");
            
            Kanok r = new Kanok(kanid, kannev, kfajta, kbekerules);
            kanok.add(r);
        }
        rs.close();
        return kanok;
    }

    @Override
    public int removeKanok(Kanok r) throws SQLException {
         pstmtRemoveKanok.setInt(1, r.getKanid());
         
        return pstmtRemoveKanok.executeUpdate();
    }

    @Override
    public int updateKanok(Kanok r) throws SQLException {
        pstmtUpdateKanok.setInt(1, r.getKanid());
        pstmtUpdateKanok.setString(2, r.getKannev());
        pstmtUpdateKanok.setString(3, r.getKanfajta());
        pstmtUpdateKanok.setString(4,  r.getKbekerules());
       
        return pstmtUpdateKanok.executeUpdate();
    }

    @Override
    public int addKanok(Kanok r) throws SQLException {

        pstmtAddKanok.setString(1, r.getKannev());
        pstmtAddKanok.setString(2, r.getKanfajta());
        pstmtAddKanok.setString(3,  r.getKbekerules());
        
             
        
        return pstmtAddKanok.executeUpdate();  }

    @Override
    public List<Kocak> getAllKocak() throws SQLException {
        List<Kocak> kocak = new ArrayList<>();
        ResultSet rs = pstmtGetAllKocak.executeQuery();
        
        while(rs.next()) {
            int kocaid = rs.getInt("kocaid");
            String anya = rs.getString("anya");
            String apa = rs.getString("apa");
            String fajta = rs.getString("fajta");
            String csszam = rs.getString("csipszam");
            String koszam = rs.getString("koszam");
            String kocatenydatum = rs.getString("kocatenydatum");
            
            Kocak r = new Kocak(kocaid, anya, apa, fajta, csszam, koszam, 
                          kocatenydatum);
            kocak.add(r);
        }
        rs.close();
        return kocak;
    }

    @Override
    public int removeKocak(Kocak r) throws SQLException {
        pstmtRemoveKocak.setInt(1, r.getKocaid());
        return pstmtRemoveKocak.executeUpdate(); 
    }

    @Override
    public int updateKocak(Kocak r) throws SQLException {
        pstmtUpdateKocak.setInt(1, r.getKocaid());
        pstmtUpdateKocak.setString(2, r.getAnya());
        pstmtUpdateKocak.setString(3, r.getApa());
        pstmtUpdateKocak.setString(4, r.getFajta());
        pstmtUpdateKocak.setString(5, r.getCsszam());
        pstmtUpdateKocak.setString(6, r.getKoszam());
        return pstmtUpdateKocak.executeUpdate();  
    }

    @Override
    public int addKocak(Kocak r) throws SQLException {
       
        pstmtAddKocak.setString(2, r.getAnya());
        pstmtAddKocak.setString(3, r.getApa());
        pstmtAddKocak.setString(4, r.getFajta());
        pstmtAddKocak.setString(5, r.getCsszam());
        pstmtAddKocak.setString(6, r.getKoszam());
        pstmtAddKocak.setString(7, r.getKocatenydatum());
        return pstmtAddKocak.executeUpdate();  }

    @Override
    public List<Tenyesztes> getAllTenyesztes() throws SQLException {
        List<Tenyesztes> tenyesztes = new ArrayList<>();
        ResultSet rs = pstmtGetAllTenyesztes.executeQuery();
        
        while(rs.next()) {
            int kocaid = rs.getInt("kocaid");
            int tid = rs.getInt("tid");
            String termekenyites = rs.getString("termekenyites");
            int kanid = rs.getInt("kanid");
            String uhvizsgalat = rs.getString("uhvizsgalat");
            String uh = rs.getString("uh");
            String fialdatum = rs.getString("fialasdatum");
            int fialtdb = rs.getInt("fialtdb");
            int holtdb = rs.getInt("holtdb");
            String valasztdatum = rs.getString("valasztdatum");
            int valasztdb = rs.getInt("valasztdb");
            int vholtdb = rs.getInt("valasztholt");
            String megjegyzes = rs.getString("megjegyzes");
            
            Tenyesztes r = new Tenyesztes(kocaid, tid, termekenyites,kanid,
                          uhvizsgalat,uh,fialdatum,fialtdb,holtdb,valasztdatum,valasztdb,vholtdb, megjegyzes);
            tenyesztes.add(r);
        }
        rs.close();
        return tenyesztes;
    }

    @Override
    public int removeTenyesztes(Tenyesztes r) throws SQLException {
     pstmtRemoveTenyesztes.setInt(2, r.getTid());
        return pstmtRemoveTenyesztes.executeUpdate();      
    }

    @Override
    public int updateTenyesztes(Tenyesztes r) throws SQLException {
         
        pstmtUpdateTenyesztes.setInt(1, r.getKocaid());
        pstmtUpdateTenyesztes.setInt(1, r.getTid());
        pstmtUpdateTenyesztes.setString(2, r.getTermekenyites());
        pstmtUpdateTenyesztes.setInt(3, r.getKanid());
        pstmtUpdateTenyesztes.setString(4,  r.getUhvizsgalat());
        pstmtUpdateTenyesztes.setString(5, r.getUh());
        pstmtUpdateTenyesztes.setString(6,  r.getFialas());
        pstmtUpdateTenyesztes.setInt(7, r.getFialtdb());
        pstmtUpdateTenyesztes.setInt(8, r.getHoltdb());
        pstmtUpdateTenyesztes.setString(9,  r.getValasztas());
        pstmtUpdateTenyesztes.setInt(10, r.getVdb());
        pstmtUpdateTenyesztes.setInt(11, r.getVholt());
         pstmtUpdateTenyesztes.setString(12, r.getMegjegyzes());
        return pstmtUpdateTenyesztes.executeUpdate(); 
    }

    @Override
    public int addTenyesztes(Tenyesztes r) throws SQLException {
         
        pstmtAddTenyesztes.setInt(1, r.getKocaid());
        pstmtAddTenyesztes.setString(2,  r.getTermekenyites());
        pstmtAddTenyesztes.setInt(3, r.getKanid());
        pstmtAddTenyesztes.setString(4,  r.getUhvizsgalat());
        pstmtAddTenyesztes.setString(5, r.getUh());
        pstmtAddTenyesztes.setString(6,  r.getFialas());
        pstmtAddTenyesztes.setInt(7, r.getFialtdb());
        pstmtAddTenyesztes.setInt(8, r.getHoltdb());
        pstmtAddTenyesztes.setString(9,  r.getValasztas());
        pstmtAddTenyesztes.setInt(10, r.getVdb());
        pstmtAddTenyesztes.setInt(11, r.getVholt());
         pstmtAddTenyesztes.setString(12, r.getMegjegyzes());
        return pstmtAddTenyesztes.executeUpdate();  }
    }


