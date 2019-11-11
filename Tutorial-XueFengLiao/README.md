<!--
 * @LastEditors: Yifan Liu
 -->
# Java basics

## Introduction
- Main method must be static and the argument should be String array (String[] args). User can type args in command line tool and main method will receive this arg.
- Use special comments to automatically create comments of the class or methods.(similar to doc string in python)

**Variable**
- Java is strong type language, we should define variable with its type.
- Byte is the least storage unit. One byte is a 8 digit number in  binary number(0-255).
- Int in java is signed. Te highest digit represent the sign of the number: 1 is positive and 0 represents negative.
- Float type should defined with f. 
```java 
double d = 1.79e308;
float f1=3.14f;
```
- Boolean type only has two value: true, false. (No uppercase).Usually it is 4 bytes defined by JVM.
- Int division will have a int result. Divide by 0 will have run time error instead of compile time error.
- Char use '', while string use ""
- use + to concat strings.(""+(char)1 + (char) 2 = "12")


**Arithmetic**
- Type coercion, short + int = int.
- float type will overflow. Return NaN, Infinity or -Infinity.
- Math.pow(a,b)
- For boolean type, use &&, ||, !.

**Array**
- All element in an array will be initialized with a default value.(0 for int,0.0 for float, false for boolean.)
- array.length to get length of an array.
- array.tostring() to print an array
- array.deeptostring() to print an 3d array.
- array.sort() to sort an array.
- Array itself is a pointer.

**Control flow**
- System.out.println(): print and new line.
- System.out.printf(): print in format. e.g. printf("%.2f",weight)
- Input
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}

```

- To judge whether a reference type, we should use a.equals(b). If a is null here, it will throw a NullPointerException. To avoid this, use a != null first.
- Before java 12, use switch should careful with break and {}. With java 12, it become much easier. And we could use yield to return value.
- Java has while and do while loop.
- There are two type for loop.
```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int n : ns) {
            System.out.println(n);
        }
    }
}
```