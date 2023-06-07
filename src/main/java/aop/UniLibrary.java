package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook(){
        System.out.println("Мы берем книгу UniLibrary");
    }

    public void getJournal(){
        System.out.println("Мы берем журнал UniLibrary");
    }

    public String returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "OK";
    }
}
