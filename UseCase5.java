public class UseCase5 {
    UseCase4 useCase4 = new UseCase4();
    private String company;
    private int empRatePerHr;
    private int numOfWorkingDays;
    private int maxHrsPerMonth;

    void addCompany(String company,int empRatePerHr,int numOfWorkingDays,int maxHrsPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
        System.out.println("For " + company);
        useCase4.totalEmpWage(company,empRatePerHr,numOfWorkingDays,maxHrsPerMonth);
  
    }
}
