/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Nyakas István <30/7323629>
 */
public interface Imodel {
   
     List<Kanok> getAllKanok() throws SQLException;
    int removeKanok(Kanok r) throws SQLException;
    int updateKanok(Kanok r) throws SQLException;
    int addKanok(Kanok r) throws SQLException;
    
     List<Kocak> getAllKocak() throws SQLException;
    int removeKocak(Kocak r) throws SQLException;
    int updateKocak(Kocak r) throws SQLException;
    int addKocak(Kocak r) throws SQLException;
    
     List<Tenyesztes> getAllTenyesztes() throws SQLException;
    int removeTenyesztes(Tenyesztes r) throws SQLException;
    int updateTenyesztes(Tenyesztes r) throws SQLException;
    int addTenyesztes(Tenyesztes r) throws SQLException;
    
}
