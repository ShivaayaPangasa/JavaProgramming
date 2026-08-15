package Module1.Q17_Identifiers;

public class Identifiers {
    public static void main(String[] args) {

        IdentifierExamples example = new IdentifierExamples();

        example.showIdentifiers();
    }
}
//CamelCase for Variables/Methods: Start with a lowercase letter and capitalize the first letter of each subsequent word 
// (e.g., employeeSalary, calculateTotal).

//PascalCase for Classes/Interfaces: Capitalize every word, including the first one (e.g., InvoiceManager, UserSession).

//UPPER_CASE for Constants: Use all capital letters separated by underscores (e.g., MAX_RETRY_ATTEMPTS, PI).

//Avoid Isolated Underscores: Starting with Java 9, a single underscore _ is a keyword and cannot be used by itself as an identifier.