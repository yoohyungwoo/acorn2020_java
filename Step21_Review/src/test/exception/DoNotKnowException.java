package test.exception;

public class DoNotKnowException extends Exception{
   //생성자
   public DoNotKnowException(String msg) {
      super(msg);
   }

}