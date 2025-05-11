package com.example.crudEtudiants.model;

public class Etudiant {
    private String nom;
    private String prenom;
    private int CIN;
    private String email;
    private String password;
    public Etudiant(String nom,String prenom,int CIN,String email,String password){
        this.nom=nom;
        this.prenom=prenom;
        this.CIN=CIN;
        this.password=password;
        this.email=email;
    }

    public int getCIN() {
        return CIN;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String toString(){
        return "nom :"+nom+" prenom: "+prenom+" CIN: "+CIN;
    }
}
