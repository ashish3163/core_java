class Person{
	private String name;
	private  int age;
	Person(){
		name="Shiv";
		age=18;
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display(){
		System.out.println(name+"   "+age);
	}
}
class PersonDemo{
public static void main(String args[]){
	Person e=new Person();
	e.display();
}


}