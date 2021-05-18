package test.main;

import java.util.Random;

import test.exception.DoNotKnowException;
import test.exception.HungryException;

public class MainClass {
   public static void main(String[] args) {
      //공부하는 메소드 
      play();
      try {
         study();
      } catch (DoNotKnowException e) {
         e.printStackTrace();
         System.out.println("구라쌤한테 질문해야지~~~");
      }
      System.out.println("main 메소드가 정상 종료 됩니다.");
   }
   //노는 메소드 
   public static void play() {
      Random ran=new Random();
      int ranNum=ran.nextInt(3);
      if(ranNum==0) {
         throw new HungryException("아! 배고파~~~~");
      }
      System.out.println("다 놀았습니다.");
   }
   //공부하는 메소드
   public static void study() throws DoNotKnowException {
      Random ran=new Random();
      int ranNum=ran.nextInt(3);
      if(ranNum==0) {
         throw new DoNotKnowException("오매 너무 어렵네 ㄷ ㄷ");
      }
      System.out.println("공부를 마쳤습니다.");
   }
}



