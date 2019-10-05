package Character

abstract class Character(){
  def battleOptions():List[String]
  def takeAction(string: String,x:Status):Unit
}

/*class Ninja (x:Status) extends Character(x){
  var choice:List[String] = List("battle","Potion")
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
    if (x.lv >= 15 && string == choice(1)){
      x.Hp += 10
    }
  }
}*/
/*
class Healer(x:Status) extends Character(x) {
  x.Atk = 20
  x.Def = 21
  x.MgAtk = 20
  x.MgDef = 30
  x.MaxHp = 100
  x.Hp = x.MaxHp
  x.MaxMp = 150
  x.Mp = x.MaxMp
  var choice: List[String] = List("Attack")

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
    if (x.lv >= 15 && string == choice(1)){
      x.Hp += 10
    }
}}*/