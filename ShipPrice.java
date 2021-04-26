package com.company;


import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShipPrice {

    private static final Pattern ShipPricePattern = Pattern.compile("^([A-Z]+) (\\d {1,2})$");

    private String Size;
    private String Name;
    private BigDecimal ShipPrice;

    public ShipPrice(String priceString) {
        parse(priceString);
    }

    private void parse(String priceString) {
        Matcher m = ShipPricePattern.matcher(priceString);
        m.find();
        Name = m.group(1);
        Size = m.group(2);
        ShipPrice = new BigDecimal(m.group(3));
    }

    public String getSize() {
        return Size;
    }

    public String getName() {
        return Name;
    }

    public BigDecimal getShipPrice() {
        return ShipPrice;
    }
}
