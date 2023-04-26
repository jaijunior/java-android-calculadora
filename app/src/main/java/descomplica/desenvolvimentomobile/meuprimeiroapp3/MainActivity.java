package descomplica.desenvolvimentomobile.meuprimeiroapp3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;

import java.util.EmptyStackException;

public class MainActivity extends AppCompatActivity {

    double num1 = 0 ,num2 = 0, res = 0;

    EditText valor1 ;
    EditText valor2 ;
    TextView tv_resultado ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_soma  = findViewById(R.id.btn_soma);
        Button btn_subracao  = findViewById(R.id.btn_subitraicao);
        Button btn_multiplicacao  = findViewById(R.id.btn_multiplicacao);
        Button btn_divisao  = findViewById(R.id.btn_divisao);
        valor1 = findViewById(R.id.et_valor1);
        valor2 = findViewById(R.id.et_valor2);
        tv_resultado = findViewById(R.id.tv_resultado);
        /*btn_soma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    num1 = Double.parseDouble(valor1.getText().toString());
                    num2 = Double.parseDouble(valor2.getText().toString());
                    res = (num1 + num2);
                    tv_resultado.setText(String.valueOf(res));
                }catch (Exception e) {
                    tv_resultado.setText("Erro:" + e.getLocalizedMessage());
                }
            }
        });

        btn_subracao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    num1 = Double.parseDouble(valor1.getText().toString());
                    num2 = Double.parseDouble(valor2.getText().toString());
                    res = (num1 - num2);
                    tv_resultado.setText(String.valueOf(res));
                }catch (Exception e) {
                    tv_resultado.setText("Erro:" + e.getLocalizedMessage());
                }
            }
        });

        btn_multiplicacao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    num1 = Double.parseDouble(valor1.getText().toString());
                    num2 = Double.parseDouble(valor2.getText().toString());
                    res = (num1 * num2);
                    tv_resultado.setText(String.valueOf(res));
                }catch (Exception e) {
                    tv_resultado.setText("Erro:" + e.getLocalizedMessage());
                }
            }
        });

        btn_divisao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                try{
                    num1 = Double.parseDouble(valor1.getText().toString());
                    num2 = Double.parseDouble(valor2.getText().toString());
                    if(num2 == 0){
                        res = (num1 / num2);
                        tv_resultado.setText("Erro, não pode haver divisão por 0: " + String.valueOf(res));
                    }else{
                        res = (num1 / num2);
                        tv_resultado.setText("RESULTADO: " + String.valueOf(res));
                    }
                }catch (Exception e) {
                    tv_resultado.setText("Erro:" + e.getLocalizedMessage());
                }
            }
        });*/
    }

    public void somar() {
        try {
            num1 = Double.parseDouble(valor1.getText().toString());
            num2 = Double.parseDouble(valor2.getText().toString());
            res = (num1 + num2);
            tv_resultado.setText(String.valueOf(res));
        } catch (Exception e) {
           tv_resultado.setText("Erro:" + e.getLocalizedMessage());
        }
    }

    public void subtrair(){
        try{
            num1 = Double.parseDouble(valor1.getText().toString());
            num2 = Double.parseDouble(valor2.getText().toString());
            res = (num1 - num2);
            tv_resultado.setText(String.valueOf(res));
        }catch (Exception e) {
            tv_resultado.setText("Erro:" + e.getLocalizedMessage());
        }
    }

    public void multiplicar(){
        try{
            num1 = Double.parseDouble(valor1.getText().toString());
            num2 = Double.parseDouble(valor2.getText().toString());
            res = (num1 * num2);
            tv_resultado.setText(String.valueOf(res));
        }catch (Exception e) {
            tv_resultado.setText("Erro:" + e.getLocalizedMessage());
        }
    }

    public void dividir(){
        try{
            num1 = Double.parseDouble(valor1.getText().toString());
            num2 = Double.parseDouble(valor2.getText().toString());
            if(num2 == 0){
                res = (num1 / num2);
                tv_resultado.setText("Erro, não pode haver divisão por 0: " + String.valueOf(res));
            }else{
                res = (num1 / num2);
                tv_resultado.setText("RESULTADO: " + String.valueOf(res));
            }
        }catch (Exception e) {
            tv_resultado.setText("Erro:" + e.getLocalizedMessage());
        }
    }

    public void opera(View v){
        switch(v.getId()){
            case R.id.btn_soma:
                somar();
                break;
            case R.id.btn_subitraicao:
                subtrair();
                break;
            case R.id.btn_multiplicacao:
                multiplicar();
                break;
            case R.id.btn_divisao:
                dividir();
                break;
            default:
                tv_resultado.setText("Erro, operação não existe");
        }

    }
}
