package usuario.example.tpanexoa;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class LogginActivityViewModel extends AndroidViewModel {

    private Context context;
    private MutableLiveData<Integer> avisoVisibilityMutable;
    public LogginActivityViewModel(@NonNull Application application) {
        super(application);
        this.context=application.getApplicationContext();
    }

   /* public boolean Validado() {

        return usuario.equals("usuario") && contrasenia.equals("contraseña");
    }
    */
    public void Validado(String pUsuario, String pPass) {

        try {
            if (pUsuario.equals("sa") && pPass.equals("123"))
            {
                Intent intent = new Intent(this.context, MiMenu.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
            else {
                Toast.makeText(context, "Credenciales inválidas", Toast.LENGTH_LONG).show();
            }

        }
        catch (NumberFormatException ex)
        {
            Toast.makeText(context, "Credenciales inválidas", Toast.LENGTH_LONG).show();
        }

    }


}


