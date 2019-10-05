package Character


class Healer() extends Character() {
   val Atk = 20
   val Def = 21
   val MgAtk = 20
  val MgDef = 30
   val MaxHp = 100
   val Hp = MaxHp
  val MaxMp = 150
  val Mp = MaxMp
  val lv = 1
  var choice: List[String] = List("Attack","Potion")

  override def battleOptions(): List[String] = {
    choice
  }

  override def takeAction(string: String,x:Status): Unit = {
    if (string == choice.head){
      x.Battle(x)
      x.LvUp()
    }
    if (x.lv >= 15){
      choice = List("battle","Potion")
    }
    if (lv >= 15 && string == choice(1)){
      x.Hp += 10
    }
  }}
