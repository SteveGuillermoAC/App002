package ec.edu.tecnologico.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ventana2 extends AppCompatActivity {

    Button botonRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        botonRegresar =(Button) findViewById(R.id.botonV);
        botonRegresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ventana2.this,MainActivity.class));
            }
        });
    }
}
