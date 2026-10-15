class Student{
   private String name;
   private int marks;
   
   public void setName(String name) { this.name = name; }
   public void setMarks(int marks) { this.marks = marks; }
   public String getName() { return name; }
   public int getMarks() { return marks; }
}

public class program1 {
   public static void main(String[] args) {
     Student s = new Student();
     s.setName("Aman");
     System.out.println("Name: " + s.getName());
     System.out.println("Marks:" + s.getMarks());
  }
}