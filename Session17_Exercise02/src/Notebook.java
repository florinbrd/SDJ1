import java.util.ArrayList;

public class Notebook {
	
	private int numberOfNotes;
	private ArrayList<Note> notes;
	
	public Notebook(int maxNumberOfNotes) {
		this.numberOfNotes = maxNumberOfNotes; 
		notes = new ArrayList<Note>(maxNumberOfNotes);
	}
	
	public int getNumberOfNotes() {
		return notes.size(); 
	}
	
	public Note getNote(int index) {
		return notes.get(index);
	}
	
	public String getMessage(int index) {
		return notes.get(index).getMessage();
	}
	
	public void addNote(Note note) {
		notes.add(note);
		numberOfNotes++;
	}
	
	public void addNote(String message) {
		notes.add(new Note(message));
		numberOfNotes++;
	}
	
	public void addHighPriorityNote(String message) {
		notes.add(numberOfNotes, new Note(message));
		notes.get(numberOfNotes).setToHighPriority();
		numberOfNotes++;
	}
	
	public void removeNote(int index) {
		notes.remove(index);
		numberOfNotes--;
	}
	
	public Note[] getAllNotes() {
		
		Note[] notesToReturn = new Note[notes.size()];
		
		for (int i = 0; i< notes.size(); i++) {
			notesToReturn[i] = notes.get(i);
		}
		
		return notesToReturn; 
	}
	
	
	public int getNumberOfHighPriorityNotes() {
		
		int n = 0; 
		
		for(int i =0; i< notes.size(); i++) {
			if(notes.get(i).isHighPriority()) {
				n++;
			}
		}
		return n;
	}
	
	public Note[] getAllHighPriorityNotes() {
		Note[] notesToReturn = new Note[notes.size()];
		
		for(int i = 0; i< notes.size(); i++) {
			if(notes.get(i).isHighPriority()) {
				
			notesToReturn[i] = notes.get(i);}
		}
		
		return notesToReturn; 
	}
	
	public String toString() {
		String stringReturn = " ";
		
		for (Note d: notes) {
			stringReturn += " " + d.toString(); 
		}
		
		return stringReturn; 
	}
	
	

}
