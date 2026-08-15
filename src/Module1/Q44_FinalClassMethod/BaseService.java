package Module1.Q44_FinalClassMethod;

public class BaseService {

    public final void connect(){ //final method - cannot override
        System.out.println("Connected Securely");
    }
    
}

/* 

public - other classes/objects can call it

final -  child classes CANNOT override this method

void - method returns nothing

connect - method name

() - takes no parameters

*/