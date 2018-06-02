package pl.sda.designpatterns.decorator.affix;

import pl.sda.designpatterns.decorator.words.Word;

public abstract class AbstractWordDecorator implements Word {
    protected Word word;

    public AbstractWordDecorator(Word word) {
        this.word = word;
    }
}
