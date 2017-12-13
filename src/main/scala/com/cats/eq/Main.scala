package com.cats.eq

import cats.syntax.eq._
import cats.instances.option._

object Main extends App {
  val cat1 = Cat("Garfield",   38, "orange and black")
  val cat2 = Cat("Heathcliff", 33, "orange and black")

  val optionCat1 = Option(cat1)
  val optionCat2 = Option.empty[Cat]

  println(cat1 === cat1)
  println(cat1 =!= cat2)
  println(optionCat1 === optionCat1)
  println(optionCat1 =!= optionCat2)
}