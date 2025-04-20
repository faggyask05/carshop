package carshop;

/**
 *
 * @author HP
 */
class CarsAndCustomer {

    private long customerId;
    private long carId;

    public CarsAndCustomer(long customerId, long carId) {
        this.customerId = customerId;
        this.carId = carId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public long getCarId() {
        return carId;
    }
}
