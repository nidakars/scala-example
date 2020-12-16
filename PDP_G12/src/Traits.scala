//trait mantığı =interface + abstract class
trait Ogrenci {
  val isim: String
}
trait Bilgi extends Ogrenci {
  val sehir: String
  val ilce: String

  def cal(): Unit = {
    println(s"Merhaba, ben $isim.")
    println(s"$sehir şehrinin $ilce ilçesinde yaşıyorum.")
  }
}
trait Yalova extends Bilgi {
  override val sehir: String = "Yalova"
}
trait Kocaeli extends Bilgi {
  override val sehir: String = "Kocaeli"
  override val ilce: String = "Körfez"
}
trait Pendik extends Bilgi {
  override val ilce: String = "Pendik"
}


