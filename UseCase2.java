public class UseCase2 {

     int UseCase2() {
         UseCase1 presentOrNot = new UseCase1();
         float attendance = presentOrNot.presentOrNot(); // for checking present absent or part-time
         int empPresent;
         if (attendance > 0.4){
             empPresent = 1; // present
         }
         else {
             empPresent = 2; // absent
         }
    return empPresent;
    }
}
