package com.test.services;

import com.test.model.Address;
import com.test.model.Person;
import com.transport.lib.common.Api;

@Api
public interface PersonService {

    public static final String FUCK = "FUCK";
    public int add(String name,  String email, Address address);
    public Person get(Integer id);
    public void lol();
    public void lol2(String message);
    public static void shit(){
        System.out.println("Shit");
    }
    public String getName();
    public String testError();

}
