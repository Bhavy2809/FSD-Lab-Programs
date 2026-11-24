package com.nmit.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Tells Spring to find all @Component classes in package com.nmit.di
@Configuration
@ComponentScan("com.nmit.di")
public class AppConfig {
}
