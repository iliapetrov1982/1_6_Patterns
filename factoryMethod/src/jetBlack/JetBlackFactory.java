package jetBlack;

import abstracts.Button;
import abstracts.GuiFactory;
import abstracts.ScrollBar;
import abstracts.TextArea;

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
