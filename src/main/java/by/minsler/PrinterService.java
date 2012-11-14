package by.minsler;

import java.util.List;

/**
 * User: dzmitry.misiuk
 * Date: 11/14/12
 * Time: 3:47 PM
 */
public interface PrinterService {

    String printWord(String word);


    StringBuilder printWordArray(List<String> words);
}
