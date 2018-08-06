object exercise{
  def product(f:Int => Int)(a:Int, b:Int): Int=
    if(a > b) 1
    else f(a) * product(f)(a+1,b)

  def multiply(f:Int => Int)(a:Int, b:Int, c:Int): Int = a*b*c

  def iterate(f:Int => Int)(x:Int)(n:Int): Unit = {
    val sum = 0
    for (i <- Range(1, n)) {
      println(sum + x + i)

    }
  }
  product(x=>x*x)(3,4)
  multiply(x=>x*x*x)(3,4,5)
  iterate(x=>x)(5)(4)
}
