/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststudent2;

/**
 *dadefrf3rffr
 * @author Fuwad Oladega
 */
public class TestStudent2 {

    public static void main(String[] args) 
    {
        Student[]list= new Student[3];
        Student s1= new Student();
        s1.setAge(19);
        s1.setName("Fuwad");
        Student s2= new Student();
        s2.setAge(20);
        s2.setName("Kosta");
        Student s3= new Student();
        s3.setAge(40);
        s3.setName("Blend");
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0; i<list.length;i++)
        {
            System.out.println(list[i].getName() + " " +list[i].getAge());
        
        }
    }
    
}
