package com.github.mrpowers.munit.example

import scala.util.Properties
import munit._

object Windows213 extends Tag("Windows213")

class MySuite extends FunSuite {

  override def munitNewTest(test: Test): Test = {
    println("test.tags(Windows213): " + test.tags(Windows213))
    val isIgnored =
      test.tags(Windows213) && !(
        Properties.isWin &&
          Properties.versionNumberString.startsWith("2.13")
        )
    if (isIgnored) test.tag(Ignore)
    else test
  }

  test("windows-213".tag(Windows213)) {
    println("isWin: " + Properties.isWin)
    println("""Properties.versionNumberString.startsWith("2.13"): """ + Properties.versionNumberString.startsWith("2.13"))
    println("Only runs when operating system is Windows and Scala version is 2.13")
    assertEquals(2, 3)
  }

  // true && !(false && false)
  // true && !(false)
  // true && true
  // true

  test("normal test") {
    assertEquals(2, 2)
  }

}
