package Tooles;

public class Societe {
    int id;
    String Nom_derecteur;
    String Nom_societe;
    String Societe_adress;
    int N_tlf_Soc;
    int N_fax_Soc;
    String Domptes_bancaire;

    public Societe(int id, String nom_derecteur, String nom_societe, String societe_adress, int n_tlf_Soc, int n_fax_Soc, String domptes_bancaire) {
        this.id = id;
        Nom_derecteur = nom_derecteur;
        Nom_societe = nom_societe;
        Societe_adress = societe_adress;
        N_tlf_Soc = n_tlf_Soc;
        N_fax_Soc = n_fax_Soc;
        Domptes_bancaire = domptes_bancaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_derecteur() {
        return Nom_derecteur;
    }

    public void setNom_derecteur(String nom_derecteur) {
        Nom_derecteur = nom_derecteur;
    }

    public String getNom_societe() {
        return Nom_societe;
    }

    public void setNom_societe(String nom_societe) {
        Nom_societe = nom_societe;
    }

    public String getSociete_adress() {
        return Societe_adress;
    }

    public void setSociete_adress(String societe_adress) {
        Societe_adress = societe_adress;
    }

    public int getN_tlf_Soc() {
        return N_tlf_Soc;
    }

    public void setN_tlf_Soc(int n_tlf_Soc) {
        N_tlf_Soc = n_tlf_Soc;
    }

    public int getN_fax_Soc() {
        return N_fax_Soc;
    }

    public void setN_fax_Soc(int n_fax_Soc) {
        N_fax_Soc = n_fax_Soc;
    }

    public String getDomptes_bancaire() {
        return Domptes_bancaire;
    }

    public void setDomptes_bancaire(String domptes_bancaire) {
        Domptes_bancaire = domptes_bancaire;
    }
}
