package com.epam.homework.beans3;

import com.epam.homework.other.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanD {
    @Autowired
    private OtherBeanA otherBeanA;
}
