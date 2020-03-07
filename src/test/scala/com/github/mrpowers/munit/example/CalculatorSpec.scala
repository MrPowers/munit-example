package com.github.mrpowers.munit.example

class CalculatorSpec extends munit.FunSuite {

  test("adds two numbers") {
    assertEquals(Calculator.addNumbers(3, 4), 7)
  }

  test("considers collections with the same elements equal") {
    assertEquals(Seq(1, 2), Seq(1, 2))
  }

  test("can intercept exceptions") {
    intercept[java.lang.IllegalArgumentException]{
      Calculator.crankyMethod()
    }
  }

  test("can intercept exceptions with messages") {
    interceptMessage[java.lang.Exception]("DK is my grandchild"){
      Calculator.crankyKong()
    }
  }

  test("checks the error message of code that doesn't compile") {
    assertNoDiff(
      compileErrors("""Calculator.addNumbers("hi", "there")"""),
      """|error:
         |type mismatch;
         | found   : String("hi")
         | required: Int
         |Calculator.addNumbers("hi", "there")
         |                      ^
         |""".stripMargin
    )
  }

}