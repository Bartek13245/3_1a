import java.io.IOException;

class Main {
  
  public static void main(String[] args) {
   int option=0;
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
   
      while(option!=5)
        {
             Scanner scan =new Scanner(System.in);
           System.out.println("1. Dodaj Studenta: ");
           System.out.println("2. Wypisz Studenta: ");
           System.out.println("5. WYJSCIE Z PROGRAMU: ");
          option=scan.nextInt();
          
          
    switch (option)
      {
      case 1:
          {
          case1();
            System.out.println("Dodano studenta,powrot do menu");
            break;
            
            
          }
        case 2:
          {
            
          }
          private static void case1() throws I0Exception {
            Scanner scanner=new Scanner(System.in);
          System.out.println("Podaj imie studenta: ");
          String Imie = scanner.nextLine();
           System.out.println("Podaj wiek studenta: ");
          int Wiek = scanner.nextInt();
          Service1 s = new Service1();
          s.addStudent(new Student (Imie,Wiek));
          
          
            
            
      }
          }
    } catch (IOException e) {

    }
    
  }
}