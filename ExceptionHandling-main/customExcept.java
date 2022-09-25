public class Main {

    public static void main(String[] args) {
	// throw yani hata fırlatma karşı kullanıcıya oluşabilecek hata durumunda try catchi karşı tarafın yapmasını sağlama
        // böylece belirli aksiyonlara göre hata şekillenir

        AccountManager accountManager=new AccountManager();
        System.out.println("Başlangıc bakiyesi: "+accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Şuan ki bakiye: "+accountManager.getBalance());
        try {
            accountManager.withdraw(90);
        } catch (BalanceInsuficcentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Şuan ki bakiye: "+accountManager.getBalance());
        try{
            accountManager.withdraw(20);
        }catch (BalanceInsuficcentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Şuan ki bakiye: "+accountManager.getBalance());
    }
}
