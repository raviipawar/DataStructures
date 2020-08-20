//package com.practise;
//
//import java.util.Scanner;
//
//public class BracesCount {
//
//    public int matchedCount(){
//        Scanner scan = new Scanner(System.in);
//        Stack stk = new Stack();
//        System.out.println("Enter expression");
//        String exp = scan.next();
//        int len = exp.length();
//        System.out.println("\nMatches and Mismatches:\n");
//        int counter = 0;
//        for (int i = 0; i < len; i++)
//        {
//            char ch = exp.charAt(i);
//            if (ch == '(')
//                stk.push(i);
//            else if (ch == ')')
//            {
//                try
//                {
//                    int p = stk.pop() + 1;
//                    counter++;
//                }
//                catch(Exception e)
//                {
//                    return -1;
//                }
//            }
//        }
//
//        while (!stk.isEmpty() )
//            return -1;
//        return counter;
//    }
//}
