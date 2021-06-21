package de.unidue.inf.is.domain;

public final class benutzer {

    private int bnummer ;
    private String name;
    private String email;

    public benutzer() {
    }


    public benutzer(int bnummer, String name, String email) {
        this.bnummer = bnummer;
        this.name = name;
        this.email = email;
        

    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public int getBnummer() {
        return bnummer;
    }
    public void setName(String n) {
        name = n;
    }


    public void setEmail(String e) {
        email = e;
    }

    public void getbnummer(int n) {
        bnummer = n;
    }
}