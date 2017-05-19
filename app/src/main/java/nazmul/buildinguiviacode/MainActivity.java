package nazmul.buildinguiviacode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout nameContainer;
    private LinearLayout addressContainer;
    private LinearLayout parentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createNameContainer();
        createAddressContainer();
        createParentContainer();
        setContentView(parentContainer);
    }

    private void createParentContainer() {
        parentContainer = new LinearLayout(this);
        parentContainer.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        parentContainer.setOrientation(LinearLayout.VERTICAL);
        parentContainer.addView(nameContainer);
        parentContainer.addView(addressContainer);

    }

    private void createAddressContainer() {
        addressContainer = new LinearLayout(this);
        addressContainer.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        addressContainer.setOrientation(LinearLayout.VERTICAL);
        TextView addresslbl = new TextView(this);
        addresslbl.setText("Address: ");
        TextView addressValue = new TextView(this);
        addressValue.setText("Bashirudding Road,Kolabagan,Dhaka");
        addressContainer.addView(addresslbl);
        addressContainer.addView(addressValue);

    }

    private void createNameContainer() {
        nameContainer = new LinearLayout(this);
        nameContainer.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        nameContainer.setOrientation(LinearLayout.HORIZONTAL);
        TextView nameLbl = new TextView(this);
        nameLbl.setText("Name: ");
        TextView nameValue = new TextView(this);
        nameValue.setText("Nazmul Hasan");
        nameContainer.addView(nameLbl);
        nameContainer.addView(nameValue);
    }
}
