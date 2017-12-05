package com.cats.printable

object Cat {
  import PrintableInstances._

  implicit val catPrintable = new Printable[Cat] {
    override def format(value: Cat): String = {
      val name = Printable.format(value.name)
      val age = Printable.format(value.age)
      val color = Printable.format(value.color)
      s"$name is a $age year-old $color cat"
    }
  }
}

final case class Cat(name: String, age: Int, color: String)