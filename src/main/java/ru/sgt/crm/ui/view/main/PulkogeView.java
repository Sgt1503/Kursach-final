package ru.sgt.crm.ui.view.main;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.sgt.crm.ui.MainLayout;
import ru.sgt.crm.ui.view.main.descrptAndImg;
@Route(value ="pulkoge", layout = MainLayout.class)
public class PulkogeView extends VerticalLayout {
    Pulkoge pulkoge = new Pulkoge();
    public PulkogeView(){
        HorizontalLayout content = new HorizontalLayout();
        Text recipe = new Text(pulkoge.getRecipe());
        content.add(pulkoge.getImage(), recipe);
        add(content);
        addClassName("food-view");
        content.setClassName("content");
        pulkoge.getImage().setClassName("img");
    }
}

