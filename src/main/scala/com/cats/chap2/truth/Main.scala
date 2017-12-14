package com.cats.chap2.truth

object Main {
  def main(args: Array[String]): Unit = {
    implicit val booleanAndMonoid: Monoid[Boolean] = new Monoid[Boolean] {
      def empty = true
      def combine(a: Boolean, b: Boolean) = a && b
    }

    implicit val booleanOrMonoid: Monoid[Boolean] = new Monoid[Boolean] {
      def empty = false
      def combine(a: Boolean, b: Boolean) = a || b
    }

    implicit val booleanEitherMonoid: Monoid[Boolean] = new Monoid[Boolean] {
      def empty = false
      def combine(a: Boolean, b: Boolean) = (a && !b) || (!a && b)
    }

    implicit val booleanXnorMonoid: Monoid[Boolean] = new Monoid[Boolean] {
      def empty = false
      def combine(a: Boolean, b: Boolean) = (!a || b) && (a || !b)
    }
  }
}
