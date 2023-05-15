package com.ruavsva.spring;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.ruavsva.spring")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }


}
