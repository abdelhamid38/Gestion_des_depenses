package Tooles;

public class Depenses {
int id;
String Theme;
Double mantant;
int id_lang;

    public Depenses(int id, String theme, Double mantant, int id_lang) {
        this.id = id;
        Theme = theme;
        this.mantant = mantant;
        this.id_lang = id_lang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    public Double getMantant() {
        return mantant;
    }

    public void setMantant(Double mantant) {
        this.mantant = mantant;
    }

    public int getId_lang() {
        return id_lang;
    }

    public void setId_lang(int id_lang) {
        this.id_lang = id_lang;
    }
}
