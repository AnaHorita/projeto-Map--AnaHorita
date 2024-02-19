package Posologia;


import Posologia.Posologia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PosologiaDAO {
     Connection conn;
    PreparedStatement st;
    ResultSet rs;
      ArrayList < Posologia> lista = new ArrayList();
    
     public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/map5","root", "senac2023ti");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
    }
     
      public int salvar(Posologia pos){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO posologia (medico,tratamento,medicamento,dosagem, data,hora)"+" VALUES(?,?,?,?,?,?)");
    
            st.setString(1, pos.getMedico());
            st.setString(2, pos.getTratamento());
            st.setString(3, pos.getMedicamento());
            st.setString(4, pos.getDosagem());
            st.setString(5, pos.getData());
            st.setString(6, pos.getHora());
            
      
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
      
      
     
      public ResultSet listarPosologia (){
         
         String sql = "SELECT * FROM cargo ORDER BY descricao_cargo;"; // qdo eu coloco o * eu represento todos os campos inseridos na tabela
         
         
            try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
     
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ListarPosologia"+erro);
            return null;
        }  
     } 
      
      
      
      
        public ArrayList<Posologia> PesquisarPosologia (){ // neste método as variáveis pstm,rs,lista esta no começo da
         //classe mas poderia estar aqui no método PesquisarFuncionario.
       
         String sql = " select * from funcionario";
       

         try {
             st = conn.prepareStatement(sql);
             rs = st.executeQuery();

             while (rs.next()) {
                 Posologia objfundto = new Posologia();
                 objfundto.setId(rs.getInt("id"));
                 objfundto.setMedico(rs.getString("medico"));
               objfundto.setTratamento(rs.getString("tratamento"));
                objfundto.setMedicamento(rs.getString("medicamento"));
                objfundto.setDosagem(rs.getString("dosagem"));
                objfundto.setData(rs.getString("data"));
                objfundto.setHora(rs.getString("hora"));
                
                 lista.add(objfundto);

             }

         } catch (SQLException erro) {

             JOptionPane.showMessageDialog(null, "FuncionarioDao Pesquisar" + erro);
         }
         return lista;
     }
 
      
        public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            //pode-se deixar vazio para evitar uma mensagem de erro desnecessária ao usuário
        }
    }
}
