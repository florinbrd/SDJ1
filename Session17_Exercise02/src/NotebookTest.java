
public class NotebookTest {
	
	public static void main(String[] args) {
		
		Note note1 = new Note("helloxxx");
		Note note2 = new Note("hello");
		Note note3 = new Note("hello");
		Note note4 = new Note("hello");
		
		note1.setToHighPriority();
		note2.setToHighPriority();
		
		System.out.println(note1.isHighPriority());
		
		Notebook test = new Notebook(5);
		
		test.addNote(note1);
		test.addNote(note2);
		test.addNote(note3);
		test.addNote(note4);
		
		System.out.println(test.getNumberOfNotes());
		
		System.out.println(test.getNote(0));
		
		System.out.println(test.getNumberOfHighPriorityNotes());
	
		System.out.println(test.getAllHighPriorityNotes());
	
	}

}
