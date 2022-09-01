import java.util.Scanner;

class student{
    String name;
    int id;
    int marks[] = new int[5];

    void read(){
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Id: ");
        id = input.nextInt();
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
    public static void main(String args[]){
        student std = new student();
        Marks mk = new Marks();
        std.read();
        // Issue: Getting null value from mk.display()
        mk.display();
        std.display();
    }
}

class Marks extends student{
    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}