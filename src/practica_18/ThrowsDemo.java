package practica_18;

public class ThrowsDemo {
//    public void getDetails(String key) {
//        try {
//            if (key == null) {
//                throw new NullPointerException("null key in getDetails");
//            }
//        } catch (NullPointerException e){
//            System.out.println("Exception caught");
//        }
//    }
public void printMessage(String key) {
//    String message = getDetails(key);
//    System.out.println( message );

    String message;
    try {
        message = getDetails(key);
    } catch (NullPointerException e) {
        message = "An error occurred: " + e.getMessage();
    }
    System.out.println(message);
}
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key; }
}
