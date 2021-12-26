package org.codego.ninjacoder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ScrollView;
import com.airbnb.lottie.*;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.widget.AdapterView;
import android.view.View;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Typeface;
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
import android.view.inputmethod.InputMethodManager;
import java.io.File.*;;

public class CodegomainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private DrawerLayout _drawer;
	private String subtitle = "";
	private String Folder = "";
	private double position = 0;
	private String Upfolder = "";
	private String mainfile = "";
	private String CreateFolder = "";
	private double na = 0;
	private String myzip = "";
	private String hsi = "";
	private String swb = "";
	private String fundangocontextError = "";
	private String Apkinstallermaincontext = "";
	
	private ArrayList<String> liststring = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> File_map = new ArrayList<>();
	
	private LinearLayout linear1;
	private ListView listview1;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private ScrollView _drawer_vscroll1;
	private LottieAnimationView _drawer_lottie3;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_javacode;
	private LinearLayout _drawer_websya;
	private LinearLayout _drawer_bord;
	private LinearLayout _drawer_likey;
	private LinearLayout _drawer_mygithub;
	private LinearLayout _drawer_myket;
	private LinearLayout _drawer_rubikalinear;
	private LinearLayout _drawer_sting;
	private LinearLayout _drawer_exit;
	private DigitalClock _drawer_digitalclock1;
	private ImageView _drawer_jaricon;
	private TextView _drawer_javacode1;
	private ImageView _drawer_fastweb;
	private TextView _drawer_fastweb1;
	private ImageView _drawer_keyicon;
	private TextView _drawer_key;
	private ImageView _drawer_iconkey;
	private TextView _drawer_key11;
	private ImageView _drawer_imageview1;
	private TextView _drawer_textview1;
	private ImageView _drawer_googlep;
	private TextView _drawer_myket1;
	private ImageView _drawer_myicon;
	private TextView _drawer_rubikatextview1;
	private ImageView _drawer_stingicon;
	private TextView _drawer_stingtext;
	private ImageView _drawer_myexit;
	private TextView _drawer_exit1;
	
	private Intent intent = new Intent();
	private AlertDialog.Builder dialogmain;
	private AlertDialog.Builder dialog;
	private Intent hhhh = new Intent();
	private AlertDialog.Builder ninja;
	private AlertDialog.Builder cdm;
	private TimerTask timer;
	private AlertDialog.Builder keyboard;
	private Intent u8 = new Intent();
	private Intent Settings = new Intent();
	private AlertDialog.Builder rubikajoined;
	private Intent intentrubika = new Intent();
	private Intent intentrubikagp = new Intent();
	private SharedPreferences n;
	private SharedPreferences b;
	private ProgressDialog pro;
	private TimerTask main;
	private AlertDialog.Builder mydialog;
	private Intent img = new Intent();
	private ProgressDialog swbpro;
	private MediaPlayer media;
	private TimerTask thistimerindexmain;
	private AlertDialog.Builder Assasssincreed;
	private Intent mykey = new Intent();
	private Intent intentmygithub = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.codegomain);
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
		_fab = findViewById(R.id._fab);
		
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(CodegomainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		linear1 = findViewById(R.id.linear1);
		listview1 = findViewById(R.id.listview1);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = _nav_view.findViewById(R.id.linear2);
		_drawer_vscroll1 = _nav_view.findViewById(R.id.vscroll1);
		_drawer_lottie3 = _nav_view.findViewById(R.id.lottie3);
		_drawer_linear3 = _nav_view.findViewById(R.id.linear3);
		_drawer_linear4 = _nav_view.findViewById(R.id.linear4);
		_drawer_javacode = _nav_view.findViewById(R.id.javacode);
		_drawer_websya = _nav_view.findViewById(R.id.websya);
		_drawer_bord = _nav_view.findViewById(R.id.bord);
		_drawer_likey = _nav_view.findViewById(R.id.likey);
		_drawer_mygithub = _nav_view.findViewById(R.id.mygithub);
		_drawer_myket = _nav_view.findViewById(R.id.myket);
		_drawer_rubikalinear = _nav_view.findViewById(R.id.rubikalinear);
		_drawer_sting = _nav_view.findViewById(R.id.sting);
		_drawer_exit = _nav_view.findViewById(R.id.exit);
		_drawer_digitalclock1 = _nav_view.findViewById(R.id.digitalclock1);
		_drawer_jaricon = _nav_view.findViewById(R.id.jaricon);
		_drawer_javacode1 = _nav_view.findViewById(R.id.javacode1);
		_drawer_fastweb = _nav_view.findViewById(R.id.fastweb);
		_drawer_fastweb1 = _nav_view.findViewById(R.id.fastweb1);
		_drawer_keyicon = _nav_view.findViewById(R.id.keyicon);
		_drawer_key = _nav_view.findViewById(R.id.key);
		_drawer_iconkey = _nav_view.findViewById(R.id.iconkey);
		_drawer_key11 = _nav_view.findViewById(R.id.key11);
		_drawer_imageview1 = _nav_view.findViewById(R.id.imageview1);
		_drawer_textview1 = _nav_view.findViewById(R.id.textview1);
		_drawer_googlep = _nav_view.findViewById(R.id.googlep);
		_drawer_myket1 = _nav_view.findViewById(R.id.myket1);
		_drawer_myicon = _nav_view.findViewById(R.id.myicon);
		_drawer_rubikatextview1 = _nav_view.findViewById(R.id.rubikatextview1);
		_drawer_stingicon = _nav_view.findViewById(R.id.stingicon);
		_drawer_stingtext = _nav_view.findViewById(R.id.stingtext);
		_drawer_myexit = _nav_view.findViewById(R.id.myexit);
		_drawer_exit1 = _nav_view.findViewById(R.id.exit1);
		dialogmain = new AlertDialog.Builder(this);
		dialog = new AlertDialog.Builder(this);
		ninja = new AlertDialog.Builder(this);
		cdm = new AlertDialog.Builder(this);
		keyboard = new AlertDialog.Builder(this);
		rubikajoined = new AlertDialog.Builder(this);
		n = getSharedPreferences("n", Activity.MODE_PRIVATE);
		b = getSharedPreferences("b", Activity.MODE_PRIVATE);
		mydialog = new AlertDialog.Builder(this);
		Assasssincreed = new AlertDialog.Builder(this);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				position = _position;
				if (FileUtil.isDirectory(liststring.get((int)(_position)))) {
					Folder = liststring.get((int)(_position));
					_RefreshData();
				}
				else {
					if (liststring.get((int)(_position)).endsWith(".html")) {
						cdm.setTitle("Code go");
						cdm.setIcon(R.drawable.greadliconpack_7);
						cdm.setMessage("یکی از گزینه های زیر را انتخاب کنید.");
						cdm.setPositiveButton("ویرایش و مشاهده", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								intent.setClass(getApplicationContext(), CodeeditorActivity.class);
								intent.putExtra("path", liststring.get((int)(_position)));
								intent.putExtra("save", liststring.get((int)(_position)));
								intent.putExtra("mypath", FileUtil.readFile(liststring.get((int)(_position))));
								intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
								startActivity(intent);
							}
						});
						cdm.setNeutralButton("مشاهده کنید فقط", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								hhhh.setClass(getApplicationContext(), HtmlviewerActivity.class);
								hhhh.putExtra("path", liststring.get((int)(_position)));
								hhhh.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
								startActivity(hhhh);
							}
						});
						cdm.create().show();
					}
					if (liststring.get((int)(_position)).endsWith(".py")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", liststring.get((int)(_position)));
						intent.putExtra("save", liststring.get((int)(_position)));
						intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(intent);
					}
					if (liststring.get((int)(_position)).endsWith(".lua")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", liststring.get((int)(_position)));
						intent.putExtra("save", liststring.get((int)(_position)));
						intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(intent);
					}
					if (liststring.get((int)(_position)).endsWith(".js")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", liststring.get((int)(_position)));
						intent.putExtra("save", liststring.get((int)(_position)));
						intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(intent);
					}
					if (liststring.get((int)(_position)).endsWith(".cpp")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", liststring.get((int)(_position)));
						intent.putExtra("save", liststring.get((int)(_position)));
						intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(intent);
					}
					if (liststring.get((int)(_position)).endsWith(".sh")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", liststring.get((int)(_position)));
						intent.putExtra("save", liststring.get((int)(_position)));
						intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(intent);
					}
					if (liststring.get((int)(_position)).endsWith(".css")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", liststring.get((int)(_position)));
						intent.putExtra("save", liststring.get((int)(_position)));
						intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(intent);
					}
					if (liststring.get((int)(_position)).endsWith(".php")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", liststring.get((int)(_position)));
						intent.putExtra("save", liststring.get((int)(_position)));
						intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(intent);
					}
					if (liststring.get((int)(_position)).endsWith(".xml")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", liststring.get((int)(_position)));
						intent.putExtra("save", liststring.get((int)(_position)));
						intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(intent);
					}
					if (liststring.get((int)(_position)).endsWith(".svg")) {
						dialog.setTitle("SVG ");
						dialog.setIcon(R.drawable.greadliconpack_4);
						dialog.setMessage(getResources().getString(R.string.dialog_svgTitle1));
						dialog.setPositiveButton(getResources().getString(R.string.svgview), new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								try {
									intent.setClass(getApplicationContext(), CodeeditorActivity.class);
									intent.putExtra("path", liststring.get((int)(_position)));
									intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
									startActivity(intent);
								} catch (Exception e) {
									 
								}
							}
						});
						dialog.setNeutralButton(getResources().getString(R.string.svgNo), new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								try {
									intent.setClass(getApplicationContext(), CodeeditorActivity.class);
									intent.putExtra("path", liststring.get((int)(_position)));
									intent.putExtra("save", liststring.get((int)(_position)));
								} catch (Exception e) {
									 
								}
							}
						});
						dialog.create().show();
					}
					if (liststring.get((int)(_position)).endsWith(".vue")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", liststring.get((int)(_position)));
						hhhh.putExtra("save", liststring.get((int)(_position)));
						hhhh.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(hhhh);
					}
					if (liststring.get((int)(_position)).endsWith(".java")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", liststring.get((int)(_position)));
						hhhh.putExtra("save", liststring.get((int)(_position)));
						hhhh.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(hhhh);
					}
					if (liststring.get((int)(_position)).endsWith(".dart")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", liststring.get((int)(_position)));
						hhhh.putExtra("save", liststring.get((int)(_position)));
						hhhh.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(hhhh);
					}
					if (liststring.get((int)(_position)).endsWith(".fun")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", liststring.get((int)(_position)));
						hhhh.putExtra("save", liststring.get((int)(_position)));
						hhhh.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(hhhh);
					}
					if (liststring.get((int)(_position)).endsWith(".c")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", liststring.get((int)(_position)));
						hhhh.putExtra("save", liststring.get((int)(_position)));
						hhhh.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(hhhh);
					}
					if (liststring.get((int)(_position)).endsWith(".go")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", liststring.get((int)(_position)));
						hhhh.putExtra("save", liststring.get((int)(_position)));
						hhhh.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(hhhh);
					}
					if (liststring.get((int)(_position)).endsWith(".co")) {
						pro = new ProgressDialog(CodegomainActivity.this);
						pro.setTitle("در حال نصب ....");
						pro.setCanceledOnTouchOutside(false);
						main = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										while(true) {
											try {
												String fileZip = liststring.get((int)(_position));
												        java.io.File destDir = new java.io.File("/sdcard/htmlgo/");
												        byte[]  buffer = new byte[1024] ;
												        try {
													        java.util.zip.ZipInputStream zis = new java.util.zip.ZipInputStream(new java.io.FileInputStream(fileZip));
													        java.util.zip.ZipEntry zipEntry = zis.getNextEntry();
													
													
													        while (zipEntry != null) {
														             java.io.File newFile = newFile(destDir, zipEntry);
														             if (zipEntry.isDirectory()) {
															                 if (!newFile.isDirectory() && !newFile.mkdirs()) {
																                     throw new java.io.IOException("Failed to create directory " + newFile);
																                 }
															             } else {
															                 // fix for Windows-created archives
															                 java.io.File parent = newFile.getParentFile();
															                 if (!parent.isDirectory() && !parent.mkdirs()) {
																                     throw new java.io.IOException("Failed to create directory " + parent);
																                 }
															
															                 // write file content
															                 java.io.FileOutputStream fos = new java.io.FileOutputStream(newFile);
															                 int len;
															                 while ((len = zis.read(buffer)) > 0) {
																                     fos.write(buffer, 0, len);
																                 }
															                 fos.close();
															             }
														         zipEntry = zis.getNextEntry();
														        }
													        zis.closeEntry();
													        zis.close();
												} catch (Exception e) {
													  showMessage(e.toString());
													   }
												SketchwareUtil.showMessage(getApplicationContext(), "نصب شد");
											} catch (Exception e) {
												SketchwareUtil.showMessage(getApplicationContext(), e.toString());
											}
											pro.dismiss();
											break;
										}
									}
								});
							}
						};
						_timer.schedule(main, (int)(5000));
						pro.show();
					}
					if (liststring.get((int)(_position)).endsWith(".jpg") || (liststring.get((int)(_position)).endsWith(".png") || liststring.get((int)(_position)).endsWith(".bmp"))) {
						img.setClass(getApplicationContext(), ImageviewActivity.class);
						img.putExtra("im", liststring.get((int)(_position)));
						img.putExtra("ti", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(img);
					}
					if (liststring.get((int)(_position)).endsWith(".swb")) {
						swbpro = new ProgressDialog(CodegomainActivity.this);
						swbpro.setTitle("در حال نصب پروژه ");
						swbpro.setMessage("نصب پروژه : ".concat(liststring.get((int)(_position)).concat(" ")));
						swbpro.setCanceledOnTouchOutside(false);
						thistimerindexmain = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										while(true) {
											try {
												FileUtil.writeFile("##this dont edit", "#this swb promision ");
												swb = liststring.get((int)(_position));
												
											} catch (Exception e) {
												fundangocontextError = "Error this  ";
												SketchwareUtil.showMessage(getApplicationContext(), fundangocontextError.concat(e.toString()));
												((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", fundangocontextError.concat("خطا مشکلی پیش امده است با سازنده تماس بگرید و مشکل خود را بیان کنید ")));
											}
											swbpro.dismiss();
											break;
										}
									}
								});
							}
						};
						_timer.schedule(thistimerindexmain, (int)(2000));
						swbpro.show();
					}
					if (liststring.get((int)(_position)).endsWith(".mp3")) {
						try {
							    media = new MediaPlayer();
							        media.setDataSource(liststring.get((int)(_position)));
							        media.prepare();
							    } catch (java.io.IOException e) {
							        e.printStackTrace();
							    }
						final AlertDialog.Builder alert = new AlertDialog.Builder(CodegomainActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_LIGHT); 
						    final Button btn = new Button(getApplicationContext()); 
						    btn.setText("⏮");
						    btn.setPadding(0,0,0,0);
						    btn.setLayoutParams(new LinearLayout.LayoutParams(155, 85));
						    final Button btn2 = new Button(getApplicationContext()); 
						    btn2.setText("⏭");
						    btn2.setPadding(0,0,0,0);
						    btn2.setLayoutParams(new LinearLayout.LayoutParams(155, 85));
						    final Button btn3 = new Button(getApplicationContext()); 
						    btn3.setLayoutParams(new LinearLayout.LayoutParams(110, 85));
						    btn3.setText("▶️");
						    btn3.setPadding(0,0,0,0);
						    alert.setTitle("play : ".concat(liststring.get((int)(_position)).concat(" ")));
						    
						    final SeekBar seek = new SeekBar(getApplicationContext()); 
						    LinearLayout parent = new LinearLayout(getApplicationContext()); parent.setLayoutParams(new android.widget.LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT, 250)); parent.setOrientation(LinearLayout.VERTICAL); 
						    LinearLayout parent2 = new LinearLayout(getApplicationContext()); parent2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.WRAP_CONTENT, android.widget.LinearLayout.LayoutParams.WRAP_CONTENT)); parent.setOrientation(LinearLayout.VERTICAL); 
						    parent.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
						    
						    parent.addView(seek);
						    parent2.addView(btn);
						    parent2.addView(btn2);
						    parent2.addView(btn3);
						    parent.addView(parent2);
						    alert.setCancelable(false);
						    
						    seek.setMax((int)media.getDuration()/90); 
						    
						    final Handler mHandler = new Handler();
						    runOnUiThread(new Runnable() {
							     
							         @Override
							         public void run() {
								              if(media != null){
									                   int mCurrentPosition = media.getCurrentPosition() / 90;
									                   seek.setProgress(mCurrentPosition);
									               }
								              mHandler.postDelayed(this, 90);
								          }
							    });
						    seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
							     
							             @Override
							             public void onStopTrackingTouch(SeekBar seekBar) {
								      
								              }
							     
							             @Override
							             public void onStartTrackingTouch(SeekBar seekBar) {
								      
								              }
							     
							                 @Override
							                 public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {                
								                      if(media != null && fromUser){
									                           media.seekTo(progress * 90);
									                       }
								                  }
							         });
						     
						    btn.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)500, 0xFFFF9800));
						    btn2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)500, 0xFFFF9800));
						    btn3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)500, 0xFFFF9800));
						   
						  btn3.setOnTouchListener(new View.OnTouchListener() {
							     @Override
							     public boolean onTouch(View v, MotionEvent event) {
								      switch (event.getAction()){
									       case MotionEvent.ACTION_DOWN:{
										        ObjectAnimator scaleX = new ObjectAnimator();
										        scaleX.setTarget(btn3);
										        scaleX.setPropertyName("scaleX");
										        scaleX.setFloatValues(0.9f);
										        scaleX.setDuration((int)5);
										        scaleX.start();
										        
										        ObjectAnimator scaleY = new ObjectAnimator();
										        scaleY.setTarget(btn3);
										        scaleY.setPropertyName("scaleY");
										        scaleY.setFloatValues(0.9f);
										        scaleY.setDuration((int)5);
										        scaleY.start();
										        break;
										       }
									       case MotionEvent.ACTION_UP:{
										        
										        ObjectAnimator scaleX = new ObjectAnimator();
										        scaleX.setTarget(btn3);
										scaleX.setPropertyName("scaleX");
										scaleX.setFloatValues((float)1);
										        scaleX.setDuration((int)5);
										scaleX.
										start();
										        
										        ObjectAnimator scaleY = new ObjectAnimator();
										        scaleY.setTarget(btn3);
										        scaleY.setPropertyName("scaleY");
										        scaleY.setFloatValues((float)1);
										        scaleY.setDuration((int)5);
										        scaleY.start();
										        
										        break;
										       }
									      }
								      return false;
								     }
							    });
						    btn.setOnTouchListener(new View.OnTouchListener() {
							     @Override
							     public boolean onTouch(View v, MotionEvent event) {
								      switch (event.getAction()){
									       case MotionEvent.ACTION_DOWN:{
										        ObjectAnimator scaleX = new ObjectAnimator();
										        scaleX.setTarget(btn);
										        scaleX.setPropertyName("scaleX");
										        scaleX.setFloatValues(0.9f);
										        scaleX.setDuration((int)5);
										        scaleX.start();
										        
										        ObjectAnimator scaleY = new ObjectAnimator();
										        scaleY.setTarget(btn);
										        scaleY.setPropertyName("scaleY");
										        scaleY.setFloatValues(0.9f);
										        scaleY.setDuration((int)5);
										        scaleY.start();
										        break;
										       }
									       case MotionEvent.ACTION_UP:{
										        
										        ObjectAnimator scaleX = new ObjectAnimator();
										        scaleX.setTarget(btn);
										        scaleX.setPropertyName("scaleX");
										        scaleX.setFloatValues((float)1);
										        scaleX.setDuration((int)5);
										        scaleX.start();
										        
										        ObjectAnimator scaleY = new ObjectAnimator();
										        scaleY.setTarget(btn);
										        scaleY.setPropertyName("scaleY");
										        scaleY.setFloatValues((float)1);
										        scaleY.setDuration((int)5);
										        scaleY.start();
										        
										        break;
										       }
									      }
								      return false;
								     }
							    });
						    btn2.setOnTouchListener(new View.OnTouchListener() {
							     @Override
							     public boolean onTouch(View v, MotionEvent event) {
								      switch (event.getAction()){
									       case MotionEvent.ACTION_DOWN:{
										        ObjectAnimator scaleX = new ObjectAnimator();
										        scaleX.setTarget(btn2);
										        scaleX.setPropertyName("scaleX");
										        scaleX.setFloatValues(0.9f);
										        scaleX.setDuration((int)5);
										        scaleX.start();
										        
										        ObjectAnimator scaleY = new ObjectAnimator();
										        scaleY.setTarget(btn2);
										        scaleY.setPropertyName("scaleY");
										        scaleY.setFloatValues(0.9f);
										        scaleY.setDuration((int)5);
										        scaleY.start();
										        break;
										       }
									       case MotionEvent.ACTION_UP:{
										        
										        ObjectAnimator scaleX = new ObjectAnimator();
										        scaleX.setTarget(btn2);
										        scaleX.setPropertyName("scaleX");
										        scaleX.setFloatValues((float)1);
										        scaleX.setDuration((int)5);
										        scaleX.start();
										        
										        ObjectAnimator scaleY = new ObjectAnimator();
										        scaleY.setTarget(btn2);
										        scaleY.setPropertyName("scaleY");
										        scaleY.setFloatValues((float)1);
										        scaleY.setDuration((int)5);
										        scaleY.start();
										        
										        break;
										       }
									      }
								      return false;
								     }
							    });
						    if (media.isPlaying()) {
							     btn3.setText("⏸");
							    }
						    else {
							     btn3.setText("▶️");
							    }
						    btn.setOnClickListener(new View.OnClickListener() {
							     @Override
							     public void onClick(View _view) {
								      media.release();
								     }
							    });
						    
						    btn2.setOnClickListener(new View.OnClickListener() {
							     @Override
							     public void onClick(View _view) {
								      media.reset();
								     }
							    });
						    btn3.setOnClickListener(new View.OnClickListener() {
							     @Override
							     public void onClick(View _view) {
								      if (media.isPlaying()) {
									       btn3.setText("▶️");
									       media.pause();
									      }
								      else {
									       btn3.setText("⏸");
									       media.start();
									      }
								     }
							    });
						    final String _btn9 = ("Exit");
						    alert.setPositiveButton(_btn9, new DialogInterface.OnClickListener() {
							          @Override
							          public void onClick(DialogInterface _dialog, int _which) {
								           media.reset();
								      
								     }
							         });
						    seek.setProgressTintList(ColorStateList.valueOf(0xFFFF9800));
						    
						    seek.getThumb().setColorFilter((0xFFFF9800), PorterDuff.Mode.MULTIPLY);
						    
						    alert.setView(parent);
						    final AlertDialog bb = alert.create();
						    bb.show();
					}
					if (liststring.get((int)(_position)).endsWith(".apk")) {
						try {
							if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
													Uri uri = androidx.core.content.FileProvider.getUriForFile(getApplicationContext(),
															CodegomainActivity.this.getPackageName() + ".provider", new java.io.File(liststring.get((int)(_position))));
													Intent intent = new Intent(Intent.ACTION_VIEW);
													intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
													intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
													intent.setDataAndType(uri, "application/vnd.android.package-archive");
													startActivity(intent);
								
											} else {
													Intent intent = new Intent(Intent.ACTION_VIEW);
													intent.setDataAndType(Uri.fromFile( new java.io.File(liststring.get((int)(_position)))),
															"application/vnd.android.package-archive");
													intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
													startActivity(intent);
											}
							
						} catch (Exception rr) {
							showMessage (rr.toString());
						}
					}
					if (liststring.get((int)(_position)).endsWith(".rb")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", liststring.get((int)(_position)));
						hhhh.putExtra("save", liststring.get((int)(_position)));
						hhhh.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(hhhh);
					}
					if (liststring.get((int)(_position)).endsWith(".pas")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", liststring.get((int)(_position)));
						hhhh.putExtra("save", liststring.get((int)(_position)));
						hhhh.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
						startActivity(hhhh);
					}
				}
			}
		});
		
		listview1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
				return true;
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				final AlertDialog dialog1 = new AlertDialog.Builder(CodegomainActivity.this).create();
				View inflate = getLayoutInflater().inflate(R.layout.pos,null); 
				dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
				dialog1.setView(inflate);
				LinearLayout mybg = (LinearLayout) inflate.findViewById(R.id.mybg);
				LinearLayout soon = (LinearLayout) inflate.findViewById(R.id.soon);
				LinearLayout makefolder = (LinearLayout) inflate.findViewById(R.id.makefolder);
				LinearLayout makefile = (LinearLayout) inflate.findViewById(R.id.makefile);
				LinearLayout projectCo = (LinearLayout) inflate.findViewById(R.id.projectCo);
				TextView soon1 = (TextView) inflate.findViewById(R.id.soon1);
				TextView makefile1 = (TextView) inflate.findViewById(R.id.makefile1);
				TextView makefolder1 = (TextView) inflate.findViewById(R.id.makefolder1);
				TextView projectCo1 = (TextView) inflate.findViewById(R.id.projectCo1);
				{
					android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
					SketchUi.setColor(0xFF424242);SketchUi.setCornerRadius(getDip(8));
					mybg.setElevation(getDip(3));
					mybg.setBackground(SketchUi);
				}
				soon1.setText(getResources().getString(R.string.soon));
				makefolder1.setText(getResources().getString(R.string.makefolder));
				makefile1.setText(getResources().getString(R.string.makefile));
				projectCo1.setText(getResources().getString(R.string.project));
				makefolder.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							_folder();
						dialog1.dismiss();
						
						}
				});
				makefile.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							_file();
						dialog1.dismiss();
						
						}
				});
				projectCo.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							SketchwareUtil.showMessage(getApplicationContext(), "بزودی");
						dialog1.dismiss();
						
						}
				});
				soon.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
								
							SketchwareUtil.showMessage(getApplicationContext(), "بزودی");
						dialog1.dismiss();
						
						}
				});
				dialog1.setCancelable(true);
				dialog1.show();
			}
		});
		
		_drawer_javacode.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					intent.setClass(getApplicationContext(), CodActivity.class);
					startActivity(intent);
				}
				else {
					final AlertDialog dialog1 = new AlertDialog.Builder(CodegomainActivity.this).create();
					View inflate = getLayoutInflater().inflate(R.layout.notnetwork,null); 
					dialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
					dialog1.setView(inflate);
					LinearLayout bg = (LinearLayout) inflate.findViewById(R.id.bg);
					LinearLayout mybtn = (LinearLayout) inflate.findViewById(R.id.mybtn);
					TextView text = (TextView) inflate.findViewById(R.id.text);
					TextView mytext = (TextView) inflate.findViewById(R.id.mytext);
					text.setText(getResources().getString(R.string.network_noconect));
					mytext.setText(getResources().getString(R.string.network_msg));
					{
						android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
						SketchUi.setColor(0xFF000000);SketchUi.setCornerRadius(getDip(6));
						bg.setElevation(getDip(5));
						bg.setBackground(SketchUi);
					}
					{
						android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
						SketchUi.setColor(0xFF2196F3);SketchUi.setCornerRadius(getDip(20));
						mybtn.setElevation(getDip(5));
						android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFFE91E63}), SketchUi, null);
						mybtn.setBackground(SketchUi_RD);
					}
					mybtn.setOnClickListener(new View.OnClickListener(){ public void onClick(View v){
									
								dialog1.dismiss();
							
							}
					});
					dialog1.setCancelable(false);
					dialog1.show();
				}
			}
		});
		
		_drawer_websya.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				u8.setClass(getApplicationContext(), FastwebserisActivity.class);
				startActivity(u8);
			}
		});
		
		_drawer_bord.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				keyboard.setTitle("GoBord");
				keyboard.setIcon(R.drawable.mylego);
				keyboard.setMessage("لطفان یکی از گزینه های زیر را انتخاب کنید");
				keyboard.setPositiveButton("تایید کیبورد", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						Intent callSettingIntent= new Intent(android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS);
						 startActivity(callSettingIntent);
					}
				});
				keyboard.setNeutralButton("انتخاب کیبورد", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
						((InputMethodManager) CodegomainActivity.this.getApplicationContext().getSystemService("input_method")).showInputMethodPicker();
					}
				});
				keyboard.create().show();
			}
		});
		
		_drawer_likey.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				mykey.setClass(getApplicationContext(), KeystoneActivity.class);
				startActivity(mykey);
			}
		});
		
		_drawer_mygithub.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intentmygithub.setAction(Intent.ACTION_VIEW);
				intentmygithub.setData(Uri.parse("https://github.com/Ninjacoderhsi/Codegopro"));
				startActivity(intentmygithub);
			}
		});
		
		_drawer_myket.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				hhhh.setAction(Intent.ACTION_VIEW);
				hhhh.setData(Uri.parse("myket://comment?id=org.codego.ninjacoder"));
				startActivity(hhhh);
			}
		});
		
		_drawer_rubikalinear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				rubikajoined.setTitle("روبیکا");
				rubikajoined.setMessage("برای سوالات و حمایت از ما یک گزینه را انتخاب کنید.");
				rubikajoined.setNegativeButton("گروه روبیکا", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						Intent jjjjjjjjjjjhhhggfff = new Intent();
						jjjjjjjjjjjhhhggfff.setAction(Intent.ACTION_VIEW);
						 jjjjjjjjjjjhhhggfff.setData(Uri.parse("rubika://g.rubika.ir/".concat("BHFBIFJE0HFRQUYDGNWNSAWFBMVBBPVW"))); startActivity(jjjjjjjjjjjhhhggfff);
					}
				});
				rubikajoined.setNeutralButton("لغو", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				rubikajoined.create().show();
			}
		});
		
		_drawer_sting.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Settings.setClass(getApplicationContext(), SettingsActivity.class);
				startActivity(Settings);
			}
		});
		
		_drawer_exit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finishAffinity();
			}
		});
	}
	
	private void initializeLogic() {
		try {
			Folder = FileUtil.getExternalStorageDir();
			_RefreshData();
			listview1.setHorizontalScrollBarEnabled(false);
			listview1.setVerticalScrollBarEnabled(false);
			listview1.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
		} catch (Exception e) {
			 
		}
		_fab.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(_fab);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(_fab);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(_fab);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(_fab);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration((int)5);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
		if (true) {
			     getSupportActionBar().hide();
		}
		else {
					getSupportActionBar().show();
		}
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);  androidx.drawerlayout.widget.DrawerLayout .LayoutParams params = (androidx.drawerlayout.widget.DrawerLayout .LayoutParams)_nav_view.getLayoutParams();  params.width = (int)getDip((int)280);  params.height = androidx.drawerlayout.widget.DrawerLayout .LayoutParams.MATCH_PARENT;  _nav_view.setLayoutParams(params);
		 _nav_view.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
		rubikajoined = new AlertDialog.Builder(this,AlertDialog.THEME_TRADITIONAL);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =CodegomainActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF212121);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);float lt = getDip(0);
			float rt = getDip(12);
			float rb = getDip(12);
			float lb = getDip(0);
			SketchUi.setCornerRadii(new float[]{
					lt,lt,rt ,rt,rb,rb ,lb,lb });
			_drawer_javacode.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF65BFFF}), SketchUi, null);
			_drawer_javacode.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);float lt = getDip(0);
			float rt = getDip(12);
			float rb = getDip(12);
			float lb = getDip(0);
			SketchUi.setCornerRadii(new float[]{
					lt,lt,rt ,rt,rb,rb ,lb,lb });
			_drawer_myket.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF65BFFF}), SketchUi, null);
			_drawer_myket.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);float lt = getDip(0);
			float rt = getDip(12);
			float rb = getDip(12);
			float lb = getDip(0);
			SketchUi.setCornerRadii(new float[]{
					lt,lt,rt ,rt,rb,rb ,lb,lb });
			_drawer_exit.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF65BFFF}), SketchUi, null);
			_drawer_exit.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);float lt = getDip(0);
			float rt = getDip(12);
			float rb = getDip(12);
			float lb = getDip(0);
			SketchUi.setCornerRadii(new float[]{
					lt,lt,rt ,rt,rb,rb ,lb,lb });
			_drawer_websya.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF65BFFF}), SketchUi, null);
			_drawer_websya.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);float lt = getDip(0);
			float rt = getDip(12);
			float rb = getDip(12);
			float lb = getDip(0);
			SketchUi.setCornerRadii(new float[]{
					lt,lt,rt ,rt,rb,rb ,lb,lb });
			_drawer_bord.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF65BFFF}), SketchUi, null);
			_drawer_bord.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);float lt = getDip(0);
			float rt = getDip(12);
			float rb = getDip(12);
			float lb = getDip(0);
			SketchUi.setCornerRadii(new float[]{
					lt,lt,rt ,rt,rb,rb ,lb,lb });
			_drawer_sting.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF65BFFF}), SketchUi, null);
			_drawer_sting.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);float lt = getDip(0);
			float rt = getDip(12);
			float rb = getDip(12);
			float lb = getDip(0);
			SketchUi.setCornerRadii(new float[]{
					lt,lt,rt ,rt,rb,rb ,lb,lb });
			_drawer_rubikalinear.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF65BFFF}), SketchUi, null);
			_drawer_rubikalinear.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);float lt = getDip(0);
			float rt = getDip(12);
			float rb = getDip(12);
			float lb = getDip(0);
			SketchUi.setCornerRadii(new float[]{
					lt,lt,rt ,rt,rb,rb ,lb,lb });
			_drawer_likey.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF65BFFF}), SketchUi, null);
			_drawer_likey.setBackground(SketchUi_RD);
		}
		{
			android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
			SketchUi.setColor(0xFF424242);float lt = getDip(0);
			float rt = getDip(12);
			float rb = getDip(12);
			float lb = getDip(0);
			SketchUi.setCornerRadii(new float[]{
					lt,lt,rt ,rt,rb,rb ,lb,lb });
			_drawer_mygithub.setElevation(getDip(5));
			android.graphics.drawable.RippleDrawable SketchUi_RD = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{0xFF65BFFF}), SketchUi, null);
			_drawer_mygithub.setBackground(SketchUi_RD);
		}
		linear1.setBackgroundColor(0xFF424242);
		dialogmain = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		dialog = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		ninja = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		cdm = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		keyboard = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		Assasssincreed = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		_fab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("0xFFE65100".replace("0xFF" , "#"))));
		_drawer_linear1.setBackgroundColor(0xFF212121);
		_drawer_jaricon.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		_drawer_googlep.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		_drawer_myexit.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		_drawer_myicon.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		_drawer_fastweb.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		_drawer_keyicon.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		_drawer_stingicon.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		_drawer_iconkey.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		_drawer_imageview1.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
	}
	
	@Override
	public void onBackPressed() {
		if (Folder.equals(FileUtil.getExternalStorageDir())) {
			finishAffinity();
		}
		else {
			Upfolder = Folder.substring((int)(0), (int)(Folder.lastIndexOf("/")));
			Folder = Upfolder;
			_RefreshData();
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		_Assassincreeddatamain(Assasssincreed);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF424242".replace("0xFF" , "#")));
		}
		_drawer_key.setText(getResources().getString(R.string.keyboard));
		_drawer_rubikatextview1.setText(getResources().getString(R.string.rubi));
		_drawer_myket1.setText(getResources().getString(R.string.myket));
		_drawer_stingtext.setText(getResources().getString(R.string.sting));
		_drawer_exit1.setText(getResources().getString(R.string.by));
		_drawer_javacode1.setText(getResources().getString(R.string.myjava));
		_drawer_fastweb1.setText(getResources().getString(R.string.web));
		_drawer_key11.setText(getResources().getString(R.string.key11));
		_drawer_textview1.setText(getResources().getString(R.string.github));
	}
	
	public void _RefreshData() {
		try {
			listview1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE); listview1.setItemsCanFocus(false);
			File_map.clear();
			subtitle = Folder;
			
			FileUtil.listDir(Folder, liststring);
			Collections.sort(liststring, String.CASE_INSENSITIVE_ORDER);
			position = 0;
			for(int _repeat14 = 0; _repeat14 < (int)(liststring.size()); _repeat14++) {
				{
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("file", liststring.get((int)(position)));
					File_map.add(_item);
				}
				
				position++;
			}
			final class FileComparator implements Comparator<String> {
				public int compare(String f1, String f2) {
					if(f1 == f2) return 0;
					if(FileUtil.isDirectory(f1) && FileUtil.isFile(f2))
					return -1;
					if(FileUtil.isFile(f1) && FileUtil.isDirectory(f2))
					return 1;
					return f1.compareToIgnoreCase(f2);
				}
			}
			Collections.sort(liststring, new FileComparator());
			listview1.setAdapter(new Listview1Adapter(File_map));
			((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		} catch (Exception e) {
			 
		}
	}
	
	
	public void _file() {
		dialogmain.setTitle(getResources().getString(R.string.dialog_newfile));
		dialogmain.setIcon(R.drawable.mylegolith);
		dialogmain.setMessage(getResources().getString(R.string.dialogtitle_msg));
		final EditText edittext2= new EditText(CodegomainActivity.this);
		LinearLayout.LayoutParams lparr = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		edittext2.setHint("name file...");
		edittext2.setHintTextColor(0xFF000000);
		edittext2.setTextSize((float)16);
		edittext2.setTextColor(0xFFF44336);
		((EditText)edittext2).setError("Error plestype text");
		edittext2.setLayoutParams(lparr);
		dialogmain.setView(edittext2);
		dialogmain.setPositiveButton(getResources().getString(R.string.dialog_ok), new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				try {
					
					edittext2.addTextChangedListener(new TextWatcher() {
						
						  ColorScheme keywords = new ColorScheme(
						      Pattern.compile(
						          "\\b(transient|Activity|View|Log|MotionEvent|void|const|static|volatile|interface|native|protected|final|abstract|synchronized|enum|instanceof|assert|break|goto|return|new|throw|throws|super|extends|implements|import)\\b"),
						      Color.parseColor("#FFD84315") //brown
						  );
						
						ColorScheme keywordskeywords = new ColorScheme(
						      Pattern.compile(
						          "\\b(class|private|public|this|arg|args|out)\\b"),
						      Color.parseColor("#FFFF1744") //rose
						  );
						
						ColorScheme keywords2 = new ColorScheme(
						      Pattern.compile(
						          "\\b(package|strictfp|char|short|int|long|double|String|float|byte|boolean|default|do|continue)\\b"),
						      Color.parseColor("#FF4DB6AC") 
						  );
						
						ColorScheme keywords3 = new ColorScheme(
						      Pattern.compile(
						          "\\b(if|else|switch|case|for|while)\\b"),
						      Color.parseColor("#FFD500F9") //mauve
						  );
						
						ColorScheme keywords4 = new ColorScheme(
						      Pattern.compile(
						          "\\b(try|catch|finally|true|false|null|IOException|java.io.IOException)\\b"),
						      Color.parseColor("#FFFFC400") // jaune foncé
						  );
						
						ColorScheme keywords5 = new ColorScheme(
						      Pattern.compile(
						          "\\b(BroadcastReceiver|Intent|Integer|CharSequence|Dialog|OnFocusChangeListener|OnCreateContextMenuListener|OnKeyListener|WifiManager|StringBuffer|StringBuilder|OnClickListener|OnTouchListener|OnLongClickListener|OnCheckedChanged|addTextChangedListener|Color.parseColor|parseColor|Color|ColorScheme|ProcessBuilder|Process|PackageManager|)\\b"),
						      Color.parseColor("#FF2196F3") //Blue
						  );
						
						ColorScheme keywords6 = new ColorScheme(
						      Pattern.compile(
						          "\\b(LinearLayout|LinearParams|CheckboxGroup|CheckBox|Button|Switch|Spannable|EditText|TextView|ImageView|CircleImageView|RadioButton|TabLayout|SwipRefreshLayout)\\b"),
						      Color.parseColor("#FFC0CA33") //Lime foncé
						  );
						
						ColorScheme newtypes = new ColorScheme(
						      Pattern.compile(
						          "\\b(onTextChanged|isSelected|isChecked|CheckBox|Button|Switch|Spannable|EditText|TextView|ImageView|CircleImageView|RadioButton|TabLayout|SwipRefreshLayout)\\b"),
						      Color.parseColor("#76ff03") //green claire
						  );
						
						ColorScheme keywords7 = new ColorScheme(    
						      Pattern.compile(
						          "\\b(java.io.|BufferedReader|InputStream|BufferedWriter|InputStreamReader|File|FileReader|java.io.BufferedReader|java.io.InputStream|java.io.BufferedWriter|java.io.InputStreamReader|java.io.File|java.io.FileReader)\\b"),
						      Color.parseColor("#FFBA68C8") 
						  );
						
						
						  final ColorScheme[] schemes = {newtypes, keywordskeywords , keywords4, keywords3, keywords2, keywords, keywords5, keywords6, keywords7 };
						
						  @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {
							
							  }
						
						  @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
							
							  }
						
						  @Override public void afterTextChanged(Editable s) {
							    removeSpans(s, ForegroundColorSpan.class);
							    for (ColorScheme scheme : schemes) {
								      for(Matcher m = scheme.pattern.matcher(s); m.find();) {
									        s.setSpan(new ForegroundColorSpan(scheme.color),
									            m.start(),
									            m.end(),
									            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
									      }
								    }
							  }
						
						  void removeSpans(Editable e, Class<? extends CharacterStyle> type) {
							    CharacterStyle[] spans = e.getSpans(0, e.length(), type);
							    for (CharacterStyle span : spans) {
								      e.removeSpan(span);
								    }
							  }
						
						  class ColorScheme {
							    final Pattern pattern;
							    final int color;
							
							     ColorScheme(Pattern pattern, int color) {
								      this.pattern = pattern;
								      this.color = color;
								    }
							  }
						
					});
					
					mainfile = edittext2.getText().toString();
					if (mainfile.equals("")) {
						_file();
					}
					else {
						if (!mainfile.contains("/")) {
							FileUtil.writeFile(Folder.concat("/".concat(mainfile)), "");
							_RefreshData();
						}
						else {
							if (FileUtil.isExistFile(Folder.concat("/".concat(mainfile)))) {
								_RefreshData();
							}
							else {
								
							}
						}
					}
				} catch (Exception e) {
					 
				}
			}
		});
		dialogmain.setNegativeButton(getResources().getString(R.string.dialog_no), new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		dialogmain.create().show();
	}
	
	
	public void _folder() {
		dialog.setTitle(getResources().getString(R.string.dialogfolder_title));
		dialog.setMessage(getResources().getString(R.string.dialogfolder_msg));
		dialog.setIcon(R.drawable.mylegolith);
		final EditText edittext12 = new EditText(CodegomainActivity.this);
		LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		edittext12.setHint("name folder...");
		edittext12.setHintTextColor(0xFFFFFFFF);
		edittext12.setTextSize((float)18);
		edittext12.setTextColor(0xFF00F4D4);
		((EditText)edittext12).setError("Error plestype text");
		edittext12.setLayoutParams(lpar);
		dialog.setView(edittext12);
		edittext12.addTextChangedListener(new TextWatcher() {
			
			  ColorScheme keywords = new ColorScheme(
			      Pattern.compile(
			          "\\b(transient|Activity|View|Log|MotionEvent|void|const|static|volatile|interface|native|protected|final|abstract|synchronized|enum|instanceof|assert|break|goto|return|new|throw|throws|super|extends|implements|import)\\b"),
			      Color.parseColor("#FFD84315") //brown
			  );
			
			ColorScheme keywordskeywords = new ColorScheme(
			      Pattern.compile(
			          "\\b(class|private|public|this|arg|args|out)\\b"),
			      Color.parseColor("#FFFF1744") //rose
			  );
			
			ColorScheme keywords2 = new ColorScheme(
			      Pattern.compile(
			          "\\b(package|strictfp|char|short|int|long|double|String|float|byte|boolean|default|do|continue)\\b"),
			      Color.parseColor("#FF4DB6AC") 
			  );
			
			ColorScheme keywords3 = new ColorScheme(
			      Pattern.compile(
			          "\\b(if|else|switch|case|for|while)\\b"),
			      Color.parseColor("#FFD500F9") //mauve
			  );
			
			ColorScheme keywords4 = new ColorScheme(
			      Pattern.compile(
			          "\\b(try|catch|finally|true|false|null|IOException|java.io.IOException)\\b"),
			      Color.parseColor("#FFFFC400") // jaune foncé
			  );
			
			ColorScheme keywords5 = new ColorScheme(
			      Pattern.compile(
			          "\\b(BroadcastReceiver|Intent|Integer|CharSequence|Dialog|OnFocusChangeListener|OnCreateContextMenuListener|OnKeyListener|WifiManager|StringBuffer|StringBuilder|OnClickListener|OnTouchListener|OnLongClickListener|OnCheckedChanged|addTextChangedListener|Color.parseColor|parseColor|Color|ColorScheme|ProcessBuilder|Process|PackageManager|)\\b"),
			      Color.parseColor("#FF2196F3") //Blue
			  );
			
			ColorScheme keywords6 = new ColorScheme(
			      Pattern.compile(
			          "\\b(LinearLayout|LinearParams|CheckboxGroup|CheckBox|Button|Switch|Spannable|EditText|TextView|ImageView|CircleImageView|RadioButton|TabLayout|SwipRefreshLayout)\\b"),
			      Color.parseColor("#FFC0CA33") //Lime foncé
			  );
			
			ColorScheme newtypes = new ColorScheme(
			      Pattern.compile(
			          "\\b(onTextChanged|isSelected|isChecked|CheckBox|Button|Switch|Spannable|EditText|TextView|ImageView|CircleImageView|RadioButton|TabLayout|SwipRefreshLayout)\\b"),
			      Color.parseColor("#76ff03") //green claire
			  );
			
			ColorScheme keywords7 = new ColorScheme(    
			      Pattern.compile(
			          "\\b(java.io.|BufferedReader|InputStream|BufferedWriter|InputStreamReader|File|FileReader|java.io.BufferedReader|java.io.InputStream|java.io.BufferedWriter|java.io.InputStreamReader|java.io.File|java.io.FileReader)\\b"),
			      Color.parseColor("#FFBA68C8") 
			  );
			
			
			  final ColorScheme[] schemes = {newtypes, keywordskeywords , keywords4, keywords3, keywords2, keywords, keywords5, keywords6, keywords7 };
			
			  @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				
				  }
			
			  @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
				
				  }
			
			  @Override public void afterTextChanged(Editable s) {
				    removeSpans(s, ForegroundColorSpan.class);
				    for (ColorScheme scheme : schemes) {
					      for(Matcher m = scheme.pattern.matcher(s); m.find();) {
						        s.setSpan(new ForegroundColorSpan(scheme.color),
						            m.start(),
						            m.end(),
						            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
						      }
					    }
				  }
			
			  void removeSpans(Editable e, Class<? extends CharacterStyle> type) {
				    CharacterStyle[] spans = e.getSpans(0, e.length(), type);
				    for (CharacterStyle span : spans) {
					      e.removeSpan(span);
					    }
				  }
			
			  class ColorScheme {
				    final Pattern pattern;
				    final int color;
				
				     ColorScheme(Pattern pattern, int color) {
					      this.pattern = pattern;
					      this.color = color;
					    }
				  }
			
		});
		
		dialog.setPositiveButton(getResources().getString(R.string.dialogfolder_ok), new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				try {
					CreateFolder = edittext12.getText().toString();
					if (!FileUtil.isFile(Folder.concat("/".concat(CreateFolder.concat("/"))))) {
						FileUtil.makeDir(Folder.concat("/".concat(CreateFolder.concat("/"))));
						FileUtil.writeFile(".nomedia", "");
						_RefreshData();
					}
					else {
						
					}
				} catch (Exception e) {
					 
				}
			}
		});
		dialog.setNegativeButton(getResources().getString(R.string.dialogfolder_no), new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		dialog.create().show();
	}
	
	
	public void _textcolor(final TextView _mytexter, final String _color1, final String _color2) {
		_mytexter.setText(_mytexter.getText().toString());
		
		TextPaint paint = _mytexter.getPaint();
		
		float width = paint.measureText(_mytexter.getText().toString()); 
		
		Shader textShader = new LinearGradient(0, 0, width,_mytexter.getTextSize(), new int[]{ 
			
			Color.parseColor(_color1), Color.parseColor(_color2), 
			
			/*

 //More Colors 

Color.parseColor("#64B678"), Color.parseColor("#478AEA"), Color.parseColor("#8446CC"), 

*/
			
			
		}, null,Shader.TileMode.CLAMP); 
		
		/* By EPIC Technical Tricks YT */
		
		_mytexter.getPaint().setShader(textShader);
	}
	
	
	public void _lib() {
	}
	private boolean zipEntryMatch(String zeName, java.io.File[]  files, String path){
		    for(int i = 0; i < files.length; i++){
			        if((path + files[i] .getName()).equals(zeName)){
				            return true;
				        }
			    }
		    return false;
	}
	
	    public static class ZipUtils {
		
		        private final List<java.io.File> fileList;
		
		        private List<String> paths;
		
		        public ZipUtils() {
			            fileList = new ArrayList<>();
			            paths = new ArrayList<>(25);
			        }
		
		        public void zipIt(java.io.File sourceFile, java.io.File zipFile) {
			            if (sourceFile.isDirectory()) {
				                byte[]  buffer = new byte[1024] ;
				                java.io.FileOutputStream fos = null;
				                java.util.zip.ZipOutputStream zos = null;
				
				                try {
					
					
					
					                    String sourcePath = sourceFile.getParentFile().getPath();
					                    generateFileList(sourceFile);
					
					                    fos = new java.io.FileOutputStream(zipFile);
					                    zos = new java.util.zip.ZipOutputStream(fos);
					
					                    System.out.println("Output to Zip : " + zipFile);
					                    java.io.FileInputStream in = null;
					
					                    for (java.io.File file : this.fileList) {
						                        String path = file.getParent().trim();
						                        path = path.substring(sourcePath.length());
						
						                        if (path.startsWith(java.io.File.separator)) {
							                            path = path.substring(1);
							                        }
						
						                        if (path.length() > 0) {
							                            if (!paths.contains(path)) {
								                                paths.add(path);
								                                java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry(path + "");
								                                zos.putNextEntry(ze);
								                                zos.closeEntry();
								                            }
							                            path += "/";
							                        }
						
						                        String entryName = path.substring((int)(0), (int)(path.lastIndexOf("/")))+ "/" + file.getName();
						                        System.out.println("File Added : " + entryName);
						                        java.util.zip.ZipEntry ze = new java.util.zip.ZipEntry(entryName);
						
						                        zos.putNextEntry(ze);
						                        try {
							                            in = new java.io.FileInputStream(file);
							                            int len;
							                            while ((len = in.read(buffer)) > 0) {
								                                zos.write(buffer, 0, len);
								                            }
							                        } finally {
							                            in.close();
							                        }
						                    }
					
					                    zos.closeEntry();
					                    System.out.println("Folder successfully compressed");
					
					                } catch (java.io.IOException ex) {
					                    ex.printStackTrace();
					                } finally {
					                    try {
						                        zos.close();
						                    } catch (java.io.IOException e) {
						                        e.printStackTrace();
						                    }
					                }
				            }
			        }
		
		        protected void generateFileList(java.io.File node) {
			
			            if (node.isFile()) {
				                fileList.add(node);
				            }
			            if (node.isDirectory()) {
				                java.io.File[]  subNote = node.listFiles();
				                for (java.io.File filename : subNote) {
					                    generateFileList(filename);
					                }
				            }
			        }
		    }
	public  java.io.File newFile(java.io.File destinationDir, java.util.zip.ZipEntry zipEntry) throws java.io.IOException {
		    java.io.File destFile = new java.io.File(destinationDir, zipEntry.getName());
		
		    String destDirPath = destinationDir.getCanonicalPath();
		    String destFilePath = destFile.getCanonicalPath();
		
		    if (!destFilePath.startsWith(destDirPath + java.io.File.separator)) {
			        throw new java.io.IOException("Entry is outside of the target dir: " + zipEntry.getName());
			    }
		
		    return destFile;
	}
	
	
	public void _setBitmapFromVideo(final ImageView _imageview, final String _path) {
		class ContextClass {
			
			private Context myContext;
			
			public ContextClass(Context activity) {
				myContext = activity;
			}
			
			public ContextClass(Fragment fragment) {
				myContext = fragment.getActivity();
			}
			
			public ContextClass(DialogFragment fragment) {
				myContext = fragment.getActivity();
			}
			
			public final Context getContext() {
				return myContext;
			}
		}
		_imageview.setImageBitmap(new VideoThumbnail(new ContextClass(this).getContext()).fromPath(_path));
	}
	
	
	public void _Assassincreeddatamain(final AlertDialog.Builder _Contextgetmain) {
		FileUtil.makeDir("/sdcard/htmlgo/");
		if (FileUtil.isExistFile("/sdcard/htmlgo/data.main")) {
				 
		}
		else {
				_Contextgetmain.setTitle("نصب دیتا؟");
			_Contextgetmain.setIcon(R.drawable.mylego);
			_Contextgetmain.setMessage("یک دیتای کوچک برای نصب فایل های برنامه ایا میخواهید نصب کنید؟");
			_Contextgetmain.setPositiveButton("نصب", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					copyOneFileFromAssets("data.main", "/sdcard/htmlgo/");
				}
			});
			_Contextgetmain.setNeutralButton("خروج", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					finishAffinity();
				}
			});
			_Contextgetmain.setCancelable(false);
			_Contextgetmain.create().show();
		}
	}
	
	
	public void _android11() {
	}
	private void copyAllFilesAssets(String assetsFolder, String outPath) {
		    AssetManager assetManager = getAssets();
		    String[] files = null;
		    try {
			        files = assetManager.list(assetsFolder);
			    } catch (java.io.IOException e) {
			        
			    }
		    if (files != null) for (String filename : files) {
			        java.io.InputStream in = null;
			        java.io.OutputStream out = null;
			        try {
				          in = assetManager.open(assetsFolder+"/"+filename);
				          java.io.File outFile = new java.io.File(outPath, filename);
				          if (!(outFile.exists())) {// File does not exist...
					                out = new java.io.FileOutputStream(outFile);
					                copyFile(in, out);
					                showMessage("success !");
					          }
				        } catch(java.io.IOException e) {
				            showMessage(e.toString());
				        }     
			        finally {
				            if (in != null) {
					                try {
						                    in.close();
						                } catch (java.io.IOException e) {
						                    // NOOP
						                }
					            }
				            if (out != null) {
					                try {
						                    out.close();
						                } catch (java.io.IOException e) {
						                    // NOOP
						                }
					            }
				        }  
			    }
	}
	private void copyFile(java.io.InputStream in, java.io.OutputStream out) throws java.io.IOException {
		    byte[] buffer = new byte[1024];
		    int read;
		    while((read = in.read(buffer)) != -1){
			      out.write(buffer, 0, read);
			    }
	}
	
	private void copyOneFileFromAssets(final String assetFilename, final String assetSavePath) {
		  			try{
			  				int count;
			  				java.io.InputStream input = getAssets().open(assetFilename);
			  				java.io.OutputStream output = new  java.io.FileOutputStream(assetSavePath+"/"+assetFilename);
			  				byte data[] = new byte[1024];
			  				while ((count = input.read(data))>0) {
				  					output.write(data, 0, count);
				  			}
			  				output.flush();
			  				output.close();
			  				input.close();
			  				
			  				SketchwareUtil.showMessage(getApplicationContext(), "success ");
			  		}catch(Exception e){
			  				
			  				SketchwareUtil.showMessage(getApplicationContext(), "failed !");
			  		}
	}
	{
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
				_view = _inflater.inflate(R.layout.file, null);
			}
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout itemback = _view.findViewById(R.id.itemback);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			
			textview1.setText(Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myfont.ttf"), 0);
			cardview1.setRadius((float)18);
			cardview1.setCardElevation((float)2);
			
			_textcolor(textview1, "#FF77F5FF", "#FF1BFFB9");
			_textcolor(textview2, "#FF77F5FF", "#FF1BFFB9");
			cardview1.setCardBackgroundColor(0xFF616161);
			if (FileUtil.isDirectory(liststring.get((int)(_position)))) {
				imageview1.setImageResource(R.drawable.folder);
				itemback.setBackgroundColor(0xFFF44336);
			}
			else {
				if (liststring.get((int)(_position)).endsWith(".html")) {
					imageview1.setImageResource(R.drawable.myiconsvg_7);
					itemback.setBackgroundColor(0xFF3F51B5);
				}
				else {
					if (liststring.get((int)(_position)).endsWith(".js")) {
						imageview1.setImageResource(R.drawable.myiconsvg_9);
						itemback.setBackgroundColor(0xFFFFEB3B);
					}
					else {
						if (liststring.get((int)(_position)).endsWith(".lua")) {
							itemback.setBackgroundColor(0xFF7B1FA2);
							imageview1.setImageResource(R.drawable.myiconsvg_6);
						}
						else {
							if (liststring.get((int)(_position)).endsWith(".cpp")) {
								itemback.setBackgroundColor(0xFFD81B60);
								imageview1.setImageResource(R.drawable.myiconsvg_13);
							}
							else {
								if (liststring.get((int)(_position)).endsWith(".sh")) {
									imageview1.setImageResource(R.drawable.myiconsvg_4);
									itemback.setBackgroundColor(0xFF512DA8);
								}
								else {
									if (liststring.get((int)(_position)).endsWith(".py")) {
										imageview1.setImageResource(R.drawable.myiconsvg_5);
										itemback.setBackgroundColor(0xFFFF9800);
									}
									else {
										if (liststring.get((int)(_position)).endsWith(".css")) {
											imageview1.setImageResource(R.drawable.myiconsvg_11);
											itemback.setBackgroundColor(0xFF1A237E);
										}
										else {
											if (liststring.get((int)(_position)).endsWith(".php")) {
												imageview1.setImageResource(R.drawable.myiconfuntom_2);
												itemback.setBackgroundColor(0xFF8BC34A);
											}
											else {
												if (liststring.get((int)(_position)).endsWith(".xml")) {
													imageview1.setImageResource(R.drawable.myiconsvg_3);
													itemback.setBackgroundColor(0xFF000000);
												}
												else {
													if (liststring.get((int)(_position)).endsWith(".svg")) {
														imageview1.setImageResource(R.drawable.myiconsvg_1);
														itemback.setBackgroundColor(0xFFF9A825);
													}
													else {
														if (liststring.get((int)(_position)).endsWith(".java")) {
															imageview1.setImageResource(R.drawable.myiconsvg_8);
															itemback.setBackgroundColor(0xFFF9A825);
														}
														else {
															if (liststring.get((int)(_position)).endsWith(".co")) {
																imageview1.setImageResource(R.drawable.project);
																itemback.setBackgroundColor(0xFF000000);
															}
															else {
																if (liststring.get((int)(_position)).endsWith(".dart")) {
																	imageview1.setImageResource(R.drawable.myicondart);
																	itemback.setBackgroundColor(0xFF0D47A1);
																}
																else {
																	if (liststring.get((int)(_position)).endsWith(".png") || liststring.get((int)(_position)).endsWith(".jpg")) {
																		itemback.setBackgroundColor(0xFF0D47A1);
																		imageview1.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(liststring.get((int)(_position)), 1024, 1024));
																	}
																	else {
																		if (liststring.get((int)(_position)).endsWith(".vue")) {
																			itemback.setBackgroundColor(0xFF006064);
																			imageview1.setImageResource(R.drawable.myiconsvg_2);
																		}
																		else {
																			if (liststring.get((int)(_position)).endsWith(".fun")) {
																				itemback.setBackgroundColor(0xFF00BCD4);
																				imageview1.setImageResource(R.drawable.myiconfuntom_1);
																			}
																			else {
																				if (liststring.get((int)(_position)).endsWith(".c")) {
																					itemback.setBackgroundColor(0xFF757575);
																					imageview1.setImageResource(R.drawable.myiconsvg_12);
																				}
																				else {
																					if (liststring.get((int)(_position)).endsWith(".go")) {
																						itemback.setBackgroundColor(0xFF039BE5);
																						imageview1.setImageResource(R.drawable.myiconsvg_10);
																					}
																					else {
																						if (liststring.get((int)(_position)).endsWith(".mp3")) {
																							itemback.setBackgroundColor(0xFFFFEB3B);
																							hsi = liststring.get((int)(_position));
																							Bitmap bMap = ThumbnailUtils.createVideoThumbnail(hsi,
																							android.provider.MediaStore.Video.Thumbnails.FULL_SCREEN_KIND);
																							imageview1.setImageBitmap(bMap);
																						}
																						else {
																							if (liststring.get((int)(_position)).endsWith(".swb")) {
																								itemback.setBackgroundColor(0xFF3F51B5);
																								imageview1.setImageResource(R.drawable.swbfile);
																							}
																							else {
																								if (liststring.get((int)(_position)).endsWith(".apk")) {
																									_getApkIcon(liststring.get((int)(_position)), imageview1);
																								}
																								else {
																									if (liststring.get((int)(_position)).endsWith(".jks")) {
																										imageview1.setImageResource(R.drawable.key);
																										itemback.setBackgroundColor(0xFF00BCD4);
																									}
																									else {
																										if (liststring.get((int)(_position)).endsWith(".rb")) {
																											imageview1.setImageResource(R.drawable.ruby_2);
																											itemback.setBackgroundColor(0xFFB71C1C);
																										}
																										else {
																											if (liststring.get((int)(_position)).endsWith(".pas")) {
																												imageview1.setImageResource(R.drawable.pascal_2);
																												itemback.setBackgroundColor(0xFF9C27B0);
																											}
																											else {
																												itemback.setBackgroundColor(0xFFF44336);
																												imageview1.setImageResource(R.drawable.file);
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
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