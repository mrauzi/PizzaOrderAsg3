package css.mrauzi.pizzaorderasg3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declare variables
    RadioButton rbSmall;
    RadioButton rbMedium;
    RadioButton rbLarge;
    CheckBox cbExCheese;
    CheckBox cbDelivery;
    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize variables
        rbSmall = (RadioButton)findViewById(R.id.radioButtonSmall);
        rbMedium = (RadioButton)findViewById(R.id.radioButtonMedium);
        rbLarge = (RadioButton)findViewById(R.id.radioButtonLarge);
        cbExCheese = (CheckBox)findViewById(R.id.checkBoxExtraCheese);
        cbDelivery = (CheckBox)findViewById(R.id.checkBoxDelivery);
        tvTotal = (TextView)findViewById(R.id.textViewTotal);
    }

    public void onClickCalculateTotal(View view) {
        final Double SM_PIZZA = 7.00;
        final Double MED_PIZZA = 9.00;
        final Double LG_PIZZA = 13.00;
        final Double EX_CHEESE = 1.75;
        final Double DELIVERY = 2.50;
        Double total = 0.0;

        if (rbSmall.isChecked()) {
            total = SM_PIZZA;
        }
        else if (rbMedium.isChecked()) {
            total = MED_PIZZA;
        }
        else if (rbLarge.isChecked()) {
            total = LG_PIZZA;
        }

        if (cbExCheese.isChecked()) {
            total += EX_CHEESE;
        }
        if (cbDelivery.isChecked()) {
            total += DELIVERY;
        }

        tvTotal.setText(String.format("Total is $%.2f", total));

    }
}
