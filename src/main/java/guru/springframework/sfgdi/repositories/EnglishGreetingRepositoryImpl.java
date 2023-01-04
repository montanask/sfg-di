package guru.springframework.sfgdi.repositories;

/**
 * Created by Ihor Sukalin on 04.01.2023
 *
 * @author : Ihor Sukalin
 * date : 04.01.2023
 * project : sfg-di
 */

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
