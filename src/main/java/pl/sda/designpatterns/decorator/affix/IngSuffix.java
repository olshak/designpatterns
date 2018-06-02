package pl.sda.designpatterns.decorator.affix;

import pl.sda.designpatterns.decorator.words.Word;

public class IngSuffix extends AbstractWordDecorator {
    public IngSuffix(Word word) {
        super(word);
    }

    @Override
    public String display() {
        return word.display() + "ing";
    }
}
