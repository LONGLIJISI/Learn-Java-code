package com.longlijisi;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //目标：认识使用数组的好处，数组的定义，访问。
        call();
    }
    //请帮我开发一个随机点名的方法，假设有15名学生
    public static void call(){
        //1.定义一个数组，存储15个不同名字的学生姓名。
        String[] names = new String[]{"小明","小红","小刚","小花","小花","小花","小花","小花","小花","小花","小花","小花","小花","小花","小花"};
        //                    索引值：0~14


        //2.随机获取一个索引值。
        //Math.random() : [0~1) 直接的小数
        //names.length : 数组中元素的个数
        //数组名.[索引值]
        int index = (int)(Math.random() * names.length);

        //3.根据索引值，获取数组中的元素，就是学生姓名。
        String name = names[index];
        //4.打印输出
        System.out.println("被选中的学生是：" + name);
    }
}
