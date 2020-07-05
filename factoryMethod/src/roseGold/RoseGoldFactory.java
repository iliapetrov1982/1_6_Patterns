package roseGold;

import abstracts.Button;
import abstracts.GuiFactory;
import abstracts.ScrollBar;
import abstracts.TextArea;

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
