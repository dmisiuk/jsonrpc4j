package by.minsler;

import java.util.List;

/**
 * User: dzmitry.misiuk
 * Date: 11/14/12
 * Time: 3:49 PM
 */
public class    PrinterServiceImpl implements PrinterService{


    @Override
    public String printWord(String word) {
        System.out.println(word);
        return word;
    }

    @Override
    public String printUser(User user) {
        System.out.println(user);
        return user.toString();
    }

    @Override
    public StringBuilder printWordArray(List<String> words) {
        StringBuilder sb = new StringBuilder();
        for(String word:words){
            System.out.println(word);
            sb.append(word);
        }
        return sb;
    }

}