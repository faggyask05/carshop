/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carshop;

/**
 *
 * @author HP
 */
class Customer {

    private long id;
    private String name;
    private int age;
    private String sex;
    private boolean isDriverLicense;

    public Customer(long id, String name, int age, String sex, boolean isDriverLicense) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.isDriverLicense = isDriverLicense;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
