/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class Juet{
    String name;
    int age;
    
    void setname(String name){
        this.name=name;
    }
    void setage(int age){
        this.age=age;
    }
    
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
    
}


public class Main
{
	public static void main(String[] args) {
		Juet m1=new Juet();
		m1.setname("Shubh Pratap Singh");
		m1.setage(20);
		
		System.out.println(m1.getName());
		System.out.println(m1.getAge());
	}
}
