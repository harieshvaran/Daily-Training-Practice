// Q3. VEHICLE MANAGEMENT

// A transport company manages different vehicles.

// All vehicles can:
// - Start
// - Stop

// But each vehicle starts differently.

// Vehicles:
// - Car
// - Bike
// - Bus

// Requirements:
// - Create an abstract class Vehicle.
// - Create abstract method start().
// - Create concrete method stop().
// - Create child classes Car, Bike, and Bus.
// - Override start() in each class.
// - Demonstrate the output.

abstract class Vehicle {
    abstract void start();
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car start");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike start");
    }
}

class Bus extends Vehicle {
    void start() {
        System.out.println("Bus start");
    }
}

class VehicleManagement {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.stop();
        
        Vehicle v2 = new Bike();
        v2.start();
        v2.stop();
        
        Vehicle v3 = new Bus();
        v3.start();
        v3.stop();
    }
}