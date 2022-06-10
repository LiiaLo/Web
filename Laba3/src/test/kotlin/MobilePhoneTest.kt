import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MobilePhoneTest {

    @Test
    fun addNewContact() {
        var phone = MobilePhone("89568122828")
        phone.addNewContact(Contact("", ""))
        assertTrue(phone.contacts.size == 1)
    }

    @Test
    fun removeContact() {
        var phone = MobilePhone("89568122828")
        phone.addNewContact(Contact("", ""))
        phone.removeContact(Contact("", ""))
        assertTrue(phone.contacts.size == 0)
    }

    @Test
    fun findContact() {
        var phone = MobilePhone("89568122828")
        phone.addNewContact(Contact("", ""))
        assertTrue(0 == phone.findContact(Contact("", "")))
    }
}