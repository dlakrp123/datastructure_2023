//import java.util.Stack;
//
//class Student{
//   int hakbun;
//   String name;
//   public Student(int h, String n) {
//      hakbun = h;
//      name = n;
//   }
//}
//
//public class SortStudent {
//   public static void main(String[] args) {
//      Stack<Student> myStack = new Stack<Student>();
//      Stack<Student> tmpStack = new Stack<Student>();
//      myStack.push(new Student(1111,"김진"));
//      myStack.push(new Student(1234,"홍길동"));
//      myStack.push(new Student(1324,"김인호"));
//      myStack.push(new Student(1127,"이민정"));
//      myStack.push(new Student(2310,"박철호"));
//      
//      while(!myStack.empty()) {
//         Student student = myStack.pop();
//         while(!tmpStack.empty() && student.hakbun < tmpStack.peek().hakbun) {
//            myStack.push(tmpStack.pop());
//         }
//         tmpStack.push(student);
//      }
//      while(!tmpStack.empty()) {
//         Student student = tmpStack.pop();
//         System.out.println(student.hakbun + " " + student.name);
//      }
//   }
//}