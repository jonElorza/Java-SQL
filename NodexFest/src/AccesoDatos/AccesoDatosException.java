package AccesoDatos;

import java.sql.SQLException;

@SuppressWarnings("serial")
public class AccesoDatosException extends RuntimeException {

	public AccesoDatosException(String string, SQLException e) {
		
	}

	public AccesoDatosException(String string, Exception e) {
		
	}

	public AccesoDatosException() {
		super();
		
	}

	public AccesoDatosException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public AccesoDatosException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public AccesoDatosException(String arg0) {
		super(arg0);
		
	}

	public AccesoDatosException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
