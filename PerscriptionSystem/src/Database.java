import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Database {
	private String url = "jdbc:postgresql://localhost/PerscriptionSystem";
	private String user = "postgres";
	private String password = "Utukusii374!";
	
	public Connection connect() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
	
	// list all the compounds provided by a particular manufacturer
	public void listCompounds(int manufactureId) {
		String query = "SELECT * FROM Compound WHERE ManufacturerID = ?";
		
		try (Connection conn = connect();
			 PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setInt(1, manufactureId);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt("CompoundID") + "\t"
						+ rs.getString("BrandName") + "\t"
						+ rs.getDouble("Strength"));
			} 
		} catch (SQLException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	
	//list the details of all the distributors and manufacturers for a particular compound
	public void listDistributiorsForCompound(int compoundId) {
		String query = "SELECT D.* FROM Distributor D " + 
					   "JOIN Compound_Distributor CD on D.DistributorID = CD.DistributorID " +
				       "WHERE CD.CompoundID = ?";
		try (Connection conn = this.connect();
			 PreparedStatement pstmt = conn.prepareStatement(query)) {
			
			pstmt.setInt(1, compoundId);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println("DistributorID: " + rs.getInt("DistributorID") +
						", CompanyName: " + rs.getString("CompanyName") +
						", Address: " + rs.getString("Address"));
			}
		} catch (SQLException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void listManufacturersForCompound(int compoundId) {
	    String query = "SELECT M.* FROM Manufacturer M " +
	                   "JOIN Compound C ON M.ManufacturerID = C.ManufacturerID " +
	                   "WHERE C.CompoundID = ?";

	    try (Connection conn = this.connect();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        pstmt.setInt(1, compoundId);

	        ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            System.out.println("ManufacturerID: " + rs.getInt("ManufacturerID") +
	                               ", CompanyName: " + rs.getString("CompanyName") +
	                               ", Address: " + rs.getString("Address"));
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	//list detailed of a particular drug
	public void listDrugDetails(int drugId) {
	    String query = "SELECT * FROM Drug WHERE DrugID = ?";

	    try (Connection conn = this.connect();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        pstmt.setInt(1, drugId);

	        ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            System.out.println("DrugID: " + rs.getInt("DrugID") +
	                               ", Name: " + rs.getString("Name") +
	                               ", ChemicalFormula: " + rs.getString("ChemicalFormula") +
	                               ", MedicalAction: " + rs.getString("MedicalAction") +
	                               ", Classification: " + rs.getString("Classification"));
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	//list total number of drugs with details
	public void listTotalNumberOfDrugs() {
	    String query = "SELECT COUNT(*), Name, ChemicalFormula, MedicalAction FROM Drug GROUP BY Name, ChemicalFormula, MedicalAction";

	    try (Connection conn = this.connect();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            System.out.println("Count: " + rs.getInt(1) +
	                               ", Name: " + rs.getString("Name") +
	                               ", ChemicalFormula: " + rs.getString("ChemicalFormula") +
	                               ", MedicalAction: " + rs.getString("MedicalAction"));
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}

	//list compound and manufactures for drug
	public void listCompoundsAndManufacturersForDrug(int drugId) {
	    String query = "SELECT C.CompoundID, C.BrandName, C.Strength, M.CompanyName, M.Address " +
	                   "FROM Compound C " +
	                   "JOIN Manufacturer M ON C.ManufacturerID = M.ManufacturerID " +
	                   "WHERE C.DrugID = ?";

	    try (Connection conn = this.connect();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        pstmt.setInt(1, drugId);

	        ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            System.out.println("CompoundID: " + rs.getInt("CompoundID") +
	                               ", BrandName: " + rs.getString("BrandName") +
	                               ", Strength: " + rs.getDouble("Strength") +
	                               ", Manufacturer Name: " + rs.getString("CompanyName") +
	                               ", Manufacturer Address: " + rs.getString("Address"));
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}


	//list all allergic reaction mechanisms with corresponding allergy codes and drugs
	public void listAllergicReactions() {
	    String query = "SELECT A.AllergyCode, A.Mechanism, D.Name FROM Allergy A JOIN Drug_Allergy DA ON A.AllergyCode = DA.AllergyCode JOIN Drug D ON DA.DrugID = D.DrugID";

	    try (Connection conn = this.connect();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            System.out.println("AllergyCode: " + rs.getInt("AllergyCode") +
	                               ", Mechanism: " + rs.getString("Mechanism") +
	                               ", Drug Name: " + rs.getString("Name"));
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}

	//list all drug interactions for a particular drug
	public void listDrugInteractions(int drugId) {
	    String query = "SELECT I.Description FROM Interaction I JOIN Drug_Interaction DI ON I.InteractionID = DI.InteractionID WHERE DI.DrugID = ?";

	    try (Connection conn = this.connect();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        pstmt.setInt(1, drugId);

	        ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            System.out.println("Interaction Description: " + rs.getString("Description"));
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}

	//insert a new compound into the database
	public void insertNewCompound(String brandName, double strength, int drugId, int manufacturerId) {
	    String query = "INSERT INTO Compound (BrandName, Strength, DrugID, ManufacturerID) VALUES (?, ?, ?, ?)";

	    try (Connection conn = this.connect();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        pstmt.setString(1, brandName);
	        pstmt.setDouble(2, strength);
	        pstmt.setInt(3, drugId);
	        pstmt.setInt(4, manufacturerId);

	        int affectedRows = pstmt.executeUpdate();
	        if (affectedRows > 0) {
	            System.out.println("A new compound has been inserted.");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}

	//delete an existing drug from the database
	public void deleteDrug(int drugId) {
	    String query = "DELETE FROM Drug WHERE DrugID = ?";

	    try (Connection conn = this.connect();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        pstmt.setInt(1, drugId);

	        int affectedRows = pstmt.executeUpdate();
	        if (affectedRows > 0) {
	            System.out.println("Drug with ID " + drugId + " has been deleted.");
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}

	//update an existing drug with new allergy codes
	public void addAllergyToDrug(int drugId, int allergyCode) {
	    String query = "INSERT INTO Drug_Allergy (DrugID, AllergyCode) VALUES (?, ?)";

	    try (Connection conn = this.connect();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {

	        pstmt.setInt(1, drugId);
	        pstmt.setInt(2, allergyCode);

	        int affectedRows = pstmt.executeUpdate();
	        if (affectedRows > 0) {
	            System.out.println("Allergy code " + allergyCode + " added to drug with ID " + drugId);
	        }
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}

	
	public static void main(String[]args) {
		//case study 1
		Database app = new Database();
		System.out.println("List compounds");
		app.listCompounds(3);
		
		//case study 2
		System.out.println();
		System.out.println("List distributors for compound");
		app.listDistributiorsForCompound(7);
		
		//case study 3
		System.out.println();
		System.out.println("List manufacturers for compound");
		app.listManufacturersForCompound(8);
		
		//case study 4
		System.out.println();
		System.out.println("List drug detail");
		app.listDrugDetails(9);
		
		//case study 5
		System.out.println();
		System.out.println("Total number of drugs");
		app.listTotalNumberOfDrugs();
		
		//case study 6
		System.out.println();
		System.out.println("Total number of drugs");
		app.listTotalNumberOfDrugs();
		
		//case study 7
		System.out.println();
		System.out.println("list coupounds and manufactures for drug");
		app.listCompoundsAndManufacturersForDrug(8);
		
		//case study 8
		System.out.println();
		System.out.println("list allergic reactions");
		app.listAllergicReactions();
		
		//case study 9
		System.out.println();
		System.out.println("list drug interaction");
		app.listDrugInteractions(7);
		
		//case study 10
		System.out.println();
		System.out.println("insert new compoind");
		app.insertNewCompound("New Compound", 1.11, 7, 3);
	}
}


