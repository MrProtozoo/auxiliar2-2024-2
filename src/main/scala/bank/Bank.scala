package bank // Indica el paquete en el que se encuentra este archivo

import person.Person // Permite utilizar la clase Person, que se ubica en el paquete person.

import scala.collection.mutable.ArrayBuffer // Cosas relacionadas a la librería estándar de Scala.

/** Represents a bank
* @param name // Name of the bank
*/
class Bank(val name: String) {

    /** Subscribers of the bank */
    val subscribers: ArrayBuffer[Person] =
        new ArrayBuffer[Person]()

    /** Adds a new subscriber to the bank.
     * @param person Person as a subscriber
     */
    def addNewSubscriber(person: Person): Unit = {
        subscribers.addOne(person)
    }

    /** Removes a subscriber from the bank.
     * @param person Person to remove as a subscriber
    */
    def removeSubscriber(person: Person): Unit = {
        val index: Int = subscribers.indexOf(person)
        subscribers.remove(index)
    }
}