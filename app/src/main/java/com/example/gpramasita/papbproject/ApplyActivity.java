package com.example.gpramasita.papbproject;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.net.Uri;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by gpramasita on 12/14/17.
 */

public class ApplyActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int PICK_IMAGE = 2;
    ImageView ImageUP;
    Button buttonSb, buttonSr;
    EditText editFullname;
    Spinner editCountry, editSeason;
    Uri ImageOnUpload;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
        ImageUP = (ImageView) findViewById(R.id.imageProfile);
        buttonSr = (Button) findViewById(R.id.buttonSearch);
        buttonSb = (Button) findViewById(R.id.buttonSubmit);
        ImageUP.setOnClickListener(this);
        buttonSr.setOnClickListener(this);
        buttonSb.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonSearch:
                openGallery();
                break;
            case R.id.buttonSubmit:
                Intent Submit = new Intent(this, DisplayActivity.class);
                Bundle resAll = new Bundle();

                Submit.putExtra("Profile", ImageOnUpload.toString());
                editFullname = (EditText) findViewById(R.id.editName);
                editCountry = (Spinner) findViewById(R.id.spinnerCountry);
                editSeason = (Spinner) findViewById(R.id.spinnerSeason);



                resAll.putString("Full Name", editFullname.getText().toString());
                resAll.putString("Country", editCountry.getSelectedItem().toString());
                resAll.putString("Season", editSeason.getSelectedItem().toString());

                Submit.putExtras(resAll);
                this.startActivity(Submit);

                break;


        }
    }
    private void openGallery(){
        Intent GalleryOP = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(GalleryOP, PICK_IMAGE);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK) {
            ImageOnUpload = data.getData();
            ImageUP.setImageURI(ImageOnUpload);

        }
    }

}
