package One;

public class Customers {
    public static int customer_id;
    public static String first_name;
    public static String last_name;
    public static String brith_date;
    public static int age;
    public static String gender;
    public static int phone;
    public static String email;
    public static String city;
    public static String street;
    public static int building;

    public Customers(int customer_id, String first_name, String last_name, String brith_date, int age, String gender, int phone, String email, String city, String street, int building) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.brith_date = brith_date;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.street = street;
        this.building = building;
    }
    //Метод toString вывод всё значения возращаемые от класса CRUDcustomers ,метода getCustomer
        public String toString() {
            return
                    " customer_id= " + customer_id +"\n"+ " first_name= " + first_name +"\n"+ " last_name= " + last_name +"\n"+ " birth_date= " + brith_date + "\n"+" age= " + age +"\n"+" gender= " + gender +"\n"+
                    " phone= " + phone +"\n"+ " email= " + email + "\n"+ " city= " + city + "\n" + " street= " + street + "\n"+ " building= " + building;
        }
    }
