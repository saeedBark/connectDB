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

              Personne persone = new Personne("amir", "akram", 55, 74.3);


              insertPersonne(connection, persone);



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

    private static void insertPersonne(Connection connection, Personne personne) throws SQLException {
        String insertQuery = "INSERT INTO `personne` (`id`, `nom`, `prenom`, `age`, `taille`) VALUES (NULL, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

        preparedStatement.setString(2, personne.getPrenom());
        preparedStatement.setInt(3, personne.getAge());
        preparedStatement.setDouble(4, personne.getTaille());

        preparedStatement.executeUpdate();

        preparedStatement.close();
    }
}
