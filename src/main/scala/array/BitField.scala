package unicorn
package array

sealed trait BitField:
  def apply(n: Int): Boolean

final class ArrayBitField(n: Int) extends BitField:
  val bits: Array[Boolean] = Array.fill(n)(false)

  def apply(n: Int): Boolean = bits(n)

object BitField:
  def apply(n: Int): BitField = new ArrayBitField(n)
