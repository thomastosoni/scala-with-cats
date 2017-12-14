package com.cats.chap1.show

import Cat.catShow
import cats.syntax.show._

object Main extends App {
  val cat = Cat("Mouse", 2, "#FFFFFF")
  println(cat.show)
}