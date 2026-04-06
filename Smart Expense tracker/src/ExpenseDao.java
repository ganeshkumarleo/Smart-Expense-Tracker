import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ExpenseDao{

        public void addExpense(Expense expense){

            String query ="Insert into expenses(category,amount,expense_date,description)values(?,?,?,?)";
       
            try(Connection conn = Dbconnection.getConnection();

              PreparedStatement pstmt = conn.prepareStatement(query)){
            
                pstmt.setString(1,expense.getCategory());
                pstmt.setDouble(2,expense.getAmount());
                pstmt.setObject(3,expense.getDate());
                pstmt.setString(4,expense.getDescription());
            
                int rowsInserted=pstmt.executeUpdate();
        
                if(rowsInserted > 0){

                    System.out.println("expense added to database!");
                }
                
            }catch(SQLException e){
                System.out.println("error saving expense"+e.getMessage());
            }
        }
    }

