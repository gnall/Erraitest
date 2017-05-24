package com.joe.client.dto;

import gwt.material.design.client.constants.IconType;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    public DataHelper() {
    }


    public static List<Link> getAppLinks() {
        List<Link> links = new ArrayList<>();

        Link about = new Link(IconType.INFO_OUTLINE, "New", "#new");
        Link home = new Link(IconType.HOME, "Home", "#home");
        /*Link gettingStarted = new Link(IconType.CLOUD_DOWNLOAD, "Getting Started", "#getting_started");

        Link components = new Link(IconType.POLYMER, "Components");
        components.addSubLink(new Link("Badges", "#badge"));
        components.addSubLink(new Link("Buttons", "#button"));
        components.addSubLink(new Link("Breadcrumb", "#breadcrumbs"));
        components.addSubLink(new Link("Cards", "#card"));
        components.addSubLink(new Link("Chips", "#chip"));
        components.addSubLink(new Link("Collapsible", "#collapsible"));
        components.addSubLink(new Link("Collections", "#collection"));
        components.addSubLink(new Link("Date Picker", "#datepicker"));
        components.addSubLink(new Link("Modals", "#modals"));
        components.addSubLink(new Link("Dropdown", "#dropdown"));
        components.addSubLink(new Link("Errors", "#errors"));
        components.addSubLink(new Link("Forms", "#forms"));
        components.addSubLink(new Link("FAB", "#fab"));
        components.addSubLink(new Link("Footer", "#footer"));
        components.addSubLink(new Link("Loaders", "#loader"));
        components.addSubLink(new Link("Media", "#media"));
        components.addSubLink(new Link("Nav Bar", "#navbar"));
        components.addSubLink(new Link("Pushpin", "#pushpin"));
        components.addSubLink(new Link("Search", "#search"));
        components.addSubLink(new Link("Sidenavs", "#sidenav"));
        components.addSubLink(new Link("Scrollspy", "#scrollspy"));
        components.addSubLink(new Link("Tabs", "#tab"));
        components.addSubLink(new Link("Toast", "#toast"));
        components.addSubLink(new Link("Tooltip", "#tooltip"));

        Link addins = new Link(IconType.EXTENSION, "Addins");
        addins.addSubLink(new Link("Autocomplete", "#autocomplete"));
        addins.addSubLink(new Link("Avatar", "#avatar"));
        addins.addSubLink(new Link("Bubble", "#bubble"));
        addins.addSubLink(new Link("Camera", "#camera"));
        addins.addSubLink(new Link("Combo Box", "#combobox"));
        addins.addSubLink(new Link("Cut Out", "#cutout"));
        addins.addSubLink(new Link("Data Table", "#datatable"));
        addins.addSubLink(new Link("Drag and Drop", "#dnd"));
        addins.addSubLink(new Link("Doc Viewer", "#docviewer"));
        addins.addSubLink(new Link("File Uploader", "#fileuploader"));
        addins.addSubLink(new Link("Icon Morph", "#iconmorph"));
        addins.addSubLink(new Link("Masonry", "#masonry"));
        addins.addSubLink(new Link("Overlay", "#overlay"));
        addins.addSubLink(new Link("Path Animator", "#pathanimator"));
        addins.addSubLink(new Link("Rating", "#rating"));
        addins.addSubLink(new Link("Rich Editor", "#richeditor"));
        addins.addSubLink(new Link("Scroll Fire", "#scrollfire"));
        addins.addSubLink(new Link("Split Panel", "#splitpanel"));
        addins.addSubLink(new Link("Steppers", "#stepper"));
        addins.addSubLink(new Link("Subheader", "#subheader"));
        addins.addSubLink(new Link("Swipeable", "#swipeable"));
        addins.addSubLink(new Link("Time Picker", "#timepicker"));
        addins.addSubLink(new Link("Tree View", "#tree"));
        addins.addSubLink(new Link("Waterfall", "#waterfall"));
        addins.addSubLink(new Link("Window", "#window"));

        Link styleLayout = new Link(IconType.STYLE, "Style and Layout");
        styleLayout.addSubLink(new Link("Colors", "#colors"));
        styleLayout.addSubLink(new Link("Grid", "#grid"));
        styleLayout.addSubLink(new Link("Helpers", "#helpers"));
        styleLayout.addSubLink(new Link("Icons", "#icons"));
        styleLayout.addSubLink(new Link("Shadow", "#shadow"));
        styleLayout.addSubLink(new Link("Themes", "#themes"));

        Link animations = new Link(IconType.PLAY_CIRCLE_OUTLINE, "Animations");
        animations.addSubLink(new Link("Core", "#core_animation"));
        animations.addSubLink(new Link("Meaningful", "#meaningful_animation"));
*/
        links.add(home);
        links.add(about);
        /*links.add(gettingStarted);
        links.add(components);
        links.add(addins);
        links.add(styleLayout);
        links.add(animations);*/
        return links;
    }
}
