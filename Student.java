public class Student {
    public String name ;
    public int age;
    public String add;
public String getAdd() {
    return add;
}
public int getAge() {
    return age;
}
public String getName() {
    return name;
}
public void setAdd(String add) {
    this.add = add;
}
public void setAge(int age) {
    this.age = age;
}
public void setName(String name) {
    this.name = name;
}

@Override
public String toString() {
    return "Student Details is : Name: "+getName()+" Add : "+getAdd()+ " Age : "+getAge();
}

}
