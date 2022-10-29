public class Truck extends Transport {

    DriverLicense driverLicense = DriverLicense.C;
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume, DriverLicense.C);
    }

    @Override
    public void pitStop() {
        System.out.println(this.toString() + " pulled into a pit stop");
    }

    @Override
    public void bestTime() {
        System.out.println(this.toString() + " showed the best lap time");
    }

    @Override
    public void maxSpeed() {
        System.out.println(this.toString() + " showed the max speed jn this lap");
    }
}
