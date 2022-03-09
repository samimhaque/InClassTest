package ie.gmit;

public class Employee {

    String title;
    String name;
    int age;
    String PPS;
    long phone;
    String EmploymentType;
    public Employee(String title, String name, int age,String PPS,long phone,String employmentType) {
        this.title = title;
        if (name.length() > 3)
        {
            if (name.length()<25)
            {
                this.name = name;
            }
        }
        if (PPS.length()==8)
            this.PPS  = PPS;
        int lgth = String.valueOf(phone).length();
        if (lgth==9){
            this.phone=phone;
        }
        this.EmploymentType=employmentType;
        if (age > 15)
            this.age = age;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getPPS() {
        return PPS;
    }

    public void setPPS(String PPS) {
        this.PPS = PPS;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmploymentType() {
        return EmploymentType;
    }

    public void setEmploymentType(String employmentType) {
        EmploymentType = employmentType;
    }

}