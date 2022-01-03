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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Switch;
import android.app.Activity;
import android.content.SharedPreferences;
import android.widget.CompoundButton;
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

public class SettingsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear4;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextView textview1;
	private Switch switch1;
	private TextView textview2;
	private Switch switch2;
	private TextView textview3;
	private Switch switch3;
	private TextView textview4;
	private Switch switch4;
	private TextView textview5;
	private Switch switch5;
	private TextView textview6;
	
	private SharedPreferences n;
	private SharedPreferences b;
	private SharedPreferences myweb;
	private SharedPreferences c;
	private SharedPreferences d;
	private SharedPreferences f;
	private SharedPreferences bar;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settings);
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
		vscroll1 = findViewById(R.id.vscroll1);
		linear4 = findViewById(R.id.linear4);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		textview1 = findViewById(R.id.textview1);
		switch1 = findViewById(R.id.switch1);
		textview2 = findViewById(R.id.textview2);
		switch2 = findViewById(R.id.switch2);
		textview3 = findViewById(R.id.textview3);
		switch3 = findViewById(R.id.switch3);
		textview4 = findViewById(R.id.textview4);
		switch4 = findViewById(R.id.switch4);
		textview5 = findViewById(R.id.textview5);
		switch5 = findViewById(R.id.switch5);
		textview6 = findViewById(R.id.textview6);
		n = getSharedPreferences("n", Activity.MODE_PRIVATE);
		b = getSharedPreferences("b", Activity.MODE_PRIVATE);
		myweb = getSharedPreferences("myweb", Activity.MODE_PRIVATE);
		c = getSharedPreferences("c", Activity.MODE_PRIVATE);
		d = getSharedPreferences("d", Activity.MODE_PRIVATE);
		f = getSharedPreferences("f", Activity.MODE_PRIVATE);
		bar = getSharedPreferences("bar", Activity.MODE_PRIVATE);
		
		switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					n.edit().putString("lin", "1").commit();
					textview2.setText(getResources().getString(R.string.lineshowON));
				}
				else {
					n.edit().putString("lin", "2").commit();
					textview2.setText(getResources().getString(R.string.lineshowOFF));
				}
			}
		});
		
		switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textview3.setText(getResources().getString(R.string.Textstyle1ON));
					f.edit().putString("lin1", "3").commit();
				}
				else {
					f.edit().putString("lin1", "4").commit();
					textview3.setText(getResources().getString(R.string.Textstyle1OFF));
				}
			}
		});
		
		switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textview4.setText(getResources().getString(R.string.FixScrollBarON));
					c.edit().putString("lin2", "5").commit();
				}
				else {
					c.edit().putString("lin2", "6").commit();
					textview4.setText(getResources().getString(R.string.FixScrollBarOFF));
				}
			}
		});
		
		switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					d.edit().putString("lin3", "7").commit();
					textview5.setText(getResources().getString(R.string.WARPCORPON));
				}
				else {
					d.edit().putString("lin3", "8").commit();
					textview5.setText(getResources().getString(R.string.WARPCORPOFF));
				}
			}
		});
		
		switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					bar.edit().putString("br", "1").commit();
					textview6.setText("مخفی کردن بار روشن");
				}
				else {
					bar.edit().putString("br", "2").commit();
					textview6.setText("مخفی کردن بار خاموش");
				}
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("تنظیمات برنامه");
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =SettingsActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF424242);
		}
		if (n.getString("lin", "").equals("1")) {
			switch1.setChecked(true);
		}
		else {
			switch1.setChecked(false);
		}
		if (c.getString("lin2", "").equals("5")) {
			switch3.setChecked(true);
		}
		else {
			switch3.setChecked(false);
		}
		if (d.getString("lin3", "").equals("7")) {
			switch4.setChecked(true);
		}
		else {
			switch4.setChecked(false);
		}
		if (f.getString("lin1", "").equals("3")) {
			switch2.setChecked(true);
		}
		else {
			switch2.setChecked(false);
		}
		if (bar.getString("br", "").equals("1")) {
			switch5.setChecked(true);
		}
		else {
			switch5.setChecked(false);
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF424242".replace("0xFF" , "#")));
		}
		textview1.setText(getResources().getString(R.string.publics));
		textview2.setText(getResources().getString(R.string.lineshowOFF));
		textview3.setText(getResources().getString(R.string.Textstyle1OFF));
		textview4.setText(getResources().getString(R.string.FixScrollBarOFF));
		textview5.setText(getResources().getString(R.string.WARPCORPOFF));
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