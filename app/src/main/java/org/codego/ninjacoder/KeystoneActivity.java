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
import com.google.android.material.textfield.*;
import android.widget.EditText;
import com.google.android.material.button.*;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
import com.github.florent37.viewtooltip.*;
import arabware.libs.getThumbnail.*;
import androidx.webkit.*;
import com.zip4j.*;
import com.example.myapp.*;
import s4u.restore.swb.*;
import io.reactivex.*;
import com.android.tools.r8.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import com.example.myapp.signing.*;
import java.io.File.*;

public class KeystoneActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String alias = "";
	private String keyPassword = "";
	private String storePassword = "";
	private String commonName = "";
	private String OrganizationUnit = "";
	private String OrganizationName = "";
	private String stateName = "";
	private String CountryCode = "";
	private String city = "";
	private double expire = 0;
	private String save = "";
	private String path = "";
	
	private LinearLayout linear1;
	private TextInputLayout textinputlayout1;
	private TextInputLayout textinputlayout2;
	private TextInputLayout textinputlayout3;
	private TextInputLayout textinputlayout4;
	private TextInputLayout textinputlayout5;
	private TextInputLayout textinputlayout6;
	private TextInputLayout textinputlayout7;
	private TextInputLayout textinputlayout8;
	private TextInputLayout textinputlayout9;
	private TextInputLayout textinputlayout10;
	private EditText edittext11;
	private MaterialButton mtn;
	private EditText edittext1;
	private EditText edittext2;
	private EditText edittext3;
	private EditText edittext4;
	private EditText edittext5;
	private EditText edittext6;
	private EditText edittext7;
	private EditText edittext8;
	private EditText edittext9;
	private EditText edittext10;
	
	private AlertDialog.Builder dialogmain;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.keystone);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
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
		textinputlayout1 = findViewById(R.id.textinputlayout1);
		textinputlayout2 = findViewById(R.id.textinputlayout2);
		textinputlayout3 = findViewById(R.id.textinputlayout3);
		textinputlayout4 = findViewById(R.id.textinputlayout4);
		textinputlayout5 = findViewById(R.id.textinputlayout5);
		textinputlayout6 = findViewById(R.id.textinputlayout6);
		textinputlayout7 = findViewById(R.id.textinputlayout7);
		textinputlayout8 = findViewById(R.id.textinputlayout8);
		textinputlayout9 = findViewById(R.id.textinputlayout9);
		textinputlayout10 = findViewById(R.id.textinputlayout10);
		edittext11 = findViewById(R.id.edittext11);
		mtn = findViewById(R.id.mtn);
		edittext1 = findViewById(R.id.edittext1);
		edittext2 = findViewById(R.id.edittext2);
		edittext3 = findViewById(R.id.edittext3);
		edittext4 = findViewById(R.id.edittext4);
		edittext5 = findViewById(R.id.edittext5);
		edittext6 = findViewById(R.id.edittext6);
		edittext7 = findViewById(R.id.edittext7);
		edittext8 = findViewById(R.id.edittext8);
		edittext9 = findViewById(R.id.edittext9);
		edittext10 = findViewById(R.id.edittext10);
		dialogmain = new AlertDialog.Builder(this);
		
		mtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				alias = edittext1.getText().toString();
				keyPassword = edittext2.getText().toString();
				storePassword = edittext3.getText().toString();
				commonName = edittext4.getText().toString();
				OrganizationUnit = edittext5.getText().toString();
				OrganizationName = edittext6.getText().toString();
				stateName = edittext7.getText().toString();
				CountryCode = edittext8.getText().toString();
				city = edittext9.getText().toString();
				expire = Double.parseDouble(edittext10.getText().toString());
				save = edittext11.getText().toString();
				KeyStoreHelper.Builder builder = new KeyStoreHelper.Builder();
				        builder.setAlias(alias);
				        builder.setKeyPassword(keyPassword);
				        builder.setStorePassword(storePassword);
				        builder.setCommonName(commonName);
				        builder.setOrganizationName(OrganizationName);
				        builder.setOrganizationUnit(OrganizationUnit);
				        builder.setStateName(stateName);
				        builder.setValidityYears((int)expire);
				        builder.setCityOrLocalityName(city);
				        builder.setCountryCode(CountryCode);
				        builder.setStoreType(KeyStoreHelper.Type.JKS);
				        builder.setKeySize(KeyStoreHelper.Size.S_1024);
				        builder.setSigAlgorithm(KeyStoreHelper.SigAlgorithm.SHA1WITHRSA);
				        builder.setKeyAlgorithm(KeyStoreHelper.Algorithm.RSA);
				        builder.setOutputFile(new java.io.File(save));
				        try {
					            KeyStoreHelper.generate(builder);
					        } catch (Exception e) {
					            Toast.makeText(getApplicationContext(), e.toString(), Toast.LENGTH_LONG).show();
					        }
			}
		});
	}
	
	private void initializeLogic() {
		FileUtil.writeFile("######", "####");
		textinputlayout1.setBoxStrokeColor(0xFFFF9800);
		textinputlayout2.setBoxStrokeColor(0xFFFF9800);
		textinputlayout3.setBoxStrokeColor(0xFFFF9800);
		textinputlayout4.setBoxStrokeColor(0xFFFF9800);
		textinputlayout5.setBoxStrokeColor(0xFFFF9800);
		textinputlayout6.setBoxStrokeColor(0xFFFF9800);
		textinputlayout7.setBoxStrokeColor(0xFFFF9800);
		textinputlayout8.setBoxStrokeColor(0xFFFF9800);
		textinputlayout9.setBoxStrokeColor(0xFFFF9800);
		textinputlayout10.setBoxStrokeColor(0xFFFF9800);
		dialogmain = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		textinputlayout1.setBoxBackgroundColor(0xFFFF9800);
		textinputlayout2.setBoxBackgroundColor(0xFFFF9800);
		textinputlayout3.setBoxBackgroundColor(0xFFFF9800);
		textinputlayout4.setBoxBackgroundColor(0xFFFF9800);
		textinputlayout5.setBoxBackgroundColor(0xFFFF9800);
		textinputlayout6.setBoxBackgroundColor(0xFFFF9800);
		textinputlayout7.setBoxBackgroundColor(0xFFFF9800);
		textinputlayout8.setBoxBackgroundColor(0xFFFF9800);
		textinputlayout9.setBoxBackgroundColor(0xFFFF9800);
		textinputlayout10.setBoxBackgroundColor(0xFFFF9800);
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF00BCD4);SketchUi.setCornerRadius(getDip(20));
			SketchUi.setStroke((int)getDip(1) ,0xFFF44336);
			mtn.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF9C27B0}), SketchUi, null);
			mtn.setBackground(SketchUi_RD);
		}
		textinputlayout1.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout2.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout3.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout4.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout5.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout6.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout8.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout9.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout10.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
		textinputlayout7.setBoxBackgroundMode(TextInputLayout.BOX_BACKGROUND_OUTLINE);
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