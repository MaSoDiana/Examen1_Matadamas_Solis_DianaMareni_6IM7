package mx.ipn.cecyt9.examen1_matadamas_sols_dianamareni_6im7;

    import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;

public class Activity2 extends Activity {

    TextView txtRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        try {
            Intent recibido = getIntent();
            Bundle DatosRec = recibido.getExtras();

            txtRes = (TextView) findViewById(R.id.RES);
            txtRes.setText("Matadamas Solís Diana Mareni "+DatosRec.getString("Resultado"));
        }catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"Hay un error", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickCorreo(View vw)
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Examen 1er Parcial");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo:\n"+txtRes.getText().toString());
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }
}

