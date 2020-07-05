import abstracts.Button;
import abstracts.GuiFactory;
import abstracts.ScrollBar;
import abstracts.TextArea;
import jetBlack.JetBlackButton;
import jetBlack.JetBlackFactory;

import javax.swing.*;

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
