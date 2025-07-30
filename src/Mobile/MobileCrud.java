package Mobile;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;



public class MobileCrud {
	
	
	static Connection createConnection() throws SQLException
	{	
		String st = "jdbc:mysql://localhost:3306/Block28_day09";
		return DriverManager.getConnection(st, "root", "root");
		
	}
	
	static void closeConnection(Connection con)
	{
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	static void addMobile(Scanner sc) {
		  sc.nextLine();
	        System.out.print("Enter model number: ");
	        String modelNo = sc.nextLine();

	        System.out.print("Enter company: ");
	        String company = sc.nextLine();

	        System.out.print("Enter price: ");
	        int price = sc.nextInt();

	        System.out.print("Enter manufacturing date (YYYY-MM-DD): ");
	        
	        LocalDate mfgDate = LocalDate.parse(sc.next());
	        
	        
	        Connection con=null;
	        
	        try {
	        	con = createConnection();
	        	
	        	String query = "INSERT INTO mobile(model_no,company,price,MFGdate ) VALUES(?,?,?,?)";
				PreparedStatement st = con.prepareStatement(query);
				st.setString(1, modelNo);
				st.setString(2, company);
				st.setInt(3, price);
				st.setDate(4, Date.valueOf(mfgDate));
				
				int t = st.executeUpdate();
				
				if(t>0)
				{
					System.out.println("insert success");
				}
				else {
					System.out.println("not insert");
				}
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	        finally {
	        	closeConnection(con);
	        }
	        
	}
	
	
	static void updateMobile(Scanner sc) {
		  sc.nextLine();
	        System.out.print("which  model number you wnant please write down: ");
	        String modelNo = sc.nextLine();

	        System.out.print("Enter company: ");
	        String company = sc.nextLine();

	        System.out.print("Enter price: ");
	        int price = sc.nextInt();

	        System.out.print("Enter manufacturing date (YYYY-MM-DD): ");
	        
	        LocalDate mfgDate = LocalDate.parse(sc.next());
	        
	        
	        Connection con=null;
	        
	        try {
	        	con = createConnection();
	        	
//				String query = "INSERT INTO mobile(model_no,company,price,MFGdate ) VALUES('"+modelNo+"','"+company+"','"+price+"','"+mfgDate+"')";
				String update = "UPDATE mobile set company=?,price=?,MFGdate=?,where model_no=?";
				PreparedStatement st = con.prepareStatement(company);
				st.setString(1, company);
				st.setDouble(2, price);
				st.setDate(3, Date.valueOf(mfgDate));
				st.setString(4, modelNo);
				
				
				int t = st.executeUpdate();
				
				if(t>0)
				{
					System.out.println("insert success");
				}
				else {
					System.out.println("not insert");
				}
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	        finally {
	        	closeConnection(con);
	        }
	        
	}
	
	
	static void deleteMobile(Scanner sc) {
		  sc.nextLine();
	        System.out.print("Enter model number: ");
	        String modelNo = sc.nextLine();


	        
	        Connection con=null;
	        
	        try {
	        	con = createConnection();
	        	
				String query = "delete from mobile where model_no=?";
				PreparedStatement st = con.prepareStatement(query);
				st.setString(1, modelNo);
				
				int t = st.executeUpdate();
				
				if(t>0)
				{
					System.out.println("update success");
				}
				else {
					System.out.println("not update");
				}
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	        finally {
	        	closeConnection(con);
	        }
	}
	
	
	
	static void viewAllmobile(Scanner sc) {
		  
	        

	        
	        
	        Connection con=null;
	        
	        try {
	        	con = createConnection();
	        	
				
//				String query = "INSERT INTO mobile(model_no,company,price,MFGdate ) VALUES('"+modelNo+"','"+company+"','"+price+"','"+mfgDate+"')";
				String update = "select * from mobile order by price";
				PreparedStatement st = con.prepareStatement(update);
				
				
				
				ResultSet  t = st.executeQuery();
				
				
				while(t.next()) {
					System.out.println("id='"+t.getInt(1)+"',id='"+t.getString(2)+"'.id='"+t.getString(3)+"'.id='"+t.getInt(4)+"',id='"+t.getDate(5).toLocalDate()+"'");
					
				}
				
				
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	        finally {
	        	closeConnection(con);
	        }
	        
	}
	
	
	static void searchMobile(Scanner sc) {
		  
        
		sc.nextLine();
        System.out.print("Enter model number: ");
        String modelNo = sc.nextLine();
        
        
        Connection con=null;
        
        try {
        	con = createConnection();
        	
			

			String update = "select * from mobile where model_no =?";
			
			PreparedStatement st = con.prepareStatement(update);
			st.setString(1, modelNo);
			ResultSet  t = st.executeQuery();
			
			
			while(t.next()) {
				System.out.println("id='"+t.getInt(1)+"',modelno='"+t.getString(2)+"',company='"+t.getString(3)+"',price='"+t.getInt(4)+"',mfgdate='"+t.getDate(5).toLocalDate()+"'");
				
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
        finally {
        	closeConnection(con);
        }
        
}
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("1. Add Mobile");
	            System.out.println("2. Update the details using model_no ");
	            System.out.println("3. Delete mobile using model_no ");
	            System.out.println("4. view All mobile");
	            System.out.println("5.  search mobile no");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    addMobile(sc);
	                    break;

	                case 2:
	                    updateMobile(sc);
	                    break;

	                case 3:
	                    deleteMobile(sc);
	                    break;

	                case 4:
	                    viewAllmobile(sc);
	                    break;

	               case 5:
	                    searchMobile(sc);
	                    break;
	                case 0:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Please enter a valid choice.");
	            }
	        } while (choice != 0);
	    }
	
	
}
