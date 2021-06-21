package de.unidue.inf.is.domain;

public final class aufgabe {
	private int kid;
	private int anummer;
    private String name;
    private String beschreibung;


    public aufgabe() {
    }


    public aufgabe(int kid, int anummer, String name, String beschreibung) {
        this.kid = kid;
        this.anummer = anummer;
        this.name = name;
        this.beschreibung = beschreibung;

    }


    public String getName() {
        return name;
    }


    public String getBeschreibung() {
        return beschreibung;
    }
    public int getKid() {
        return kid;
    }


    public int getAnummer() {
        return anummer;
    }
    
    public void setName(String n) {
        name = n;
    }


    public void setBeschreibung(String b) {
        beschreibung = b;
    }
    public void setKid(int k) {
        kid = k;
    }


    public void setAnummer(int A) {
        anummer = A;
    }

}