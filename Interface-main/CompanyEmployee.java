public class CompanyEmployee implements IEmployee,ICompanyEmployee{


    @Override
    public void work() {
        System.out.println("Şirkette çalışmaktadır");
    }

    @Override
    public void food() {
        System.out.println("Yemek hakkından yararlanabilir");
    }

    @Override
    public void salary() {
        System.out.println("Maaş hakkından yararlanabilir");
    }
}
