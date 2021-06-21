package de.unidue.inf.is.domain;

public final class einreichen{
private int bnummer;
private int kid;
private int anummer;
private int aid;


public einreichen(){}
public einreichen(int bn ,int kd , int an , int ad )
{
this.bnummer=bn;
this.kid=kd;
this.anummer=an;
this.aid=ad;
}

public int getBnummer(){
return bnummer;

}
public int getKid(){
return kid;

}
public int getAnummer(){
return anummer;

}
public int getAid(){
return aid;

}

 public void setBnummer(int b)
{
	bnummer=b;
}
 public void setKid(int k)
{
	kid=k;
}
 public void setAnummer(int a)
{
	anummer=a;
}
 public void setAid(int ad)
{
	aid=ad;
}
}