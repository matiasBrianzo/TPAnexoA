package usuario.example.tpanexoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etUsuario, etContrasenia;

    private Button btIngresar;
    private LogginActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = findViewById(R.id.etUsuario);
        etContrasenia = findViewById(R.id.etContrasenia);
        btIngresar = findViewById(R.id.btIngresar);

        viewModel = new ViewModelProvider(this).get(LogginActivityViewModel.class);

        btIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsuario.getText().toString();
                String password = etContrasenia.getText().toString();
                viewModel.Validado(username,password);
            }
        });
    }
}