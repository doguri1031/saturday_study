package review2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrinterManager {
   List<Printer> printerList;
   //Printer p = new Printer();
   Scanner sc = new Scanner(System.in);
   

   public PrinterManager() {
      printerList = new ArrayList<Printer>();
   }
   
   
   public boolean insertPrinter(Printer s) {
      
      for(int i = 0; i<printerList.size();i++){
         if(s.getId().equals(printerList.get(i).getId()))
            return false;
      }

      printerList.add(s);
         return true;
   }
   
   
   public Printer findPrinter(String id) {
      for(int i = 0;i<printerList.size();i++){
         if(id.equals(printerList.get(i).getId())){
            return printerList.get(i); 
         
         }
      } return null;   
   }

   public boolean deletePrinter(String id) {
      for(int i = 0;i<printerList.size();i++){
         if(id.equals(printerList.get(i).getId())){   
            System.out.print("정말 삭제 하시겠습니까?");
            System.out.print("삭제 하시려면 y를 입력하시요");
            String sn = sc.next();
            if(sn.equals("Y")||sn.equals("y")){
               printerList.remove(i);
               }
               return true;         
         }
      } return false;
   }

   public void output() {
      if(printerList.size() > 0){
         for (int i = 0; i < printerList.size(); i++){
            System.out.println(printerList.get(i).toString());
         }
      }
   }
}