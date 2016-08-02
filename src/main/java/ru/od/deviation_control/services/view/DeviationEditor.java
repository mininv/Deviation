package ru.od.deviation_control.services.view;


import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.event.ShortcutAction;
import com.vaadin.server.FontAwesome;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import ru.od.deviation_control.services.domain.Deviation;
import org.springframework.beans.factory.annotation.Autowired;
import ru.od.deviation_control.services.repositories.DeviationRepository;

@SpringComponent
@UIScope
public class DeviationEditor extends VerticalLayout {

    private final DeviationRepository repository;
    private Deviation deviation;


    TextField description = new TextField("Description");
    TextField placeOfAppear = new TextField("Place of Appear");

    Button save = new Button("Save", FontAwesome.SAVE);
    Button cancel = new Button("Cancel");
    Button delete = new Button("Delete", FontAwesome.TRASH_O);
    CssLayout actions = new CssLayout(save, cancel, delete);

    @Autowired
    public DeviationEditor(DeviationRepository repository) {
        this.repository = repository;

        addComponents(description, placeOfAppear, actions);

        // Configure and style components
        setSpacing(true);
        actions.setStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
        save.setStyleName(ValoTheme.BUTTON_PRIMARY);
        save.setClickShortcut(ShortcutAction.KeyCode.ENTER);

        // wire action buttons to save, delete and reset
        save.addClickListener(e -> repository.save(deviation));
        delete.addClickListener(e -> repository.delete(deviation));
        cancel.addClickListener(e -> editDeviation(deviation));
        setVisible(false);
    }

    public interface ChangeHandler {

        void onChange();
    }

    public final void editDeviation(Deviation c) {
        final boolean persisted = c.getId() != null;
        if (persisted) {
            // Find fresh entity for editing
            deviation = repository.findOne(c.getId());
        }
        else {
            deviation = c;
        }
        cancel.setVisible(persisted);

        // Bind customer properties to similarly named fields
        // Could also use annotation or "manual binding" or programmatically
        // moving values from fields to entities before saving
        BeanFieldGroup.bindFieldsUnbuffered(deviation, this);

        setVisible(true);

        // A hack to ensure the whole form is visible
        save.focus();
        // Select all text in firstName field automatically
        description.selectAll();
    }

    public void setChangeHandler(ChangeHandler h) {
        // ChangeHandler is notified when either save or delete
        // is clicked
        save.addClickListener(e -> h.onChange());
        delete.addClickListener(e -> h.onChange());
    }

}
