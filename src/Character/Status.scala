package Character

class Status {
  var Atk = 3
  var Def = 2
  var MgAtk = 3
  var MgDef = 2
  var MaxHp = 10
  var Hp = MaxHp
  var MaxMp= 10
  var Mp = MaxMp
  var Dead: Boolean = false
  def takeDamage(dmg:Int): Unit ={
    Hp = Hp - dmg
    if(Hp <= 0){
      this.Dead == true
    }
  }
  def PhyAtk(y:Status): Unit ={
    if(this.Atk > y.Def){
      y.takeDamage(this.Atk - y.Def)
    }
  }
  def MgAtk(z:Status): Unit={
    Mp = Mp - 6
    if (Mp < 6 ){
      z.takeDamage( 0)
    }
    else if(this.MgAtk > z.MgDef){
      z.takeDamage(this.MgAtk - z.MgDef)
    }
  }
}
