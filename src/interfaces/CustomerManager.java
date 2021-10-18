package interfaces;

import jdk.jshell.execution.Util;

public class CustomerManager {

    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("Customer added "+ customer.getFirstName());

        Utils.runLoggers(loggers, customer.getFirstName());
    }

    public void delete(Customer customer){
        System.out.println("Customer deleted "+ customer.getFirstName());

        Utils.runLoggers(loggers, customer.getFirstName());
    }
}
