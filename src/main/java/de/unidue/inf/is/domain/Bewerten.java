package de.unidue.inf.is.domain;

public final class bewerten {

    private int bnummer;
    private int aid;
    private int note;
    private String kommentar;


public bewerten(int bnummer,int aid,int note,String kommentar) {
    this.bnummer = bnummer;
    this.aid = aid;
    this.note = note;
    this.kommentar = kommentar;
}
public int getBnummer() {
    return bnummer;
}
public void setBnummer(int b) {
    this.bnummer = bnummer;
}
public int getAid() {
    return aid;
}
public void setAid(int a) {
    this.aid = a;
}
public int getNote() {
    return note;
}
public void setNote(int n) {
    this.note = n;
}

public string getKommentar() {
    return kommentar;
}
public void setKommentar(String k) {
    this.kommentar = k;
}
}