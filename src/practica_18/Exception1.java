package practica_18;

public class Exception1 {
//        public void exceptionDemo() {
//            System.out.println(2.0 / 0.0);
////            Изменение выражения с 2/0 на 2.0 / 0.0 не изменит суть проблемы. Деление на ноль все равно недопустимо в математике и в Java,
////                    и это вызовет ту же java.lang.ArithmeticException.
////                    В данном случае, результат будет бесконечностью (Infinity).
//        }
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}
