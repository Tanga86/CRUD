
import java.sql.Connection;
import java.sql.Statement;

public class main {
    public static void main(String[] args){

        try (Connection connection=Connect.FullConnected()){

            if (connection!=null) {
                Statement statement = connection.createStatement();


                //create customer
                statement.executeUpdate(CRUDcustomers.createCustomers("Tony", "Gibson", "1989.12.09", 19, "M", 345678,"vox15v@",
                        "Ura", "Lenina", 3));

                //delete customer
                statement.executeUpdate(CRUDcustomers.deleteCustomers(5));

                //update customer
                statement.executeUpdate(CRUDcustomers.updateCustomers("", "", "", 0,
                        "", 0, "", "Moscow", "", 0, 1));

                //get customer
                CRUDcustomers.getCustomer(6);


            }
        }catch (Exception e){
            System.out.println(e);

        }
    }
}

