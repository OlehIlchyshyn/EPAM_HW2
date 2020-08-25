package com.epam.homework.beans3;

import com.epam.homework.other.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanE {
    @Autowired
    @Qualifier("otherBeanB")
    private OtherBeanB otherBeanB;
}
