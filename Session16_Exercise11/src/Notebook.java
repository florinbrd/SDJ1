
public class Notebook {
	
	private int numberOfNotes;
	private Note[] notes; 
	
	public Notebook(int maxNumberOfNotes) {
		this.numberOfNotes = numberOfNotes; 
		notes = new Note[maxNumberOfNotes];
	}
	
	public int getNumberOfNotes() {
		return notes.length; 
	}
	
	public Note getNote(int index) {
		return notes[index];
	}
	
	public String getMessage(int index) {
		
		return notes[index].getMessage();
	}
	
	public void addNote(Note note) {
		notes[numberOfNotes] = note.copy(); 
		numberOfNotes++; 
	}
	
	public void addNote(String message) {
		notes[numberOfNotes] = new Note(message);
		numberOfNotes++; 
	}
	
	public void addHighPriorityNote(String message) {
		notes[numberOfNotes] = new Note(message);
		notes[numberOfNotes].setToHighPriority();
		numberOfNotes++; 
	}
	
	public void removeNote(int index) {
		for (int i = index; i<numberOfNotes -1; i++) {
			notes[i] = notes[i+1];
		}
		notes[numberOfNotes -1] = null;
		numberOfNotes --; 
	}
	
	public Note[] getAllNotes() {
		Note[] temp = new Note[numberOfNotes];
		for(int i=0; i<numberOfNotes; i++) {
			temp[i] = notes[i].copy();
			}
		return temp; 
 	}
	
	public int getNumberOfHighPriority() {
		int x = 0; 
		for(int i=0; i< numberOfNotes; i++) {
			if(notes[i].isHighPriority()) {
				x++;
			}
		}
		return x; 
	}
	
	public Note[] getAllHighPriorityNotes() {
		Note[] hPNotes = new Note[getNumberOfHighPriority()];
		int n=0; 
		for(int i = 0; i< numberOfNotes; i++) {
			if(notes[i].isHighPriority()) {
				hPNotes[n] = notes[i];
				n++; 
			}
		} return hPNotes; 
	}
	
	public String toString() {
		return getNumberOfNotes() + " " + getNumberOfHighPriority();
	}
	
	
	

}
