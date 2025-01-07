package com.longlijisi.demo;

public class Test3 {
    public static void main(String[] args) {
        //目标：开发验证码。
        //1.调用一个方法返回执行位数的验证码，每位只能是数字或者大写字母或者小写字母。
        System.out.println(getCode(4));
        System.out.println(getCode(6));
    }

    public static String getCode(int n){
        //2.定义一个字符串变量用于记录生产的验证码。
        String code = "";
        //3.循环n次，每次生成一个验证码。
        for (int i = 0; i < n ; i++) {
            //i = 0 1 2 3
            //4.为当前位置随机生成一个数字或者大写字母或者小写字母。 数字0-9，大写字母65-90，小写字母97-122。
            //随机一个0 或者 1 或者2 表示当前位置随机的字符类型。
            int type = (int)(Math.random() * 3);//[0,3] * 3 => 0 1 2
            //使用switch 语句判断当前位置随机的字符类型。
            switch (type) {
                case 0:
                    //数字0-9
                    int num = (int)(Math.random() * 10);//[0,10) => 0-9
                    code += num;
                    break;
                case 1:
                    //大写字母65-90
                    int num1 = (int)(Math.random() * 26);//[65,91) => A-Z
                    char ch = (char)(65 + num1);
                    code += ch;
                    break;
                case 2:
                    //小写字母97-122
                    int num2 = (int)(Math.random() * 26);//[97,123) => a-z
                    char ch1 = (char)(97 + num2);
                    code += ch1;
                    break;
            }
        }
        return code;
    }
}
