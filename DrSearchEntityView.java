package model.bean;

public class DrSearchEntityView {
private String drname;	
private String drid;



public DrSearchEntityView(String drname, String drid) {
	super();
	this.drname = drname;
	this.drid = drid;
}
public String getDrname() {
	return drname;
}
public void setDrname(String drname) {
	this.drname = drname;
}
public String getDrid() {
	return drid;
}
public void setDrid(String drid) {
	this.drid = drid;
}
	
	

}
