package pl.hartel.firstapp;

import org.springframework.stereotype.Component;

@Component
public class CountService {

    public int count(String word){
        return word.length();
    }
}