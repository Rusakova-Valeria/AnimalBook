package com.example.animalbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Кошка", "Домашнее животное, одно из наиболее популярных «животных-компаньонов». С точки зрения научной систематики, домашняя кошка - млекопитающее семейства кошачьих отряда хищных",
                R.drawable.cat, "Численность большая"));
        animals.add( new Animal("Хомяк", "Подсемейство грызунов семейства хомяковых.Стали популярными домашними питомцами",
                R.drawable.hamster, "Численность большая"));
        animals.add( new Animal("Собака", "Семейство млекопитающих отряда хищных.домашнее животное. одно из наиболее популярных (наряду с кошкой) животных-компаньонов.",
                R.drawable.dog, "Численность большая"));
        animals.add( new Animal("Кролик", "Общее название нескольких родов млекопитающих из семейства зайцевых",
                R.drawable.rabbit, "Численность большая"));
        animals.add( new Animal("Сова", "Хищная птица семейства совиных с мягким рыхлым оперением, обеспечивающим бесшумность полёта, с продолговатым крючковатым клювом и круглой головой, на которой оперение вокруг больших глаз образует так называемый «лицевой» диск, ведущая сумеречный образ жизни",
                R.drawable.owl, "Численность большая"));
    }
}