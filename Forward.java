package model.bean;

public class Forward {
	private String admin_id;
	private String f_name;
	private String l_name;
	private String contact;
	private String image;
	private  String password;
	private  String dob;
	
	public Forward(){}
	public Forward(String admin_id, String f_name, String l_name,String dob,  String contact, String image, String password) {
		super();
		this.admin_id = admin_id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.contact = contact;
		this.image = image;
		this.password = password;
		this.dob = dob;
	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	
	
	
	
	

}
