package exp_6;

import java.util.*;

class Customer {
    private int customerId;
    private long telephoneNum;
    private String customerName;

    public Customer(int id, long num, String name) {
        this.customerId = id;
        this.telephoneNum = num;
        this.customerName = name;

    }

    public void setCustomerId(int id) {
        this.customerId = id;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setTelephoneNum(long num) {
        this.telephoneNum = num;
    }

    public long getTelephoneNum() {
        return this.telephoneNum;
    }

    public boolean validateCustomerName() {
        return this.customerName.matches("[A-Z][a-z]*");
    }
}
