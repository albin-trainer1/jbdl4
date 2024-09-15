package com.geek;
public class SingletonPattern {
public static void main(String[] args) {
	//only once connection obj to be created and it is shared to all clients
	DBConnection dbCon1= DBConnection.getConnection();
	DBConnection dbCon2= DBConnection.getConnection();
	System.out.println(dbCon1==dbCon2);
}
}
class DBConnection{
	private static DBConnection con=null;
	private DBConnection() {
		System.out.println("constructor ....");
	}
	 //factory method ....
	public  static DBConnection getConnection() {
		if(con==null) {
			synchronized (DBConnection.class) {
				if(con==null)
					con=new DBConnection();
			}
		}
		return con;
	}
}