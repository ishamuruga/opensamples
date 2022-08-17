package com.company.consumer;

import com.company.api.CalculatorManager;
import com.company.api.CalculatorManagerImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalculatorManager calc = new CalculatorManagerImpl();
        System.out.println(calc.multiple(10, 13));
    }
}
