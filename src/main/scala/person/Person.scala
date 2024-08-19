package person

import bank.Bank

/** Represents a person.
 * @param name Name of the person
 * @param age Age of the person
 */
class Person(val name: String, var age: Int) {

    /** Bank the person is subscribed to. */
    var bank: Bank = null

    /** Makes the person have a birthday. */
    def birthday(): Unit = {
        age += 1
    }

    /** Subscribes the person to a bank.
      * @param newBank Bank to subscribe to.
      */
    def bankSubscribe(newBank: Bank): Unit = {
        bank = newBank
        bank.addNewSubscriber(this)
    }

    /** Unsubscribes the person from a bank */
    def bankUnsubscribe(): Unit = {
        bank.removeSubscriber(this)
        bank = null
    }
}