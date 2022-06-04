/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inf202;

import java.util.ArrayList;
import java.util.Date;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import userInterface.ToursTableController;
//import javafx.beans.property.StringProperty;
/**
 *
 * @author mbirc
 */
public class Tour {
    
    private String tourName;
    private Date tourDatum;
    private String tourInfo;
    private int maxTeilnehmer = 0;
    private String hotelName;
    private float preis = 0;
    private String kunden;
    private int freiePlaetze = 0;
    private String reiseL;
/*
    public Tour(String n, Date d, String info, int maxT, String hN, float p, String rL)
    {
        tourName = n;
        tourDatum = d;
        tourInfo = info;
        maxTeilnehmer = maxT;
        hotelName = hN;
        preis = p;
        freiePlaetze = maxT;
        reiseL = rL;        
    }
*/
    public Tour(String n, Date d, String info, int maxT, String hN, float p)
    {
        tourName = n;
        tourDatum = d;
        tourInfo = info;
        maxTeilnehmer = maxT;
        hotelName = hN;
        preis = p;
        freiePlaetze = maxT;       
    }

    public Tour(String n, Date d, String info, int maxT, String hN, float p, int freieP, String rL, String kunde)
    {
        tourName = n;
        tourDatum = d;
        tourInfo = info;
        maxTeilnehmer = maxT;
        hotelName = hN;
        preis = p;
        freiePlaetze = freieP;
        reiseL = rL;        
        kunden = kunde;
    }
 
    public Tour(String n, Date d, String info, int maxT, String hN, float p, int freieP)
    {
        tourName = n;
        tourDatum = d;
        tourInfo = info;
        maxTeilnehmer = maxT;
        hotelName = hN;
        preis = p;
        freiePlaetze = freieP;        
    }

    public String getTourName() {
        return tourName;
    }
    
    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public Date getTourDatum() {
        return tourDatum;
    }

    public void setTourDatum(Date tourDatum) {
        this.tourDatum = tourDatum;
    }

    public String getTourInfo() {
        return tourInfo;
    }

    public void setTourInfo(String tourInfo) {
        this.tourInfo = tourInfo;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getKunden() {
        return kunden;
    }

    public void setKunden(String kunden) {
        this.kunden = kunden;
    }

    public int getFreiePlaetze() {
        return freiePlaetze;
    }

    public void setFreiePlaetze(int freiePlaetze) {
        this.freiePlaetze = freiePlaetze;
    }

    public String getReiseL() {
        return reiseL;
    }

    public void setReiseL(String r) {
        this.reiseL = r;
    }
    
    public int getMaxTeilnehmer(){
        return maxTeilnehmer;
    }
    
    public void setMaxTeilnehmer(int m){
        maxTeilnehmer = m;
    }

    public float getPreis(){
        return preis;
    }
    
    public void setPreis(int m){
        preis = m;
    }
          
}
