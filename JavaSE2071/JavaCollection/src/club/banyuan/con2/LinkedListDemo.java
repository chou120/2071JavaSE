package club.banyuan.con2;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/9/18 3:14 下午
 */
public class LinkedListDemo {


  public static void main(String[] args) {
    LinkedList<Integer> objects = new LinkedList<>();
    objects.add(1231);
    objects.add(112312231);
    objects.add(1111231);
    objects.add(1,9876);
    objects.addLast(123);

    objects.push(213121);
    objects.push(1091);
    objects.push(8762121);

    Integer pop = objects.pop();
    objects.offer(11223);
    objects.offer(9876223);

    objects.offerFirst(9089898);
    Integer peek = objects.peek();
    Integer peek1 = objects.peek();

    Integer element = objects.element();
    Integer poll = objects.pollLast();


    System.out.println(poll+"---"+objects);

    //Vector
    Stack<String>  stack=new Stack();
    stack.push("java");
    stack.push("C");
    stack.push("C++");
    stack.push("C#");
    stack.push("VB");
    stack.push("java");
    stack.push("JS");

    // JS Java VB C# C++  C java

    int java = stack.search("java");
    System.out.println(stack+"---"+java);

    String s = stack.elementAt(2);  //下标
    System.out.println(s);
    //stack.replaceAll("");


  }
}
