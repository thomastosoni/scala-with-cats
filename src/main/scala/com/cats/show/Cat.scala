package com.cats.show

import cats.Show
import cats.instances.int._
import cats.instances.string._
import cats.syntax.show._

object Cat {
  implicit val catShow: Show[Cat] = {
    Show.show(cat => s"${cat.name.show} is a ${cat.age.show} year-old ${cat.color.show} cat")
  }
}

final case class Cat(name: String, age: Int, color: String)