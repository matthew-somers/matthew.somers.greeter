package matthew.somers.greeter;

import android.os.Bundle;
import android.app.Activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private ImageView iv1;
	private Button button1;
	
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    button1 = (Button) findViewById(R.id.button1);
    //tv1 = (TextView) findViewById(R.id.textView1);
    iv1 = (ImageView) findViewById(R.id.imageView1);

  }

  // This method is called at button click because we assigned the name to the
  // "OnClick property" of the button
  public void onClick(View view) {
	  Toast.makeText(this, "Hi Ryan!", Toast.LENGTH_LONG).show();
	  iv1.setVisibility(1);

  }
}