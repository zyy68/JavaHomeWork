/**
 *Test.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018年12月27日 下午10:03:38
 */
package com.总复习.算法语言基础;

/**
 * @author sylvia.zhao
 *
 */
public class 静态实例化 {
    static int total = 10; 
    public static void main (String args []) { 
           new 静态实例化(); 
    } 
    public 静态实例化 () { 
           System.out.println("In test"); 
           System.out.println(this); 
           int temp = this.total; 
           if (temp > 5) { 
               System.out.println(temp); 
           } 
    } 
}
