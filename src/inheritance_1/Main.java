package inheritance_1;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer cengizhan = new  IndividualCustomer();
        cengizhan.customerNumber = "12345";

        CorporateCustomer karabel = new CorporateCustomer();
        karabel.customerNumber = "78910";

        CustomerManager customerManager = new CustomerManager();

        Customer[] customers = {cengizhan, karabel};
        customerManager.addMultiple(customers);
    }
}
