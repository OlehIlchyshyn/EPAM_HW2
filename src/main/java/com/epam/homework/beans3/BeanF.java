package com.epam.homework.beans3;

import com.epam.homework.other.OtherBeanA;
import com.epam.homework.other.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanF {
    @Autowired
    private OtherBeanA otherBeanA;
    @Autowired
    private OtherBeanC otherBeanC;
}
