package com.epam.homework.beans1;

import com.epam.homework.other.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private OtherBeanA otherBeanA;

    @Autowired
    public BeanA(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }
}
