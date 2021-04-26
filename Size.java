package com.company;

import java.util.Objects;

public class Size {

    private final String Size;

    public Size(String Size) {
        this.Size = Size; }
    @Override
    public int hashCode() {
        return Objects.hash(Size);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Size)) {
            return false;
        }
        Size other = (Size) o;
        return Objects.equals(Size, other.Size);
    }
}
