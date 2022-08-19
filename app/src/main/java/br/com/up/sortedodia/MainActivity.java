package br.com.up.sortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle; //criação das variaveis
    private Button buttonAction;
    private ArrayList<String> messages = new ArrayList<>(); // criação da lista de mensagens




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //findViewById necessario ser colocado após o setContentView para encontrar o id

        textViewTitle = findViewById(R.id.text_title); // R = Res (pasta)
        buttonAction = findViewById(R.id.button_action);

        messages.add("Exemplo texto"); // adicionando um texto na lista
        messages.add("Babiribupi");
        messages.add("oiasndoinasodk");



        //View.OnClickListener listener = new View.OnClickListener() { // 1o Metodo
        //    @Override
        //    public void onClick(View v) {
        //
        //   }
        //};
        //
        //buttonAction.setOnClickListener();

        buttonAction.setOnClickListener(  // 2o Metodo
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Random random = new Random(); // instancia da função random
                        int index = random.nextInt(messages.size()); // gerando um numero inteiro que varia de 0 até o tamanho da lista
                        String message = messages.get(index);
                        textViewTitle.setText(message);
                    }
                }
        );

    }
}