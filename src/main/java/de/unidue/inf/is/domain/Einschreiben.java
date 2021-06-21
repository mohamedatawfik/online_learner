package de.unidue.inf.is.domain;


public final class einschreiben {

    private int bnummer;
    private int kid;
    private Date datum;




public einschreiben(int bnummer,int kid,Date datum) {
    this.bnummer = bnummer;
    this.kid = kid;
    this.datum = datum;
}
public int getBnummer() {
    return bnummer;
}
public void setBnummer(int b) {
    this.bnummer = b;
}
public int getKid() {
    return kid;
}
public void setKid(int k) {
    this.kid = k;
}
public Date getDatum() {
    return datum;
}
public void setDatum(Date m) {
    this.datum = m;
}
}