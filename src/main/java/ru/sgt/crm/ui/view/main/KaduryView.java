package ru.sgt.crm.ui.view.main;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.sgt.crm.ui.MainLayout;
import ru.sgt.crm.ui.view.main.descrptAndImg;
@Route(value ="kadury", layout = MainLayout.class)
public class KaduryView extends VerticalLayout {
    Kadury kadury = new Kadury();
    public KaduryView(){
        HorizontalLayout content = new HorizontalLayout();
        Text recipe = new Text(kadury.getRecipe());
        content.add(kadury.getImage(), recipe);
        add(content);
        addClassName("food-view");
        content.setClassName("content");
        kadury.getImage().setClassName("img");
    }
}

