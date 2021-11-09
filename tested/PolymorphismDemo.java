package tested;
import java.util.Date;
import java.util.Random;
import java.math.BigInteger;
import java.net.BindException;

// public class test {
//     public static void main(String[] args) {
//         // int i, j;
//         // i = 1;
//         // j = i;
//         // System.out.println(i + j);
//         // j = 2;
//         // System.out.println(i + j);
//         // Date date = new Date(120, 10, 26);
//         // System.out.println(date.getYear());
//         // Random r = new Random();
//         // System.out.println(r.nextInt());
//         // BigInteger b = new BigInteger("9223372036854775807");
//         // BigInteger d = new BigInteger("1383505805528216371050");
//         // BigInteger a = new BigInteger("3");
//         // BigInteger c = b.multiply(a);
//         // System.out.println(c);
//         // String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
//         // for(int i = 0; i < tokens.length; ++i) System.out.println(tokens[i]);

//     }
// }
public class PolymorphismDemo {
    public static void main(String[] args) {
      m(new GraduateStudent());
      m(new Student());
      m(new Person());
      m(new Object());
    }
  
    public static void m(Object x) {
      System.out.println(x.toString());
    }
  }
  
  class GraduateStudent extends Student {
  }
  
  class Student extends Person {
    public String toString() {
      return "Student";
    }
  }
  
  class Person extends Object {
    public String toString() {
      return "Person";
    }
  }
  