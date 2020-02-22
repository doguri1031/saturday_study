package review2;

import java.util.Scanner;

public class PrinterUI {
   private Scanner sc = new Scanner(System.in); 
   private PrinterManager manager = new PrinterManager();

   public PrinterUI() {
      while (true) {
         printMainMenu();
         
         int menu = sc.nextInt();
         System.out.println();

         switch (menu) {
         case 1:
            insertPrinter();
            break;

         case 2:
            System.out.print("유저이름 입력 :");
            String id = sc.next();

            Printer find_p = manager.findPrinter(id);

            if (find_p == null) {
               System.out.println("등록된 정보가 없습니다");
            } else {
               manager.output();
            }
            break;

         case 3:
            System.out.print("삭제할 아이디 입력 :| ");
            String delete_id = sc.next();
            
            boolean delete_result = manager.deletePrinter(delete_id);

            if (delete_result) {
               System.out.println("삭제되었습니다.");
            } else {
               System.out.println("삭제에 실패했습니다.");
            }
            break;

         case 4:
            manager.output();
            break;

         case 9:
            System.exit(0);
            break;

         default:
         }
         System.out.println();
      }
   }

   public void insertPrinter() {

      Printer p = makePrinter();
      
      boolean result = manager.insertPrinter(p);
      

      if (result) {
         System.out.println("등록되었습니다.");
      } else {
         System.out.println("이미 등록되어 있는 데이터입니다.");
      }
   }

   public void printMainMenu() {
      System.out.println("****************************************");
      System.out.println("기능들");
      System.out.println("****************************************");
      System.out.println("****************************************");
      System.out.println("1.등록");
      System.out.println("2.검색");
      System.out.println("3.삭제");
      System.out.println("4.출력");
      System.out.println("9.종료");
      System.out.println("****************************************");
      System.out.print(" 값을 입력해 주세요 : ");
      
   }

   /**
    * <pre>
    * ｸﾅｰｳｺｯｼﾎﾅｰｺｸｵ蟾ﾎ ﾀﾔｷﾂｹﾞｾﾆ Printer ｰｴﾃｼｸｦ ｻｼｺﾇﾏｿｩ ｹﾝﾈｯﾇﾑｴﾙ.
    * @return ｻｼｺｵﾈ Printer ｰｴﾃｼ
    * </pre>
    */
   public Printer makePrinter() {
      
      String id           = getIdFromUser();            // ｾﾆﾀﾌｵ・
      String manufacturer = getManufacturerFromUser();   // ﾁｦﾁｶｻ・
      int price          = getPriceFromUser();         // ｰ｡ｰﾝ
      
      Printer p = new Printer(id, manufacturer, price);
      p.setId(id);
      p.setManufacturer(manufacturer);
      p.setPrice(price);
      return p;
   }

   /**
    * <pre>
    * ﾇﾁｸｰﾅﾍｱ・IDｸｦ ﾀﾔｷﾂｹﾞｴﾂｴﾙ.
    * @return ﾀﾔｷﾂｹﾞﾀｺ ｾﾆﾀﾌｵ・
    * </pre>
    */
   private String getIdFromUser() {
      System.out.print("유저명입력 :  ");
      
      String id = sc.next();
      return id;      
   }
   
   /**
    * <pre>
    * ﾇﾁｸｰﾅﾍｱ・ﾁｦﾁｶｻ・ﾀﾌｸｧﾀｻ ﾀﾔｷﾂｹﾞｴﾂｴﾙ.
    * @return ﾀﾔｷﾂｹﾞﾀｺ ﾁｦﾁｶｻ・
    * </pre>
    */
   private String getManufacturerFromUser() {
      System.out.print("기계명 입력 : ");
      String name = sc.next();
      return name;      
   }
   
   /**
    * <pre>
    * ｰ｡ｰﾝﾀｻ ﾀﾔｷﾂｹﾞｴﾂｴﾙ.
    * @return ﾀﾔｷﾂｹﾞﾀｺ ｰ｡ｰﾝ
    * </pre>
    */
   private int getPriceFromUser() {
      System.out.print("가격 입력 ");
      int price = sc.nextInt();
      return price;
   }
}