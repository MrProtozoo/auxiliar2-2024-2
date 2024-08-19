import bank.Bank
import person.Person

object Main {
  def main(args: Array[String]): Unit = {

    val bank: Bank = new Bank("Banco de Chile")

    val person1: Person = new Person("Juan", 20)
    val person2: Person = new Person("Pedro", 30)

    // Podemos acceder a los atributos de una instancia de una clase de esta manera:
    println(person1.name) // Juan
    println(person2.age) // 20

    println(person2.name) // Pedro
    println(person2.age) // 30

    person1.birthday() // Juan cumple años!

    println(person1.age) // 21

    person1.bankSubscribe(bank) // Juan se suscribe al banco Banco de Chile, y banco Banco de Chile agrega a Juan como suscriptor

    person2.bankSubscribe(bank) // Pedro se suscribe al banco de Chile, y el Banco de Chile agrega a Pedro como suscriptor

    person1.bankUnsubscribe()
  }
}