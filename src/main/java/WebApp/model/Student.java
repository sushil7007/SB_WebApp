package WebApp.model;

public class Student {
private int sid;
private String name;
private int marks;
private String city;
@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + ", city=" + city + "]";
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int sid, String name, int marks, String city) {
	super();
	this.sid = sid;
	this.name = name;
	this.marks = marks;
	this.city = city;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
