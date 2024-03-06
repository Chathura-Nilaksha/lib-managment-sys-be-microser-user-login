package edu.icet.confic;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanConfig {
    @Bean
    public ModelMapper makeModelMapper(){
        return new ModelMapper();
    }

}
