package org.pursuit.dogapiagain.model;

import java.util.List;

public class Dog {
    List<String> message;

    public Dog(List<String> message) {
        this.message = message;
    }

    public List<String> getMessage() {
        return message;
    }

    String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }


}
