package ch18.lecture.p01iostream;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.*;

import org.junit.jupiter.api.*;

class ExceptionTest {

	@Test
	void test() {
		Controller con = new Controller();
//		con.call();
		Assertions.assertThrows(MySQLException.class, () -> con.call());
	}

	static class Controller {

		Service service = new Service();

		void call() {
			service.save();
		}
	}

	static class Service {

		Repository repository = new Repository();

		void save() {
			try {
				repository.call();
			} catch (SQLException e) {
				throw new MySQLException(e);
			}
		}
	}

	static class Repository {
		void call() throws SQLException {
			System.out.println("repository");
			throw new SQLException();
		}
	}

}

class MySQLException extends RuntimeException {

	public MySQLException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MySQLException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
