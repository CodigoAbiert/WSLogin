package login;

public class Datos_Login {
	
	public boolean correcto;

	public boolean isCorrecto() {
		return correcto;
	}

	public void setCorrecto(boolean correcto) {
		this.correcto = correcto;
	}
	
	public boolean regresarDatos(String usr, String pass, String host){
		Coneccion con = new Coneccion();
		sqlQuery sql = new sqlQuery(con.getConnectionAdmin());
		setCorrecto(sql.log_In("select * from gev_login('"+usr+"', '"+pass+"', '"+host+"', '"+host+"', 2004, '', '1.11.0', '0', '0')"));
		return correcto;
	}
}
