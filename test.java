package com.company;
import java.time.LocalDate;

public class test implements Comparable <test> {

    private LocalDate Date;
    private String Name;
    private String Size;
    private String Price;

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        this.Size = Size;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }

    @Override
    public String toString() {
        return "test[" +
                "Date=" + Date +
                ", name='" + Name + '\'' +
                ", size='" + Size + '\'' +
                ", price='" + Price + '\'' + ']';
    }

    @Override
    public int compareTo (test o) {
        return 0;
    }
}
