package com.example.bibliotecadigitalapp;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    private List<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        bookList = new ArrayList<>();
        bookList.add(new Book("Cien años de soledad", "Gabriel García Márquez", Color.RED));
        bookList.add(new Book("El principito", "Antoine de Saint-Exupéry", Color.BLUE));
        bookList.add(new Book("Don Quijote de la Mancha", "Miguel de Cervantes", Color.GREEN));
        bookList.add(new Book("1984", "George Orwell", Color.YELLOW));
        bookList.add(new Book("Moby-Dick", "Herman Melville", Color.CYAN));


        bookAdapter = new BookAdapter(this, bookList);
        recyclerView.setAdapter(bookAdapter);
    }
}
