package abstractFactory.jetBlack;

import abstractFactory.abstracts.ScrollBar;

public class JetBlackScrollBar extends ScrollBar {
    @Override
    public void scrollTo(int i) {
        System.out.println("JetBlack scrolling to " + i);
    }
}
