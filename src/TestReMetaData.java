import java.sql.*;
public class TestReMetaData {
    public static void main (String []arg){
        try{
            Connection con = DBManger.getConnection();
            DatabaseMetaData dbm = con.getMetaData();
            
            System.out.println(dbm.getConnection());
            System.out.println("getCatalogs :" + dbm.getCatalogs());
            System.out.println("getDataBaseProductName :" + dbm.getDatabaseProductName());
            System.out.println("getDataBaseProductVersion :" + dbm.getDatabaseProductVersion());
            
            ResultSet rs = dbm.getTables(null, null, null, new String[]{"TABLE"});
            System.out.println("All table");
            while(rs.next()){
                System.out.println(rs.getString(1) + "\t" + rs.getString(2)+"\t"+
                        rs.getString(3) + "\t" + rs.getString(4)
                        );
            }
        }catch(Exception ex){
            System.out.printf(null, ex);
        }
    }
}
