package solver

import org.scalatest.{FunSpec, MustMatchers}

class SolverSpec extends FunSpec with MustMatchers {

  it("solve") {
    val inputStream = getClass.getResourceAsStream("/input.txt")
    val input = scala.io.Source.fromInputStream(inputStream)
    val outputStream = getClass.getResourceAsStream("/output.txt")
    val output = scala.io.Source.fromInputStream(outputStream)

    val iline = input.getLines().toList
    val oline = output.getLines().toList
    (0 until iline.length) foreach { i =>
      Solver.solve(iline(i)) mustBe oline(i).toInt
    }
  }

}