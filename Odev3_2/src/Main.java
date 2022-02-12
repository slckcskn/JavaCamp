
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"Selçuk","Coşkun","asdfghj123@gmail.com","123456",
				"java","05551234567");
		Student student1 = new Student(2,"Coşkun","Selçuk","qwertyu6546@gmail.com","789123",
				"java","05557891234");
		Instructor instructor= new Instructor(3,"Engin","Demiroğ","engindemirog@gmail.com","123456","Odtü",
				"java,javascript ");
		
		
		UserManager userManager = new UserManager();
		User [] users= {student,student1,instructor};
		
		for(User user:users) {
			System.out.println(user.getUserName());
			
		}
		
		StudentManager studentManager = new StudentManager();
		studentManager.update(student);

	}

}
