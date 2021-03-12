package com.loyaltymember;

public class MorningFreshnessMember {
    private String name;
    private SuperShoothieSchema schema;
    private int points;

    public MorningFreshnessMember(String name, SuperShoothieSchema schema) {
        this.name = name;
        this.schema = schema;
    }

    public void orders(Integer int1, String drink) {
          points += schema.getpointsFor(drink) * int1;
    }

    public int getPoints(){return points;}
}
