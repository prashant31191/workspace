package suave.ms.tracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MSImages extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		Intent intent = new Intent(MSImages.this, MSTrackerHome.class);
		// Load Activity
		startActivity(intent);
		finish();
	}

	@Override
	public void onClick(View arg0) {
		// switch (v.getId()) {
		// case R.id.btnBack:
		// Intent intent = new Intent(Schedule.this, MSTracker.class);
		// // Load Activity
		// startActivity(intent);
		// finish();
		// break;
		//
		// default:
		// break;
		// }

	}
}
