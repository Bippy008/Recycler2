package kg.geektech.a3homework52;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ContactAdapter adapter;
    private ArrayList<String> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_contact);
        contactList = new ArrayList<>();
        contactList.add("0551343434");
        contactList.add("0551343434");
        contactList.add("0551343434");
        contactList.add("0551343434");
        contactList.add("0997564356");
        contactList.add("0997564356");
        contactList.add("0997564356");
        contactList.add("0997564356");
        contactList.add("0772322332");
        contactList.add("0772322332");
        contactList.add("0772322332");
        contactList.add("0772322332");
        contactList.add("0772322332");
        contactList.add("0997564356");
        contactList.add("0997564356");
        contactList.add("0997564356");
        contactList.add("0997564356");
        adapter = new ContactAdapter(contactList);
        recyclerView.setAdapter(adapter);
    }
}