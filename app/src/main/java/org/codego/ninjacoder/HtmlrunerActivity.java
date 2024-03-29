package org.codego.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
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
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.content.ClipData;
import android.webkit.WebViewClient;
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
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

public class HtmlrunerActivity extends AppCompatActivity {
	
	public final int REQ_CD_MM = 101;
	
	private String hsi = "";
	private String html = "";
	private String path = "";
	private String path2 = "";
	
	private LinearLayout linear1;
	private WebView mWebView;
	
	private SharedPreferences run;
	private RequestNetwork net;
	private RequestNetwork.RequestListener _net_request_listener;
	private SharedPreferences myweb;
	private Intent mm = new Intent(Intent.ACTION_GET_CONTENT);
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.htmlruner);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
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
		linear1 = findViewById(R.id.linear1);
		mWebView = findViewById(R.id.mWebView);
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.getSettings().setSupportZoom(true);
		run = getSharedPreferences("run", Activity.MODE_PRIVATE);
		net = new RequestNetwork(this);
		myweb = getSharedPreferences("myweb", Activity.MODE_PRIVATE);
		mm.setType("*/*");
		mm.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		
		//no listener code
		
		//no listener code
		
		//webviewOnProgressChanged
		mWebView.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		mWebView.setWebViewClient(new WebViewClient() {
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
		
		_net_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		html = "";
		
		mWebView.loadUrl("file:///".concat(getIntent().getStringExtra("send")));
		mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.getSettings().setLoadWithOverviewMode(true);
		mWebView.getSettings().setUseWideViewPort(true);
		mWebView.getSettings().setDisplayZoomControls(true);
		mWebView.getSettings().setBuiltInZoomControls(true);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =HtmlrunerActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF000027);
		}
		 if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
				      
			/////webview drak mod on
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(mWebView.getSettings(), WebSettingsCompat.FORCE_DARK_ON);
			////dont edit code ples
			///add library webkit
					        
				    } else {
				      
				    ////this code webview dark mod of
			////used library webkit 
			if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK));
			WebSettingsCompat.setForceDark(mWebView.getSettings(), WebSettingsCompat.FORCE_DARK_OFF);
			////the code not work android 4~9
			///used android 10 up ples add block if sdk android 10 up
			////the code by google 
			///add block by ninja coder.ir
			///dont edit code
			////dont used block try  
				    }
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_MM:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF000027".replace("0xFF" , "#")));
		}
		
		/*
add library com.github.angads25:filepicker:1.1.1
*/
		
		mWebView.getSettings().setDisplayZoomControls(true);
		mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
		mWebView.getSettings().setAppCacheMaxSize(5*1024*1024); 
		mWebView.getSettings().setAppCachePath(getApplicationContext().getCacheDir().getAbsolutePath()); 
		mWebView.getSettings().setAllowFileAccess(true);
		mWebView.getSettings().setAppCacheEnabled(true);
		mWebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		mWebView.getSettings().setLoadWithOverviewMode(true);
		mWebView.getSettings().setUseWideViewPort(true);
		mWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
		mWebView.getSettings().setDomStorageEnabled(true);
		mWebView.getSettings().setSaveFormData(true);mWebView.setWebChromeClient(new WebChromeClient());
		mWebView.getSettings().setDomStorageEnabled(true);
		
		mWebView.setWebChromeClient(new WebChromeClient() {
				
							private ValueCallback<Uri[]> mFilePathCallback;
			
							public boolean onShowFileChooser(WebView mWebView, final ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
													
								com.github.angads25.filepicker.model.DialogProperties filePickerp = new com.github.angads25.filepicker.model.DialogProperties();
										
										filePickerp.selection_mode = com.github.angads25.filepicker.model.DialogConfigs.MULTI_MODE;
										
										filePickerp.selection_type = com.github.angads25.filepicker.model.DialogConfigs.FILE_SELECT;
										
										filePickerp.root = new java.io.File(FileUtil.getExternalStorageDir());
										
										filePickerp.error_dir = new java.io.File(FileUtil.getExternalStorageDir());
										
										filePickerp.offset = new java.io.File(FileUtil.getExternalStorageDir());
										
										filePickerp.extensions = null;
										
										final com.github.angads25.filepicker.view.FilePickerDialog filePicker = new com.github.angads25.filepicker.view.FilePickerDialog(HtmlrunerActivity.this,filePickerp);
										
										filePicker.setTitle("pick what you want!!!");
										
										filePicker.setPositiveBtnName("Pick File");
										
										filePicker.setNegativeBtnName("cancel");
										filePicker.setDialogSelectionListener(new com.github.angads25.filepicker.controller.DialogSelectionListener() {
															@Override public void onSelectedFilePaths(String[] files) {
														
											java.io.File file = new java.io.File(new String (files[0]));
											
											Uri uri = Uri.fromFile(file);
											
											
											
											if (mFilePathCallback != null) {
												                    mFilePathCallback.onReceiveValue(null);
												                }
										                mFilePathCallback = filePathCallback;
										                mFilePathCallback.onReceiveValue(new Uri[]{uri});
										                mFilePathCallback = null;			
																		
												} 
										});
										filePicker.show();
								
								return true; }
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