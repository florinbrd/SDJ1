
public class NoteBookTest {
	
	public static void main(String[] args) {
		
		Note note1 = new Note("Hello");
		Note note2 = new Note("yoyoyo");
		Note note3 = new Note("yolo");
		Note note4 = new Note("Folo");
		
		note1.setToHighPriority();
		note3.setToHighPriority();
		
		Notebook test = new Notebook(4);
		
		test.addNote(note1);
		test.addNote(note2);
		test.addNote(note3);
		test.addNote(note4);
		
		test.getAllHighPriorityNotes();
		test.removeNote(2);
		test.addNote("yolo");
		
		System.out.println(test.toString());
		
	}

}
