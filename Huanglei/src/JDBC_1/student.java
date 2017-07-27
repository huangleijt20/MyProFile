package JDBC_1;

import java.io.Serializable;
import java.sql.Date;

public class student implements Serializable {
	private static final long serialVersionUID = 5212469995130398264L;
	private int studentNo;
	private String loginPwd;
	private String studentName;
	private String sex;
	private int gradeId;
	private String phone;
	private String address;
	private Date bornDate;
	private String email;
	private String identityCard;
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getGradeId() {
		return gradeId;
	}
	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBornDate() {
		return bornDate;
	}
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	@Override
	public String toString() {
		return "student [studentNo=" + studentNo + ", loginPwd=" + loginPwd
				+ ", studentName=" + studentName + ", sex=" + sex
				+ ", gradeId=" + gradeId + ", phone=" + phone + ", address="
				+ address + ", bornDate=" + bornDate + ", email=" + email
				+ ", identityCard=" + identityCard + "]";
	}
	
}
