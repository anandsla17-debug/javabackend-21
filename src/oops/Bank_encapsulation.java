package oops;

public class Bank_encapsulation {
private long accno;
private double balance; 
private int pin;

private int count[]= {89,78};


//=> set =>method =.particular, constructor => all give, get

// parameter constructor
public Bank_encapsulation(long accno,double balance,int pin) {
 this.accno=accno;
 this.balance=balance;
 this.pin=pin;
}

//defualt
public Bank_encapsulation() {
	
}
public void setAccno(long accno) {
	this.accno=accno;
}

public long getAccno() {
	return accno;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}

public int[] getCount() {
	return count;
}
}
