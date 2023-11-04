package serviceloaderexample;

import java.util.ServiceLoader;

public class ServiceLoaderExample {

    public static void main(String[] args) {

        ServiceLoader<Account> loader = new ServiceLoader.load(Account.class);
        Account acc = loader.iterator().next();
        System.out.println(acc.getType());
    }
    
}
