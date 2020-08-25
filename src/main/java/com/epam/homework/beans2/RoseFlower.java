package com.epam.homework.beans2;

import com.epam.homework.other.OtherBeanA;
import com.epam.homework.other.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RoseFlower {
    private OtherBeanA otherBeanA;
    private OtherBeanC otherBeanC;

    @Autowired
    @Qualifier("otherBeanA")
    public void setOtherBeanA(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }

    @Autowired
    public void setOtherBeanC(OtherBeanC otherBeanC) {
        this.otherBeanC = otherBeanC;
    }
}
