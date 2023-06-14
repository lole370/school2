package assoziation;

import java.util.ArrayList;

public class Addressbook {

    private String name;

    private ArrayList<Contact> contacts = new ArrayList<>();

    public Addressbook() {
        this.name = "business";
    }

    public Addressbook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        String contactsString = "";
        for(Contact c : this.contacts) {
            contactsString += c.toString();
            contactsString += "\n";
        }

        return "Addressbook{" +
                "name='" + name + '\'' +
                '}' + '\n' + contactsString;
    }

    public void showByName(String name) {

    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public Contact getContact(int id) {
        return this.contacts.get(id);
    }

    public void removeContact(int id) {
        for(int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getId() == id) {
                this.contacts.remove(i);
                break;
            }
        }
    }


}
