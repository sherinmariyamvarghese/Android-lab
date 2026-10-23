import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    Button btnAdd, btnDisplay;
    TextView tvNames;

    databasehelp dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        btnAdd = findViewById(R.id.btnAdd);
        btnDisplay = findViewById(R.id.btnDisplay);
        tvNames = findViewById(R.id.tvNames);
    }

    public void addme(View view) {
        String name = etName.getText().toString();
        if (dbHelper.addName(name)) {
            Toast.makeText(this, "Name added", Toast.LENGTH_SHORT).show();etName.setText("");

        } else {
            Toast.makeText(this, "Failed to add name", Toast.LENGTH_SHORT).show();

        }

    }
}