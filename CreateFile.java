import java.io.File;
import java.io.IOException;


 class CreateFile{
  public static void main(String[] args){
    File file = new File("student.txt");

   try{
      if(file.createNewFile()){
         System.out.println("File created successfully.");
      }else{
         System.out.println("File already exists.");
      }
    }catch (IOException e){
      System.out.println("An error occured:"+e.getMessage());
    }
  }
}         