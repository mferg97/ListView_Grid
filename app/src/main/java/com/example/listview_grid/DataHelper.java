package com.example.listview_grid;

import java.util.ArrayList;

public class DataHelper {

    public static ArrayList<ListViewItem> provideItems() {
        ArrayList<ListViewItem> list = new ArrayList<>();

        list.add(new ListViewItem(R.drawable.ic_android_black_24dp, "monito", android.R.color.holo_green_light));

        list.add(new ListViewItem(R.drawable.ic_brightness_7_black_24dp, "brillo", android.R.color.holo_blue_light));
        list.add(new ListViewItem(R.drawable.ic_cake_black_24dp, "pastel", android.R.color.holo_purple));
        list.add(new ListViewItem(R.drawable.ic_child_care_black_24dp, "bebe", android.R.color.holo_orange_light));
        list.add(new ListViewItem(R.drawable.ic_favorite_black_24dp, "heart", android.R.color.holo_red_light));
        list.add(new ListViewItem(R.drawable.ic_local_pizza_black_24dp, "pizza", android.R.color.holo_orange_dark));
        list.add(new ListViewItem(R.drawable.ic_palette_black_24dp, "pintura", android.R.color.holo_blue_dark));
        list.add(new ListViewItem(R.drawable.ic_star_black_24dp, "estrella", android.R.color.holo_orange_light));
        list.add(new ListViewItem(R.drawable.ic_wb_sunny_black_24dp, "sol", android.R.color.holo_orange_light));

        return list;

    }

}
