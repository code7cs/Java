package hw01;

// A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
// We have to print the money deposited by him in a particular bank.
//Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses named 'BankA',
// 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that
// particular bank. Call the method 'getBalance' by the object of each of the three banks.
public class Bank {

    public double getBalance() {
        return 0;
    }

    public static void main(String[] args) {
        Bank a = new BankA();
        System.out.println(a.getBalance());
        Bank b = new BankB();
        System.out.println(b.getBalance());
        Bank c = new BankC();
        System.out.println(c.getBalance());
    }
}

class BankA extends Bank {
    public double getBalance() {
        return 1000;
    }
}

class BankB extends Bank {
    public double getBalance() {
        return 1500;
    }
}

class BankC extends Bank {
    public double getBalance() {
        return 2000;
    }
}
