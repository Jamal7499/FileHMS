package model.bean;

public class DrInsertionEntity {

     private String physicianid;
	 private String fname;
	 private String lname;
	 private String age;
	 private String gender;
	 private String dob;
	 private String contact;
	 private String altcontact;
	 private String email;
	 private String pswd;
	 private String address1;
	 private String address2;
	 private String city;
	 private String state;
	 private String zipcode;
	 private String degree;
	 private String speciality;
	 private String WorkingHours;
	 private String hospitality;
	 
	 public DrInsertionEntity(String physicianid,String fname,String lname,String age,String gender,String dob,String contact,String altcontact,  String email,   String pswd,  String address1, String address2, String city, String state,String zipcode,String hospitality,String speciality,String degree,String WorkingHours) {
			super();
			 
			this.physicianid=physicianid; 
			this.fname=fname;
			 this.lname=lname;
			 this.age=age;
			 this.gender=gender;
			 this.dob=dob;
			 this.contact=contact;
			 this.altcontact=altcontact;
			 this.email=email;
			 this.pswd=pswd;
			 this.address1=address1;
			 this.address2=address2;
			 this.city=city;
			 this.state=state;
			 this.zipcode=zipcode;
			 this.degree=degree;
			 this.speciality=speciality;
			 this.WorkingHours=WorkingHours;
			 this.hospitality=hospitality;
			 
		}

	public String getPhysicianid() {
		return physicianid;
	}

	public void setPhysicianid(String physicianid) {
		this.physicianid = physicianid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAltcontact() {
		return altcontact;
	}

	public void setAltcontact(String altcontact) {
		this.altcontact = altcontact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public String getWorkingHours() {
		return WorkingHours;
	}

	public void setWorkingHours(String workingHours) {
		WorkingHours = workingHours;
	}

	public String getHospitality() {
		return hospitality;
	}

	public void setHospitality(String hospitality) {
		this.hospitality = hospitality;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	
	 
		
}
