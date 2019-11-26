
public class Brain {
	
	private String activeMemoryItem;
	private String passiveMemoryItemOne;
	private String passiveMemoryItemTwo; 
	
	public Brain() {
		activeMemoryItem = " ";
		passiveMemoryItemOne = " ";
		passiveMemoryItemTwo = " ";
	}
	
	public int getIQ() {
		int iq = 0; 
		if (activeMemoryItem.length() > 20 && ((passiveMemoryItemOne.length() + passiveMemoryItemTwo.length())>10)) {
			iq = 130; 
		}
		else if ((activeMemoryItem.length() + passiveMemoryItemOne.length() + passiveMemoryItemTwo.length()) == 10) {
			iq = 100; 
		} else if (activeMemoryItem == null || passiveMemoryItemOne == null || activeMemoryItem == null) {
			if ((activeMemoryItem.length() + passiveMemoryItemOne.length() + passiveMemoryItemTwo.length()) < 10) {
				return 70;
			}
		} else {
			System.out.println(" ");
		}
		return iq; 
	}
	
	public boolean isBrainDamage() {
		if (activeMemoryItem == null || passiveMemoryItemOne == null || activeMemoryItem == null) {
			return true; 
		} else {
			return false; 
		}
	}
	
	public void remeber(String info) {
		passiveMemoryItemTwo = passiveMemoryItemOne;
		passiveMemoryItemOne = activeMemoryItem; 
		activeMemoryItem = info; 
	}
	
	public void refreshMemory(String info) {
		if (info == passiveMemoryItemOne || info == passiveMemoryItemTwo) {
			passiveMemoryItemOne = activeMemoryItem; 
			activeMemoryItem = info; 
		}
	}
	
	public boolean recall(String info) {
		if(passiveMemoryItemOne == info || passiveMemoryItemTwo == info || activeMemoryItem == info) {
			return true; 
		} else {
			return false; 
		}
	}
	
	public String recall() {
		return activeMemoryItem; 
	}
	
	public String toString() {
		return activeMemoryItem + " " + passiveMemoryItemOne + " " + passiveMemoryItemTwo + getIQ();
	}
	
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Brain)) {
			return false; 
		}
		
		Brain other = (Brain) obj; 
		
		return activeMemoryItem == other.activeMemoryItem && passiveMemoryItemOne == other.passiveMemoryItemOne && passiveMemoryItemTwo == other.passiveMemoryItemTwo; 
		
	}

}
