package domain;

import java.util.List;

public class ContactService {

	private static Long count = 0L;

	static public Long getCount() {
		return count++;
	}

	public boolean addContact(Long idContact, String firstname,
			String lastname, String email) {
		DAOContact daoc = new DAOContact();
		Contact res = daoc.addContact(idContact, firstname, lastname, email);
		return res != null;
	}

	public List<Contact> listContact() {
		DAOContact daoc = new DAOContact();
		return daoc.listContact();
	}

	public boolean removeContact(Long id) {
		DAOContact daoc = new DAOContact();
		int res = daoc.deleteContact(id);
		return res != 0;
	}

}
