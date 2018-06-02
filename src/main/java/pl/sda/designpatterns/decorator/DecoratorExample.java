package pl.sda.designpatterns.decorator;

import pl.sda.designpatterns.decorator.affix.IngSuffix;
import pl.sda.designpatterns.decorator.affix.UnPrefix;
import pl.sda.designpatterns.decorator.words.Do;
import pl.sda.designpatterns.decorator.words.Fuck;
import pl.sda.designpatterns.decorator.words.Word;

public class DecoratorExample {
    public static void main(String[] args) {
        Word word = new UnPrefix(new IngSuffix(new Do()));
        System.out.println(word.display());
        Word curseWord = new UnPrefix(new IngSuffix(new UnPrefix(new IngSuffix(new Fuck()))));
        System.out.println(curseWord.display());
    }
}
