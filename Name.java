package com.company;

import java.util.Objects;

public class Name {

    private final String Name;

    public Name(String Name) {
        this.Name = Name; }
    @Override
    public int hashCode() {
        return Objects.hash(Name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Name)) {
            return false;
        }
        Name other = (Name) o;
        return Objects.equals(Name, other.Name);
    }
}
