import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        String[] brands = {"VW", "BMW", "Mercedes", "Opel"};
        String[] models = {"Model 1", "Model 2", "Model 3", "Model 4"};
        String[] names = {"Ben", "Nick", "James", "Mike", "Joseph", "Matias"};

        Transport[] transports = new Transport[12];
        for (int i = 0; i < transports.length; i++) {
            if (i < 4) {
                transports[i] = new Car(brands[rnd.nextInt(brands.length)],
                        models[rnd.nextInt(models.length)],
                        ((double) rnd.nextInt(10) / 10) + rnd.nextInt(4));
                continue;
            }
            if (i < 8) {
                transports[i] = new Truck(brands[rnd.nextInt(brands.length)],
                        models[rnd.nextInt(models.length)],
                        ((double) rnd.nextInt(10) / 10) + rnd.nextInt(3) + 5);
                continue;
            }
            transports[i] = new Bus(brands[rnd.nextInt(brands.length)],
                    models[rnd.nextInt(models.length)],
                    ((double) rnd.nextInt(10) / 10) + rnd.nextInt(3) + 5);
        }

        Driver[] drivers = new Driver[names.length];
        for (int i = 0; i < drivers.length; i++) {
            if (i < 2) {
                drivers[i] = new Driver(names[i], DriverLicense.B, rnd.nextInt(15));
                continue;
            }
            if (i < 4) {
                drivers[i] = new Driver(names[i], DriverLicense.C, rnd.nextInt(15));
                continue;
            }
            drivers[i] = new Driver(names[i], DriverLicense.D, 10 + rnd.nextInt(15));
        }

        for (int i = rnd.nextInt(4); i < transports.length; i += 4) {
            int j = 0;
            while (true) {
                if (j == drivers.length) {
                    System.out.println("Для "+transports[i] + " нет подходящих водителей!");
                    break;
                }
                if (drivers[j].canDrive(transports[i])) {
                    System.out.println(drivers[j] + " управляет автомобилем " + transports[i] + " и будет участвовать в заезде");
                    break;
                }
                j++;
            }
        }
 /*
        for (Transport t : transports) {
            System.out.println(t + " " + t.getEngineVolume());
        }
        for (Driver d : drivers) {
            System.out.println(d);
        }
 */
    }
}