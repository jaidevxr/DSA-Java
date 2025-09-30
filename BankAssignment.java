public 
abstract class Bank {
   
    public abstract double getRateOfInterest();
}


class SBI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 8.5; 
    }
}


class HDFC extends Bank {
    @Override
    public double getRateOfInterest() {
        return 7.9; 
    }
}

public class BankAssignment {
    public static void main(String[] args) {
        
        Bank sbiBank = new SBI();
        System.out.println("SBI Rate of Interest: " + sbiBank.getRateOfInterest() + "%");

      
        Bank hdfcBank = new HDFC();
        System.out.println("HDFC Rate of Interest: " + hdfcBank.getRateOfInterest() + "%");
    }
} 
