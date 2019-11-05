package org.fabrice.webapp;

public class Grade {
    private int first=100;
    private int second=210;

    public Grade(){}

    public Grade(int first, int second){
        this.first=first;
        this.second=second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
