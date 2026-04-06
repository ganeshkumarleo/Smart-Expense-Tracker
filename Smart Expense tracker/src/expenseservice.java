import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class expenseservice{

    private static final double MONTHLY_BUDGET= 5000.0;

    public void checkBugdetstatus(){

        String query="select sum(amount)from expenses";

        try(Connection conn = Dbconnection.getConnection();

        PreparedStatement pstmt=conn.prepareStatement(query);

        ResultSet rs=pstmt.executeQuery()){

        
        if(rs.next()){

            double totalspent = rs.getDouble(1);
            double thresold= MONTHLY_BUDGET*0.8;

           
         System.out.println("-------------------------");
         System.out.println("TOTAL SPENT:"+totalspent);  
         if(totalspent >= MONTHLY_BUDGET){
                System.out.println("ALERT:YOU HAVE EXCEEDED YOUR BUDGET OF $"+ MONTHLY_BUDGET);
            }
            else if(totalspent >= thresold){

                System.out.println("warning:you have reached 80% of your budget!");
            }
            else{
                 System.out.println("safe: you are within your budget:");
            }
            System.out.println("-------------------------------");
        }
    }
        catch(Exception e){
              System.out.println("error checking budget:"+e.getMessage()); 
        }
    }
}