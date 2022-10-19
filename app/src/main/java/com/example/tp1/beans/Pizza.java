package com.example.tp1.beans;

public class Pizza {
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String dataisingred;
    private  String descreption;
    private String preparation;
    private static int comp;
    public Pizza(String nom, int nbrIngredients, int photo, String duree, String dataisingred, String descreption,
                 String preparation) {
        super();
        this.id = ++ comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.dataisingred = dataisingred;
        this.descreption = descreption;
        this.preparation = preparation;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNbrIngredients() {
        return nbrIngredients;
    }
    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }
    public int getPhoto() {
        return photo;
    }
    public void setPhoto(int photo) {
        this.photo = photo;
    }
    public String getDuree() {
        return duree;
    }
    public void setDuree(String duree) {
        this.duree = duree;
    }
    public String getDataisingred() {
        return dataisingred;
    }
    public void setDataisingred(String dataisingred) {
        this.dataisingred = dataisingred;
    }
    public String getDescreption() {
        return descreption;
    }
    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }
    public String getPreparation() {
        return preparation;
    }
    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }
    public static int getComp() {
        return comp;
    }
    public static void setComp(int comp) {
        Pizza.comp = comp;
    }
    @Override
    public String toString() {
        return "Pizza [id=" + id + ", nom=" + nom + ", nbrIngredients=" + nbrIngredients + ", photo=" + photo
                + ", duree=" + duree + ", dataisingred=" + dataisingred + ", descreption=" + descreption
                + ", preparation=" + preparation + "]";
    }


}
