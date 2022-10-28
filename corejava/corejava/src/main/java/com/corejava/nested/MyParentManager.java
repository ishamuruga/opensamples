package com.corejava.nested;

public interface MyParentManager {
    public Boolean checkData();
    public Relative findRelative(Relative rel);
    
    
    interface MyChildManager {
        public Boolean checkData2();    
    }
    
    class Relative {
        int age;
        int id;
        String name;
    }
}


class MyParent implements MyParentManager {

    @Override
    public Boolean checkData() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Relative findRelative(Relative rel) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

class MyChildManager implements MyParentManager.MyChildManager {

    @Override
    public Boolean checkData2() {
        // TODO Auto-generated method stub
        return null;
    }
    
}