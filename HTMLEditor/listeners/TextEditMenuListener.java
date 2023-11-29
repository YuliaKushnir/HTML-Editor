package HTMLEditor.listeners;

import HTMLEditor.View;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;

public class TextEditMenuListener implements MenuListener {
    private View view;

    public TextEditMenuListener(View view) {this.view = view; }

    @Override
    public void menuSelected(MenuEvent menuEvent) {
        JMenu source = (JMenu) menuEvent.getSource();
        Component[] menuComponents = source.getMenuComponents();
        for(Component component : menuComponents) {
            component.setEnabled(view.isHtmlTabSelected());
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {}

    @Override
    public void menuCanceled(MenuEvent e) {}
}
