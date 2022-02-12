
public class Student extends User{
	
	String studentContact;
	String studentCourse;
	
	public Student(int userId, String userName, String userLastname, String userMail, String userPassword,
			String studentContact, String studentCourse) {
		super(userId, userName, userLastname, userMail, userPassword);
		
		this.studentContact = studentContact;
		this.studentCourse = studentCourse;
		
	}

	public String getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
}
