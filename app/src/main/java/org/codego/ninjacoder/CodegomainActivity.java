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
	private String context11 = "";
	private String getpath = "";
	private String seris = "";
	private String getfolderandroid11 = "";
	private String dddddd = "";
	private String cold = "";
	private String aqules = "";
	
	private ArrayList<String> liststring = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> File_map = new ArrayList<>();
	private ArrayList<String> list = new ArrayList<>();
	private ArrayList<String> folderList = new ArrayList<>();
	private ArrayList<String> filelist = new ArrayList<>();
	
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
	private AlertDialog.Builder coproject;
	private ProgressDialog dialogcompers;
	private AlertDialog.Builder cofolder;
	private ProgressDialog cofolder2;
	private AlertDialog.Builder dismis;
	private TimerTask g1;
	private TimerTask g2;
	private SharedPreferences persefone;
	private AlertDialog.Builder dialogandroid11;
	private AlertDialog.Builder android11folderpath;
	private Intent np3 = new Intent();
	private Intent apkinstall = new Intent();
	
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
		coproject = new AlertDialog.Builder(this);
		cofolder = new AlertDialog.Builder(this);
		dismis = new AlertDialog.Builder(this);
		persefone = getSharedPreferences("perafone", Activity.MODE_PRIVATE);
		dialogandroid11 = new AlertDialog.Builder(this);
		android11folderpath = new AlertDialog.Builder(this);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				position = _position;
				if (FileUtil.isDirectory(File_map.get((int)_position).get("file").toString())) {
					Folder = File_map.get((int)_position).get("file").toString();
					_RefreshData();
				}
				else {
					if (liststring.get((int)(_position)).endsWith(".rjejwiwo")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", liststring.get((int)(_position)));
						intent.putExtra("save", liststring.get((int)(_position)));
						intent.putExtra("title", Uri.parse(liststring.get((int)(_position))).getLastPathSegment());
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".lua")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", File_map.get((int)_position).get("file").toString());
						intent.putExtra("save", File_map.get((int)_position).get("file").toString());
						intent.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(intent);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".js")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", File_map.get((int)_position).get("file").toString());
						intent.putExtra("save", File_map.get((int)_position).get("file").toString());
						intent.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(intent);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".cpp")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", File_map.get((int)_position).get("file").toString());
						intent.putExtra("save", File_map.get((int)_position).get("file").toString());
						intent.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(intent);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".sh")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", File_map.get((int)_position).get("file").toString());
						intent.putExtra("save", File_map.get((int)_position).get("file").toString());
						intent.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(intent);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".css")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", File_map.get((int)_position).get("file").toString());
						intent.putExtra("save", File_map.get((int)_position).get("file").toString());
						intent.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(intent);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".php")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", File_map.get((int)_position).get("file").toString());
						intent.putExtra("save", File_map.get((int)_position).get("file").toString());
						intent.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(intent);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".xml")) {
						intent.setClass(getApplicationContext(), CodeeditorActivity.class);
						intent.putExtra("path", File_map.get((int)_position).get("file").toString());
						intent.putExtra("save", File_map.get((int)_position).get("file").toString());
						intent.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(intent);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".svg")) {
						dialog.setTitle("SVG ");
						dialog.setIcon(R.drawable.greadliconpack_4);
						dialog.setMessage(getResources().getString(R.string.dialog_svgTitle1));
						dialog.setPositiveButton(getResources().getString(R.string.svgview), new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								try {
									intent.setClass(getApplicationContext(), CodeeditorActivity.class);
									intent.putExtra("path", File_map.get((int)_position).get("file").toString());
									intent.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
									startActivity(intent);
								} catch (Exception e) {
									 
								}
							}
						});
						dialog.setNeutralButton(getResources().getString(R.string.svgNo), new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								try {
									intent.setClass(getApplicationContext(), SvgActivity.class);
									intent.putExtra("path", File_map.get((int)_position).get("file").toString());
									intent.putExtra("save", File_map.get((int)_position).get("file").toString());
								} catch (Exception e) {
									 
								}
							}
						});
						dialog.create().show();
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".vue")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".java")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".dart")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".fun")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".c")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".go")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".co")) {
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
												String fileZip = File_map.get((int)_position).get("file").toString();
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
					if (File_map.get((int)_position).get("file").toString().endsWith(".jpg") || (File_map.get((int)_position).get("file").toString().endsWith(".png") || File_map.get((int)_position).get("file").toString().endsWith(".bmp"))) {
						img.setClass(getApplicationContext(), ImageviewActivity.class);
						img.putExtra("im", File_map.get((int)_position).get("file").toString());
						img.putExtra("ti", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(img);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".swb")) {
						swbpro = new ProgressDialog(CodegomainActivity.this);
						swbpro.setTitle("در حال نصب پروژه ");
						swbpro.setMessage("نصب پروژه : ".concat(File_map.get((int)_position).get("file").toString().concat(" ")));
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
												swb = File_map.get((int)_position).get("file").toString();
												SketchwareUtil.showMessage(getApplicationContext(), "install project to : ".concat(swb));
												if(swb.contains(".swb")){
															if (FileUtil.isFile(swb)) {
																			S4U.selecteSWB(swb, getApplicationContext());
																		
																		//REMOVE TEMPORARY FILE BECAUSE NOT MARGE TWO PROJECT FILES
																			while(S4U._is_finish()) {
																					 FileUtil.deleteFile(FileUtil.getPackageDataDir(getApplicationContext()).concat("/swb_restore/"));
																							break;
																			}
															}
															else {
																			SketchwareUtil.showMessage(getApplicationContext(), "INVALID SWB PATH");
															}
												} 
												else {
															SketchwareUtil.showMessage(getApplicationContext(), "THIS FILE IS NOT SWB");
												}
											} catch (Exception e) {
												fundangocontextError = File_map.get((int)_position).get("file").toString();
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
					if (File_map.get((int)_position).get("file").toString().endsWith(".mp3")) {
						np3.setClass(getApplicationContext(), Mp3Activity.class);
						np3.putExtra("title", File_map.get((int)_position).get("file").toString());
						np3.putExtra("path", File_map.get((int)_position).get("file").toString());
						startActivity(np3);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".apk")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("apk", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("icon", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".rb")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".pas")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith("LICENSE")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".py")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
					if (File_map.get((int)_position).get("file").toString().endsWith(".html")) {
						hhhh.setClass(getApplicationContext(), CodeeditorActivity.class);
						hhhh.putExtra("path", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("save", File_map.get((int)_position).get("file").toString());
						hhhh.putExtra("title", Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
						startActivity(hhhh);
					}
				}
			}
		});
		
		listview1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				dismis.setTitle("ایجاد پروژه");
				dismis.setIcon(R.drawable.project);
				dismis.setMessage("لطفان دقت کنید کدام گزینه را انتخاب میکنید");
				dismis.setPositiveButton("folder", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						coproject.setTitle("ساخت پروژه Co?");
						coproject.setIcon(R.drawable.codegol);
						final EditText edittext23= new EditText(CodegomainActivity.this);
						LinearLayout.LayoutParams lparr = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
						edittext23.setHint("name file...");
						edittext23.setHintTextColor(0xFF000000);
						edittext23.setText("/sdcard/htmlgo/main.co");
						edittext23.setTextSize((float)16);
						edittext23.setTextColor(0xFFF44336);
						///((EditText)edittext23).setError("Error plestype text");
						edittext23.setLayoutParams(lparr);
						coproject.setView(edittext23);
						coproject.setMessage("ایا میخواهید یک پروژه ایجاد کنید؟ برای فایل ها");
						coproject.setPositiveButton("تایید", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								dialogcompers = new ProgressDialog(CodegomainActivity.this);
								dialogcompers.setTitle("در حال ایجاد");
								dialogcompers.setCanceledOnTouchOutside(false);
								context11 = edittext23.getText().toString();
								dialogcompers.setMessage("میتونی پروژه هاتو توی پوشه html go ببینی");
								g2 = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												while(true) {
													try {
														new ZipperFF().zipFile(new java.io.File(File_map.get((int)_position).get("file").toString()), new java.io.File(context11));
													} catch (Exception e) {
														SketchwareUtil.CustomToast(getApplicationContext(), e.toString(), 0xFFF44336, 16, 0xFFFFFFFF, 25, SketchwareUtil.BOTTOM);
													}
													dialogcompers.dismiss();
													break;
												}
											}
										});
									}
								};
								_timer.schedule(g2, (int)(3000));
								dialogcompers.show();
							}
						});
						coproject.setNegativeButton("لغو", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						coproject.create().show();
					}
				});
				dismis.setNegativeButton("file", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						cofolder.setTitle("ساخت پروژه Co?");
						cofolder.setIcon(R.drawable.codegol);
						final EditText edittext25= new EditText(CodegomainActivity.this);
						LinearLayout.LayoutParams lparr = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
						edittext25.setHint("name file...");
						edittext25.setHintTextColor(0xFF000000);
						edittext25.setTextSize((float)16);
						edittext25.setText("/sdcard/htmlgo/ninjacoder.co");
						edittext25.setTextColor(0xFFF44336);
						//((EditText)edittext25).setError("Error plestype text");
						edittext25.setLayoutParams(lparr);
						cofolder.setView(edittext25);
						cofolder.setMessage("ایا میخواهید یک پروژه ایجاد کنید؟ برای فایل ها");
						cofolder.setPositiveButton("تایید", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								cofolder2 = new ProgressDialog(CodegomainActivity.this);
								getpath = edittext25.getText().toString();
								cofolder2.setTitle("در حال ایجاد");
								cofolder2.setMessage("میتونی پروژه هاتو توی پوشه html go ببینی");
								cofolder2.setCanceledOnTouchOutside(false);
								g1 = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												while(true) {
													try {
														_zip(File_map.get((int)_position).get("file").toString(), getpath);
														SketchwareUtil.CustomToast(getApplicationContext(), "FileSaved!", 0xFFFF9800, 16, 0xFF424242, 25, SketchwareUtil.BOTTOM);
													} catch (Exception e) {
														SketchwareUtil.CustomToast(getApplicationContext(), e.toString(), 0xFFF44336, 16, 0xFFFFFFFF, 25, SketchwareUtil.BOTTOM);
													}
													cofolder2.dismiss();
													break;
												}
											}
										});
									}
								};
								_timer.schedule(g1, (int)(3000));
								cofolder2.show();
							}
						});
						cofolder.setNegativeButton("لغو", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						cofolder.create().show();
					}
				});
				dismis.create().show();
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
								
							dialog1.dismiss();
						_folder();
						
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
		dialogandroid11 = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
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
		try {
			 if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
					      
				if (persefone.getString("one", "").equals("")) {
					persefone.edit().putString("one", "1").commit();
					dialogandroid11.setTitle("دستگاه شما اندروید 11 است.");
					dialogandroid11.setIcon(R.drawable.codegol);
					dialogandroid11.setMessage("لطفان مجوز وارداتی اندروید 11 را صادر کنید تا ما به راحتی به فایل های شما دست رسی داشته باشیم");
					dialogandroid11.setPositiveButton("تایید", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							seris = "/sdcard/htmlgo";
							if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
								    try {
									        
									       if (permission()) {	   
										if (FileUtil.isExistFile(seris)) {
											FileUtil.makeDir(seris);
										}          
												                } else {
												                  RequestPermission_Dialog();
										
												                }
									        
									        
									    } catch (Exception e) {
									               
									    }
										                
									         } else {
								
								if (FileUtil.isExistFile(seris)) {
									FileUtil.makeDir(seris);
								}
								
							}
						}
					});
					dialogandroid11.setNeutralButton("لغو", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					dialogandroid11.create().show();
				}
				else {
					
				}
						        
					    } else {
					      
					       
					    }
		} catch (Exception e) {
			 
		}
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
		setTheme(android.R.style.Theme_Material);
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
		liststring.clear();
		folderList.clear();
		File_map.clear();
		filelist.clear();
		FileUtil.listDir(Folder, liststring);
		Collections.sort(liststring, String.CASE_INSENSITIVE_ORDER);
		position = 0;
		for(int _repeat87 = 0; _repeat87 < (int)(liststring.size()); _repeat87++) {
			if (FileUtil.isDirectory(liststring.get((int)(position)))) {
				folderList.add(liststring.get((int)(position)));
			}
			else {
				filelist.add(liststring.get((int)(position)));
			}
			position++;
		}
		position = 0;
		for(int _repeat101 = 0; _repeat101 < (int)(folderList.size()); _repeat101++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("file", folderList.get((int)(position)));
				File_map.add(_item);
			}
			
			position++;
		}
		position = 0;
		for(int _repeat108 = 0; _repeat108 < (int)(filelist.size()); _repeat108++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("file", filelist.get((int)(position)));
				File_map.add(_item);
			}
			
			position++;
		}
		listview1.setAdapter(new Listview1Adapter(File_map));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
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
	
	
	public void _zup() {
	}
	public final class ZipperFF {
		
		        private  java.io.FileOutputStream fos;
		        private  java.util.zip.ZipOutputStream zos;
		        private  java.io.BufferedOutputStream bos;
		        private  java.util.zip.ZipEntry entry;
		
		        private  java.io.FileInputStream fis;
		        private  java.io.BufferedInputStream bis;
		
		        private  final int BUFFER_CAPACITY = 1024;
		        private  byte[] buffer;
		        private  int buffer_size;
		
		
		        public  boolean zipFile(java.io.File source, java.io.File target) {
			            boolean check = true;
			            try {
				                fos = new java.io.FileOutputStream(target);
				                zos = new java.util.zip.ZipOutputStream(fos);
				                zos.setMethod(java.util.zip.ZipOutputStream.DEFLATED);
				                zos.setLevel(java.util.zip.Deflater.DEFAULT_COMPRESSION);
				                bos = new java.io.BufferedOutputStream(zos);
				            } catch (java.io.IOException e) {
				                System.out.println("ZipperFF.zipFile() says: " + e);
				                check = false;
				            }
			            if (source.isDirectory()) {
				                buffer = new byte[BUFFER_CAPACITY];
				                if (manageFolder(source, ""))
				
				                    check = false;
				            } else {
				                buffer = new byte[BUFFER_CAPACITY];
				                if (writeFileToZipStream(source, ""))
				                    check = false;
				            }
			            try {
				                zos.finish();
				                bos.close();
				                zos.close();
				                fos.close();
				            } catch (Exception e) {
				                System.out.println("While closing streams (final), the following happend: " + e);
				            }
			            return true;
			        }
		
		        private  boolean manageFolder(java.io.File source_folder, String name) {
			            boolean check = true;
			            java.io.File[] all_files = source_folder.listFiles();
			            for (java.io.File single_file : all_files) {
				                if (single_file.isDirectory()) {
					                    manageFolder(single_file, name + java.io.File.separator + single_file.getName());
					                } else {
					                    if (!writeFileToZipStream(single_file, name +java.io.File.separator + single_file.getName()))
					                        check = false;
					                }
				            }
			            return check;
			        }
		
		        private  boolean writeFileToZipStream(java.io.File source_file, String entry_name) {
			            entry_name = entry_name.equals("") ? entry_name : entry_name.substring(1);
			            boolean check = true;
			            try {
				                fis = new java.io.FileInputStream(source_file);
				                bis = new java.io.BufferedInputStream(fis, BUFFER_CAPACITY);
				                entry = new java.util.zip.ZipEntry(entry_name.equals("") ? source_file.getName() : entry_name);
				                zos.putNextEntry(entry);
				                while ((buffer_size = bis.read(buffer, 0, BUFFER_CAPACITY)) != -1) {
					                    bos.write(buffer, 0, buffer_size);
					                }
				            } catch (java.io.IOException e) {
				                System.out.println("ZipperFF.writeFileToZipStream() says: " + e);
				                check = false;
				            }
			            try {
				                bos.flush();
				                zos.closeEntry();
				                bis.close();
				                fis.close();
				            } catch (java.io.IOException e) {
				                System.out.println("While closing streams (file), the following happend: " + e);
				            }
			            return check;
			        }
		    }
	    {
	}
	
	
	public void _zip(final String _source, final String _destination) {
		FileUtil.writeFile("Don't Remove it Thanks.\nModified By: AauraParti", "This Block Added for Manage Permission");
		try {
			java.util.zip.ZipOutputStream os = new java.util.zip.ZipOutputStream(new java.io.FileOutputStream(_destination));
					zip(os, _source, null);
					os.close();
		}
		
		catch(java.io.IOException e) {}
	}
	private void zip(java.util.zip.ZipOutputStream os, String filePath, String name) throws java.io.IOException
		{
				java.io.File file = new java.io.File(filePath);
				java.util.zip.ZipEntry entry = new java.util.zip.ZipEntry((name != null ? name + java.io.File.separator : "") + file.getName() + (file.isDirectory() ? java.io.File.separator : ""));
				os.putNextEntry(entry);
				
				if(file.isFile()) {
						java.io.InputStream is = new java.io.FileInputStream(file);
						int size = is.available();
						byte[] buff = new byte[size];
						int len = is.read(buff);
						os.write(buff, 0, len);
						return;
				}
				
				java.io.File[] fileArr = file.listFiles();
				for(java.io.File subFile : fileArr) {
						zip(os, subFile.getAbsolutePath(), entry.getName());
				}
	}
	
	
	public void _contextandroid() {
	}
	/*
Code Edited by Hichem Soft
youtube channel : Hichem Soft
support me if you like my work
*/
	@Override
	    protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		  super.onActivityResult(_requestCode, _resultCode, _data);
		            
		if (_requestCode == new_folder){
			    if (_resultCode == Activity.RESULT_OK) {
				            if (_data != null) {
					              final Uri uri2 = _data.getData();
					if (Uri.decode(uri2.toString()).endsWith(":")) {
						SketchwareUtil.showMessage(getApplicationContext(), "⛔");
						askPermission(uri2.toString());
					}
					else {
						final int takeFlags = i.getFlags()
						            & (Intent.FLAG_GRANT_READ_URI_PERMISSION
						            | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
						// Check for the freshest data.
						getContentResolver().takePersistableUriPermission(uri2, takeFlags);
						
						
						 
						
						
					}
					
					       } else {
					        
					   }
				       } else {
				      
				 
				 
				   }
		}
		
		
		if (_requestCode == 2000) {
				      if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
						        if (Environment.isExternalStorageManager()) {
								          
								        } else {
								
								        }
						      }
				    
		}
		
		
		
		       
		
	}
	
	// solve android 11 sdcard permissions
	
	
	 public void RequestPermission_Dialog() {
		    if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
				      try {
						        Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
						        intent.addCategory("android.intent.category.DEFAULT");
						        intent.setData(Uri.parse(String.format("package: ", new Object[]{getApplicationContext().getPackageName()})));
						        startActivityForResult(intent, 2000);
						      } catch (Exception e) {
						        Intent obj = new Intent();
						        obj.setAction(android.provider.Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
						        startActivityForResult(obj, 2000);
						      }
				    } else {
				      androidx.core.app.ActivityCompat.requestPermissions(CodegomainActivity.this, new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_CODE);
				    }
		  }
	
	  public boolean permission() {
		    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) { // R is Android 11
				      return Environment.isExternalStorageManager();
				    } else {
				      int write = androidx.core.content.ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
				      int read = androidx.core.content.ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.READ_EXTERNAL_STORAGE);
				
				      return write == android.content.pm.PackageManager.PERMISSION_GRANTED
				          && read == android.content.pm.PackageManager.PERMISSION_GRANTED;
				    }
	} 
	
	// ask permissions request
	
	    
	    public void askPermission(final String _uri) {
			
		
			i.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION |  Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
					
			i.setAction(Intent.ACTION_OPEN_DOCUMENT_TREE);				    i.putExtra(android.provider.DocumentsContract.EXTRA_INITIAL_URI, Uri.parse(_uri));
						        startActivityForResult(i, new_folder);
		}
	
	// check permissions of path if accepted 
	
	
	public boolean checkPermission(final String _uri) {
				Uri muri = Uri.parse(_uri);
				    dFile = androidx.documentfile.provider.DocumentFile.fromTreeUri(getApplicationContext(), muri);
				                    
				if (dFile.canRead() && dFile.canWrite()) {
						return true ;
				}
				return false ;
		}
	
	// simple path to UriTree path
	
	
	public String pathToRealUri( String _path) {
				uriFor1 = "content://com.android.externalstorage.documents/tree/primary%3A";
		
		if ( _path.endsWith("/")) {
			_path = _path.substring(0, _path.length()-1);
		}
		
		
				if (_path.contains("/sdcard/")) {
						uriFor2 = _path.replace("/sdcard/", "").replace("/", "%2F");
						
						if (uriFor2.substring(uriFor2.length()-1, uriFor2.length()).equals("/")) {
								
								uriFor2 = uriFor1.substring(0, uriFor1.length()-1);
								
						}
						
				}
				else {
						if (_path.contains("/storage/") && _path.contains("/emulated/")) {
								uriFor2 = _path.replace("/storage/emulated/0/", "").replace("/", "%2F");
								
								if (uriFor2.substring(uriFor2.length()-1, uriFor2.length()).equals("/")) {
										
										uriFor2 = uriFor1.substring(0, uriFor1.length()-1);
										
								}	
								
						}
						else {
								
						}
				}
				return uriFor1 = uriFor1 + uriFor2;
		}
	
	
	// simple path to UriTree path 2
	
	public String pathToUri( String _path) {
				uriFor1 = "content://com.android.externalstorage.documents/tree/primary%3AAndroid/document/primary%3A";
		
		if ( _path.endsWith("/")) {
			_path = _path.substring(0, _path.length()-1);
		}
		
				if (_path.contains("/sdcard/")) {
						uriFor2 = _path.replace("/sdcard/", "").replace("/", "%2F");
						
						if (uriFor2.substring(uriFor2.length()-1, uriFor2.length()).equals("/")) {
								
								uriFor2 = uriFor1.substring(0, uriFor1.length()-1);
								
						}
						
						
				}
				else {
						if (_path.contains("/storage/") && _path.contains("/emulated/")) {
								uriFor2 = _path.replace("/storage/emulated/0/", "").replace("/", "%2F");
								
								if (uriFor2.substring(uriFor2.length()-1, uriFor2.length()).equals("/")) {
										
										uriFor2 = uriFor1.substring(0, uriFor1.length()-1);
										
								}
								
						}
						else {
								
						}
				}
				return uriFor1 = uriFor1 + uriFor2;
		}
	
	// ccopy file from path to path
	
	private boolean copyAsset(final String assetFilename, final Uri targetUri) {
		  			try{
			  				int count;
			  				InputStream input = null;
					OutputStream output = null;
			  				
			  				ContentResolver content = getApplicationContext().getContentResolver();
						  
			            input = getApplicationContext().getAssets().open(assetFilename);
						
			            output = content.openOutputStream(targetUri);
			            
			            
			  				byte data[] = new byte[1024];
			  				while ((count = input.read(data))>0) {
				  					output.write(data, 0, count);
				  			}
			  				output.flush();
			  				output.close();
			  				input.close();
			  				
			  				SketchwareUtil.showMessage(getApplicationContext(), "success ✔️ نجاح ");
							 
			  		}catch(Exception e){
			  				
			  		FileUtil.writeFile("/sdcard/log.txt", "\n"+ "3   " +e.toString());		SketchwareUtil.showMessage(getApplicationContext(), e.toString());
							  return false;
			  		}
		
		return true;
	}
	
	
	
	
	
	private void copyAssetFolder(String  _folder, String _out ) {
		
		
		AssetManager assetManager = getAssets();
		int sizeList = 0;
		    String[] files = null;
		    try {
				        files = assetManager.list(_folder);
				
				    } catch (java.io.IOException e) {
				        
				    }
		final ArrayList<String> str = new ArrayList<>(Arrays.asList(files));
		
		
		
		int nn = 0;
		for(int _repeat12 = 0; _repeat12 < (int)(str.size()); _repeat12++) {
				
				try {
							Uri mUri = Uri.parse(pathToRealUri(_out));
							
							String fileName = str.get((int)nn);
					sizeList = str.size()-1;		
						
						androidx.documentfile.provider.DocumentFile dFile = androidx.documentfile.provider.DocumentFile.fromTreeUri(getApplicationContext(), mUri);
							           Uri mUri2 = Uri.parse(mUri.toString()+ "%2" + fileName);
							          androidx.documentfile.provider.DocumentFile  dFile2 = androidx.documentfile.provider.DocumentFile.fromTreeUri(getApplicationContext(), mUri2);
							            
							  
							
							try {              
										
										androidx.documentfile.provider.DocumentFile file = dFile.findFile(fileName);
										   android.provider.DocumentsContract.deleteDocument(getApplicationContext().getContentResolver(), file.getUri());
										
								    android.provider.DocumentsContract.deleteDocument(getApplicationContext().getContentResolver(), mUri2);
										
										
							} catch (FileNotFoundException e) {
										                } catch (Exception e2) {
										                }
							
							
							
							dFile2 = dFile.createFile("*/*", fileName);
							            mUri = dFile2.getUri();
							        
							        
							        
							        if (copyAsset(_folder+"/"+fileName, mUri)) {
										    
						if (nn >= sizeList){				    SketchwareUtil.showMessage(getApplicationContext(), "️😎✔️");       
					}					        
						} else {
										            
										        
								SketchwareUtil.showMessage(getApplicationContext(), "😓❌");
								break;
						}
							
							                
							      } catch (Exception re){}      
				            
				nn++;
		}
		
	}
	
	
	public boolean copy(java.io.File copy, String directory, Context con) {
		     java.io.FileInputStream inStream = null;
		     java.io.OutputStream outStream = null;
		    androidx.documentfile.provider.DocumentFile  dir= androidx.documentfile.provider.DocumentFile.fromTreeUri(getApplicationContext(), Uri.parse(pathToRealUri(directory)));
		    
		 
		try {   
			  String fileN = Uri.parse(copy.getPath()).getLastPathSegment();  
			
			    androidx.documentfile.provider.DocumentFile file = dir.findFile(fileN);
			   android.provider.DocumentsContract.deleteDocument(getApplicationContext().getContentResolver(), file.getUri());
			    
			 } catch (Exception e){
			e.printStackTrace();
		}   
		    String mim = mime(copy.toURI().toString());
		    androidx.documentfile.provider.DocumentFile  copy1= dir.createFile(mim, copy.getName());
		    try {
			        inStream = new java.io.FileInputStream(copy);
			        outStream =
			                con.getContentResolver().openOutputStream(copy1.getUri());
			        byte[] buffer = new byte[16384];
			        int bytesRead;
			        while ((bytesRead = inStream.read(buffer)) != -1) {
				            outStream.write(buffer, 0, bytesRead);
				
				        }
			    } catch (java.io.FileNotFoundException e) {
			        e.printStackTrace();
			    } catch (java.io.IOException e) {
			        e.printStackTrace();
			    } finally {
			        try {
				
				            inStream.close();
				
				            outStream.close();
				
				
				            return true;
				
				
				        } catch (java.io.IOException e) {
				            e.printStackTrace();
				        }
			    }
		    return false;
	}
	
	
	
	public  String mime(String URI) {
		       String type = "";
		       String extention = android.webkit.MimeTypeMap.getFileExtensionFromUrl(URI);
		       if (extention != null) {
			           type = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(extention);
			       }
		       return type;
		   }
	
	
	
	
	
	private boolean fromStorage = false;
	  final static int REQUEST_CODE = 333;
	  final static  int OLD_REQUEST = 2000;
	  private SharedPreferences sha;
	private Intent i = new Intent();
		private  Uri muri;
		private String uriFor1 = "";
		private String uriFor2 = "";
		private  
		androidx.documentfile.provider.DocumentFile dFile;
		private double PermissionNumber;
		private  static final int new_folder = 43;
	{
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
			
			textview1.setText(Uri.parse(File_map.get((int)_position).get("file").toString()).getLastPathSegment());
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/myfont.ttf"), 0);
			cardview1.setRadius((float)18);
			cardview1.setCardElevation((float)2);
			
			_textcolor(textview1, "#FF77F5FF", "#FF1BFFB9");
			_textcolor(textview2, "#FF77F5FF", "#FF1BFFB9");
			cardview1.setCardBackgroundColor(0xFF616161);
			if (FileUtil.isDirectory(File_map.get((int)_position).get("file").toString())) {
				imageview1.setImageResource(R.drawable.folder);
				itemback.setBackgroundColor(0xFFF44336);
			}
			else {
				if (File_map.get((int)_position).get("file").toString().endsWith(".html")) {
					imageview1.setImageResource(R.drawable.myiconsvg_7);
					itemback.setBackgroundColor(0xFF3F51B5);
				}
				else {
					if (File_map.get((int)_position).get("file").toString().endsWith(".js")) {
						imageview1.setImageResource(R.drawable.myiconsvg_9);
						itemback.setBackgroundColor(0xFFFFEB3B);
					}
					else {
						if (File_map.get((int)_position).get("file").toString().endsWith(".lua")) {
							itemback.setBackgroundColor(0xFF7B1FA2);
							imageview1.setImageResource(R.drawable.myiconsvg_6);
						}
						else {
							if (File_map.get((int)_position).get("file").toString().endsWith(".cpp")) {
								itemback.setBackgroundColor(0xFFD81B60);
								imageview1.setImageResource(R.drawable.myiconsvg_13);
							}
							else {
								if (File_map.get((int)_position).get("file").toString().endsWith(".sh")) {
									imageview1.setImageResource(R.drawable.myiconsvg_4);
									itemback.setBackgroundColor(0xFF512DA8);
								}
								else {
									if (File_map.get((int)_position).get("file").toString().endsWith(".py")) {
										imageview1.setImageResource(R.drawable.myiconsvg_5);
										itemback.setBackgroundColor(0xFFFF9800);
									}
									else {
										if (File_map.get((int)_position).get("file").toString().endsWith(".css")) {
											imageview1.setImageResource(R.drawable.myiconsvg_11);
											itemback.setBackgroundColor(0xFF1A237E);
										}
										else {
											if (File_map.get((int)_position).get("file").toString().endsWith(".php")) {
												imageview1.setImageResource(R.drawable.myiconfuntom_2);
												itemback.setBackgroundColor(0xFF8BC34A);
											}
											else {
												if (File_map.get((int)_position).get("file").toString().endsWith(".xml")) {
													imageview1.setImageResource(R.drawable.myiconsvg_3);
													itemback.setBackgroundColor(0xFF000000);
												}
												else {
													if (File_map.get((int)_position).get("file").toString().endsWith(".svg")) {
														imageview1.setImageResource(R.drawable.myiconsvg_1);
														itemback.setBackgroundColor(0xFFF9A825);
													}
													else {
														if (File_map.get((int)_position).get("file").toString().endsWith(".java")) {
															imageview1.setImageResource(R.drawable.myiconsvg_8);
															itemback.setBackgroundColor(0xFFF9A825);
														}
														else {
															if (File_map.get((int)_position).get("file").toString().endsWith(".co")) {
																imageview1.setImageResource(R.drawable.project);
																itemback.setBackgroundColor(0xFF000000);
															}
															else {
																if (File_map.get((int)_position).get("file").toString().endsWith(".dart")) {
																	imageview1.setImageResource(R.drawable.myicondart);
																	itemback.setBackgroundColor(0xFF0D47A1);
																}
																else {
																	if (File_map.get((int)_position).get("file").toString().endsWith(".png") || File_map.get((int)_position).get("file").toString().endsWith(".jpg")) {
																		itemback.setBackgroundColor(0xFF0D47A1);
																		imageview1.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(File_map.get((int)_position).get("file").toString(), 1024, 1024));
																	}
																	else {
																		if (File_map.get((int)_position).get("file").toString().endsWith(".vue")) {
																			itemback.setBackgroundColor(0xFF006064);
																			imageview1.setImageResource(R.drawable.myiconsvg_2);
																		}
																		else {
																			if (File_map.get((int)_position).get("file").toString().endsWith(".fun")) {
																				itemback.setBackgroundColor(0xFF00BCD4);
																				imageview1.setImageResource(R.drawable.myiconfuntom_1);
																			}
																			else {
																				if (File_map.get((int)_position).get("file").toString().endsWith(".c")) {
																					itemback.setBackgroundColor(0xFF757575);
																					imageview1.setImageResource(R.drawable.myiconsvg_12);
																				}
																				else {
																					if (File_map.get((int)_position).get("file").toString().endsWith(".go")) {
																						itemback.setBackgroundColor(0xFF039BE5);
																						imageview1.setImageResource(R.drawable.myiconsvg_10);
																					}
																					else {
																						if (File_map.get((int)_position).get("file").toString().endsWith(".mp3")) {
																							itemback.setBackgroundColor(0xFFFFEB3B);
																							hsi = File_map.get((int)_position).get("file").toString();
																							Bitmap bMap = ThumbnailUtils.createVideoThumbnail(hsi,
																							android.provider.MediaStore.Video.Thumbnails.FULL_SCREEN_KIND);
																							imageview1.setImageBitmap(bMap);
																						}
																						else {
																							if (File_map.get((int)_position).get("file").toString().endsWith(".swb")) {
																								itemback.setBackgroundColor(0xFF3F51B5);
																								imageview1.setImageResource(R.drawable.swbfile);
																							}
																							else {
																								if (File_map.get((int)_position).get("file").toString().endsWith(".apk")) {
																									_getApkIcon(File_map.get((int)_position).get("file").toString(), imageview1);
																								}
																								else {
																									if (File_map.get((int)_position).get("file").toString().endsWith(".jks")) {
																										imageview1.setImageResource(R.drawable.key);
																										itemback.setBackgroundColor(0xFF00BCD4);
																									}
																									else {
																										if (File_map.get((int)_position).get("file").toString().endsWith(".rb")) {
																											imageview1.setImageResource(R.drawable.ruby_2);
																											itemback.setBackgroundColor(0xFFB71C1C);
																										}
																										else {
																											if (File_map.get((int)_position).get("file").toString().endsWith(".pas")) {
																												imageview1.setImageResource(R.drawable.pascal_2);
																												itemback.setBackgroundColor(0xFF9C27B0);
																											}
																											else {
																												if (File_map.get((int)_position).get("file").toString().endsWith("LICENSE")) {
																													imageview1.setImageResource(R.drawable.lisens);
																													itemback.setBackgroundColor(0xFFFBC02D);
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
			}
			if (liststring.get((int)(_position)).equals("data")) {
				aqules = liststring.get((int)(_position));
				if (checkPermission(pathToRealUri(aqules))) {
					if (FileUtil.isDirectory(aqules)) {
						FileUtil.makeDir("/sdcard/android/data/com.ninjacoder.codegomain");
					}
					else {
						
					}
				}
				else {
					askPermission(pathToUri(aqules));
				}
			}
			else {
				
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