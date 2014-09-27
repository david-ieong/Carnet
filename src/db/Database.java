package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Database connection handling
 * 
 * @author Virginie Collombon, David San
 */
public class Database {
	public static final String DEFAULT_DB_FILE = "default.db";
	public static final int BATCH_SAFE_LIMIT = 1000;

	static {
		try {
			Connection con = connect();
			Statement s = con.createStatement();
			s.execute("drop table if exists contacts");
			s.execute("create table contacts(id integer, firstname string, lastname string, email string)");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection connect(String filename) throws SQLException,
			ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		return DriverManager.getConnection("jdbc:sqlite:" + filename);
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