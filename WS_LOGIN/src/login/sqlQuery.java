package login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class sqlQuery {
	Connection conexion;
    Statement sentencia;
    ResultSet resultado;
    Object [] datosLogIn = null;
    
    public sqlQuery (Connection con){
        conexion = con;
    }

    public boolean log_In(String cad_sql){
    	boolean correcto = false;
    	try{
    		sentencia=conexion.createStatement();
    		resultado = sentencia.executeQuery(cad_sql);
    		datosLogIn = new Object[6];
    		
    		while (resultado.next()){
    			datosLogIn[0] = resultado.getString("sesion");
    			datosLogIn[1] = resultado.getString("admusuario_id");
    			datosLogIn[2] = resultado.getString("paterno");
    			datosLogIn[3] = resultado.getString("materno");
    			datosLogIn[4] = resultado.getString("nombres");
    			datosLogIn[5] = resultado.getString("catcuenta_id");
    			correcto = true;
    		}
    	}catch (SQLException E){
    	}
    	for (int i=0; i<datosLogIn.length; i++){
    		System.out.println(datosLogIn[i].toString());
    	}
    	return correcto;
    }
}
