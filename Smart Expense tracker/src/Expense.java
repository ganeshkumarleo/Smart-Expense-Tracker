import java.time.LocalDate;

public class Expense{

    private int id;
    private String category;
    private double amount;
    private LocalDate date;
    private String description;

public Expense(){

      }
    public Expense(int id,String category,double amount,LocalDate date,String description){

        this.id = id;
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public int getId(){
        return id;
    }
    public void setInt(int id){
        this.id=id;
    }
      public String getCategory(){
        return category ;
    }
    public void setCategory(String  category){
        this.category= category;
    }
      public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
      public LocalDate getDate(){
        return date;
    }
    public void setDate(LocalDate date){
        this.date=date;
    }
      public String getDescription(){
        return description;
    }
    public void setDescription(String description){
     
        this.description=description;
    }
        @Override
          public String toString(){
            
            return "Expense [ID=" + id + ", category=" + category + ", amount=" + amount + ", date=" + date +"]";
        }
    }

