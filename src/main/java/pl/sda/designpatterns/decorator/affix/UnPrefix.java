package pl.sda.designpatterns.decorator.affix;

import pl.sda.designpatterns.decorator.words.Word;

public class UnPrefix extends AbstractWordDecorator {
    public UnPrefix(Word word) {
        super(word);
    }

    @Override
    public String display() {
        return "un" + word.display();
    }
}
