package za.co.ktpsolutions.www.adamscoffeebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NewOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(NewOrderActivity.this, "Please cancel order first!", Toast.LENGTH_SHORT).show();
    }
}
