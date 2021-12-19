class UseCase4 {
    void totalEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {
        int totalWorkingDay = 1;
        int totalEmpHours = 0;
        int regularity = 0;

        int day = 1;
        while (totalWorkingDay <= numOfWorkingDays && totalEmpHours < maxHrsPerMonth && day <=30) {
            UseCase3 useCase3 = new UseCase3();
            int empHours = useCase3.empHour();
            if (empHours > 0){
                System.out.println("Day " + day +" Working day " + totalWorkingDay + " and Work of Employee Hours is : " + empHours);

                totalWorkingDay++;
                totalEmpHours += empHours;
            }
            else {
                System.out.println("Day " + day + " Employee is absent");
                regularity ++;
            }
            day ++;
        }
        System.out.println("Total Emp Hours is " + totalEmpHours);
        if (regularity > 10 && totalEmpHours < maxHrsPerMonth ){
            System.out.println("This Emp is not regular & he absent more than " + regularity + " days");
        }
        int totalWage =  totalEmpHours * empRatePerHr ;
        System.out.println("total wage for " + company + " is " + totalWage + "\n\n");
    }
}
