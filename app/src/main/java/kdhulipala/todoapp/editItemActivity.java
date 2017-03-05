package kdhulipala.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class editItemActivity extends AppCompatActivity {

    EditText etEditItem;
    String itemPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        etEditItem = (EditText) findViewById(R.id.etEditItem);
        String item = getIntent().getStringExtra("item");
        etEditItem.setText(item);
        itemPos = getIntent().getStringExtra("itemPos");

    }

    public void onClickSave(View view) {
        Intent item = new Intent();
        item.putExtra("item", etEditItem.getText().toString());
        item.putExtra("itemPos", itemPos);
        setResult(RESULT_OK, item); // set result code and bundle data for response
        finish();

    }
}
