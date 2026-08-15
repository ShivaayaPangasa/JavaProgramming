package Module1.Q44_FinalClassMethod;

public class FinalClassMethod {
    public static void main(String[] args){
        ReportService report = new ReportService();
        report.connect(); //BaseService class- connect() final method
        report.generateReport(); //ReportService class (child of BaseService class) - generateReport() method

        SystemUtility utility = new SystemUtility();
        utility.displayVersion();
    }
    
}
// final method → child class CANNOT override that method

// final class → another class CANNOT extend/inherit that class