package com.serguei.catmeter.model;// Created by Serguei Outenkov on 8/28/16.

import java.util.ArrayList;
import java.util.List;

public class CatFact {

    private String factDescription;

    public CatFact(String factDescription) {
        this.factDescription = factDescription;
    }

    public static List<CatFact> getFakeData() {
        List<CatFact> list = new ArrayList<>();

        CatFact fact = new CatFact("Fake cat description");

        list.add(fact);
        list.add(fact);
        list.add(fact);
        list.add(fact);
        list.add(fact);
        list.add(fact);
        list.add(fact);
        list.add(fact);
        list.add(fact);
        list.add(fact);

        return list;
    }

    public String getFactDescription() {
        return factDescription;
    }

    public void setFactDescription(String factDescription) {
        this.factDescription = factDescription;
    }
}
