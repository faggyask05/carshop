/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carshop;

/**
 *
 * @author HP
 */
class Car {
    private long id;
    private String type;
    private String brand;
    private int age;
    private int price;

    public Car(long id, String type, String brand, int age, int price) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.age = age;
        this.price = price;
    }

    public long getId() { return id; }
    public String getType() { return type; }
    public String getBrand() { return brand; }
}
    
