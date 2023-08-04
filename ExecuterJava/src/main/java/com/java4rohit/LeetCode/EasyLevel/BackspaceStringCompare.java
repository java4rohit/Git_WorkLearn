package com.java4rohit.LeetCode.EasyLevel;

import java.util.Stack;

public class BackspaceStringCompare {


    private static void backspaceCompare(String s, String t) {

        Stack stack = new Stack();

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '#') {
                stack.push(ch[i]);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        System.out.println(stack);


        Stack stack1 = new Stack();
        char[] ch1 = t.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != '#') {
                stack1.push(ch1[i]);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }
        System.out.println(stack1);

        boolean flag = compareTwoStack(stack, stack1);

        System.out.println(flag);


    }

    private static boolean compareTwoStack(Stack stack, Stack stack1) {
        boolean flag = true;

        if (stack.size() != stack1.size()) {
            flag = false;
            return false;
        }
        while (stack.empty() == false) {
            if (stack.peek() == stack1.peek()) {
                stack.pop();
                stack1.pop();
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        String s = "a#c";
        String t = "#a#c";

        backspaceCompare(t, s);
    }


}