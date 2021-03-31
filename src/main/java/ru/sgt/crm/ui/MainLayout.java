package ru.sgt.crm.ui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;
import ru.sgt.crm.ui.view.ListView;
import ru.sgt.crm.ui.view.main.*;

@CssImport("./styles/shared-styles.css")
public class MainLayout extends AppLayout {
    public MainLayout() {
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        H1 logo = new H1("KimPub");
        logo.addClassName("logo");


        Anchor crm = new Anchor("crm", "CRM");
        Anchor logout = new Anchor("logout", "Выйти");
        Anchor main = new Anchor("", "Главная");



        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(), logo, main, crm, logout);

        header.expand(logo);
        header.setDefaultVerticalComponentAlignment(
            FlexComponent.Alignment.CENTER);
        header.setWidth("100%");
        header.addClassName("header");


        addToNavbar(header);

    }

    private void createDrawer() {
        RouterLink mainLink = new RouterLink("Главная", MainView.class);
        RouterLink gopchangLink = new RouterLink("Гопчанг", GopchangView.class);
        RouterLink kaduryLink = new RouterLink("Кадюри", KaduryView.class);
        RouterLink kimchiLink = new RouterLink("Кимчи Жаренный рис", KimchiRiceView.class);
        RouterLink pibimpubLink = new RouterLink("Пибимпаб", PibimpubView.class);
        RouterLink pulkogeLink = new RouterLink("Пулькоге", PulkogeView.class);
        RouterLink sushiLink = new RouterLink("Кимбап", SushiView.class);
        gopchangLink.setHighlightCondition(HighlightConditions.sameLocation());
        kaduryLink.setHighlightCondition(HighlightConditions.sameLocation());
        kimchiLink.setHighlightCondition(HighlightConditions.sameLocation());
        pibimpubLink.setHighlightCondition(HighlightConditions.sameLocation());
        pulkogeLink.setHighlightCondition(HighlightConditions.sameLocation());
        sushiLink.setHighlightCondition(HighlightConditions.sameLocation());

        addToDrawer(new VerticalLayout(mainLink, gopchangLink, kaduryLink, kimchiLink, pibimpubLink, pulkogeLink, sushiLink));
    }
}