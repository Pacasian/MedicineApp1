package pa.pacasian.sumithkumar.medicineapp;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Doctor_Activity extends AppCompatActivity {
String[] st={"headache","heartattack","fever","cold"};
String[] dr={"Dr.Sumith","Dr.Mohin","Dr.Rajeev","Dr.Shrenika"};
String[] fd={"1","2","3","4"};
Button btnShow;
EditText edMS;
EditText edTS;
String drname;
EditText pname;
String st1="";
EditText pPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_);
        btnShow=findViewById(R.id.button6);
        edTS=findViewById(R.id.editText7);
        pname=findViewById(R.id.editText);
        pPhone=findViewById(R.id.editText2);
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doctor();
            }
        });
    }
    public void doctor(){
                edMS=findViewById(R.id.ed1);
                st1=edMS.getText().toString().trim();
                Toast.makeText(Doctor_Activity.this, st1 + "", Toast.LENGTH_SHORT).show();
                for (int i=0;i<4;i++){
                    if (st1.equals(st[i])){
                        Toast.makeText(Doctor_Activity.this, drname+"", Toast.LENGTH_SHORT).show();
                        final Dialog login2=new Dialog(this);
                        login2.setContentView(R.layout.structure);
                        Button btn_login=login2.findViewById(R.id.button8);
                        TextView classes=login2.findViewById(R.id.textView);
                        classes.setText(dr[i]);
                        btn_login.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                    /*Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setData(Uri.parse("Email"));
                    String[] st = {"pacasian.pacy@gmail.com"};
                    intent.putExtra(Intent.EXTRA_EMAIL, st);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "The attendence of class 5B ");
                    intent.putExtra(Intent.EXTRA_TEXT, "The Attendance is " + sumith + "/" + total_size + "of class " + subee);
                    intent.setType("message/rfc822");
                    Intent choose = Intent.createChooser(intent, "Launch Email");
                    startActivity(choose);
                    finish();*/
                                Intent intent=new Intent(Doctor_Activity.this, Main3Activity.class);
                                startActivity(intent);

                            }

                        });


                login2.show();



                    }

                }
    }
}
