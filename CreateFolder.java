import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFolderNIO{
  public static void main(String[] args){
      Path path = Paths.get("C:/myFolders/subFolder/newFolder");
      
    try{
        Path newDir = Files.createDirectories(catch);
        System.out.println("Directory created successfully at: "+newDir.toAbsolutepath();
    } catch (IOException e){
        System.out.println("Failed to create directory:"+e.getMessage());
        e.printStackTrace();
    }
 }
}