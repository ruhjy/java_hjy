package ch18.lecture.p01iostream;

import static org.junit.Assert.assertThrows;

import java.sql.*;

import org.junit.jupiter.api.*;

class ExceptionTest2 {

	@Test
	void test() {
		Controller con = new Controller();

		assertThrows(SQLException.class, () -> con.call());
	}

	static class Controller {

		Service service = new Service();

		String call() throws SQLException {
			service.save();
			return "1";
		}
	}

	static class Service {

		Repository repository = new Repository();

		void save() throws SQLException {
			repository.call();
		}
	}

	static class Repository {
		void call() throws SQLException {
			throw new SQLException();
		}

	}

}

class MySQLException extends SQLException {

	public MySQLException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MySQLException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
