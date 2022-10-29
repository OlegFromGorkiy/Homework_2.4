public class Bus extends Transport {
    DriverLicense driverLicense = DriverLicense.D;

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume, DriverLicense.D);
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
