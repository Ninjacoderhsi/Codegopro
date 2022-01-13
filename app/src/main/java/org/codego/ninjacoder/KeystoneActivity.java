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
import android.widget.EditText;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import org.antlr.v4.runtime.*;
import org.benf.cfr.reader.*;
import com.googlecode.d2j.*;
import org.eclipse.jdt.*;
import io.github.rosemoe.sora.*;
import com.github.angads25.filepicker.*;
import com.google.gson.*;
import javaxml.*;
import io.github.rosemoe.sora.langs.java.*;
import io.github.rosemoe.sora.langs.base.*;
import io.github.rosemoe.sora.langs.python.*;
import com.android.tools.r8.*;
import io.reactivex.*;
import s4u.restore.swb.*;
import com.example.myapp.*;
import com.github.florent37.viewtooltip.*;
import arabware.libs.getThumbnail.*;
import androidx.webkit.*;
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
	private EditText edittext11;
	private Button mtn;
	
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
		edittext11 = findViewById(R.id.edittext11);
		mtn = findViewById(R.id.mtn);
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
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF00BCD4);SketchUi.setCornerRadius(getDip(20));
			SketchUi.setStroke((int)getDip(1) ,0xFFF44336);
			mtn.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF9C27B0}), SketchUi, null);
			mtn.setBackground(SketchUi_RD);
		}
		dialogmain = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
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