import java.sql.SQLOutput;

public class Driver {
    private String name;
    private boolean haveDriveLicense;
    private int drivingExperience;
    private DriverLicense driverLicense;

    public Driver(String name) {
        this.name = check(name);
        driverLicense = null;
        drivingExperience = 0;
        haveDriveLicense = false;
    }

    public Driver(String name, DriverLicense driverLicense, int drivingExperience) {
        this.name = check(name);
        this.driverLicense = driverLicense;
        this.drivingExperience = check(drivingExperience);
        haveDriveLicense = this.driverLicense != null;
    }

    private String check(String str) {
        if (str == null) str = "";
        if (str.matches("^\\s+$") || str.length() == 0) return "default";
        else return str;
    }

    private int check(int i) {
        return Math.max(0, i);
    }

    public void startMoving() {
        System.out.println(this.toString() + " start moving");
    }

    public void stopMoving() {
        System.out.println(this.toString() + " stopped");
    }

    public void refuel() {
        System.out.println(this.toString() + " refueling his auto");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean haveDriveLicense() {
        return haveDriveLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = check(drivingExperience);
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
        if (driverLicense != null) haveDriveLicense = true;
    }

    public boolean canDrive(Transport t){
        return t.getDriverLicense() == this.driverLicense;
    }
    @Override
    public String toString() {
        return "Driver " + getName() + ", drive license type " + getDriverLicense()
                + ", drive experiens - " + getDrivingExperience() + " years.";
    }
}
