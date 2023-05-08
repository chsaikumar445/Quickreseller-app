package com.example.QuickReseller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class item_info extends AppCompatActivity {

    TextView itemName,itemDescription,itemPrice;
    ImageView itemImage;
    Button contact_owner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_info);

        itemName=findViewById(R.id.item_name_tv);
        itemDescription=findViewById(R.id.description_tv);
        itemPrice=findViewById(R.id.price_tv);
        itemImage=findViewById(R.id.item_img_view);
        contact_owner=findViewById(R.id.contact_owner_Btn);

        Intent i=getIntent();
        String name=i.getStringExtra("name");
        String description=i.getStringExtra("description");
        String price=i.getStringExtra("price");
        String imgUrl=i.getStringExtra("imgUrl");
        String phone = i.getStringExtra("phone");
        itemName.setText("Item: "+name);
        itemDescription.setText(description);
        itemPrice.setText("price: "+price+"$");
        Picasso.with(getApplicationContext()).load(imgUrl).into(itemImage);

        contact_owner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(phone.length()!=0){
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                    startActivity(intent);
                }
                }
        });


    }
}