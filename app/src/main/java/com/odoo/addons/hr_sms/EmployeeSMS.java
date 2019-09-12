package com.odoo.addons.hr_sms;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.odoo.R;
import com.odoo.core.orm.fields.OColumn;


public class EmployeeSMS extends AppCompatActivity {

    private EditText txtMobile;
    private EditText txtMessage;
    private Bundle extras;

    private boolean hasRecordInExtra() {
        return extras != null && extras.containsKey(OColumn.ROW_ID);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_sms);
        txtMobile = findViewById(R.id.mblTxt);
        txtMessage = findViewById(R.id.msgTxt);
        Button btnSms = findViewById(R.id.btnSend);
        extras = getIntent().getExtras();

        if (hasRecordInExtra()) {
            txtMobile.setText(extras.getString("number"));
            txtMessage.setText(extras.getString("message"));
        }


        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    SmsManager smgr = SmsManager.getDefault();
                    smgr.sendTextMessage(txtMobile.getText().toString(),null,txtMessage.getText().toString(),null,null);
                    Toast.makeText(EmployeeSMS.this, "SMS Sent Successfully", Toast.LENGTH_SHORT).show();
                    txtMessage.setText("");
                }
                catch (Exception e){
                    Toast.makeText(EmployeeSMS.this, "SMS Failed to Send, Please try again", Toast.LENGTH_SHORT).show();
                    System.out.println(e.getMessage());
                }
            }
        });
    }
}
