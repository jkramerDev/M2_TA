package template;

import java.util.List;
import java.util.Map;

/**
 * model a Contact 
 * Contact has a name & list of phonebook entries
 * 
 * Support adding phonebookEntry to a contact
 * 
 * @Override hashCode and equals
 * 
 */

class Contact {
	private String name;
	private List<PhonebookEntry> entries;
	

	public Contact (String name)
	{
		this.name = name;
	}
	public void addPhonebookEntry(String string, String string2) {
		int newNum = Integer.parseInt(string2);
		PhonebookEntry entry = new PhonebookEntry(string, newNum);
		
	}
	public List<PhonebookEntry> getPhonebookEntries() {
		// TODO Auto-generated method stub
		return entries;
	}
	
	
	 

}
