package Tooles;

import java.util.Date;

public class Commend {
    int id ;
    String Agir_pour;
    String Theme;
    Date Date;
    Double Mantant;
    Double Mantant_total;

    public Commend(){

    }

    public Commend(int id, String agir_pour, String theme, java.util.Date date, Double mantant, Double mantant_total) {
        this.id = id;
        Agir_pour = agir_pour;
        Theme = theme;
        Date = date;
        Mantant = mantant;
        Mantant_total = mantant_total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAgir_pour() {
        return Agir_pour;
    }

    public void setAgir_pour(String agir_pour) {
        Agir_pour = agir_pour;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public Double getMantant() {
        return Mantant;
    }

    public void setMantant(Double mantant) {
        Mantant = mantant;
    }

    public Double getMantant_total() {
        return Mantant_total;
    }

    public void setMantant_total(Double mantant_total) {
        Mantant_total = mantant_total;
    }
}
