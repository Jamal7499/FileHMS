package model.bean;

public class PatientSearchEntityView {
private String pname;
private String pid;
	
  public PatientSearchEntityView( ) {}
	public PatientSearchEntityView(String pname ,String pid) {
		
		this.pname = pname;
		this.pid = pid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

}
