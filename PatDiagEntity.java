package model.bean;

public class PatDiagEntity {
	private String reportid;
	private String patid;
	private String phyid;
	private String sdate;
	private String trdate;
	private String actuald1;
	private String ranged1;
	private String actuald2;
	private String ranged2;
	private String actuald3;
	private String ranged3;
	private String actuald4;
	private String ranged4;
	private String actuald5;
	private String ranged5;
	private String actuald6;
	private String ranged6;
	private String text;
	private String otherinfo;

	public PatDiagEntity(){}
	public PatDiagEntity(String reportid,String patid,String phyid,String sdate,String trdate,String actuald1,String ranged1,String actuald2,String ranged2,String actuald3,String ranged3,String actuald4,String ranged4,String actuald5,String ranged5,String actuald6,	String ranged6,String text,String otherinfo )
	{
		super();
		this.reportid=reportid;
		this.patid=patid;
		this.phyid=phyid;
		this.sdate=sdate;
		this.trdate=trdate;
		this.actuald1=actuald1;
		this.ranged1=ranged1;
		this.actuald2=actuald2;
		this.ranged2=ranged2;
		this.actuald3=actuald3;
		this.ranged3=ranged3;
		this.actuald4=actuald4;
		this.ranged4=ranged4;
		this.actuald5=actuald5;
		this.ranged5=ranged5;
		this.actuald6=actuald6;
		this.ranged6=ranged6;
		this.text=text;
		this.otherinfo=otherinfo;	
	}

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getTrdate() {
		return trdate;
	}

	public void setTrdate(String trdate) {
		this.trdate = trdate;
	}

	public String getActuald1() {
		return actuald1;
	}

	public void setActuald1(String actuald1) {
		this.actuald1 = actuald1;
	}

	public String getReportid() {
		return reportid;
	}

	public void setReportid(String reportid) {
		this.reportid = reportid;
	}

	public String getPatid() {
		return patid;
	}

	public void setPatid(String patid) {
		this.patid = patid;
	}

	public String getPhyid() {
		return phyid;
	}

	public void setPhyid(String phyid) {
		this.phyid = phyid;
	}

	public String getRanged1() {
		return ranged1;
	}

	public void setRanged1(String ranged1) {
		this.ranged1 = ranged1;
	}

	public String getActuald2() {
		return actuald2;
	}

	public void setActuald2(String actuald2) {
		this.actuald2 = actuald2;
	}

	public String getRanged2() {
		return ranged2;
	}

	public void setRanged2(String ranged2) {
		this.ranged2 = ranged2;
	}

	public String getActuald3() {
		return actuald3;
	}

	public void setActuald3(String actuald3) {
		this.actuald3 = actuald3;
	}

	public String getRanged3() {
		return ranged3;
	}

	public void setRanged3(String ranged3) {
		this.ranged3 = ranged3;
	}

	public String getActuald4() {
		return actuald4;
	}

	public void setActuald4(String actuald4) {
		this.actuald4 = actuald4;
	}

	public String getRanged4() {
		return ranged4;
	}

	public void setRanged4(String ranged4) {
		this.ranged4 = ranged4;
	}

	public String getActuald5() {
		return actuald5;
	}

	public void setActuald5(String actuald5) {
		this.actuald5 = actuald5;
	}

	public String getRanged5() {
		return ranged5;
	}

	public void setRanged5(String ranged5) {
		this.ranged5 = ranged5;
	}

	public String getActuald6() {
		return actuald6;
	}

	public void setActuald6(String actuald6) {
		this.actuald6 = actuald6;
	}

	public String getRanged6() {
		return ranged6;
	}

	public void setRanged6(String ranged6) {
		this.ranged6 = ranged6;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}
	

}
