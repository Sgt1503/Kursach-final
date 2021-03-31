package ru.sgt.crm.ui.view.main;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.sgt.crm.ui.MainLayout;
import ru.sgt.crm.ui.view.main.descrptAndImg;
@Route(value = "sushi", layout = MainLayout.class)
public class SushiView extends VerticalLayout {
    Sushi sushi = new Sushi();
    public SushiView(){
        HorizontalLayout content = new HorizontalLayout();
        Text recipe = new Text(sushi.getRecipe());
        content.add(sushi.getImage(), recipe);
        add(content);
        addClassName("food-view");
        content.setClassName("content");
        sushi.getImage().setClassName("img");
    }
}
