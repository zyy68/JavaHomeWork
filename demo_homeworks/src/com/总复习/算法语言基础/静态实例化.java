/**
 *Test.java
 *
 *copyright@ sylvia.zhao Sylvia.Zhao
 *
 *created on 2018��12��27�� ����10:03:38
 */
package com.�ܸ�ϰ.�㷨���Ի���;

/**
 * @author sylvia.zhao
 *
 */
public class ��̬ʵ���� {
    static int total = 10; 
    public static void main (String args []) { 
           new ��̬ʵ����(); 
    } 
    public ��̬ʵ���� () { 
           System.out.println("In test"); 
           System.out.println(this); 
           int temp = this.total; 
           if (temp > 5) { 
               System.out.println(temp); 
           } 
    } 
}
