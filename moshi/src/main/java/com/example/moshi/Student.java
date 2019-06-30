package com.example.moshi;

public class Student {
    private String name;
    private int age;


    public static class Builder {
        Student student;

        public Builder() {
            student = new Student();
        }

        public Builder setName(String name) {
            student.setName(name);
            return this;
        }

        public Builder setAge(int age) {
            student.setAge(age);
            return this;
        }

        public Student build() {
            return student;
        }
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
