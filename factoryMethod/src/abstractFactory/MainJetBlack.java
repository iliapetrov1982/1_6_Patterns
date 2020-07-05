package abstractFactory;

import abstractFactory.abstracts.Button;
import abstractFactory.abstracts.GuiFactory;
import abstractFactory.abstracts.ScrollBar;
import abstractFactory.abstracts.TextArea;
import abstractFactory.jetBlack.JetBlackFactory;

public class MainJetBlack {
    private static GuiFactory guiFactory = new JetBlackFactory();

    public static void main(String[] args) {
    //    ab.ScrollBar scroll = new ab.ScrollBar();
    //    ab.Button button = new ab.Button();
    //    ab.TextArea textArea = new ab.TextArea();
    
        ScrollBar scrollBar = guiFactory.createScrollBar();
        Button button = guiFactory.createButton();
        TextArea textArea = guiFactory.createTextArea();

        scrollBar.scrollTo(100);
    }
}
