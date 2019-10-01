package assgmt2.Q10;

import java.util.*;
import java.io.*;

interface Command {
  public void execute();
}

class FileOpenCommand implements Command {
  File file;

  FileOpenCommand(File file){
    this.file = file;
  }

  public void execute(){
    file.open();
  }
}

class FileReadCommand implements Command {
  File file;

  FileReadCommand(File file){
    this.file = file;
  }

  public void execute() {
    try {
      file.read();
    }
    catch (Exception e){
      System.out.println(e);
    }
  }
}

class FileWriteCommand implements Command {
  File file;

  FileWriteCommand(File file){
    this.file = file;
  }

  public void execute(){
    try {
      file.write();
    }
    catch (Exception e){
      System.out.println(e);
    }
  }
}

class FileSaveCommand implements Command {
  File file;

  FileSaveCommand(File file){
    this.file = file;
  }

  public void execute(){
    file.save();
  }
}

class File {
  private FileWriter fw = null;
  private FileReader fr = null;
  private String fileName = "";


  public void open(){
    Scanner in = new Scanner(System.in);
    this.fileName = in.nextLine();
  }

  public void read() throws IOException{

    try {
      fr = new FileReader(fileName);
    }
    catch (FileNotFoundException fe){
      System.out.println("File not found");
    }

    int ch;
    while ((ch=fr.read()) != -1)
      System.out.print((char)ch);
    System.out.println();
  }

  public void write() throws IOException{

    Scanner in = new Scanner(System.in);
    String str = in.nextLine();

    try {
      fw = new FileWriter(fileName);
    }
    catch (FileNotFoundException fe){
      System.out.println("File not found");
    }

    for (int i = 0; i < str.length(); i++)
      fw.write(str.charAt(i));
    System.out.println("Writing successful");
  }

  public void save() {

    try {
      if(fr != null){
        this.fr.close();
        System.out.println("Closed.");
      }
      if(fw != null){
        this.fw.close();
        System.out.println("Saved.");
      }
    }
    catch (Exception e){
      System.out.println(e.toString());
    }
  }
}

class FileControl {
  private Command command;

  public void setCommand(Command command){
    this.command = command;
  }

  public void executeCommand(){
    command.execute();
  }
}

public class MainQ10{
  public static void main(String[] args) {
    FileControl control = new FileControl();
    File file = new File();
    Command open = new FileOpenCommand(file);
    Command write = new FileWriteCommand(file);
    Command read = new FileReadCommand(file);
    Command save = new FileSaveCommand(file);

    control.setCommand(open);
    control.executeCommand();

    control.setCommand(write);
    control.executeCommand();

    control.setCommand(save);
    control.executeCommand();

    control.setCommand(open);
    control.executeCommand();

    control.setCommand(read);
    control.executeCommand();

    control.setCommand(save);
    control.executeCommand();
  }
}
