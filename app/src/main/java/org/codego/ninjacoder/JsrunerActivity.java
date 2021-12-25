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
import android.webkit.WebView;
import android.webkit.WebSettings;
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
import android.webkit.WebChromeClient;

public class JsrunerActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear1;
	private WebView consoleView;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.jsruner);
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
		consoleView = findViewById(R.id.consoleView);
		consoleView.getSettings().setJavaScriptEnabled(true);
		consoleView.getSettings().setSupportZoom(true);
		
		//no listener code
		
		//no listener code
		
		//webviewOnProgressChanged
		consoleView.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		consoleView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
	}
	
	private void initializeLogic() {
		String string = getIntent().getExtras().getString("sendCode");
		        setTitle("Console");
		        String str = "<html><head><meta charset='UTF-8'><meta name='viewport' content='width=device-width,  initial-scale=1.0'><title>console</title><link rel=\"stylesheet\" href=\"css/saam.min.css\"><link rel=\"stylesheet\" href=\"css/console.css\"></head><body><div class='coutput content scroll-content' id='log'></div><script>var Console = function(code){var args = [];for(var a in arguments){if(typeof arguments[a] == \"object\"){var c = JSON.stringify(arguments[a]);args.push(c);} else { args.push(arguments[a]);}} document.getElementById('log').innerHTML += `<code class='cline'>${args.join('')}</code>`;};(function runCode() { try { " + string.replace("console.log", "Console") + " } catch (err){ document.getElementById('log').innerHTML = `<code class='cline cerror'> ! ${err.message} </code>`; } })();</script></body></html>";
		       /// this.consoleView = (WebView) findViewById(R.id.console_view);
		        WebSettings settings = this.consoleView.getSettings();
		        settings.setJavaScriptEnabled(true);
		        settings.setDomStorageEnabled(true);
		        settings.setDatabaseEnabled(true);
		        settings.setAllowContentAccess(true);
		        settings.setAllowFileAccess(true);
		        settings.setAppCacheEnabled(true);
		        settings.setUseWideViewPort(true);
		        consoleView.setWebChromeClient(new WebChromeClient());
		        consoleView.loadDataWithBaseURL("file:///android_asset/core/", str, "text/html", "utf-8", (String) null);
		        consoleView.setOnLongClickListener(new View.OnLongClickListener() {
			            public boolean onLongClick(View view) {
				                return true;
				            }
			        });
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