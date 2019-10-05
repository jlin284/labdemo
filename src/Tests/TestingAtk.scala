package Tests
import org.scalatest._
import Character.Status
class TestingAtk extends FunSuite {
  test("Tests atk damage")
    {//testx
      val obj1: Status = new Status
      val obj2: Status = new Status
      obj1.PhyAtk(obj1,obj2)
      assert(obj2.Hp == 90)
      obj1.MgAtk(obj2)
      assert(obj2.Hp == 90)
      assert(obj1.Mp == 94)



      val player: Status = new Status
      val npc: Status = new Status
      player.Mp = 4
      player.MgAtk(npc)
      assert(npc.Hp == 100)
    }
  }