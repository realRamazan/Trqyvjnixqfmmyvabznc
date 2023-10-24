package com.example.Trqyvjnixqfmmyvabznc.packageFilter;

public class Filter {
    int offset = 1;
    int limit = 1;

    public Filter(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }

    public Filter() {
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }


}
