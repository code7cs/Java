package session05;

/**
 * 引用构造函数
 * super（参数）：调用父类中的某一个构造函数（应该为构造函数中的第一条语句）
 * this（参数）：调用本类中另一种形式的构造函数（应该为构造函数中的第一条语句）
 */
class Person {
    public static void prt(String s) {
        System.out.println(s);
    }

    Person() {
        prt("父类·无参数构造方法： " + "session05.A session05.Person.");
    }   //构造方法(1)

    Person(String name) {
        prt("父类·含一个参数的构造方法： " + "session05.A person's name is " + name);
    }   //构造方法(2)
}

class Chinese extends Person {
    Chinese() {
        super();    // 调用父类构造方法（1）
        prt("子类·调用父类”无参数构造方法“： " + "session05.A chinese coder.");
    }

    Chinese(String name) {
        super(name);    // 调用父类具有相同形参的构造方法（2）
        prt("子类·调用父类”含一个参数的构造方法“： " + "his name is " + name);
    }

    Chinese(String name, int age) {
        this(name); // 调用具有相同形参的构造方法（3）
        prt("子类：调用子类具有相同形参的构造方法：his age is " + age);
    }

    public static void main(String[] args) {
        Chinese cn = new Chinese();
        cn = new Chinese("Hanfan");
        cn = new Chinese("Hanfan", 23);
    }
}