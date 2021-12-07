package practica;

public class Student {
	public int nota;
    public String name;
  
    // Method to set the data to
    // student objects
    public void setData(int nota, String name)
    {
        this.nota = nota;
        this.name = name;
    }
  
    // display() method to display
    // the student data
    public void display()
    {
        System.out.println("Student nota is: " + nota + " "
                           + "and Student name is: "
                           + name);
        System.out.println();

    }
}
