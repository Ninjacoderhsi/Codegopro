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
import android.widget.ProgressBar;
import com.github.angads25.filepicker.controller.DialogSelectionListener ;
import com.github.angads25.filepicker.model.DialogConfigs;
import com.github.angads25.filepicker.model.DialogProperties;
import com.github.angads25.filepicker.view.FilePickerDialog;
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
import com.googlecode.dex2jar.v3.Dex2jar;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

public class DextojarActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private String path = "";
	
	private LinearLayout linear1;
	private EditText edittext1;
	private Button button1;
	private ProgressBar progressbar1;
	private Button button2;
	
	private FilePickerDialog di;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.dextojar);
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
		button1 = findViewById(R.id.button1);
		progressbar1 = findViewById(R.id.progressbar1);
		button2 = findViewById(R.id.button2);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				path = edittext1.getText().toString();
				try {
					if (path.equals("")) {
						
					}
					else {
						if (path.endsWith(".dex")) {
							
						}
						else {
							if (FileUtil.isExistFile(path)) {
								progressbar1.setVisibility(View.VISIBLE);
								button1.setVisibility(View.GONE);
								edittext1.setEnabled(false);
								button2.setVisibility(View.GONE);
								new _BackgroundTaskClass(DextojarActivity.this) {
										        @Override
										        public void doInBackground() {
										_ConvertDexToJar(path, path.substring((int)(0), (int)(path.lastIndexOf(".dex"))).concat(".jar"));
										
												        }
										
										        @Override
										        public void onPostExecute() {
												 
										button1.setVisibility(View.VISIBLE);
										progressbar1.setVisibility(View.GONE);
										button2.setVisibility(View.GONE);
										edittext1.setEnabled(true);
										SketchwareUtil.showMessage(getApplicationContext(), "Success to convert - ".concat(path.substring((int)(0), (int)(path.lastIndexOf(".dex"))).concat(".jar")));
												        }
										    }.execute();
							}
							else {
								
							}
						}
					}
				} catch (Exception e) {
					 
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				DialogProperties dip = new DialogProperties();
				dip.selection_mode = DialogConfigs.SINGLE_MODE;
				dip.selection_type = DialogConfigs.FILE_SELECT;
				dip.root = new File(FileUtil.getExternalStorageDir());
				dip.error_dir = new File(FileUtil.getExternalStorageDir());
				dip.offset = new File(FileUtil.getExternalStorageDir());
				dip.extensions = null;
				di = new FilePickerDialog(DextojarActivity.this,dip);
				di.setTitle("انتخاب کنید class.dex");
				di.setDialogSelectionListener(new DialogSelectionListener() {
					@Override public void onSelectedFilePaths(String[] files) {
						edittext1.setText(Arrays.asList(files).get(0).toString());
					} 
				});
				di.show();
			}
		});
	}
	
	private void initializeLogic() {
		
		setTheme(android.R.style.Theme_Material);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE|WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =DextojarActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF212121);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF757575);SketchUi.setCornerRadius(getDip(22));
			SketchUi.setStroke((int)getDip(0) ,0xFFFF9800);
			button1.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFF44336}), SketchUi, null);
			button1.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF757575);SketchUi.setCornerRadius(getDip(22));
			SketchUi.setStroke((int)getDip(0) ,0xFFFF9800);
			button2.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFF44336}), SketchUi, null);
			button2.setBackground(SketchUi_RD);
		}
		progressbar1.setVisibility(View.GONE);
	}
	
	
	@Override
	public void onStart() {
		super.onStart();
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF212121".replace("0xFF" , "#")));
		}
	}
	public void _ConvertDexToJar(final String _DexPath, final String _JarPath) {
		try {
			Dex2jar.from(new java.io.File(_DexPath)).to(new java.io.File(_JarPath));
		} catch(java.io.IOException e) {
		}
	}
	public static abstract class _BackgroundTaskClass {
		
		    private Activity activity;
		    public _BackgroundTaskClass(Activity activity) {
				        this.activity = activity;
				    }
		public _BackgroundTaskClass(Fragment activity) {
				        this.activity = activity.getActivity();
				    }
		public _BackgroundTaskClass(DialogFragment activity) {
				        this.activity = activity.getActivity();
				    }
		
		    private void startBackground() {
				        new Thread(new Runnable() {
						            public void run() {
								Looper.prepare();
								                doInBackground();
								                activity.runOnUiThread(new Runnable() {
										                    public void run() {
												
												                        onPostExecute();
												                    }
										                });
								            }
						        }).start();
				    }
		    public void execute(){
				        startBackground();
				    }
		
		    public abstract void doInBackground();
		    public abstract void onPostExecute();
		
	}
	{
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