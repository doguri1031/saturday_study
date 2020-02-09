package review1;
import java.util.Scanner;

public class PrinterManager {
   Printer[] printerList;
   int printerCount = 0;
   //Printer p = new Printer();
   Scanner sc = new Scanner(System.in);
   

   public PrinterManager() {
      printerList = new Printer[50];
      
   }
   
   
   public boolean insertPrinter(Printer s) {
      
      for(int i = 0;i<printerCount;i++){
         if(s.getId().equals(printerList[i].getId()))
            return false;

      }


      printerList[printerCount++] = s;
         return true;
      
   }
   
   
   public Printer findPrinter(String id) {
      for(int i = 0;i<printerCount;i++){
         if(id.equals(printerList[i].getId())){
            return printerList[i]; 
         
         }
      } return null;   
   }

   public boolean deletePrinter(String id) {
      for(int i = 0;i<printerCount;i++){
         if(id.equals(printerList[i].getId())){   
            System.out.print("정말 삭제 하시겠습니까?");
            System.out.print("삭제 하시려면 y를 입력하시요");
            String sn = sc.next();
            if(sn.equals("Y")||sn.equals("y")){
               for(int j =i ;j<printerCount-1;i++){
               printerList[j]=printerList[j+1];
               }
               printerCount--;
               return true   ;         
            }
         }
      } return false;
   }

   public void output() {
      if(printerCount!=0){
         for (int i = 0; i < printerCount; i++){
            printerList[i].output();
         }
   
      
      }
   }

}