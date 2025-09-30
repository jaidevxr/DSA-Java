// class sloth{
//     String intro;
//     String moto;
//   // constructor
//     sloth(String intro, String moto)
//     {
//         this.intro = intro;
//         this.moto = moto;
//     }

//     void start()
//     {
//         System.out.println("I am a sloth.");
//     }

//     void traits()
//     {
//         System.out.println("I am slow and lazy. But sometimes I can do some crazy things.");
//     }

//     void stop()
//     {
//         System.out.println("I am no more sloth.");
//     }
// }

// public class OOPs {
//     public static void main(String[] args) {
//         sloth s1 = new sloth("Konnichiwa!! Watashi no namae wa SLOTHZILLA desu.","I do nothing all day but still the moto is Shinzou wo sasageyo!!");

    

//         System.out.println(s1.intro);
//         System.out.println(s1.moto);
//         s1.start();
//         s1.traits();
//         s1.stop();
//     }
// }


class smartphone{
    String brand;
    String model;
    int storage; 
    double price; 

    // constructor
    smartphone(String brand, String model, int storage, double price)
    {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.price = price;
    }

    void makeCall(String number)
    {
        System.out.println("Calling " + number + "...");
    }

    void sendMessage(String number, String message)
    {
        System.out.println("Sending message to " + number + ": " + message);
    }

    void displayInfo()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: $" + price);
    }
}

public class OOPs {
    public static void main(String[] args) {
        smartphone phone1 = new smartphone("Xiomi", "POCO M4 PRO", 64, 1000);
        smartphone phone2 = new smartphone("Samsung", "Galaxy S21", 128, 15000);

        phone1.displayInfo();
        phone1.makeCall("987654321");
        phone1.sendMessage("995664581", "Hello from my POCO!");

        System.out.println();

        phone2.displayInfo();
        phone2.makeCall("987-654-3210");
        phone2.sendMessage("987-654-3210", "Hello from my Galaxy!");
    }
}