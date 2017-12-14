package com.cats.chap1.eq

import cats.Eq
import cats.syntax.eq._
import cats.instances.int._
import cats.instances.string._

object Cat {

  implicit val catEq: Eq[Cat] = {
    Eq.instance[Cat] { (cat1, cat2) =>
      cat1.age === cat2.age && cat1.color === cat2.color && cat1.name === cat2.name
    }
  }
}

final case class Cat(name: String, age: Int, color: String)
