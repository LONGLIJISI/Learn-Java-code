package com.longlijisi.branch;

public class IfText2 {
    public static void main(String[] args) {
        //目标：完成自动汽车驾驶程序的代码模拟；以便可以根据红绿灯状态正确通过路口。
        boolean red = false;
        boolean green = true;
        boolean yellow = false;
        if (red) {
            System.out.println("红灯亮，请停止通过！");
        } else if (green) {
            System.out.println("绿灯亮，请通过！");
        } else if (yellow) {
            System.out.println("即将转变为红灯，请注意！");
        } else {
            System.out.println("有其他情况，请回归自主操作！");
        }
    }
}
