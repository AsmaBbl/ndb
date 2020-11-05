object Assignment2 {
  def main(args: Array[String]): Unit = {

    val days = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    def task1(list: List[String]): Unit = {

      def checkDay(dayName: String): String = {
        dayName match {
          case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Work"
          case "Saturday" | "Sunday" => "weekend"
          case _ => "no such day"
        }
      }
      days.foreach(day => println(checkDay(day)))
    }

    def task2(): Unit = {
      class bankAccount(private var balance: Double) {
        def this() { this(0) }
        def deposits(amount: Double): Unit = {
          if (amount > 0) balance = balance + amount
          else throw new Exception("wrong amount input")
        }

        def withdraw(amount: Double): Unit = {
          if (0 < amount && amount <= balance) {
          balance = balance - amount
          else throw new Exception("wrong amount input")
          }
       def currentBalance: Unit = {println("Your current balance is: " + balance)}    

    def task3(): Unit = {
      class Person(val firstName: String, val lastName: String) {        
        }

      val Person1 = new Person("Andzej", "Duda")
      val Person2 = new Person("Beyoncé", "Knowles")
      val Person3 = new Person("Lara", "Croft")

      def greet(person: Person): String = {
        person.lastName match {
          case "Duda" => "Hello, Sir"
          case "Knowles" => "Hello, madame"
          case "Croft" => "Hello, Miss"
        }
      }
        
      println(greet(Person1))
      println(greet(Person2))
      println(greet(Person3))
    }
    

    def task4(): Unit = {
      def intHandler(item: Int, revoke: Int => Int): Int = {
        revoke(revoke(revoke(item)))
      }
      println(intHandler(10, (item: Int) => item * 10))
    }

    def task5(): Unit = {
      class PersonTask5 (val firstName: String, val lastName: String, private val _taxToPay: Double) {
       def taxToPay = _taxToPay;
      }
      trait Employee extends PersonTask5 {
        var _salary: Double;
        def salary = _salary 

        override def taxToPay(): Double = {
          return _salary * 0.2;
        }
      }
      trait Student extends PersonTask5 {
        override def taxToPay(): Double = {
          return 0.0;
        }
      }
      trait Teacher extends Employee {
        override def taxToPay(): Double = {
          return _salary * 0.1;
        }
      }
      object p1 extends PersonTask5("Sarah", "Parker") with Employee
      p1.salary(5000)
      p1.taxToPay
      object p2 extends PersonTask5("Sarah", "Parker") with Student
      p2.taxToPay
      object p3 extends PersonTask5("Sarah", "Parker") with Teacher
      p3.salary(5000)
      p3.taxToPay
      object p4 extends PersonTask5("Sarah", "Parker") with Employee with Student
      p4.salary(5000)
      p4.taxToPay
      object p5 extends PersonTask5("Sarah", "Parker") with Student with Employee
      p5.salary(5000)
      p5.taxToPay
    
    }
    task1(days)
    task2()
    task3()
    task4()
    task5()
    
  }
}
