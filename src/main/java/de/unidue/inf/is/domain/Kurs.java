package de.unidue.inf.is.domain;

public final class kurs {

	
	private int kid;
    private String name;
    private String beschreibungstext;
    private String einschreibschluessel;
    private int freiePlaetze;
    private int ersteller;


    public kurs() {
    }


    public User(int kid, String name, String beschreibungstext, String einschreibschluessel, int freiePlaetze, int ersteller) {
        this.kid = kid;
        this.name = name;
        this.beschreibungstext = beschreibungtext;
        this.einschreibschluessel = einschreibschluessel;
        this.freiePlaetze = freiePlaetze;
        this.ersteller = ersteller;

    }


    public String getName() {
        return name;
    }


    public int getKid() {
        return kid;
    }
    
    public String getBeschreibungstext() {
        return beschreibungstext;
    }


    public String getEinschreibschlessel() {
        return einschreibschluessel;
    }
    public int getfreiePlaetze() {
        return einschreibschluessel;
    }
    public int getErsteller() {
        return einschreibschluessel;
    }
    
    public void setName(String n) {
        n = name;
    }


    public void setKid(int i) {
        kid = i;
    }
    
    public void setBeschreibungstext(String B) {
        beschreibungstext = B;
    }


    public void setEinschreibschlessel(String e) {
        einschreibschluessel = e;
    }
    public void setfreiePlaetze(String f) {
        einschreibschluessel = f;
    }
    public void setErsteller(String E) {
        einschreibschluessel = E;
    }
    

}