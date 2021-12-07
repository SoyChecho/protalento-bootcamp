package practica;

public class GFG {
	public static void main(String args[])
    {
  
        // Declaring an array of student
        Student[] arr;
  
        // Allocating memory for 2 objects
        // of type student
        arr = new Student[2];
  
        // Creating actual student objects
        arr[0] = new Student();
        arr[1] = new Student();
  
        // Assigning data to student objects
        arr[0].setData(1701289270, "Satyabrata");
        arr[1].setData(1701289219, "Omm Prasad");
  
        // Displaying the student data
        System.out.println(
            "Student data in student arr 0: ");
        arr[0].display();
  
        System.out.println(
            "Student data in student arr 1: ");
        arr[1].display();
    }
}


