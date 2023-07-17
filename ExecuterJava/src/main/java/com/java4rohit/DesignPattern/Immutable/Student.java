package com.java4rohit.DesignPattern.Immutable;

//Immutable mean Once Object is constructed , its State cannot be changed

 public class Student {
    final private int id ;
    final private String StudentName;
   final private  Address address;

    public Student(int id, String studentName, Address address) {
        this.id = id;
        StudentName = studentName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getStudentName() {
        return StudentName;
    }
//Removed Set
//    public void setStudentName(String studentName) {
//        StudentName = studentName;
//    }


    public Address getAddress() {
        return new Address(address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", StudentName='" + StudentName + '\'' +
                ", address=" + address +
                '}';
    }
}
