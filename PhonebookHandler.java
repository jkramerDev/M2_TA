package template;

import java.util.*;

/**
 * PhonebookHandler - supports 
 * Phonebook operations
 * 
 * Use a map to build the Phonebook
 * key: Contact
 * value: List<phonebookEntries>
 */

public class PhonebookHandler implements iPhonebookHander{
	private Map<Contact, List<PhonebookEntry>> phonebook;
	
	public PhonebookHandler(Map<Contact, List<PhonebookEntry>> phonebook)
	{
		this.phonebook = phonebook;
	}
	//bubble sort / merge sort would do it
		public List<Contact> sortByName()
		{
			List<Contact> contact = null;
			return contact;
		}
		
		/*
		 * To implement searchByName using binary search, we need to make sure that the
		 * phonebook is sorted by names. Here's the modified sortByKeys method using
		 * Merge Sort, followed by the implementation of searchByName using binary
		 * search:
		 */
		public List<PhonebookEntry> binarySearch(List<Contact> sortedContacts, String name)
		{
			List<PhonebookEntry> entry = null;
			return entry;
		}

		//iterate over the contacts.  
		//no sorting here, just display
		public void display(List<Contact> sortedContacts)
		{
			
		}
}
