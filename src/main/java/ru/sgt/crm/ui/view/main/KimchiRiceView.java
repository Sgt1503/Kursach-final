package ru.sgt.crm.ui.view.main;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.sgt.crm.ui.MainLayout;
import ru.sgt.crm.ui.view.main.descrptAndImg;
@Route(value ="kimchirice", layout = MainLayout.class)
public class KimchiRiceView extends VerticalLayout {
    KimchiRice kimchiRice = new KimchiRice();
    public KimchiRiceView(){
        HorizontalLayout content = new HorizontalLayout();
        Text recipe = new Text(kimchiRice.getRecipe());
        content.add(kimchiRice.getImage(), recipe);
        add(content);
        addClassName("food-view");
        content.setClassName("content");
        kimchiRice.getImage().setClassName("img");
    }
}

