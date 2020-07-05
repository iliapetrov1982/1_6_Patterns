package abstractFactory.roseGold;

import abstractFactory.abstracts.Button;
import abstractFactory.abstracts.GuiFactory;
import abstractFactory.abstracts.ScrollBar;
import abstractFactory.abstracts.TextArea;

public class RoseGoldFactory extends GuiFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new RoseGoldScrollBar();
    }

    @Override
    public Button createButton() {
        return new RoseGoldButton();
    }

    @Override
    public TextArea createTextArea() {
        return new RoseGoldTexyArea();
    }
}
