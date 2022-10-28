package com.corejava.test;

class AccessModifierParent {
    int age = 45;

}

public class DefaultAccessModifier extends AccessModifierParent {
    public void run(){
        System.out.println(this.age);
    }

    public void increment(){
        age++;
    }

    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        am.run();

        AccessModifierParent2 amp3 = new AccessModifierParent2();
        
    }
}

class AccessModifierParent2 {
    AccessModifierParent2(){
        AccessModifier am = new AccessModifier();
        am.increment();
        am.run();
    }

}