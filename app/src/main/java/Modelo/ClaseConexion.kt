package Modelo

import java.sql.Connection
import java.sql.DriverManager

class ClaseConexion {

    fun cadenaConexion (): Connection? {

    try {

        val url = "jdbc:oracle:thin:@192.168.1.10:1521:xe"
        val usuario = "system"
        val contrasena = "godislove"
        val connection = DriverManager.getConnection(url,usuario, contrasena)
        return connection


    }catch (e: Exception){
        println("error: $e")
        return null
    }


    }
}