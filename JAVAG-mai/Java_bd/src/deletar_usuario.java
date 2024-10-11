
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macar
*/
public class deletar_usuario {
    public static String deletar_usuario(String[] usuario){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/Restaurante";
            String username = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, username, password);
            
            Statement st = con.createStatement();
            
            String sql = "delete from " + usuario[0] + " where " + usuario[1] + "=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            if(usuario[3].equals("id")){
                stmt.setInt(1, Integer.parseInt(usuario[2]));
                stmt.execute();
                return "usuario deletado com sucesso";
            }
            if(usuario[1].equals("nome")){
                stmt.setString(1, usuario[2]);
                stmt.execute();
                return "usuario deletado com sucesso";
            }
        
            
            
            con.close();
            return "Erro";
        }
        catch(Exception e) {
            System.out.println(e);
            return "erro ao deletar";
        }
    }
}