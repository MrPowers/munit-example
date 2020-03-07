package com.github.mrpowers.munit.example

class FailingSpec extends munit.FunSuite {

  test("equality error message") {
    val obtained = 42
    val expected = 43
    assertEquals(obtained, expected)
  }

  test("gives good error messages for different collections") {
    assertEquals(Seq(1, 2), Seq(1, 8))
  }

}
