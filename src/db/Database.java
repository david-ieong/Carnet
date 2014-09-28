package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import domain.Messages;


/**
 * Database connection handling
 * 
 * @author Virginie Collombon, David San
 */
public class Database {
	public static final String DEFAULT_DB_FILE = "carnet";
	public static final int BATCH_SAFE_LIMIT = 1000;

	static {
		try {
			Connection con = connect();
			Statement s = con.createStatement();
			//s.execute("drop table if exists contacts");
			s.execute("CREATE TABLE if not exists contacts(id integer, firstname VARCHAR(20), lastname VARCHAR(20), email VARCHAR(20))");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection connect(String filename) throws SQLException,
			ClassNotFoundException {
		Class.forName(Messages.getString("driver"));
		return DriverManager.getConnection(Messages.getString("database") + filename, 
			Messages.getString("username"), Messages.getString("password"));
	}

	public static Connection connect() throws SQLException,
			ClassNotFoundException {
		return connect(DEFAULT_DB_FILE);
	}

	public static Connection connectRAM() throws SQLException,
			ClassNotFoundException {
		return connect(":memory:");
	}

}