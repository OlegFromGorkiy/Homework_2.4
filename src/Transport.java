public abstract class Transport implements Competetable{
    private String brand;
    private String model;
    private double engineVolume;
    DriverLicense driverLicense;

    public Transport(String brand, String model, double engineVolume, DriverLicense driverLicense) {
        this.brand = check(brand);
        this.model = check(model);
        this.engineVolume = check(engineVolume);
        this.driverLicense = driverLicense;
    }

    public String check(String str) {
        if (str == null) str = "";
        if (str.matches("^\\s+$") || str.length() == 0) return "default";
        else return str;
    }

    public double check(double d) {
        return Math.abs(d);
    }

    public void start() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stopped");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = check(brand);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = check(brand);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = check(engineVolume);
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel();
    }
    //public abstract
}
