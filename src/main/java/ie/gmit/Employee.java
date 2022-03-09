package ie.gmit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Employee {

    String title;
    String name;
    int age;
    String PPS;
    String phone;
    String EmploymentType;
    String regex = "\\d{10}";

    public Employee(String title, String name, int age,String PPS,String phone,String employmentType) {
        this.title = title;
        if (name.length() > 3 && name.length() > 26) {
                this.name = name;
        }else {
            System.out.println("Given Name is not valid");
        }

        if (PPS.length() == 8){
            this.PPS = PPS;
        }else {
            System.out.println("Given PPS number is valid");
        }
        Pattern pattern = Pattern.compile(regex);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(phone);
        //Verifying whether given phone number is valid
        if (matcher.matches()) {
            this.phone = phone;
            System.out.println("Given phone number is valid");
        } else {
            System.out.println("Given phone number is not valid");
        }
        this.EmploymentType = employmentType;

        if (age > 15) {
            this.age = age;
        }else {
            System.out.println("Given Age is not valid");
        }
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmploymentType() {
        return EmploymentType;
    }

    public void setEmploymentType(String employmentType) {
        EmploymentType = employmentType;
    }

}