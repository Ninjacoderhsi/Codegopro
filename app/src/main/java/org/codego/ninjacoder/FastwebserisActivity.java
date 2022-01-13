package org.codego.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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
import android.widget.ImageView;
import android.widget.EditText;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;
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

public class FastwebserisActivity extends AppCompatActivity {
	
	private FloatingActionButton _fab;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private ImageView back;
	private EditText edittext1;
	private ImageView home;
	private WebView webview1;
	private ImageView imageview3;
	private LinearLayout linear5;
	private ImageView imageview4;
	
	private RequestNetwork n;
	private RequestNetwork.RequestListener _n_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.fastwebseris);
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
		_fab = findViewById(R.id._fab);
		
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		back = findViewById(R.id.back);
		edittext1 = findViewById(R.id.edittext1);
		home = findViewById(R.id.home);
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		imageview3 = findViewById(R.id.imageview3);
		linear5 = findViewById(R.id.linear5);
		imageview4 = findViewById(R.id.imageview4);
		n = new RequestNetwork(this);
		
		back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				if ((edittext1.getText().toString().indexOf("http://") == 0) || ("https://".indexOf(edittext1.getText().toString()) == 0)) {
						webview1.loadUrl(edittext1.getText().toString());
				}
				else {
						if (edittext1.getText().toString().indexOf("www.") == 0) {
								webview1.loadUrl("http://".concat(edittext1.getText().toString()));
						}
						else {
								webview1.loadUrl("https://www.google.com/search?q=".concat(edittext1.getText().toString()));
						}
				}
				
				
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		home.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://www.google.com");
			}
		});
		
		//no listener code
		
		//no listener code
		
		//webviewOnProgressChanged
		webview1.setWebChromeClient(new WebChromeClient() {
				@Override public void onProgressChanged(WebView view, int _newProgress) {
					
				}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
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
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.goForward();
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.goBack();
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("javascript:(function () { var script = document.createElement('script'); script.src=\"//cdn.jsdelivr.net/npm/eruda\"; document.body.appendChild(script); script.onload = function () { eruda.init() } })();");
			}
		});
		
		_n_request_listener = new RequestNetwork.RequestListener() {
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
		
		
		/*
add library com.github.angads25:filepicker:1.1.1
*/
		
		webview1.getSettings().setDisplayZoomControls(true);
		webview1.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
		webview1.getSettings().setAppCacheMaxSize(5*1024*1024); 
		webview1.getSettings().setAppCachePath(getApplicationContext().getCacheDir().getAbsolutePath()); 
		webview1.getSettings().setAllowFileAccess(true);
		webview1.getSettings().setAppCacheEnabled(true);
		webview1.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		webview1.getSettings().setLoadWithOverviewMode(true);
		webview1.getSettings().setUseWideViewPort(true);
		webview1.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
		webview1.getSettings().setDomStorageEnabled(true);
		webview1.getSettings().setSaveFormData(true);webview1.setWebChromeClient(new WebChromeClient());
		webview1.getSettings().setDomStorageEnabled(true);
		
		webview1.setWebChromeClient(new WebChromeClient() {
				
							private ValueCallback<Uri[]> mFilePathCallback;
			
							public boolean onShowFileChooser(WebView mWebView, final ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
													
								com.github.angads25.filepicker.model.DialogProperties filePickerp = new com.github.angads25.filepicker.model.DialogProperties();
										
										filePickerp.selection_mode = com.github.angads25.filepicker.model.DialogConfigs.MULTI_MODE;
										
										filePickerp.selection_type = com.github.angads25.filepicker.model.DialogConfigs.FILE_SELECT;
										
										filePickerp.root = new java.io.File(FileUtil.getExternalStorageDir());
										
										filePickerp.error_dir = new java.io.File(FileUtil.getExternalStorageDir());
										
										filePickerp.offset = new java.io.File(FileUtil.getExternalStorageDir());
										
										filePickerp.extensions = null;
										
										final com.github.angads25.filepicker.view.FilePickerDialog filePicker = new com.github.angads25.filepicker.view.FilePickerDialog(FastwebserisActivity.this,filePickerp);
										
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
		
		webview1.loadUrl("https://www.google.com");
		edittext1.setText(webview1.getUrl());
	}
	
	@Override
	public void onStart() {
		super.onStart();
		webview1.getSettings().setSavePassword(true);
		if (android.os.Build.VERSION.SDK_INT >= 21) { 
			CookieManager.getInstance().setAcceptThirdPartyCookies(webview1, true); 
		} else {   
			CookieManager.getInstance().setAcceptCookie(true); }
		webview1.getSettings().setAppCacheEnabled(true);
		webview1.getSettings().setAppCachePath("/data/data" + getPackageName() + "/cache");
		webview1.getSettings().setSaveFormData(true);
		webview1.getSettings().setDatabaseEnabled(true);
		webview1.getSettings().setDomStorageEnabled(true);
		
		CookieManager.getInstance().acceptCookie();
		CookieManager.setAcceptFileSchemeCookies(true);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setDisplayZoomControls(true);
		webview1.getSettings().setBuiltInZoomControls(false);
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFFFFFFFF);SketchUi.setCornerRadius(getDip(51));
			edittext1.setElevation(getDip(5));
			edittext1.setBackground(SketchUi);
		}
		webview1.setDownloadListener(new DownloadListener() {       
			@Override
			public void onDownloadStart(String url, String userAgent,
			                                    String contentDisposition, String mimetype,
			                                    long contentLength) {
				DownloadManager.Request request = new DownloadManager.Request(
				                    Uri.parse(url));
				request.allowScanningByMediaScanner();
				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED); //Notify client once download is completed!
				final String filename= URLUtil.guessFileName(url, contentDisposition, mimetype);
				request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, filename);
				            DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
				            dm.enqueue(request);
				Toast.makeText(getApplicationContext(), "Downloading File", //To notify the Client that the file is being downloaded
				                    Toast.LENGTH_LONG).show();
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