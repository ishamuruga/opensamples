package com.company.simple.myfirstsboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MySuperCommandLine implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }


        for(int i=0;i<5;i++){
            System.out.println("===============" + i);
        }
        
        System.out.println("Completed on = " + (new java.util.Date().toString()));
        
    }
    
}
