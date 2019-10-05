package Tests
import org.scalatest._
import Character.{Healer, Ninja, Status}
class CharacterTest extends FunSuite {
  test("Tests atk damage")
  {

    val obj2: Healer = new Healer
    val obj1: Ninja = new Ninja

   assert(obj1.battleOptions() == List("battle","Potion"))
    assert(obj2.battleOptions() == List("Attack","Potion"))






  }
}
