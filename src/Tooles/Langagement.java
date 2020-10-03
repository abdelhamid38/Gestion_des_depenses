package Tooles;

import java.util.Date;

public class Langagement {
 int id;
 Date date;
 int nombre;
 String titre;
 Double Ancien_solde;
 Double neveau_solde;
 Double operation;
 int id_port;

    public Langagement(int id, Date date, int nombre, String titre, Double ancien_solde, Double neveau_solde, Double operation, int id_port) {
        this.id = id;
        this.date = date;
        this.nombre = nombre;
        this.titre = titre;
        Ancien_solde = ancien_solde;
        this.neveau_solde = neveau_solde;
        this.operation = operation;
        this.id_port = id_port;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Double getAncien_solde() {
        return Ancien_solde;
    }

    public void setAncien_solde(Double ancien_solde) {
        Ancien_solde = ancien_solde;
    }

    public Double getNeveau_solde() {
        return neveau_solde;
    }

    public void setNeveau_solde(Double neveau_solde) {
        this.neveau_solde = neveau_solde;
    }

    public Double getOperation() {
        return operation;
    }

    public void setOperation(Double operation) {
        this.operation = operation;
    }

    public int getId_port() {
        return id_port;
    }

    public void setId_port(int id_port) {
        this.id_port = id_port;
    }
}
