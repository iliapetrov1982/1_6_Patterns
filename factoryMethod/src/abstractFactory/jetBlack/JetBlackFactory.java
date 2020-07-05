package abstractFactory.jetBlack;

import abstractFactory.abstracts.Button;
import abstractFactory.abstracts.GuiFactory;
import abstractFactory.abstracts.ScrollBar;
import abstractFactory.abstracts.TextArea;

public class JetBlackFactory extends GuiFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new JetBlackScrollBar();
    }

    @Override
    public Button createButton() {
        return new JetBlackButton();
    }

    @Override
    public TextArea createTextArea() {
        return new JetBlackTextArea();
    }
}
