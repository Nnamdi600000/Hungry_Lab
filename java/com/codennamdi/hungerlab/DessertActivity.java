package com.codennamdi.hungerlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        ListView dessertListView = findViewById(R.id.dessert_list_view);


        Dish[] dessertList = {
                new Dish("Meat Pie", "A meat pie is a pie with a chunky filling of meat and often other savory ingredients.", 300),
                new Dish("Nuts", "Nuts are actually fruits. They are defined as dry, single-seeded fruits that have high oil content. They are usually enclosed in a leathery or solid outer layer.", 500),
                new Dish("Plantain chips", "Plantain Chips or also called as chifles, mariquitas, or chicharritas, are chips made from thinly sliced green-yellow plantains that are deep fried until crisp and golden and sprinkled with seasoning to taste.", 400),
                new Dish("Egg rolls", "Egg rolls are a variety of deep-fried appetizers served in American Chinese restaurants. An egg roll is a cylindrical, savory roll with shredded cabbage, chopped pork, and other fillings inside a thickly-wrapped wheat flour skin, which is fried in hot oil.", 200),
                new Dish("Groundnut Cake", "groundnut cake is formed from caramelized sugar and peanut, also known as groundnut or Arachis hypogaea.", 1000),
                new Dish("Kilishi", "Kilishi is a version of jerky that originated in Hausaland specifically Bauchi state. It is a dried form of suya, made from deboned cow, sheep or goat meat.", 500),
                new Dish("Coconut Candy", "Coconut candy is tasty and made of freshly grated coconut. It is a common treat during Deepavali.", 1200),
                new Dish("Bread and egg", "fresh bread deep fried with egg", 1000),
                new Dish("Coconut bread", "Coconut Bread are sweet buns baked in glorious coconut milk and turn out as tasty, delicate and moist.", 1500),
        };

        //Adapting to the dish array
        ArrayAdapter<Dish> dessertArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dessertList);
        dessertListView.setAdapter(dessertArrayAdapter);
    }
}