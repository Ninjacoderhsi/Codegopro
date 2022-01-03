package org.codego.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;
import org.antlr.v4.runtime.*;
import io.github.rosemoe.sora.*;
import com.github.angads25.filepicker.*;
import com.google.gson.*;
import javaxml.*;
import com.evgenii.jsevaluator.*;
import org.jetbrains.kotlin.*;
import io.github.rosemoe.sora.langs.base.*;
import io.github.rosemoe.sora.langs.css3.*;
import io.github.rosemoe.sora.langs.java.*;
import io.github.rosemoe.sora.langs.python.*;
import com.android.tools.r8.*;
import io.reactivex.*;
import s4u.restore.swb.*;
import com.example.myapp.*;
import com.github.florent37.viewtooltip.*;
import arabware.libs.getThumbnail.*;
import androidx.webkit.*;
import com.zip4j.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;

public class ApkinstallActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String install = "";
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private TextView apkpath;
	private LinearLayout linear3;
	private CardView cardview1;
	private ImageView imageview1;
	private Button btn;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.apkinstall);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		apkpath = findViewById(R.id.apkpath);
		linear3 = findViewById(R.id.linear3);
		cardview1 = findViewById(R.id.cardview1);
		imageview1 = findViewById(R.id.imageview1);
		btn = findViewById(R.id.btn);
		
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				install = getIntent().getStringExtra("apk");
				try {
					if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
											Uri uri = androidx.core.content.FileProvider.getUriForFile(getApplicationContext(),
													ApkinstallActivity.this.getPackageName() + ".provider", new java.io.File(install));
											Intent intent = new Intent(Intent.ACTION_VIEW);
											intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
											intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
											intent.setDataAndType(uri, "application/vnd.android.package-archive");
											startActivity(intent);
						
									} else {
											Intent intent = new Intent(Intent.ACTION_VIEW);
											intent.setDataAndType(Uri.fromFile( new java.io.File(install)),
													"application/vnd.android.package-archive");
											intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
											startActivity(intent);
									}
					
				} catch (Exception rr) {
					showMessage (rr.toString());
				}
			}
		});
	}
	
	private void initializeLogic() {
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFFFF9800);SketchUi.setCornerRadius(getDip(22));
			SketchUi.setStroke((int)getDip(2) ,0xFFE91E63);
			btn.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFFFFFFF}), SketchUi, null);
			btn.setBackground(SketchUi_RD);
		}
		apkpath.setText(getIntent().getStringExtra("title"));
		_getApkIcon(getIntent().getStringExtra("icon"), imageview1);
	}
	
	public void _getApkIcon(final String _path, final ImageView _imageview) {
		try { 
			
			
				
			android.content.pm.PackageManager packageManager = this.getPackageManager();
			android.content.pm.PackageInfo packageInfo = packageManager.getPackageArchiveInfo(_path, 0);
			packageInfo.applicationInfo.sourceDir = _path;
			packageInfo.applicationInfo.publicSourceDir = _path;
			_imageview.setImageDrawable(packageInfo.applicationInfo.loadIcon(packageManager));
			packageInfo = null;
			packageManager = null;
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}