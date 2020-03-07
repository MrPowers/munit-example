//package com.github.mrpowers.munit.example
//
//import scala.util.Properties
//import munit._
//
//object Windows213 extends Tag("Windows213")
//
//class MySuite extends FunSuite {
//  // reminder: type Test = GenericTest[Any]
//  override def munitNewTest(test: Test): Test = {
//    val isIgnored =
//      test.tags(Windows213) && !(
//        Properties.isWin &&
//          Properties.versionNumberString.startsWith("2.13")
//        )
//    if (isIgnored) test.withBody(() => Ignore)
//    else test
//  }
//
//  test("windows-213".tag(Windows213)) {
//    // Only runs when operating system is Windows and Scala version is 2.13
//  }
//  test("normal test") {
//    // Always runs like a normal test.
//  }
//}
