package com.epam.homework.beans1;

import com.epam.homework.other.OtherBeanB;
import com.epam.homework.other.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private OtherBeanB otherBeanB;
    private OtherBeanC otherBeanC;

    @Autowired
    public BeanB(@Qualifier("otherBeanB") OtherBeanB otherBeanB, OtherBeanC otherBeanC) {
        this.otherBeanB = otherBeanB;
        this.otherBeanC = otherBeanC;
    }
}
