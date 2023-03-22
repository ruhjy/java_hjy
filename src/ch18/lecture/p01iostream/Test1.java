package ch18.lecture.p01iostream;

import java.io.*;
import java.sql.*;

public interface Test1 {
	
	void a() throws IOException;
	void b() throws SQLException ;
	void c() throws SQLClientInfoException;
	void d() throws ClassCastException;
}

class A implements Test1 {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b(){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void d() {
		// TODO Auto-generated method stub
		
	}

}
