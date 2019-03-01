package dlo51.scarletmail.rutgers.edu.messingaround;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button answerYesButton,answerNoButton,answerNeutral;
    private EditText userNameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answerYesButton = (Button) findViewById(R.id.answer_yes_button);
        answerNoButton = (Button) findViewById(R.id.answer_no_button);
        answerNeutral = (Button) findViewById(R.id.answer_Neutral_Button);
        userNameEditText = (EditText) findViewById(R.id.user_name_edit_text);

    }

    public void onYesButtonClick(View view) {
        //get into building a toast
        String userName = userNameEditText.getText().toString();
        String yourYesResponse = "That is great " + userName;

        Toast.makeText(this,yourYesResponse,Toast.LENGTH_SHORT).show();
    }

    public void onNoButtonClick(View view) {
        String userName = String.valueOf(userNameEditText.getText());
        String yourNoResponse = "That's too bad " + userName + ". Keep your head up champ!";

        Toast.makeText(this,yourNoResponse,Toast.LENGTH_LONG).show();
    }

    public void onNeutralButton(View view) {
    String username = String.valueOf(userNameEditText.getText());
    String yourNresponse = "Well that's okay sometimes that's how we feel " + username;
    Toast.makeText(this, yourNresponse, Toast.LENGTH_LONG).show();
    }
}
