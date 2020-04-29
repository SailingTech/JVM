package com.mashibing.jvm.c4_RuntimeDataAreaAndInstructionSet;

/**
 * 这个案例用来诠释jvm stack指令
 *
 */
public class TestIPulsPlus {
    public static void main(String[] args) {
        int i = 8;
        //i = i++;
        i = ++i;
        System.out.println(i);
    }
}
