package jetBlack;

import abstracts.ScrollBar;

public class JetBlackScrollBar extends ScrollBar {
    @Override
    public void scrollTo(int i) {
        System.out.println("JetBlack scrolling to " + i);
    }
}
