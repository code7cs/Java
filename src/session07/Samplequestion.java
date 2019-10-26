//package session07;
//
//public __________ A { // interface，为什么不是抽象类呢？因为如果是抽象类，则非抽象方法必须给出实现，即{}
//	public void f();
//}
//
//public ____________ B ____________ A { // abstract class, implements。这里使用abstract的原因，同 E
//	private int x;
//	public B() {x = 0; }
//}
//
//public ___________ C ___________ B { // abstract class, extends
//	public abstract void g();
//	public void f() {}
//}
//
//public _________ D {              // 如果是抽象类，则非抽象方法必须给出实现，{}， 而这里没有，所以排除抽象类
//	public void f();                // 所以为接口，interface
//	public void g();
//}
//public _______ E __________ D {   // 一个类实现了一个接口的话，必须完全实现这个接口里所定义的全部抽象方法（也就是重写这些抽象方法），
//	public void f() {}              // 否则，该类将保存从父类那里继承的抽象方法，该类也必须定义为抽象类，abstract class, implements
//}
//
//public _______ F __________ D {   // abstract class    ,   implements
//	public void g() {}
//}
//
//public class G __________ E {     // extends
//	public void g() {}
//}
