package com.designpatterns.journaldev.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class Student implements Cloneable{

    private String name;
    private String email;
    private String empId;
    private Map<String, String> address = new HashMap<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student clone = (Student) super.clone();
        clone.setAddress(null);
        Map<String, String> addressClone = new HashMap<>();
        address.forEach(addressClone::put);
        clone.setAddress(addressClone);
        return clone;
    }


}
