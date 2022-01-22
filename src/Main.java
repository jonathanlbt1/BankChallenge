public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Banco do Brasil");

        bank.addBranch("Campinas");

        bank.addCustomer("Campinas", "Jonathan", 100.50);
        bank.addCustomer("Campinas", "John", 1765.20);
        bank.addCustomer("Campinas", "Sophie", 220.12);

        bank.addBranch("Aruja");
        bank.addCustomer("Aruja", "Sebastian", 199.9);

        bank.addCustomerTransaction("Campinas", "Jonathan", 39.29);
        bank.addCustomerTransaction("Campinas", "John", 14.29);
        bank.addCustomerTransaction("Campinas", "Sophie", 39.29);

        bank.listCustomer("Campinas", true);
        bank.listCustomer("Aruja", true);


}

}
