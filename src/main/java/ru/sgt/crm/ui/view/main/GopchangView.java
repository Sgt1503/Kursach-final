package ru.sgt.crm.ui.view.main;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import ru.sgt.crm.ui.MainLayout;

@Route(value ="gopchang", layout = MainLayout.class)
@CssImport("./styles/shared-styles.css")
public class GopchangView extends VerticalLayout {
    Gopchang gopchang = new Gopchang();
    public GopchangView(){
        HorizontalLayout content = new HorizontalLayout();
        Text recipe = new Text(gopchang.getRecipe());
        content.add(gopchang.getImage(), recipe);
        add(content);
        addClassName("food-view");
        content.setClassName("content");
        gopchang.getImage().setClassName("img");
    }
}

