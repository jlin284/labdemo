package Character

//import java.io.ObjectInputFilter.Status

class Status {
  var Atk = 31
  var Def = 21
  var MgAtk = 10
  var MgDef = 25
  var MaxHp = 100
  var Hp = MaxHp
  var MaxMp= 100
  var Mp = MaxMp
  var Dead: Boolean = false
  var exp: Int = 0
  var lv: Int = 1
  def takeDamage(dmg:Int): Unit = {
    this.Hp = this.Hp - dmg
    if(this.Hp <= 0){
      this.Dead = true
    }
  }
  def PhyAtk(y:Status,z:Status): Unit ={
    if(y.Atk > z.Def){
      z.takeDamage(y.Atk - z.Def)
    }
  }
  def MgAtk(y:Status): Unit={
    Mp = Mp - 6
    if (Mp < 6 ){
      y.takeDamage( 0)
    }
    else if(this.MgAtk > y.MgDef){
      y.takeDamage(this.MgAtk - y.MgDef)
    }
  }
  def Battle(z:Status): Unit ={
    while(this.Dead == false && z.Dead == false) {
      PhyAtk(this, z)
      PhyAtk(z,this)
    }
    if(z.Dead == true) {
      if (z.lv > this.lv) {
        this.exp += 200
      }
      else if (z.lv == this.lv) {
        this.exp += 100
      }
      else if (z.lv < this.lv) {
        this.exp += 50
      }
    }
    else if (this.Dead == true){
      if (z.lv < this.lv) {
        z.exp += 200
      }
      else if (z.lv == this.lv) {
        z.exp += 100
      }
      else if (z.lv > this.lv) {
        z.exp += 50
      }
    }
  }
  def StatusUp(z:Status): Unit ={
    z.Atk += 1
    z.Def += 1
    z.MgAtk +=1
    z.MgDef +=1
    z.MaxHp += 5
    z.MaxMp += 5
    z.Hp = MaxHp
    z.Mp = MaxMp
  }
  def LvUp(): Unit ={
    while((this.exp /300 )>=1 ){
      this.exp = this.exp - 300
      this.lv += 1
      StatusUp(this:Status)
    }
  }
  def cheat(): Unit ={
    this.exp += 300
  }
  def GM(): Unit = {
    this.lv -=1
  }
}

class party(I:Status,j:Status,K:Status,L:Status)
{
  val A:Status = I
  val B:Status = j
  val C:Status = K
  val D:Status = L


  var Equal = 0
  def PBattle(x:party): Unit ={
      this.A.Battle(x.A)
      this.B.Battle(x.B)
      this.C.Battle(x.C)
      this.D.Battle(x.D)
      Equal =(this.A.exp + this.B.exp +this.C.exp + this.D.exp)/4
      this.A.exp -= 50
      this.B.exp -= 50
      this.C.exp -= 50
      this.D.exp -= 50
      this.A.exp += Equal
      this.B.exp += Equal
      this.C.exp += Equal
      this.D.exp += Equal
  }
}
