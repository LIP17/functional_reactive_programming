trait Map[Key,Value] extends (Key => Value)
trait Seq[Elem] extends Int => Elem


// partial function
val f: PartialFunction[String, String] = { case "ping" => "pong"}

f.isDefinedAt("ping") // "true"
f.isDefinedAt("pong") // "false"

trait PartialFunction[-A, +R] extends Function1[-A, +R] {
	def apply(x: A): R
	def isDefinedAt(x: A): Boolean
}

/*
  Iterable : {
	Seq : {
	  IndexedSeq : { Array, String, Vector }
	  LinearSeq : {List}
	}
	Set : {
	  
	}
	Map : {
	
	}
  }
*/

// Monads
trait M[T] {
  def flatMap[U](f: T => M[U]): M[U]
}

def unit[T](x: T): M[T]
// associativity
(m flatMap f) flatMap g == m flatMap (x => f(x) flatMap g)

// left unit
unit(x) flatMap f == f(X)

// right unit

m flatMap unit == m


















 

