package test.java基础.浅拷贝与深拷贝;

class Writer implements Cloneable{
    private int age;
    private String name;

    // getter/setter 和构造方法都已省略

    @Override
    public String toString() {
        return super.toString().substring(26) + "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}