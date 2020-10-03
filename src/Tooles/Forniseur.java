package Tooles;

public class Forniseur {
    int id;
    String nom_prenom_for;
    String Forniseur_adress;
    int N_tlf_for;
    int N_fax_for;

    public Forniseur(int id, String nom_prenom_for, String forniseur_adress, int n_tlf_for, int n_fax_for) {
        this.id = id;
        this.nom_prenom_for = nom_prenom_for;
        Forniseur_adress = forniseur_adress;
        N_tlf_for = n_tlf_for;
        N_fax_for = n_fax_for;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom_prenom_for(String nom_prenom_for) {
        this.nom_prenom_for = nom_prenom_for;
    }

    public void setForniseur_adress(String forniseur_adress) {
        Forniseur_adress = forniseur_adress;
    }

    public void setN_tlf_for(int n_tlf_for) {
        N_tlf_for = n_tlf_for;
    }

    public void setN_fax_for(int n_fax_for) {
        N_fax_for = n_fax_for;
    }

    public int getId() {
        return id;
    }

    public String getNom_prenom_for() {
        return nom_prenom_for;
    }

    public String getForniseur_adress() {
        return Forniseur_adress;
    }

    public int getN_tlf_for() {
        return N_tlf_for;
    }

    public int getN_fax_for() {
        return N_fax_for;
    }
}
