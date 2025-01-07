package com.longlijisi.branch;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        //目标:搞清楚swtich分支结构的应用和写法，还要理解其执行流程。
        test1();
    }

    //需求：根据男女性别的不同，推荐不同的书本信息给其观看
    public static void test1(){
        //1.让用户输入自己的性别
        System.out.println("请输入你的性别：");
        Scanner sc = new Scanner(System.in);
        String sex = sc.next();// "男" "女" "保密"

        //2.根据用户输入的性别，判断该做什么
        switch (sex){
            case("男"):
                System.out.println("男的，推荐你看《十宗罪》");
                break;
            case("女"):
                System.out.println("女的，推荐你看《白夜行》");
                break;
            default:
                System.out.println("保密的，推荐你看《三体》");
        }
    }
}
