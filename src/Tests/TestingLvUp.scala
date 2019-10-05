package Tests
import org.scalatest._
import Character.{Status, party}

class TestingLvUp extends FunSuite {
  test("Tests lv up") {
    val obj1: Status = new Status
    val obj2: Status = new Status
    //test for leveling up multiple lv
    obj1.cheat()
    obj1.cheat()
    obj1.cheat()
    obj1.LvUp()
    assert(obj1.lv == 4)
    // Status update
    assert(obj1.Atk == 6)
    // different exp setup
    obj1.Battle(obj2)
    assert(obj1.exp == 50)
    val obj3: Status = new Status
    val obj4: Status = new Status
    val obj5: Status = new Status
    val obj6: Status = new Status
    val obj7: Status = new Status
    val obj8: Status = new Status
    val obj9: Status = new Status
    val obj10: Status = new Status
    obj3.cheat()
    obj3.cheat()
    obj3.LvUp()
    obj4.cheat()
    obj4.cheat()
    obj4.LvUp()
    obj5.cheat()
    obj5.cheat()
    obj5.LvUp()
    obj6.cheat()
    obj6.cheat()
    obj6.LvUp()
    obj4.Dead = true
    val party1:party = new party(obj3,obj4,obj5,obj6)
    val party2:party = new party(obj7,obj8,obj9,obj10)
    party1.PBattle(party2)
    assert(obj3.exp == 50)
    assert(obj4.exp == 0)

  }
}

