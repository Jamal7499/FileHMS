package model.bean;

public class PatientSearchEntity {

		private String patientid;
		private String firstname;
		private String lastname;
		private String age;
		private String gender;
		private String dob;
		private String contactnumber;
		private String altcontactnumber;
		private String emailid;
		private String pswd;
		private String address1;
		private String address2;
		private String city;
		private String state;
		private String zipcode;
	
		public PatientSearchEntity(String patientid, String firstname, String lastname, String age, String gender, String dob,
				String contactnumber, String altcontactnumber, String emailid, String pswd, String address1,
				String address2, String city, String state, String zipcode) {
		
			this.patientid = patientid;
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
			this.gender = gender;
			this.dob = dob;
			this.contactnumber = contactnumber;
			this.altcontactnumber = altcontactnumber;
			this.emailid = emailid;
			this.pswd = pswd;
			this.address1 = address1;
			this.address2 = address2;
			this.city = city;
			this.state = state;
			this.zipcode = zipcode;
		}

		public String getPatientid() {
			return patientid;
		}
		public void setPatientid(String patientid) {
			this.patientid = patientid;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
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
		public String getContactnumber() {
			return contactnumber;
		}
		public void setContactnumber(String contactnumber) {
			this.contactnumber = contactnumber;
		}
		public String getAltcontactnumber() {
			return altcontactnumber;
		}
		public void setAltcontactnumber(String altcontactnumber) {
			this.altcontactnumber = altcontactnumber;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
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
		public void setState(String state) {
			this.state = state;
		}
		public String getZipcode() {
			return zipcode;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}

}	

