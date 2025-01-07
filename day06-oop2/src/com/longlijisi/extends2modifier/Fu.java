package com.longlijisi.extends2modifier;

public class Fu {
    //1.private:只能在啊当前类中访问。
    private void privateMethods() {
        System.out.println("privateMethods");
    }

    //2.缺省：只能在当前类中，同一个包下的其他类中访问、
    void methods() {
        System.out.println("method");
    }

    //3.protected:只能在当前类中，同一个包下的其他类中，子孙类中访问。
    protected void protectedMethods(){
        System.out.println("protectedMethods");
    }

    //public：任何类中都可以访问。
    public void publicMethods() {
        System.out.println("publicMethods");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privateMethods();
        fu.methods();
        fu.protectedMethods();
        fu.publicMethods();
    }
}
