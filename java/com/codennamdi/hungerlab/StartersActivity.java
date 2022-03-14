package com.codennamdi.hungerlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.List_View_Starters);

        Dish[] dishes = {
                new Dish("Jollof Rice", "Jollof rice is a spiced dish, simmered in reduced tomatoes, onions, peppers, and different seasonings depending on where it's made. It's an iconic dish, with massive regional significance across West Africa and a staple in celebratory social gatherings, including at Lagos parties in Nigeria.", 999),
                new Dish("Pounded Yam", "Pounded Yam is a popular African dish similar to mashed potatoes but heavier. Pounded Yam is very smooth and tasty. It is often eaten with vegetable soup.", 900),
                new Dish("African Mango Seed Soup", "The main ingredient of this soup is ground mango seeds. Mango seeds give this stew its characteristic thickness when they are cooked in a mixture of palm oil and water.", 1200),
                new Dish("Puff-Puff (Fried Sweet Dough Ball)", "Nigerians call it Puff-Puff (Puff) or beignet in French. The basic ingredient consist of: flour, sugar, yeast, water, salt and oil for deep frying.", 500),
                new Dish("Àkàrà (Fried Bean Cake)", "Akara is made from peeled beans (black eye peas), washed and ground with pepper, and other preferred seasonings, then beaten to aerate them, and deep fried", 100),
                new Dish("Pepper Soup", "Peppersoup is a soup from parts of West Africa, notably Nigeria that is prepared using various meats, chili peppers and calabash nutmeg as primary ingredients. It is a spicy soup that has a light, watery texture.", 1500),
                new Dish("Suya (Spicy Grilled Kebab)", "Suya- Roast African spicy skewered beef – An irresistible beef  Satay with Spicy Peanut Spice Blend – the epitome of West African Street food.", 1000),
                new Dish("Asaro (Yam Porridge)", "Yam porridge or Asaro is another delicious Nigerian yam dish cooked in a well-seasoned pepper mix until soft and fluffy with some yam chunks.", 1500),
                new Dish("Egusi (Melon Seed Soup)", "Egusi soup is a kind of soup thickened with the ground seeds and popular in West Africa, with considerable local variation. Besides the seeds, water, and oil, egusi soup typically contains leaf vegetables, palm oil, other vegetables, seasonings, and meat.", 2000),
                new Dish("Ẹ̀bà (Cassava Meal)", "Ẹ̀bà is a staple food mainly eaten in the West African sub-region, particularly in Nigeria and parts of Ghana. It is specifically called Eba by the Yoruba people. It is a cooked starchy vegetable food made from dried grated cassava (manioc) flour, commonly known as garri.", 1500)
        };


        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startersList.setAdapter(dishesAdapter);
    }
}