public class Equal_HashCode {

    public static void main(String[] args) {
        Employ em=new Employ("Manjit", "Kolkata", 22);

        System.out.println(em);

        String s1="Ram";
        String s2="Ram";

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        String ss1=new String("Ram");
        String ss2 = new String("Ram");

        System.out.println(ss1.equals(ss2));
        System.out.println(ss1==ss2);

        Employ e1=new Employ("Ram", "Kol", 30);
        Employ e2=new Employ("Ram", "Kol", 30);

        System.out.println(e1.equals(e2));
        System.out.println(e1==e2);
    }
}

class Employ{
    private String name;
    private String address; 
    private int age;

    public Employ(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employ [name=" + name + ", address=" + address + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + age;
        return result;
    }
// -----------------------------------equal and has code ------------------------------------

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employ other = (Employ) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (age != other.age)
            return false;
        return true;
    } 
    
}