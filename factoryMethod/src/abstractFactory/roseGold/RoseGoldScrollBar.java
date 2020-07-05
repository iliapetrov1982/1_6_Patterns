package abstractFactory.roseGold;

import abstractFactory.abstracts.ScrollBar;

public class RoseGoldScrollBar extends ScrollBar {
    @Override
    public void scrollTo(int i) {
        System.out.println("RoseGold scrolling to " + i);
    }
}
