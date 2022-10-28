package com.corejava.test;

class ProtectedAccessModifierParent {
    protected int age;

    int display(){
       return age; 
    }
}

public class ProtectedAccessModifier extends ProtectedAccessModifierParent  {

}


