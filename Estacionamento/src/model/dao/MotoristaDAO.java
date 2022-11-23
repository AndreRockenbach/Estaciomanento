
package model.dao;

    import model.bean.Motorista;
    import connection.ConnectionFactory;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;
    import java.sql.ResultSet;
    import java.util.List;
    import java.util.ArrayList;


public class MotoristaDAO {
    public void create(Motorista m){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
              stmt = con.prepareStatement ("INSERT INTO motorista (nomeCompleto, genero, rg, cpf, celular, email, senha) VALUES (?,?,?,?,?,?,?)");
              stmt.setString (1, m.getNomeCompleto());
              stmt.setString(2, m.getGenero());
              stmt.setString(3, m.getRg());
              stmt.setString(4, m.getCpf());
              stmt.setString(5, m.getCelular());
              stmt.setString(6, m.getEmail());
              stmt.setString(7, m.getSenha());
              
              stmt.executeUpdate();
              JOptionPane.showMessageDialog (null, "Motorista salva com sucesso!");
        }catch (SQLException e){
              JOptionPane.showMessageDialog (null, "Erro ao salvar: " + e);
        }finally{
        ConnectionFactory.closeConnection (con, stmt);
        } 


}

public List<Motorista> read(){
 Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null; 
    List<Motorista> motorista = new ArrayList<>();
    try{
     stmt = con.prepareStatement ("SELECT * FROM motorista;");
     rs = stmt.executeQuery();
     while (rs.next()){
         Motorista m = new Motorista();
         m.setIdMotorista(rs.getInt("IdMotorista"));
         m.setNomeCompleto (rs.getString ("NomeCompleto"));
         m.setGenero (rs.getString ("Genero"));
         m.setRg (rs.getString ("Rg"));
         m.setCpf (rs.getString ("Cpf"));
         m.setCelular (rs.getString ("Celular"));
         m.setEmail (rs.getString ("Email"));
         m.setSenha (rs.getString ("Senha"));
  
         motorista.add (m);
     }
     }catch (SQLException e){
         throw new RuntimeException ("Erro ao buscar os dados: ", e);   
     }finally{
         ConnectionFactory.closeConnection (con, stmt, rs);
     }
     return motorista;

}

    public void delete (Motorista m){
       Connection con = ConnectionFactory.getConnection ();
       PreparedStatement stmt = null;
       
            try{
            stmt = con.prepareStatement ("DELETE FROM motorista WHERE IdMotorista=?");
            stmt.setInt(1, m.getIdMotorista ());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog (null, "Motorista excluída com sucesso!");
            }catch(SQLException e){
            JOptionPane.showMessageDialog (null, "Erro ao excluir: " + e);
            }finally{
            ConnectionFactory.closeConnection(con, stmt);
            }
}

    public Motorista read (int idMotorista){
       Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Motorista m = new Motorista ();
            try{
              stmt = con.prepareStatement ("SELECT * FROM motorista WHERE IdMotorista=? LIMIT 1;");
              stmt.setInt (1, idMotorista);
              rs = stmt.executeQuery();
              if (rs != null && rs.next()){
                  m.setIdMotorista(rs.getInt("IdMotorista"));
                  m.setNomeCompleto (rs.getString ("NomeCompleto"));
                  m.setGenero (rs.getString ("Genero"));
                  m.setRg (rs.getString ("Rg"));
                  m.setCpf (rs.getString ("Cpf"));
                  m.setCelular (rs.getString ("Celular"));
                  m.setEmail (rs.getString ("Email"));
                  m.setSenha (rs.getString ("Senha"));
              }

        }catch (SQLException e) {
            throw new RuntimeException ("Erro ao buscar os dados", e);
        }finally{
            ConnectionFactory.closeConnection (con, stmt,rs);
        }
        return m;
        }

    public void update (Motorista m){
          Connection con = ConnectionFactory.getConnection();
          PreparedStatement stmt = null;
               try{
                  stmt = con.prepareStatement ("UPDATE motorista SET NomeCompleto=?, Genero=?, Rg=?, Cpf=?, Celular=?, Email=?, Senha=? WHERE idMotorista=?");
                  stmt.setString (1, m.getNomeCompleto ());
                  stmt.setString (2, m.getGenero());
                  stmt.setString (3, m.getRg());
                  stmt.setString (4, m.getCpf());
                  stmt.setString (5, m.getCelular());
                  stmt.setString (6, m.getEmail());
                  stmt.setString (7, m.getSenha());
                  stmt.setInt (8, m.getIdMotorista());
                  stmt.executeUpdate();
                  JOptionPane.showMessageDialog(null, "Motorista atualizada com sucesso!");

               }catch (SQLException e) {
                  JOptionPane.showMessageDialog (null, "Erro ao atualizar: " + e); 
               }finally{
                  ConnectionFactory.closeConnection (con, stmt);
               }
        }

}