/*
public class Generic
{
  
  private Object object;
  
  public void setObject(Object object)
  {
  
    this.object = object;
  
  }
  
  public Object getObject()
  {
  
    return this.object;
  
  }
  
  public static void main(String[] args)
  {
  
    Generic generic = new Generic();
    
    generic.setObject("Some text");
    //generic.setObject(1679);
    
    String string = (String) generic.getObject();
    System.out.println(string.toUpperCase());
  
  }

}
*/
public class Generic<E>
{
  
  private E object;
  
  public void setObject(E object)
  {
  
    this.object = object;
  
  }
  
  public E getObject()
  {
  
    return this.object;
  
  }
  
  public static void main(String[] args)
  {
  
    Generic<String> generic = new Generic<String>();
    
    //generic.setObject("Some text");
    //generic.setObject(1679);
    
    String string = (String) generic.getObject();
    System.out.println(string.toUpperCase());
  
  }

}