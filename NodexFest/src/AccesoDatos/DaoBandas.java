package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entidades.Bandas;

public class DaoBandas {
	private static final String URL = "jdbc:sqlite:SqLite";
	private static final String USUARIO = "";
	private static final String PASSWORD = "";

	private static final String SQL_SELECT = "SELECT id,nombre,pais,escenario,fecha FROM bandas";
	private static final String SQL_SELECT_ID = SQL_SELECT + "WHERE id=?";
	//private static final String SQL_INSERT = "INSERT INTO bandas (nombre,pais,escenario,fecha) VALUES(?,?)";

	private static Connection con = null;

	private static Connection obtenerConexion() {
		try {
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
		} catch (Exception e) {
			throw new AccesoDatosException("Te esta haciendo un error", e);
		}
		return con;
	}

	@SuppressWarnings("unused")
	public static ArrayList<Bandas> obtenerTodos() {
		try (Connection con = obtenerConexion();
				PreparedStatement ps = con.prepareStatement(SQL_SELECT);
				ResultSet rs = ps.executeQuery()) {

			ArrayList<Bandas> bandas = new ArrayList<>();

			while (rs.next()) {
				bandas.add (new Bandas(rs.getInt("id"), rs.getString("nombre"), rs.getString("pais"),
						rs.getString("escenario"), rs.getString("fecha")));
			}

			return bandas;
		} catch (SQLException e) {
			throw new AccesoDatosException("No se han podido obtener todos los registros", e);
		}

	}
	
	
	public static Bandas obtenerPorId(Integer id) {
		try (Connection con = obtenerConexion();
				PreparedStatement ps = con.prepareStatement(SQL_SELECT_ID);
				) {
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			Bandas banda = null;

			if (rs.next()) {
				banda = new Bandas(rs.getInt("id"), rs.getString("nombre"),rs.getString("pais"),rs.getString("escenario"),rs.getString("fecha"));
			}

			return banda;
		} catch (SQLException e) {
			throw new AccesoDatosException("No se han podido obtener el registro con id " + id, e);
		}
	}
}
