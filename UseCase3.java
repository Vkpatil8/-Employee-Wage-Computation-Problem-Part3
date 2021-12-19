public class UseCase3 {
    int empHour(){
        UseCase2 useCase2 = new UseCase2();
        int empPresent = useCase2.UseCase2(); // call

        int empHours = 0;
        if (empPresent == 1){  // emp is present
            int check = (int)((Math.random()*10) % 2);
            switch (check){
                case 0:
                    empHours = 8; // full time
                    break;
                case 1:
                    empHours = 4; // part-time
                    break;
            }
        }
        return empHours ;
    }
}