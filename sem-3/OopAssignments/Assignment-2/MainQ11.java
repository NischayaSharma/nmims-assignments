package assgmt2.Q11;

import java.util.*;

interface Iterator{
  public boolean hasNext();
  public Object next();
}

interface Container {
  public Iterator getIterator();
}

class ShapeRepo implements Container{
  public String[] shapes = {"Square","Rectangle","Circle","Hexagon","Polygon"};

  public Iterator getIterator(){
    return new ShapeIterator();
  }
}

class ShapeIterator implements Iterator{
  private int index;
  private ShapeRepo sr = new ShapeRepo();
  public boolean hasNext(){
    if(index < sr.shapes.length)
      return true;
    return false;
  }

  public Object next(){
    if(this.hasNext()){
      return sr.shapes[index++];
    }
    return null;
  }
}

class MainQ11{
  public static void main(String[] args) {
    ShapeRepo ShapeRepository = new ShapeRepo();
    for(Iterator iter = ShapeRepository.getIterator(); iter.hasNext();){
         String shape = (String)iter.next();
         System.out.println("Shape : " + shape);
      }
  }
}
