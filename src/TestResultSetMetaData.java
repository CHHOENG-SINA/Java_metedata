import java.sql.*;
public class TestResultSetMetaData {
    public static void main (String []arg){
     
        try{
            Connection con = DBManger.getConnection();
            Statement sm = con.createStatement();
            String sql = "select * from tblstaff";
            ResultSet rs = sm.executeQuery(sql);
            ResultSetMetaData rm = rs.getMetaData();
            
            // field type 
            System.out.println("Coumn Type:" + rm.getColumnTypeName(1));
            System.out.println("Coumn Type:" + rm.getColumnTypeName(2));
            int col = rm.getColumnCount();
            for(int i=1;i<=col;i++)
                System.out.print(rm.getColumnName(i) + "\t");
             System.out.println();
             while(rs.next()){
                 for(int i = 1;i<=col;i++)
                     System.out.print(rs.getString(i).trim()+"\t");
                 System.out.println();
             }
            
        }catch(Exception ex){
            System.out.printf(null, ex);
        }
    }
}
