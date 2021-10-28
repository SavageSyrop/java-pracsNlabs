import java.io.*;
public class writeInFileClass {
    public static void main(String[] args) {
        try(FileWriter writer = new
                FileWriter("C:\\Users\\Родион Романович\\Desktop\\JavaProjects\\lab8\\src\\file.txt", true))
        {
            String text = "Holy Diver\nYou're the star of the masquerade\nNo need to look so afraid\n";
            writer.write(text);

            writer.append("Holy Diver\nYou've been down too long in the midnight sea\nOh what's becoming of me\n");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }


}





