import java.sql.*;

public class ConnectBD {

    public static void main(String[] args) {

        try {

            String url = "jdbc:mysql://localhost/java_tp";
            String user = "root";
            String password = "";

            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();


            System.out.println("Connected");

            ResultSet result = statement.executeQuery("SELECT * from persone");

              while (result.next()){
                  System.out.println(result.getObject(1).toString());

                  System.out.println("|");

                  System.out.println(result.getObject("age").toString());
              }

             statement.executeUpdate("INSERT INTO `persone` (`id`, `nom`, `prenom`, `age`, `taill`) VALUES (NULL, 'amir', 'akram', '55', '74.3')");


            // Do something with the result set if needed
            System.out.println("ok");

            // Close resources
            result.close();
            statement.close();
            connection.close();

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
