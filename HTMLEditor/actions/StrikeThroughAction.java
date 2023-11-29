package HTMLEditor.actions;

import javax.swing.*;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

public class StrikeThroughAction extends StyledEditorKit.StyledTextAction {
    public StrikeThroughAction() {
        super(StyleConstants.StrikeThrough.toString());
    }

    public void actionPerformed(ActionEvent actionEvent) {
        JEditorPane editor = getEditor(actionEvent);
        if(editor != null) {
            MutableAttributeSet mas = getStyledEditorKit(editor).getInputAttributes();
            SimpleAttributeSet sas = new SimpleAttributeSet();
            StyleConstants.setStrikeThrough(sas, !StyleConstants.isStrikeThrough(mas));
            setCharacterAttributes(editor, sas, false);
        }
    }

}
