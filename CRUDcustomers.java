package One;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CRUDcustomers{

    //Данный метод не возвращает значения переменных и приравнивает их переменным Customer
    public static Customers getCustomer(int id){

        try {
            Connection connection=Connect.FullConnected();//Подключение к базе
            Statement statement=connection.createStatement();//Подключение к базе


            String query = "SELECT * FROM cust WHERE customer_id=" + id; //Создание запроса
            ResultSet rs=statement.executeQuery(query);

            rs.next();
            Customers obj=new Customers(rs.getInt("customer_id"), rs.getString("first_name"), rs.getString("last_name"),
                    rs.getString("brith_date"), rs.getInt("age"), rs.getString("gender"), rs.getInt("phone"),
                    rs.getString("email"), rs.getString("city"), rs.getString("street"), rs.getInt("building"));

            System.out.println("Вывод Customers");
            System.out.println(obj);
            return obj;

        }catch (Exception e){
            System.out.println(e);
            return null;
        }

    }

    public static String createCustomers(String first_name, String last_name,
                                         String birth_date, int age, String gender,
                                         int phone, String email, String city,
                                         String street, int building){
        String query="INSERT INTO cust(first_name, last_name, brith_date, age," +
                "gender, phone, email, city, street, building) values('"+first_name+"','"+last_name+"', '"+birth_date+"','"+age+"','"+gender+"','"+phone+"', '"+
                email+"','"+city+"','"+street+"','"+building+"');";
        System.out.println("Cоздание новой строки");
        return query;
    }


    public static String deleteCustomers(int id){
        String query="delete from cust where customer_id="+id;
        System.out.println("Удаление строки");
        return query;
    }

    public static String updateCustomers(String first_name, String last_name,
                                         String birth_date, int age, String gender,
                                         int phone, String email, String city,
                                         String street, int building, int customer_id){
        String query="UPDATE cust SET ";
        if(first_name!="")query+="first_name=\""+first_name+"\"";
        if(first_name!="")query+="last_name=\""+last_name+"\"";
        if(birth_date!="")query+="brith_date=\""+birth_date+"\"";
        if(age!=0)query+="age=\""+age+"\"";
        if(gender!="")query+="gender=\""+gender+"\"";
        if(phone!=0)query+="phone=\""+phone+"\"";
        if(email!="")query+="email=\""+email+"\"";
        if(city!="")query+="city=\""+city+"\"";
        if(street!="")query+="street=\""+street+"\"";
        if(building!=0)query+="building=\""+building+"\"";
        query+=" WHERE customer_id="+customer_id;
        System.out.println("Преобразование строки");
        return query;

    }
}
