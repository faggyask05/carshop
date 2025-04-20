package carshop;

import java.util.*;

public class CarShop {
    public static void main(String[] args) {
        
        List<Car> cars = new ArrayList<>();
        List<Customer> customers = new ArrayList<>();
        List<CarsAndCustomer> connections = new ArrayList<>();

        Car car1 = new Car(1, "Cabrio", "Cadillac", 1996, 30000000);
        Car car2 = new Car(2, "Mustang GT", "Shelby Ford", 1962, 16000000);
        Car car3 = new Car(3, "Impala", "Chevrolet", 1967, 20000000);
        Car car4 = new Car(4, "Impreza", "Subaru", 1989, 13000000);
        Car car5 = new Car(5, "Cybertruck", "Tesla", 2021, 24000000);
        Car car6 = new Car(6, "540i", "BMW", 1988, 4000000);
        Car car7 = new Car(7, "Cooper", "Mini", 2007, 13000000);
        Car car8 = new Car(8, "Veyron", "Bugatti", 2013, 500000000);

        Collections.addAll(cars, car1, car2, car3, car4, car5, car6, car7, car8);

        Customer customer1 = new Customer(1, "Britney Spears", 28, "woman", true);
        Customer customer2 = new Customer(2, "Lindsay Lohan", 28, "woman", true);
        Customer customer3 = new Customer(3, "Nicolas Cage", 38, "man", true);
        Customer customer4 = new Customer(4, "Godzilla", 860, "monster", true);

        Collections.addAll(customers, customer1, customer2, customer3, customer4);

        connections.add(new CarsAndCustomer(1, 1));
        connections.add(new CarsAndCustomer(1, 2));
        connections.add(new CarsAndCustomer(2, 3));
        connections.add(new CarsAndCustomer(2, 4));
        connections.add(new CarsAndCustomer(3, 5));
        connections.add(new CarsAndCustomer(3, 6));
        connections.add(new CarsAndCustomer(4, 7));
        connections.add(new CarsAndCustomer(4, 8));

        for (int i = 0; i < connections.size(); i++) {
            CarsAndCustomer cac = connections.get(i);

            Customer customer = null;
            for (int j = 0; j < customers.size(); j++) {
                if (customers.get(j).getId() == cac.getCustomerId()) {
                    customer = customers.get(j);
                    break;
                }
            }

            Car car = null;
            for (int k = 0; k < cars.size(); k++) {
                if (cars.get(k).getId() == cac.getCarId()) {
                    car = cars.get(k);
                    break;
                }
            }

            //"%s -> %s %s\\n": egy formázási minta, ahol: %s: helyettesítő a szöveg (string) típusú értékeknek.  csak egy nyíl karakter, a vizuális kapcsolatot mutatja.\\n: új sor (Enter).
            if (customer != null && car != null) {
                System.out.printf("%s -> %s %s\n", customer.getName(), car.getBrand(), car.getType());
            }
        }
    }
}