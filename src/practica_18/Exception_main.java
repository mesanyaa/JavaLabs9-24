package practica_18;

public class Exception_main {
    public static void main(String[] args) {
        Exception1 exp1 = new Exception1();
        exp1.exceptionDemo();
//      программа пытается выполнить деление на ноль, что приводит к исключению java.lang.ArithmeticException.
//      Это происходит потому, что деление на ноль в математике не определено и вызывает исключение.


//        После добавления try catch
//        Изменение кода с добавлением блока try-catch позволяет обрабатывать исключение внутри программы,
//                вместо того чтобы позволить ему вызвать сбой приложения. В блоке try программа попытается выполнить деление,
//        но если произойдет деление на ноль, она перехватит исключение ArithmeticException и выполнит код в блоке catch.
//        В данном случае, код в блоке catch выводит сообщение "Attempted division by zero".
    }
}
