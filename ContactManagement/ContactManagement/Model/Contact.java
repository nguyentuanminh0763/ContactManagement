package ContactManagement.Model;

public class Contact {
    private int idContact;
    private String nameContact ;
    private String lastNameContact;
    private String firstNameContact;
    private String groupContact;
    private String addressContact;
    private String phoneNumberContact;

    public Contact(int idContact, String lastNameContact, String firstNameContact,
            String groupContact, String addressContact, String phoneNumberContact) {
        this.idContact = idContact;
        this.nameContact = firstNameContact + " " + lastNameContact;
        this.lastNameContact = lastNameContact;
        this.firstNameContact = firstNameContact;
        this.groupContact = groupContact;
        this.addressContact = addressContact;
        this.phoneNumberContact = phoneNumberContact;
    }
    public int getIdContact() {
        return idContact;
    }
    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }
    public String getNameContact() {
        return nameContact;
    }
    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }
    public String getLastNameContact() {
        return lastNameContact;
    }
    public void setLastNameContact(String lastNameContact) {
        this.lastNameContact = lastNameContact;
    }
    public String getFirstNameContact() {
        return firstNameContact;
    }
    public void setFirstNameContact(String firstNameContact) {
        this.firstNameContact = firstNameContact;
    }
    public String getGroupContact() {
        return groupContact;
    }
    public void setGroupContact(String groupContact) {
        this.groupContact = groupContact;
    }
    public String getAddressContact() {
        return addressContact;
    }
    public void setAddressContact(String addressContact) {
        this.addressContact = addressContact;
    }
    public String getPhoneNumberContact() {
        return phoneNumberContact;
    }
    public void setPhoneNumberContact(String phoneNumberContact) {
        this.phoneNumberContact = phoneNumberContact;
    }
    @Override
    public String toString() {
        return "Contact [idContact=" + idContact + ", nameContact=" + nameContact + ", lastNameContact="
                + lastNameContact + ", firstNameContact=" + firstNameContact + ", groupContact=" + groupContact
                + ", addressContact=" + addressContact + ", phoneNumberContact=" + phoneNumberContact + "]";
    }

    
}
