package com.codennamdi.hungerlab;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);


        Dish[] mainCourses = {
                new Dish("Jollof Rice", "Jollof rice is a spiced dish, simmered in reduced tomatoes, onions, peppers, and different seasonings depending on where it's made. It's an iconic dish, with massive regional significance across West Africa and a staple in celebratory social gatherings, including at Lagos parties in Nigeria.", 999),
                new Dish("White Rice", "White rice is milled rice that has had its husk, bran, and germ removed. This alters the flavor, texture and appearance of the rice and helps prevent spoilage, extend its storage life, and makes it easier to digest. After milling, the rice is polished, resulting in a seed with a bright, white, shiny appearance.", 1200),
                new Dish("Puff-Puff (Fried Sweet Dough Ball)", "Nigerians call it Puff-Puff (Puff) or beignet in French. The basic ingredient consist of: flour, sugar, yeast, water, salt and oil for deep frying.", 500),
                new Dish("Àkàrà (Fried Bean Cake)", "Akara is made from peeled beans (black eye peas), washed and ground with pepper, and other preferred seasonings, then beaten to aerate them, and deep fried", 100),
                new Dish("Pepper Soup", "Peppersoup is a soup from parts of West Africa, notably Nigeria that is prepared using various meats, chili peppers and calabash nutmeg as primary ingredients. It is a spicy soup that has a light, watery texture.", 1500),
                new Dish("Suya (Spicy Grilled Kebab)", "Suya- Roast African spicy skewered beef – An irresistible beef  Satay with Spicy Peanut Spice Blend – the epitome of West African Street food.", 1000),
                new Dish("Asaro (Yam Porridge)", "Yam porridge or Asaro is another delicious Nigerian yam dish cooked in a well-seasoned pepper mix until soft and fluffy with some yam chunks.", 1500),
                new Dish("Egusi (Melon Seed Soup)", "Egusi soup is a kind of soup thickened with the ground seeds and popular in West Africa, with considerable local variation. Besides the seeds, water, and oil, egusi soup typically contains leaf vegetables, palm oil, other vegetables, seasonings, and meat.", 2000),
                new Dish("Ẹ̀bà (Cassava Meal)", "Ẹ̀bà is a staple food mainly eaten in the West African sub-region, particularly in Nigeria and parts of Ghana. It is specifically called Eba by the Yoruba people. It is a cooked starchy vegetable food made from dried grated cassava (manioc) flour, commonly known as garri.", 1500),
                new Dish("Chin Chin (Fried Snack)", "Chin Chin is a crunchy deep-fried snack that originated from Nigeria.", 500),
                new Dish("Boli (Roasted Plantain)", "Boli is a roasted plantain dish in Nigeria. It is native to the Yoruba people of Nigeria. It is referred to as 'boli' in South West Nigeria these people are known as the Yoruba people and is eaten with groundnuts.", 1000),
                new Dish("Beans and Dodo (Fried Plantain)", "beans and dodo is a healthy and very popular beans recipe in Nigeria, and West African regions. Dodo means fried plantains in Nigeria.", 1000),
                new Dish("Obe Ila Alasepo (Mixed Okra Soup)", "Okra soup is very easy to prepare and you don’t need to break the bank or have any cooking skills  to make a delicious sizzling pot of okra soup. Below you’ll see how easy it is to make this soup.", 600),
                new Dish("Moin Moin/Okpo Oka (Bean/Corn Pudding)", "Moin-Moin or Moimoi is a Yoruba steamed bean pudding made from a mixture of washed and peeled black-eyed beans, onions and fresh ground red peppers (usually a combination of bell peppers and chili or Scotch bonnet). It is a protein-rich food that is a staple in Nigeria.", 900),
                new Dish("Beans and plantain", "They both contain lots of fiber, and foods rich in fiber support the digestive system. Fiber plays an important role in digestive health. Fiber acts as a fuel for the colon cells to keep them healthy.", 200),
                new Dish("Banga soup", "Banga soup is a delicious soup made from palm nut fruit, an assortment of spices, and a variety of meat and fish. It is a popular soup in the Niger Delta part of Nigeria, particularly the Urhobo ethnic group.", 500),
                new Dish("Okpa", "(Okpa) is a nutritious food that is eaten and enjoyed by a lot of children, adults, and can be served as a family meal. Okpa is made from the predominately Bambara nut which is the major source of the food delicacy.", 100),
                new Dish("Coconut rice", "Coconut rice is a dish prepared by soaking white rice in coconut milk or cooking it with coconut flakes. As both the coconut and the rice-plant", 1000),
                new Dish("Egusi soup", "Egusi Soup is a soup thickened with ground melon seeds and contains leafy and other vegetables.", 500)

        };

        ArrayAdapter<Dish> dishesArray = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);
        mainCoursesList.setAdapter(dishesArray);
    }
}
