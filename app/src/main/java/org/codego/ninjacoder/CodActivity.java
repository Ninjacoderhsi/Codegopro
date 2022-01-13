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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import com.airbnb.lottie.*;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.widget.AdapterView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import android.graphics.Typeface;
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

public class CodActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double length = 0;
	private double number = 0;
	private HashMap<String, Object> save = new HashMap<>();
	private String saves = "";
	private String value = "";
	private String forSearch = "";
	
	private ArrayList<HashMap<String, Object>> ni = new ArrayList<>();
	
	private LinearLayout linear1;
	private ProgressBar progressbar1;
	private LinearLayout linear2;
	private ListView listview1;
	private LottieAnimationView lottie1;
	
	private RequestNetwork n;
	private RequestNetwork.RequestListener _n_request_listener;
	private Intent myintent = new Intent();
	private TimerTask i;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.cod);
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
		progressbar1 = findViewById(R.id.progressbar1);
		linear2 = findViewById(R.id.linear2);
		listview1 = findViewById(R.id.listview1);
		lottie1 = findViewById(R.id.lottie1);
		n = new RequestNetwork(this);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				myintent.setClass(getApplicationContext(), ViewActivity.class);
				myintent.putExtra("code", ni.get((int)_position).get("code").toString());
				startActivity(myintent);
			}
		});
		
		_n_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				try {
					ni = new Gson().fromJson(_response, new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
					listview1.setAdapter(new Listview1Adapter(ni));
					((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
				} catch (Exception e) {
					 
				}
				progressbar1.setVisibility(View.GONE);
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				progressbar1.setVisibility(View.VISIBLE);
			}
		};
	}
	
	private void initializeLogic() {
		n.startRequestNetwork(RequestNetworkController.GET, "https://raw.githubusercontent.com/Ninjacoderhsi/teat/main/mycode.json", "a", _n_request_listener);
		setTitle("Java code!");
		progressbar1.setVisibility(View.GONE);
		if (android.os.Build.VERSION.SDK_INT >= 21) {
				progressbar1.getIndeterminateDrawable().setColorFilter(Color.parseColor("#FF9C00"), PorterDuff.Mode.SRC_IN);
		}
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =CodActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000027);
		}
		linear1.setBackgroundColor(0xFF000027);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF000027".replace("0xFF" , "#")));
		}
	}
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.code, null);
			}
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			
			textview1.setText(ni.get((int)_position).get("title").toString());
			cardview1.setCardBackgroundColor(0xB7001341);
			textview1.setText(textview1.getText().toString());
			
			TextPaint paint = textview1.getPaint();
			
			float width = paint.measureText(textview1.getText().toString()); 
			
			Shader textShader = new LinearGradient(0, 0, width,textview1.getTextSize(), new int[]{ 
				
				Color.parseColor("#FFFF001C"), Color.parseColor("#FF0056FF"), 
				
				/*

 //More Colors 

Color.parseColor("#64B678"), Color.parseColor("#478AEA"), Color.parseColor("#8446CC"), 

*/
				
				
			}, null,Shader.TileMode.CLAMP); 
			
			/* By EPIC Technical Tricks YT */
			
			textview1.getPaint().setShader(textShader);
			cardview1.setRadius((float)15);
			cardview1.setCardElevation((float)2);
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myfont.ttf"), 0);
			
			return _view;
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