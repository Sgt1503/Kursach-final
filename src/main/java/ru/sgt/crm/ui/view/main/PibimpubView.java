package ru.sgt.crm.ui.view.main;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.sgt.crm.ui.MainLayout;
import ru.sgt.crm.ui.view.main.descrptAndImg;
@Route(value ="pibimpub", layout = MainLayout.class)
public class PibimpubView extends VerticalLayout {
    Pibimpub pibimpub = new Pibimpub();
    public PibimpubView(){
        HorizontalLayout content = new HorizontalLayout();
        Text recipe = new Text(pibimpub.getRecipe());
        content.add(pibimpub.getImage(), recipe);
        add(content);
        addClassName("food-view");
        content.setClassName("content");
        pibimpub.getImage().setClassName("img");
    }
}

