import abstracts.Button;
import abstracts.GuiFactory;
import abstracts.ScrollBar;
import abstracts.TextArea;
import jetBlack.JetBlackFactory;
import roseGold.RoseGoldFactory;

public class MainRoseGold {
    private static GuiFactory guiFactory;

    public static void main(String[] args) {
        int style = 1;

        switch(style) {
            case 1:
                guiFactory = new JetBlackFactory();
                break;
            case 2:
                guiFactory = new RoseGoldFactory();
                break;
        }
    
        ScrollBar scrollBar = guiFactory.createScrollBar();
//        Button button = guiFactory.createButton();
//        TextArea textArea = guiFactory.createTextArea();

        scrollBar.scrollTo(100);
    }
}
