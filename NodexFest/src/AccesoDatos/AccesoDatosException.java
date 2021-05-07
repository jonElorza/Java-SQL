package AccesoDatos;

import java.sql.SQLException;

public class AccesoDatosException extends RuntimeException {

	public AccesoDatosException(String string, SQLException e) {
		// TODO Auto-generated constructor stub
	}

	public AccesoDatosException(String string, Exception e) {
		// TODO Auto-generated constructor stub
	}

	public AccesoDatosException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccesoDatosException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public AccesoDatosException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public AccesoDatosException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public AccesoDatosException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
