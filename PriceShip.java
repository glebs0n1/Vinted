package com.company;

import java.math.BigDecimal;

public interface PriceShip {

    BigDecimal getShipPrice(String Size, String Name);

    BigDecimal getLowestShipPrice(String Size);
}
