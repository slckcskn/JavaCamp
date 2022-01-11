

public class Main {

	public static void main(String[] args) {
		
		Lesson lesson1 = new Lesson(1, "Programlamaya Giriþ Ýçin Temel Kurs", 100, "Engin Demirog");
		Lesson lesson2 = new Lesson(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(Javascript)", 20, "Engin Demirog");
		Lesson lesson3 = new Lesson(3, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# - Angular)", 40, "Engin Demirog");
		Lesson lesson4 = new Lesson(4, "Yazýlým Geliþtirici Yetiþtirme Kampý(Java - React)", 80, "Engin Demirog");
		
		Lesson[] lessons = {lesson1,lesson2,lesson3,lesson4};
		
		for(Lesson lesson:lessons) {
			System.out.println(lesson.name);
		}
		
		LessonManager lessonManager = new LessonManager();
		lessonManager.add(lesson4);
		lessonManager.delete(lesson1);
		
		
	}

		
}
