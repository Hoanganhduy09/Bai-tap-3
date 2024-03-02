package Com.tn;

public class Person {
    public String name;

    public String sex;

    public int dateofbirth;

    public String address;

    public Person() {
    }

    public Person(String name, String sex, int dateofbith, String address) {
        this.name = name;
        this.sex = sex;
        this.dateofbirth = dateofbirth;
        this.address = address;
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(sex);
        System.out.println(address);
        System.out.println(dateofbirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDate() {
        return dateofbirth;
    }

    public void setDate(int date) {
        this.dateofbirth = dateofbirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
