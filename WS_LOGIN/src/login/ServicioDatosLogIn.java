package login;

public class ServicioDatosLogIn {
	public boolean datosUsr (String usr, String pass, String host){
		Datos_Login datos = new Datos_Login();
		return datos.regresarDatos(usr, pass, host);
	}

}
