package Character


class Ninja () extends Character(){
  val Atk = 30
  val Def = 21
  val MgAtk = 31
  val MgDef = 30
  val MaxHp = 100
  val Hp = MaxHp
  val MaxMp = 150
  val Mp = MaxMp
  val lv = 1
  var choice:List[String] = List("battle","Potion")
  override def battleOptions(): List[String] = {
    choice
  }

  override def takeAction(string: String,x:Status): Unit = {
    if (string == choice.head){
      x.Battle(x)
      x.LvUp()
    }
    if (lv >= 15){
      choice = List("battle","Potion")
    }
    if (x.lv >= 15 && string == choice(1)){
      x.Hp += 10
    }
  }
}
