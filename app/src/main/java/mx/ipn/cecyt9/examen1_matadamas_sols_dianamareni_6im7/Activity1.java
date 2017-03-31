package mx.ipn.cecyt9.examen1_matadamas_sols_dianamareni_6im7;
 import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

public class Activity1 extends Activity {


    EditText txtCantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        txtCantidad=(EditText)findViewById(R.id.cant);
    }

    public void onClickConvertir(View vw)
    {
        try{
            int resultado = Integer.parseInt(txtCantidad.getText().toString());
            Toast.makeText(getApplicationContext(),""+resultado/15, Toast.LENGTH_LONG).show();
            Intent intento=new Intent(this,Activity2.class);
            Bundle datos=new Bundle();
            datos.putString("Resultado",""+resultado/15);
            intento.putExtras(datos);
            finish();
            startActivity(intento);

        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Hay un error"+e.getMessage(), Toast.LENGTH_LONG).show();
        }


    }
}

