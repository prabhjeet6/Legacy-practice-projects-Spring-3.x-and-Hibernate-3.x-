
public class JDBCMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DBConnect dbc=new DBConnect();
      dbc.getCircle("2");
/*      to have jdbc connectivity with apache derby db, we add derby.jar
      & derbyclient.jar*/
	}

}
