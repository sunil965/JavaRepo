import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class JdbcTransation {

	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/AddressBook";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "password";
	
	public static void main(String[] args) throws Exception {
		
		Connection dbConnection = null;
		PreparedStatement preparedStatementInsert = null;
		PreparedStatement preparedStatementUpdate = null;

		String insertTableSQL = "insert into Registration"+ "(id, firstname, lastname, contact) values"+ "(?,?,?,?)";
		String updateTableSQL = "update Registration set firstname =? "+ "where id = ?";
		try {
			dbConnection = getDBConnection();

			dbConnection.setAutoCommit(false);

//			Savepoint savepoint1 = conn.setSavepoint("Savepoint1");
			preparedStatementUpdate = (PreparedStatement) dbConnection.prepareStatement(updateTableSQL);
			preparedStatementUpdate.setString(1, "Ashok");
			preparedStatementUpdate.setInt(2, 117);
			preparedStatementUpdate.executeUpdate();
			
			preparedStatementInsert = (PreparedStatement) dbConnection.prepareStatement(insertTableSQL);
			preparedStatementInsert.setString(1, "a"); 	// THIS LINE WILL STOP FROM DATA INSERTION TO DB.
			preparedStatementInsert.setString(2, "Chandan");
			preparedStatementInsert.setString(3, "Shayam");
			preparedStatementInsert.setInt(4, 702189976);
			preparedStatementInsert.executeUpdate();

			dbConnection.commit();
			System.out.println("Done!");

		} catch (SQLException e)
		{
			System.out.println(e.getMessage());
//			dbConnection.rollback(savepoint1);
			dbConnection.rollback();
		} 
	}

	private static Connection getDBConnection() throws Exception
	{
		Class.forName(DB_DRIVER);

		Connection dbConnection = (Connection) DriverManager.getConnection(DB_CONNECTION, DB_USER,	DB_PASSWORD);
			return dbConnection;
	}

}
