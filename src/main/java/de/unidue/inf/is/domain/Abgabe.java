package de.unidue.inf.is.domain;

public final class abgabe {

    private String abgabetext;
    private int aid;


    public abgabe() {
    }


    public abgabe(String abgabetext, int aid) {
        this.abgabetext = abgabetext;
        this.aid = aid;

    }


    public String getAbgabetext() {
        return abgabetext;
    }


    public int getAid() {
        return aid;
    }
    
    public void setAbgabetext(String a) {
        abgabetext = a;
    }


    public void setAid(int id) {
        aid = id;
    }


}