package com.test.services;

import com.test.model.Person;
import com.transport.lib.common.Callback;

public class PersonCallback implements Callback<Person> {

    @Override
    public void callBack(String key, Person result) {
        System.out.println("Key: " + key);
        System.out.println("Result: " + result);
    }

    @Override
    public void callBackError(String key, Throwable exception) {
        System.out.println("Exception during async call");
        exception.printStackTrace();
    }
}