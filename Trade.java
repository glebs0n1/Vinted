package com.company;

import java.util.HashMap;
import java.util.Map;

public class Trade {

    private Map<Size, Integer> Size;
    private Map<Size, Integer> Name;

    public Trade() {
        reset();
    }

    public void reset() {
        Size = new HashMap<>();
        Name = new HashMap<>();

    }
    public Map< com.company.Size, Integer > getName() {
        return Name;
    }
    public Map<Size, Integer> getSize() {
        return Size;
    }

    public void Size (Map<Size, Integer> Size) {
        this.Size = Size;
    }

    public void Name (Map<Size, Integer> Name) {
        this.Name = Name;
    }


}
