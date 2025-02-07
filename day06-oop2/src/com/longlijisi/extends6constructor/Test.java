package com.longlijisi.extends6constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识子类构造器的特点，再认识应用场景。
        //子类构造器必须先调用父类的无参数构造器，再执行自己的构造器。
        Zi zi = new Zi();

    }
}

class Zi extends Fu {
    public Zi() {
        super();//默认存在的，写不写都有，所以会先调用父类的无参数构造器。
//        super(666);//指定调用父类的有参数构造器
        System.out.println("子类无参构造器执行了");
    }
}

class Fu {
    public Fu() {
        System.out.println("父类无参构造起执行了");
    }
    public Fu(int a ){
        System.out.println("父类有参构造器执行了");
    }
}