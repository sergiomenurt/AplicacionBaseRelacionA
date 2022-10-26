import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Aplicacion {

    public static void main(String[] args) {

        String codigo= JOptionPane.showInputDialog("Introduce el código del producto");
        String nombre= JOptionPane.showInputDialog("Introduce el nombre del producto");
        int prezo= Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio del producto"));



        try {

            Connection con2= Conexion();

            Statement secuencia = con2.createStatement();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static Connection Conexion() throws SQLException {

        String driver = "jdbc:postgresql:";
        String host = "//localhost:";
        String porto = "5432";
        String sid = "postgres";
        String usuario = "oracle";
        String password = "oracle";
        String url = driver + host+ porto + "/" + sid;
        Connection conn = DriverManager.getConnection(url,usuario,password);

        return conn;

    }

    public void insireProduto(){



    }

    public void listaProdutos(){


    }

    public void actualizaPre(){


    }

    public void eliminaProduto(){


    }





}
