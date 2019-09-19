package Tests
import org.scalatest._
import Character.Status

class TestingDamage extends FunSuite {
  test("Tests damage") {
  val obj1: Status = new Status
  val obj2: Status = new Status
    val obj3: Status = new Status
    obj1.takeDamage(1)
  assert(obj1.Hp == 9)
    obj2.takeDamage(10)
  assert(obj2.Dead == true)
    obj3.takeDamage(11)
    assert(obj2.Dead == true)
}}
