package oopintro;

public class Product {

    int id;
    String name;
    double unitPrice;
    String detail;


    public Product(){
        System.out.println("Product constructor worked!");
    }

    public Product(int id, String name, double unitPrice, String detail){
        this();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }


}
