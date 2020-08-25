package com.epam.homework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.epam.homework.beans2"},
        basePackageClasses = {com.epam.homework.beans3.BeanD.class, com.epam.homework.beans3.BeanF.class})
public class ConfigB {
}
