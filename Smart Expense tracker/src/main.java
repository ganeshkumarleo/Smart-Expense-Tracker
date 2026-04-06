import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ExpenseDao dao= new ExpenseDao();

        expenseservice service= new expenseservice();

        System.out.println("----smart tracker expense");

        System.out.println("ENTER CATEGORY :Eg.food,rent");
        String cat=sc.nextLine();

        System.out.println("enter amount");
        double amt=sc.nextDouble();

        sc.nextLine();

        System.out.println("enter description");

        String desc=sc.nextLine();
        
        Expense newExpense = new Expense();

        newExpense.setCategory(cat);
        newExpense.setAmount(amt);
        newExpense.setDate(LocalDate.now());
        newExpense.setDescription(desc);
        dao.addExpense(newExpense);
        service.checkBugdetstatus();
        System.out.println("project executed successfully");
        sc.close();
    }
    
}
