import java.sql.*;
class Insert{
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","yahwin","yahwin");
            Statement st=con.createStatement();
            st.addBatch("Insert into Student values(1,'yahwin')");
            st.addBatch("Insert into Student values(2,'jubin')");
            st.executeBatch();
            st.executeUpdate("Insert into Student values(3,'Sharvin')");
            st.executeUpdate("delete from student where name='yahwin'");
            PreparedStatement pst=con.prepareStatement("Insert into Student values(?,?)");
            pst.setInt(1,4);
            pst.setString(2,"Tom");
            pst.executeUpdate();
            CallableStatement cs=con.prepareCall("{call insert_student(?,?)}");
            cs.setInt(1,6);
            cs.setString(2,"albin");
            cs.execute();
            ResultSet res=st.executeQuery("select * from Student");
            while(res.next()){
                System.out.println(res.getInt(1)+"\t"+res.getString(2));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}