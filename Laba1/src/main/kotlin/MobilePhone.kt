class MobilePhone(var number: String) {
    var contacts: ArrayList<Contact> = arrayListOf()

    fun addNewContact(newContact: Contact): Boolean {
        if (contacts.contains(newContact)) return false else contacts.add(newContact)
        return true
    }

    fun updateContact(oldContact: Contact, newContact: Contact): Boolean{
        if (contacts.contains(oldContact)){
            contacts[contacts.indexOf(oldContact)] = newContact
            return true
        }
        return false
    }

    fun removeContact(contact: Contact): Boolean{
        return contacts.remove(contact)

    }

    fun findContact(contact: Contact): Int{
        return contacts.indexOf(contact)
    }

    fun queryContact(contactName: String): Contact{
        for (contact in contacts){
            if (contact.name == contactName) return contact
        }
        return Contact("", "")
    }

    fun printContacts(){
        contacts.forEach{e -> println("Contact: ${e.name} - ${e.phone}")}
    }
}