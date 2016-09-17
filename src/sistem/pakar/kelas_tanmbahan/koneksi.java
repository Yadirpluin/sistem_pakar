/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.pakar.kelas_tanmbahan;
import com.mysql.jdbc.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Ncef
 */
public class koneksi {
public Connection conn;
public Statement st;
public ResultSet rs; 
public void setkoneksi()
{
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/sdt","root","");
        st=conn.createStatement();
    }
   
   
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"<Error> Koneksikan Xampp Terlebih Dahulu : "+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
    }
}
}
