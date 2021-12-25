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
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.content.ClipData;
import android.content.ClipboardManager;
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
import io.github.rosemoe.sora.langs.EmptyLanguage;
import io.github.rosemoe.sora.langs.desc.CDescription;
import io.github.rosemoe.sora.langs.desc.CppDescription;
import io.github.rosemoe.sora.langs.desc.JavaScriptDescription;
import io.github.rosemoe.sora.langs.html.HTMLLanguage;
import io.github.rosemoe.sora.langs.java.JavaLanguage;
import io.github.rosemoe.sora.langs.python.PythonLanguage;
import io.github.rosemoe.sora.langs.universal.UniversalLanguage;
import io.github.rosemoe.sora.widget.schemes.HTMLScheme;
import io.github.rosemoe.sora.widget.schemes.SchemeDarcula;
import io.github.rosemoe.sora.widget.schemes.SchemeEclipse;
import io.github.rosemoe.sora.widget.schemes.SchemeGitHub;
import io.github.rosemoe.sora.widget.schemes.SchemeNotepadXX;
import io.github.rosemoe.sora.widget.schemes.SchemeVS2019;

import io.github.rosemoe.sora.langs.universal.*;
import io.github.rosemoe.sora.langs.html.*;
import io.github.rosemoe.sora.langs.desc.GoDescription;
import io.github.rosemoe.sora.langs.vue.*;
 import io.github.rosemoe.sora.langs.xml.*;
import io.github.rosemoe.sora.langs.desc.ShellDescription;
import io.github.rosemoe.sora.langs.desc.SmaillDescription;
import io.github.rosemoe.sora.langs.desc.PhpDescription;
import io.github.rosemoe.sora.langs.desc.AndroidXmlDescription;
import io.github.rosemoe.sora.langs.xml.XMLLanguage;
import io.github.rosemoe.sora.langs.desc.LuaDescription;
import io.github.rosemoe.sora.langs.vue.VueLanguage;
import io.github.rosemoe.sora.langs.desc.DartDescription;
import io.github.rosemoe.sora.langs.desc.FuntomDescription;
import android.content.pm.PackageManager;
import io.github.rosemoe.sora.widget.CodeEditor;
import org.codego.ninjacoders.SchemeAndroidXml;
import org.codego.ninjacoder.HtmlDrak;
import org.codego.ninjacoder.Htmlday;

public class CodeeditorActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private FloatingActionButton _fab;
	private String currentWord = "";
	private String get = "";
	private boolean chack = false;
	
	private LinearLayout linear1;
	private LinearLayout panel;
	private CodeEditor editor;
	private LinearLayout linear4;
	private ImageView undo;
	private ImageView cut;
	private ImageView copy;
	private ImageView setall;
	private ImageView icon;
	private LinearLayout colorpi;
	private ImageView redo;
	private ImageView more;
	private TextView textview1;
	private HorizontalScrollView hscroll1;
	private SymbolInputView sysbar;
	
	private Intent intent = new Intent();
	private SharedPreferences go;
	private SharedPreferences run;
	private AlertDialog.Builder main;
	private Intent hsi = new Intent();
	private AlertDialog.Builder dialogsettextsize;
	private SharedPreferences n;
	private Intent html = new Intent();
	private TimerTask timer;
	private SharedPreferences b;
	private SharedPreferences c;
	private SharedPreferences d;
	private SharedPreferences f;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.codeeditor);
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
		panel = findViewById(R.id.panel);
		editor = findViewById(R.id.editor);
		linear4 = findViewById(R.id.linear4);
		undo = findViewById(R.id.undo);
		cut = findViewById(R.id.cut);
		copy = findViewById(R.id.copy);
		setall = findViewById(R.id.setall);
		icon = findViewById(R.id.icon);
		colorpi = findViewById(R.id.colorpi);
		redo = findViewById(R.id.redo);
		more = findViewById(R.id.more);
		textview1 = findViewById(R.id.textview1);
		hscroll1 = findViewById(R.id.hscroll1);
		sysbar = findViewById(R.id.sysbar);
		go = getSharedPreferences("go", Activity.MODE_PRIVATE);
		run = getSharedPreferences("run", Activity.MODE_PRIVATE);
		main = new AlertDialog.Builder(this);
		dialogsettextsize = new AlertDialog.Builder(this);
		n = getSharedPreferences("n", Activity.MODE_PRIVATE);
		b = getSharedPreferences("b", Activity.MODE_PRIVATE);
		c = getSharedPreferences("c", Activity.MODE_PRIVATE);
		d = getSharedPreferences("d", Activity.MODE_PRIVATE);
		f = getSharedPreferences("f", Activity.MODE_PRIVATE);
		
		undo.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		undo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.undo();
			}
		});
		
		cut.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		cut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", editor.getText().toString()));
				editor.setText("");
			}
		});
		
		copy.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		copy.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", editor.getText().toString()));
			}
		});
		
		setall.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		setall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((io.github.rosemoe.sora.widget.CodeEditor)editor).selectAll();
			}
		});
		
		redo.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		redo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				editor.redo();
			}
		});
		
		more.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		more.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				View popupView = getLayoutInflater().inflate(R.layout.popupmenu, null);
				final PopupWindow popup = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
				LinearLayout bg = popupView.findViewById(R.id.bg);
				
				 LinearLayout   next = popupView.findViewById(R.id.next);
				
				 
				
				 LinearLayout   prov = popupView.findViewById(R.id.prov);
				
				 
				
				 TextView   ch = popupView.findViewById(R.id.ch);
				
				 
				
				 LinearLayout   color = popupView.findViewById(R.id.color);
				
				 
				
				next.setOnClickListener(new OnClickListener() { public void onClick(View view) {
								try {
							            editor.getSearcher().gotoNext();
							        } catch (IllegalStateException e) {
							            e.printStackTrace();
							        }
								popup.dismiss();
						} });
				
				prov.setOnClickListener(new OnClickListener() { public void onClick(View view) {
								try {
							           editor.getSearcher().gotoLast();
							        } catch (IllegalStateException e) {
							            e.printStackTrace();
							        }
								popup.dismiss();
						} });
				
				ch.setOnClickListener(new OnClickListener() { public void onClick(View view) {
								if (chack) {
							chack = false;
							editor.setWordwrap(false);
						}
						else {
							chack = true;
							editor.setWordwrap(true);
							///ch.setText("Word Warp OFF");
						}
								popup.dismiss();
						} });
				
				color.setOnClickListener(new OnClickListener() { public void onClick(View view) {
								ColorPicker seekColorPicker = new ColorPicker(CodeeditorActivity.this);
						
								final AlertDialog.Builder buildPicker = new AlertDialog.Builder(CodeeditorActivity.this);
						
								final LinearLayout linPicker = new LinearLayout(getApplicationContext());
						
						
								
						
						
						
								linPicker.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
						{
							android.graphics.drawable.GradientDrawable SketchUi = new android.graphics.drawable.GradientDrawable();
							SketchUi.setColor(0xFFFFFFFF);SketchUi.setCornerRadius(getDip(30));
							SketchUi.setStroke((int)getDip(2) ,0xFF008DCD);
							linPicker.setElevation(getDip(5));
							linPicker.setBackground(SketchUi);
						}
						
								linPicker.setOrientation(LinearLayout.VERTICAL);
						
								linPicker.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
						
						
						
								buildPicker.setPositiveButton("ColorCopy", new DialogInterface.OnClickListener() {
										@Override
										public void onClick(DialogInterface dialogInterface, int i) {
								((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", hex.getText().toString()));
								SketchwareUtil.showMessage(getApplicationContext(), "COLOR:// ".concat(hex.getText().toString().concat(" Copyed!")));
										}
								});
						
						
						
								linPicker.addView(seekColorPicker);
								buildPicker.setView(linPicker);
								buildPicker.show();
								popup.dismiss();
						} });
				
				popup.setAnimationStyle(android.R.style.Animation_Dialog);
				
				popup.showAsDropDown(more, 0,0);
				
				popup.setBackgroundDrawable(new BitmapDrawable());
			}
		});
		
		_fab.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (getIntent().getStringExtra("save").equals("nofile")) {
					finish();
				}
				else {
					FileUtil.writeFile(getIntent().getStringExtra("save"), editor.getText().toString());
					SketchwareUtil.CustomToast(getApplicationContext(), "File saved", 0xFFFFFFFF, 20, 0x89005AFF, 25, SketchwareUtil.BOTTOM);
				}
				if (getIntent().getStringExtra("path").contains(".html")) {
					html.setClass(getApplicationContext(), HtmlrunerActivity.class);
					html.putExtra("send", getIntent().getStringExtra("path"));
					_fab.setImageResource(R.drawable.play);
					startActivity(html);
				}
				else {
					if (getIntent().getStringExtra("path").contains(".js")) {
						intent.setClass(getApplicationContext(), JsrunerActivity.class);
						intent.putExtra("sendCode", editor.getText().toString().trim());
						startActivity(intent);
						_fab.setImageResource(R.drawable.play);
					}
					else {
						if (getIntent().getStringExtra("path").contains(".py")) {
							FileUtil.writeFile(FileUtil.getExternalStorageDir().concat("/htmlgo/").concat("/compiler_python_rog".trim().concat(".html")), "<!DOCTYPE html>\n<html lang=\"en-US\">\n<head>\n<title>Python Tryit Editor v1.0</title>\n<meta name=\"viewport\" content=\"width=device-width\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n<meta property=\"og:image\" content=\"https://www.w3schools.com/images/w3schools_logo.png\">\n<meta property=\"og:image:type\" content=\"image/png\">\n<meta property=\"og:image:width\" content=\"200\">\n<meta property=\"og:image:height\" content=\"200\">\n<link rel=\"preload\" href=\"/lib/fonts/fontawesome.woff2?14663396\" as=\"font\" type=\"font/woff2\" crossorigin> \n<link rel=\"stylesheet\" href=\"/lib/w3schools30.css\">\n<link rel=\"stylesheet\" href=\"/lib/codemirror.css\">\n<script src=\"/lib/codemirror.js\"></script>\n<script src=\"/lib/codemirror_python.js\"></script>\n<script>\n(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\nm=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n})(window,document,'script','https://www.google-analytics.com/analytics.js','ga');\nga('create', 'UA-3855518-1', 'auto');\nga('require', 'displayfeatures');\nga('require', 'GTM-WJ88MZ5');\nga('send', 'pageview');\n</script>\n\n<script data-cfasync=\"false\" type=\"text/javascript\">\nvar k42 = false;\n\nk42 = true;\n\n</script>\n<script data-cfasync=\"false\" type=\"text/javascript\">\n    window.snigelPubConf = {\n    \"adengine\": {\n\n      \"activeAdUnits\": [\"try_it_leaderboard\"]\n\n  }\n}\n</script>\n<script async data-cfasync=\"false\" src=\"https://cdn.snigelweb.com/adengine/w3schools.com/loader.js\" type=\"text/javascript\"></script>\n<script>\nif (window.addEventListener) {              \n    window.addEventListener(\"resize\", browserResize);\n} else if (window.attachEvent) {                 \n    window.attachEvent(\"onresize\", browserResize);\n}\nvar xbeforeResize = window.innerWidth;\n\nfunction browserResize() {\n    var afterResize = window.innerWidth;\n    if ((xbeforeResize < (970) && afterResize >= (970)) || (xbeforeResize >= (970) && afterResize < (970)) ||\n        (xbeforeResize < (728) && afterResize >= (728)) || (xbeforeResize >= (728) && afterResize < (728)) ||\n        (xbeforeResize < (468) && afterResize >= (468)) ||(xbeforeResize >= (468) && afterResize < (468))) {\n        xbeforeResize = afterResize;\n        \n        if (document.getElementById(\"adngin-try_it_leaderboard-0\")) {\n                adngin.queue.push(function(){  adngin.cmd.startAuction([\"try_it_leaderboard\"]); });\n              }\n         \n    }\n    if (window.screen.availWidth <= 768) {\n      restack(window.innerHeight > window.innerWidth);\n    }\n    fixDragBtn();\n    showFrameSize();    \n}\n</script>\n<style>\n* {\n  -webkit-box-sizing: border-box;\n  -moz-box-sizing: border-box;\n  box-sizing: border-box;\n}\nbody {\n  color:#000000;\n  margin:0px;\n  font-size:100%;\n}\n.trytopnav {\n  height:48px;\n  overflow:hidden;\n  min-width:380px;\n  position:absolute;\n  width:100%;\n  top:99px;\n  background-color:#E7E9EB;\n}\n.topnav-icons {\n  margin-right:8px;\n}\n.trytopnav a,.trytopnav button {\n  color:#999999;\n}\n.w3-bar .w3-bar-item:hover {\n  color:#757575 !important;\n}\na.w3schoolslink {\n  padding:0 !important;\n  display:inline !important;\n}\na.w3schoolslink:hover,a.w3schoolslink:active {\n  text-decoration:underline !important;\n  background-color:transparent !important;\n}\n#dragbar{\n  position:absolute;\n  cursor: col-resize;\n  z-index:3;\n  padding:5px;\n}\n#shield {\n  display:none;\n  top:0;\n  left:0;\n  width:100%;\n  position:absolute;\n  height:100%;\n  z-index:4;\n}\n#framesize span {\n  font-family:Consolas, monospace;\n}\n#container {\n  background-color:#E7E9EB;\n  width:100%;\n  overflow:auto;\n  position:absolute;\n  top:144px;\n  bottom:0;\n  height:auto;\n}\n#textareacontainer, #iframecontainer {\n  float:left;\n  height:100%;\n  width:100%;\n}\n#textarea, #iframe {\n  height:100%;\n  width:100%;\n  padding-bottom:10px;\n  padding-top:1px;\n}\n#textarea {\n  padding-left:10px;\n  padding-right:5px;  \n}\n#iframe {\n  padding-left:5px;\n  padding-right:10px;\n  color:#ffffff;\n  font-family: consolas,\"courier new\",monospace;    \n}\n#textareawrapper {\n  width:100%;\n  height:100%;\n  background-color: #ffffff;\n  position:relative;\n  box-shadow:0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);\n}\n#iframewrapper {\n  width:100%;\n  height:100%;\n  -webkit-overflow-scrolling: touch;\n  background-color: #ffffff;\n  box-shadow:0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24);\n  color:#ffffff;\n  font-family: consolas,\"courier new\",monospace;  \n}\n#textareaCode {\n  background-color: #ffffff;\n  font-family: consolas,\"courier new\",monospace;\n  font-size:15px;\n  height:100%;\n  width:100%;\n  padding:8px;\n  resize: none;\n  border:none;\n  line-height:normal;    \n}\n.CodeMirror.cm-s-default {\n  line-height:normal;\n  padding: 4px;\n  height:100%;\n  width:100%;\n}\n#iframeResult, #iframeSource {\n  background-color: #000000;\n  color:#ffffff;\n  font-family: consolas,\"courier new\",monospace!important;  \n  height:100%;\n  width:100%;  \n  padding:8px;\n}\n#iframeResult * {\n  font-family: consolas,\"courier new\",monospace!important;  \n}\n#stackV {background-color:#999999;}\n#stackV:hover {background-color:#BBBBBB !important;}\n#stackV.horizontal {background-color:transparent;}\n#stackV.horizontal:hover {background-color:#BBBBBB !important;}\n#stackH.horizontal {background-color:#999999;}\n#stackH.horizontal:hover {background-color:#999999 !important;}\n#textareacontainer.horizontal,#iframecontainer.horizontal{\n  height:100%;\n  float:none;\n  width:100%;\n}\n#textarea.horizontal{\n  height:100%;\n  padding-left:10px;\n  padding-right:10px;\n}\n#iframe.horizontal{\n  height:100%;\n  padding-right:10px;\n  padding-bottom:10px;\n  padding-left:10px;  \n}\n#container.horizontal{\n  min-height:200px;\n  margin-left:0;\n}\n#tryitLeaderboard {\n  background-color:#ffffff;\n  overflow:hidden;\n  text-align:center;\n  margin-top:5px;\n  height:90px;\n}\n.w3-dropdown-content {width:350px}\nbody.darktheme {\n  background-color:rgb(40, 44, 52);\n}\nbody.darktheme #tryitLeaderboard{\n  background-color:rgb(40, 44, 52);\n}\nbody.darktheme .trytopnav{\n  background-color:#616161;\n  color:#dddddd;\n}\nbody.darktheme #container {\n  background-color:#616161;\n}\nbody.darktheme #textareaCode {\n  background-color:rgb(40, 44, 52);\n  color:#fff;\n}\nbody.darktheme .trytopnav a,body.darktheme .trytopnav button {\n  color:#dddddd;\n}\nbody{\n    background-color: black;\n}\n#runbtn {\n  background-color:#ff534;\n  color:black;\n  margin-left: 10px;\n  margin-right: 10px;\n  font-family: 'Source Sans Pro', sans-serif;\n  font-size:18px;\n  padding:6px 25px;\n  width: 100%;\n  margin-top:4px;\n  \n  word-spacing:10px;\n}\n#runbtn:hover {\n  background-color: #059862 !important;\n  color:white!important;\n}\n#getwebsitebtn {\n  background-color:#04AA6D;\n  font-family: 'Source Sans Pro', sans-serif;  \n  color: white;\n  font-size: 18px;\n  padding:6px 15px;\n  margin-top:4px;\n  margin-right: 10px;\n  display: block;\n  float: right;\n  border-radius: 5px;\n}\n#getwebsitebtn:hover {\n  background-color: #059862 !important;\n  color:white!important;\n}\n  \n@media screen and (max-width: 727px) {\n  .trytopnav {top:70px;}\n  #container {top:116px;}\n\n}\n@media screen and (max-width: 467px) {\n  .trytopnav {top:60px;}\n  #container {top:106px;}\n  \n  .w3-dropdown-content {width:100%}\n}\n@media only screen and (max-device-width: 768px) {\n  #iframewrapper {overflow: auto;}\n  #container     {min-width:320px;}\n  .stack         {display:none;}\n  #tryhome       {display:block;}\n}\n\n#runloadercontainer{\n  display:none;\n  position:absolute;\n  background-color:#000;\n  z-index:9;\n}\n#runloader{\n  margin:auto;\n  border: 10px solid #333;\n  border-top: 10px solid #04AA6D;\n  border-radius: 100%;\n  max-width: 150px;\n  max-height: 150px;\n  animation: spin 2s linear infinite;\n  position:relative;\n}\n@keyframes spin {\n    0% { transform: rotate(0deg); }\n    100% { transform: rotate(360deg); }\n}\n#iframewrapper {\n	\n}\na.topnav-icons, a.topnav-icons.fa-home, a.topnav-icons.fa-menu, button.topnav-icons.fa-adjust {\n    font-size: 28px!important;\n}\n.btn1{\n    width: 100%;\n}\n\n</style>\n<!--[if lt IE 8]>\n<style>\n#textareacontainer, #iframecontainer {width:48%;}\n#container {height:500px;}\n#textarea, #iframe {width:90%;height:450px;}\n#textareaCode, #iframeResult {height:450px;}\n.stack {display:none;}\n</style>\n<![endif]-->\n</head>\n<body>\n    <div class=\"btn1\"> <button id=\"runbtn\" class=\"w3-button w3-bar-item ws-green w3-hover-white\" onclick=\"submitTryit(1);ga('send', 'event', 'runCodePython', 'click');adngin.cmd.startAuction(['try_it_leaderboard']);\">Run &#10095;</button></div>\n    <form id=\"codeForm\" autocomplete=\"off\" style=\"margin:0px;display:none;\">\n          <input type=\"hidden\" name=\"code\" id=\"code\" />\n        </form>\n       </div>\n    </div>\n  </div>\n  <div id=\"iframecontainer\">\n    <div id=\"iframe\">\n      <div id=\"runloadercontainer\"><div id=\"runloader\"></div></div>\n      <div id=\"iframewrapper\">\n        <div id=\"iframeResult\" style=\"white-space:nowrap;overflow:auto;\">Hello, World!\n</div>\n      </div>\n    </div>\n  </div>\n</div>\n</div>\n<div id=\"menuOverlay\" class=\"w3-overlay w3-transparent\" style=\"cursor:pointer;z-index:4\"></div>\n  <div id=\"textareacontainer\">\n    <div id=\"textarea\">\n      <div id=\"textareawrapper\">\n        <textarea autocomplete=\"off\" id=\"textareaCode\" wrap=\"logical\" spellcheck=\"false\">".concat(editor.getText().toString().concat("</textarea>\n      \n<script>\ndocument.getElementById(\"textareacontainer\").style.visibility = \"hidden\";\n\nfunction submitTryit(n) {\n  if (window.editor) {\n    window.editor.save();\n  }\n  var text = document.getElementById(\"textareaCode\").value;\n  var ifr = document.createElement(\"iframe\");\n  ifr.setAttribute(\"frameborder\", \"0\");\n  ifr.setAttribute(\"id\", \"iframeResult\");\n  ifr.setAttribute(\"name\", \"iframeResult\");  \n  document.getElementById(\"iframewrapper\").innerHTML = \"\";\n  document.getElementById(\"iframewrapper\").appendChild(ifr);\n  document.getElementById(\"iframeResult\").addEventListener(\"load\", hideSpinner);\n  displaySpinner();\n  var t=text;\n  t=t.replace(/=/gi,\"w3equalsign\");\n  t=t.replace(/\\+/gi,\"w3plussign\");    \n  var pos=t.search(/script/i)\n  while (pos>0) {\n    t=t.substring(0,pos) + \"w3\" + t.substr(pos,3) + \"w3\" + t.substr(pos+3,3) + \"tag\" + t.substr(pos+6);\n    pos=t.search(/script/i);\n  }\n  document.getElementById(\"code\").value=t;\n  document.getElementById(\"codeForm\").action = \"https://try.w3schools.com/try_python.php?x=\" + Math.random();\n  document.getElementById('codeForm').method = \"post\";\n  document.getElementById('codeForm').acceptCharset = \"utf-8\";\n  document.getElementById('codeForm').target = \"iframeResult\";\n  document.getElementById(\"codeForm\").submit();\n}\n\nfunction hideSpinner() {\n  document.getElementById(\"runloadercontainer\").style.display = \"none\";\n}\nfunction displaySpinner() {\n  var i, c, w, h, r, top;\n  i = document.getElementById(\"iframeResult\");\n  w = w3_getStyleValue(i, \"width\");\n  h = w3_getStyleValue(i, \"height\");\n  c = document.getElementById(\"runloadercontainer\");\n  c.style.width = w;\n  c.style.height = h;\n  c.style.display = \"block\";\n  w = Number(w.replace(\"px\", \"\")) / 5;\n  r = document.getElementById(\"runloader\");\n  r.style.width = w + \"px\";\n  r.style.height = w + \"px\";\n  h = w3_getStyleValue(r, \"height\");\n  h = Number(h.replace(\"px\", \"\")) / 2;\n  top = w3_getStyleValue(c, \"height\");\n  top = Number(top.replace(\"px\", \"\")) / 2;\n  top = top - h\n  r.style.top = top + \"px\";\n}\n\n\nvar currentStack=true;\nif ((window.screen.availWidth <= 768 && window.innerHeight > window.innerWidth) || \"\" == \" horizontal\") {restack(true);}\nfunction restack(horizontal) {\n    var tc, ic, t, i, c, f, sv, sh, d, height, flt, width;\n    tc = document.getElementById(\"textareacontainer\");\n    ic = document.getElementById(\"iframecontainer\");\n    t = document.getElementById(\"textarea\");\n    i = document.getElementById(\"iframe\");\n    c = document.getElementById(\"container\");    \n    sv = document.getElementById(\"stackV\");\n    sh = document.getElementById(\"stackH\");\n    tc.className = tc.className.replace(\"horizontal\", \"\");\n    ic.className = ic.className.replace(\"horizontal\", \"\");        \n    t.className = t.className.replace(\"horizontal\", \"\");        \n    i.className = i.className.replace(\"horizontal\", \"\");        \n    c.className = c.className.replace(\"horizontal\", \"\");                        \n    if (sv) {sv.className = sv.className.replace(\"horizontal\", \"\")};\n    if (sv) {sh.className = sh.className.replace(\"horizontal\", \"\")};\n    stack = \"\";\n    if (horizontal) {\n        tc.className = tc.className + \" horizontal\";\n        ic.className = ic.className + \" horizontal\";        \n        t.className = t.className + \" horizontal\";        \n        i.className = i.className + \" horizontal\";                \n        c.className = c.className + \" horizontal\";                \n        if (sv) {sv.className = sv.className + \" horizontal\"};\n        if (sv) {sh.className = sh.className + \" horizontal\"};\n        stack = \" horizontal\";\n        document.getElementById(\"textareacontainer\").style.height = \"100%\";\n        document.getElementById(\"iframecontainer\").style.height = \"100%\";\n        document.getElementById(\"textareacontainer\").style.width = \"100%\";\n        document.getElementById(\"iframecontainer\").style.width = \"100%\";\n        currentStack=false;\n    } else {\n        document.getElementById(\"textareacontainer\").style.height = \"100%\";\n        document.getElementById(\"iframecontainer\").style.height = \"100%\";\n        document.getElementById(\"textareacontainer\").style.width = \"100%\";\n        document.getElementById(\"iframecontainer\").style.width = \"100%\";\n        currentStack=true;        \n    }\n    fixDragBtn();\n    showFrameSize();\n}\nfunction retheme() {\n  var cc = document.body.className;\n  if (cc.indexOf(\"darktheme\") > -1) {\n    document.body.className = cc.replace(\"darktheme\", \"\");\n    if (opener) {opener.document.body.className = cc.replace(\"darktheme\", \"\");}\n    localStorage.setItem(\"preferredmode\", \"light\");\n  } else {\n    document.body.className += \" darktheme\";\n    if (opener) {opener.document.body.className += \" darktheme\";}\n    localStorage.setItem(\"preferredmode\", \"dark\");\n  }\n}\n(\nfunction setThemeMode() {\n  var x = localStorage.getItem(\"preferredmode\");\n  if (x == \"dark\") {\n    document.body.className += \" darktheme\";\n  }\n})();\nfunction showFrameSize() {\n  var t;\n  var width, height;\n  width = Number(w3_getStyleValue(document.getElementById(\"iframeResult\"), \"width\").replace(\"px\", \"\")).toFixed();\n  height = Number(w3_getStyleValue(document.getElementById(\"iframeResult\"), \"height\").replace(\"px\", \"\")).toFixed();\n  document.getElementById(\"framesize\").innerHTML = \"Result Size: <span>\" + width + \" x \" + height + \"</span>\";\n}\nvar dragging = false;\nvar stack;\nfunction fixDragBtn() {\n  var textareawidth, leftpadding, dragleft, containertop, buttonwidth\n  var containertop = Number(w3_getStyleValue(document.getElementById(\"container\"), \"top\").replace(\"px\", \"\"));\n  if (stack != \" horizontal\") {\n    document.getElementById(\"dragbar\").style.width = \"5px\";    \n    textareasize = Number(w3_getStyleValue(document.getElementById(\"textareawrapper\"), \"width\").replace(\"px\", \"\"));\n    leftpadding = Number(w3_getStyleValue(document.getElementById(\"textarea\"), \"padding-left\").replace(\"px\", \"\"));\n    buttonwidth = Number(w3_getStyleValue(document.getElementById(\"dragbar\"), \"width\").replace(\"px\", \"\"));\n    textareaheight = w3_getStyleValue(document.getElementById(\"textareawrapper\"), \"height\");\n    dragleft = textareasize + leftpadding + (leftpadding / 2) - (buttonwidth / 2);\n    document.getElementById(\"dragbar\").style.top = containertop + \"px\";\n    document.getElementById(\"dragbar\").style.left = dragleft + \"px\";\n    document.getElementById(\"dragbar\").style.height = textareaheight;\n    document.getElementById(\"dragbar\").style.cursor = \"col-resize\";\n    \n  } else {\n    document.getElementById(\"dragbar\").style.height = \"5px\";\n    if (window.getComputedStyle) {\n        textareawidth = window.getComputedStyle(document.getElementById(\"textareawrapper\"),null).getPropertyValue(\"height\");\n        textareaheight = window.getComputedStyle(document.getElementById(\"textareawrapper\"),null).getPropertyValue(\"width\");\n        leftpadding = window.getComputedStyle(document.getElementById(\"textarea\"),null).getPropertyValue(\"padding-top\");\n        buttonwidth = window.getComputedStyle(document.getElementById(\"dragbar\"),null).getPropertyValue(\"height\");\n    } else {\n        dragleft = document.getElementById(\"textareawrapper\").currentStyle[\"width\"];\n    }\n    textareawidth = Number(textareawidth.replace(\"px\", \"\"));\n    leftpadding = Number(leftpadding .replace(\"px\", \"\"));\n    buttonwidth = Number(buttonwidth .replace(\"px\", \"\"));\n    dragleft = containertop + textareawidth + leftpadding + (leftpadding / 2);\n    document.getElementById(\"dragbar\").style.top = dragleft + \"px\";\n    document.getElementById(\"dragbar\").style.left = \"5px\";\n    document.getElementById(\"dragbar\").style.width = textareaheight;\n    document.getElementById(\"dragbar\").style.cursor = \"row-resize\";        \n  }\n}\nfunction dragstart(e) {\n  e.preventDefault();\n  dragging = true;\n  var main = document.getElementById(\"iframecontainer\");\n}\nfunction dragmove(e) {\n  if (dragging) \n  {\n    document.getElementById(\"shield\").style.display = \"block\";        \n    if (stack != \" horizontal\") {\n      var percentage = (e.pageX / window.innerWidth) * 100;\n      if (percentage > 5 && percentage < 98) {\n        var mainPercentage = 100-percentage;\n        document.getElementById(\"textareacontainer\").style.width = percentage + \"%\";\n        document.getElementById(\"iframecontainer\").style.width = mainPercentage + \"%\";\n        fixDragBtn();\n      }\n    } else {\n      var containertop = Number(w3_getStyleValue(document.getElementById(\"container\"), \"top\").replace(\"px\", \"\"));\n      var percentage = ((e.pageY - containertop + 20) / (window.innerHeight - containertop + 20)) * 100;\n      if (percentage > 5 && percentage < 98) {\n        var mainPercentage = 100-percentage;\n        document.getElementById(\"textareacontainer\").style.height = percentage + \"%\";\n        document.getElementById(\"iframecontainer\").style.height = mainPercentage + \"%\";\n        fixDragBtn();\n      }\n    }\n    showFrameSize();    \n  }\n}\nfunction dragend() {\n  document.getElementById(\"shield\").style.display = \"none\";\n  dragging = false;\n  var vend = navigator.vendor;\n  if (window.editor && vend.indexOf(\"Apple\") == -1) {\n      window.editor.refresh();\n  }\n}\nif (window.addEventListener) {              \n  document.getElementById(\"dragbar\").addEventListener(\"mousedown\", function(e) {dragstart(e);});\n  document.getElementById(\"dragbar\").addEventListener(\"touchstart\", function(e) {dragstart(e);});\n  window.addEventListener(\"mousemove\", function(e) {dragmove(e);});\n  window.addEventListener(\"touchmove\", function(e) {dragmove(e);});\n  window.addEventListener(\"mouseup\", dragend);\n  window.addEventListener(\"touchend\", dragend);\n  window.addEventListener(\"load\", fixDragBtn);\n  window.addEventListener(\"load\", showFrameSize);\n}\n\n\nfunction colorcoding() {\n  var ua = navigator.userAgent;\n  //Opera Mini refreshes the page when trying to edit the textarea.\n  if (ua && ua.toUpperCase().indexOf(\"OPERA MINI\") > -1) { return false; }\n  window.editor = CodeMirror.fromTextArea(document.getElementById(\"textareaCode\"), {\n    mode: \"text/x-python\",\n    lineWrapping: true,\n    smartIndent: false\n  });\n//  window.editor.on(\"change\", function () {window.editor.save();});\n}\ncolorcoding();\n\nfunction w3_getStyleValue(elmnt,style) {\n    if (window.getComputedStyle) {\n        return window.getComputedStyle(elmnt,null).getPropertyValue(style);\n    } else {\n        return elmnt.currentStyle[style];\n    }\n}\n\nfunction openMenu() {\n    var x = document.getElementById(\"navbarDropMenu\");\n    var y = document.getElementById(\"menuOverlay\");\n    var z = document.getElementById(\"menuButton\");\n    if (z.className.indexOf(\"w3-text-gray\") == -1) {\n        z.className += \" w3-text-gray\";\n    } else { \n        z.className = z.className.replace(\" w3-text-gray\", \"\");\n    }\n    if (z.className.indexOf(\"w3-gray\") == -1) {\n        z.className += \" w3-gray\";\n    } else { \n        z.className = z.className.replace(\" w3-gray\", \"\");\n    }\n    if (x.className.indexOf(\"w3-show\") == -1) {\n        x.className += \" w3-show\";\n    } else { \n        x.className = x.className.replace(\" w3-show\", \"\");\n    }\n    if (y.className.indexOf(\"w3-show\") == -1) {\n        y.className += \" w3-show\";\n    } else { \n        y.className = y.className.replace(\" w3-show\", \"\");\n    }\n\n}\n// When the user clicks anywhere outside of the modal, close it\nwindow.onclick = function(event) {\n    if (event.target == document.getElementById(\"menuOverlay\")) {\n        openMenu();\n    } \n}\n</script>\n\n</body>\n</html>")).trim());
							hsi.setClass(getApplicationContext(), PyrunerActivity.class);
							hsi.putExtra("language", "python");
							startActivity(hsi);
						}
						else {
							if (getIntent().getStringExtra("path").contains(".svg")) {
								intent.setClass(getApplicationContext(), HtmlrunerActivity.class);
								run.edit().putString("run", editor.getText().toString().trim()).commit();
								startActivity(intent);
								_fab.setImageResource(R.drawable.play);
							}
							else {
								if (getIntent().getStringExtra("path").contains(".lua")) {
									intent.setClass(getApplicationContext(), LuamjActivity.class);
									_fab.setImageResource(R.drawable.play);
									startActivity(intent);
								}
								else {
									
								}
							}
						}
					}
				}
			}
		});
	}
	
	private void initializeLogic() {
		editor.setNonPrintablePaintingFlags(CodeEditor.FLAG_DRAW_WHITESPACE_LEADING | CodeEditor.FLAG_DRAW_LINE_SEPARATOR);
		editor.setOverScrollEnabled(false);
		undo.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(undo);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(undo);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(undo);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(undo);
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
		cut.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(cut);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(cut);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(cut);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(cut);
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
		copy.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(copy);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(copy);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(copy);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(copy);
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
		setall.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(setall);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(setall);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(setall);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(setall);
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
		redo.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(redo);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(redo);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(redo);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(redo);
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
		more.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(more);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(more);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration((int)5);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(more);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration((int)5);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(more);
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
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE|WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =CodeeditorActivity.this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(0xFF212121);
		}
		editor.setTypefaceText(Typeface.createFromAsset(getAssets(), "ninjacoder.ttf"));
		_editordark();
		_themedrak();
		SymbolInputView inputView = findViewById(R.id.sysbar);
		
		        inputView.bindEditor(editor);
		        inputView.addSymbols(new String[]{"->","[","]","{", "}", "(", ")","#","|", "<" , ">" ,  ",", ".", ";", "&","<-","?", "+", "-", "*", "/"},
		                new String[]{"\t", "{}", "}", "(", ")", ",", ".", ";", "\"", "?", "+", "-", "*", "/"});
		
		editor.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try { 
					String textSpan = editor.getText().toString();
					    final int selection = editor.getCursor().getLeft();
					    final Pattern pattern = Pattern.compile("(#?)(\\w+)");
					    final Matcher matcher = pattern.matcher(textSpan);
					    int start = 0;
					    int end = 0;
					
					   String currentWordddddddd = "";
					   try { 
							 while (matcher.find()) {
									        start = matcher.start();
									        end = matcher.end();
									        if (start <= selection && selection <= end) {
											            currentWordddddddd = textSpan.substring(start, end).toString();
											            currentWord = currentWordddddddd;
											        }
									    }
					} catch (Exception rr) { 
							rr.printStackTrace();
					}
					if (!currentWord.isEmpty()) {
						if (currentWord.contains("#")) {
							try {
								    
								colorpi.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)50, (int)4, Color.TRANSPARENT, Color.parseColor(currentWord)));
							} catch (IllegalArgumentException iae) {
								    
							}
						}
						else {
							if (currentWord.toLowerCase().contains("0xff")) {
								try {
									    
									currentWord = currentWord.replace("0xff", "#");
									currentWord = currentWord.replace("0xFF", "#");
									colorpi.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)55, (int)6, Color.TRANSPARENT, Color.parseColor(currentWord)));
								} catch (IllegalArgumentException iae) {
									    
								}
							}
							else {
								editor.getSearcher().search(currentWord);
							}
						}
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		});
		editor.setPinLineNumber(!editor.isLineNumberPinned());
		if (n.getString("lin", "").equals("1")) {
			editor.setLineNumberEnabled(true);
		}
		else {
			if (n.getString("lin", "").equals("2")) {
				editor.setLineNumberEnabled(false);
			}
			else {
				
			}
		}
		if (f.getString("lin1", "").equals("3")) {
			editor.setWordwrap(true);
		}
		else {
			if (f.getString("lin1", "").equals("4")) {
				editor.setWordwrap(false);
			}
			else {
				
			}
		}
		if (d.getString("lin3", "").equals("5")) {
			editor.setOverScrollEnabled(true);
		}
		else {
			if (d.getString("lin3", "").equals("6")) {
				editor.setOverScrollEnabled(false);
			}
			else {
				
			}
		}
		if (c.getString("lin2", "").equals("7")) {
			editor.setFirstLineNumberAlwaysVisible(true);
		}
		else {
			if (c.getString("lin2", "").equals("8")) {
				editor.setFirstLineNumberAlwaysVisible(false);
			}
			else {
				
			}
		}
	}
	
	
	@Override
	public void onStart() {
		super.onStart();
		dialogsettextsize = new AlertDialog.Builder(this,AlertDialog.THEME_TRADITIONAL);
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {
			Window w =this.getWindow();
			w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setNavigationBarColor(Color.parseColor("0xFF424242".replace("0xFF" , "#")));
		}
	}
	public void _editordark() {
		if (getIntent().getStringExtra("title").contains(".html")) {
			_fab.setImageResource(R.drawable.play);
			editor.setColorScheme(new HtmlDrak());
			icon.setImageResource(R.drawable.greadliconpack_7);
			editor.setEditorLanguage(new HTMLLanguage()); 
			StringBuilder arebaw = new StringBuilder();
			
			try {
				
				Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
				while (scanner.hasNext()) {
					arebaw .append(scanner.next());
				}
				editor.setText(arebaw );
			} catch (Exception rt) {
				rt.printStackTrace();
			}
		}
		else {
			if (getIntent().getStringExtra("title").contains(".lua")) {
				StringBuilder arebawlll = new StringBuilder();
				
				try {
					
					Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
					while (scanner.hasNext()) {
						arebawlll .append(scanner.next());
					}
					editor.setText(arebawlll );
				} catch (Exception rt) {
					rt.printStackTrace();
				}
				editor.setEditorLanguage(new UniversalLanguage(new LuaDescription()));
				editor.setColorScheme(new SchemeAndroidXml());
				icon.setImageResource(R.drawable.greadliconpack_5);
				_fab.setImageResource(R.drawable.play);
			}
			else {
				if (getIntent().getStringExtra("title").contains(".js")) {
					StringBuilder arebawww = new StringBuilder();
					
					try {
						
						Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
						while (scanner.hasNext()) {
							arebawww .append(scanner.next());
						}
						editor.setText(arebawww );
					} catch (Exception rt) {
						rt.printStackTrace();
					}
					_fab.setImageResource(R.drawable.play);
					editor.setEditorLanguage(new UniversalLanguage(new JavaScriptDescription()));
					icon.setImageResource(R.drawable.languagejavascript);
					editor.setColorScheme(new SchemeAndroidXml());
				}
				else {
					if (getIntent().getStringExtra("title").contains(".py")) {
						StringBuilder arebzawww = new StringBuilder();
						
						try {
							
							Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
							while (scanner.hasNext()) {
								arebzawww .append(scanner.next());
							}
							editor.setText(arebzawww );
						} catch (Exception rt) {
							rt.printStackTrace();
						}
						editor.setEditorLanguage(new PythonLanguage()); 
						_fab.setImageResource(R.drawable.play);
						icon.setImageResource(R.drawable.greadliconpack_8);
						editor.setColorScheme(new SchemeAndroidXml());
					}
					else {
						if (getIntent().getStringExtra("title").contains(".cpp")) {
							StringBuilder arebzarwww = new StringBuilder();
							
							try {
								
								Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
								while (scanner.hasNext()) {
									arebzarwww .append(scanner.next());
								}
								editor.setText(arebzarwww );
							} catch (Exception rt) {
								rt.printStackTrace();
							}
							editor.setEditorLanguage(new UniversalLanguage(new CppDescription()));
							editor.setColorScheme(new SchemeAndroidXml());
							icon.setImageResource(R.drawable.languagecpp);
						}
						else {
							if (getIntent().getStringExtra("title").contains(".sh")) {
								editor.setEditorLanguage(new UniversalLanguage(new ShellDescription()));
													
								StringBuilder arebzarwwo = new StringBuilder();
								
								try {
									
									Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
									while (scanner.hasNext()) {
										arebzarwwo .append(scanner.next());
									}
									editor.setText(arebzarwwo );
								} catch (Exception rt) {
									rt.printStackTrace();
								}
								icon.setImageResource(R.drawable.greadliconpack_2);
								editor.setColorScheme(new SchemeAndroidXml());
							}
							else {
								if (getIntent().getStringExtra("title").contains(".smail")) {
									editor.setEditorLanguage(new UniversalLanguage(new SmaillDescription()));
														
									StringBuilder arebzarwwo = new StringBuilder();
									
									try {
										
										Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
										while (scanner.hasNext()) {
											arebzarwwo .append(scanner.next());
										}
										editor.setText(arebzarwwo );
									} catch (Exception rt) {
										rt.printStackTrace();
									}
									editor.setColorScheme(new SchemeAndroidXml());
									icon.setImageResource(R.drawable.greadliconpack_11);
								}
								else {
									if (getIntent().getStringExtra("title").contains(".css")) {
										editor.setEditorLanguage(new CSS3Language()); 
										StringBuilder cssmod = new StringBuilder();
										
										try {
											
											Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
											while (scanner.hasNext()) {
												cssmod .append(scanner.next());
											}
											editor.setText(cssmod );
										} catch (Exception rt) {
											rt.printStackTrace();
										}
										editor.setColorScheme(new SchemeAndroidXml());
										icon.setImageResource(R.drawable.languagecss3);
									}
									else {
										if (getIntent().getStringExtra("title").contains(".php")) {
											editor.setEditorLanguage(new UniversalLanguage(new PhpDescription()));
																
											StringBuilder phpmod = new StringBuilder();
											
											try {
												
												Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
												while (scanner.hasNext()) {
													phpmod .append(scanner.next());
												}
												editor.setText(phpmod );
											} catch (Exception rt) {
												rt.printStackTrace();
											}
											icon.setImageResource(R.drawable.languagephp);
											editor.setColorScheme(new SchemeAndroidXml());
										}
										else {
											if (getIntent().getStringExtra("title").contains(".xml")) {
												XMLLanguage xmlLanguage=new XMLLanguage(); 
												xmlLanguage.setSyntaxCheckEnable(true); 
												editor.setEditorLanguage(xmlLanguage);
												StringBuilder xmlmod = new StringBuilder();
												
												try {
													
													Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
													while (scanner.hasNext()) {
														xmlmod .append(scanner.next());
													}
													editor.setText(xmlmod );
												} catch (Exception rt) {
													rt.printStackTrace();
												}
												icon.setImageResource(R.drawable.greadliconpack_11);
												editor.setColorScheme(new SchemeAndroidXml());
											}
											else {
												if (getIntent().getStringExtra("title").contains(".svg")) {
													StringBuilder androidsvg = new StringBuilder();
													
													try {
														
														Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
														while (scanner.hasNext()) {
															androidsvg .append(scanner.next());
														}
														editor.setText(androidsvg );
													} catch (Exception rt) {
														rt.printStackTrace();
													}
													_fab.setImageResource(R.drawable.play);
													icon.setImageResource(R.drawable.greadliconpack_4);
													editor.setColorScheme(new HtmlDrak());
												}
												else {
													if (getIntent().getStringExtra("title").contains(".java")) {
														StringBuilder androidjava = new StringBuilder();
														
														try {
															
															Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
															while (scanner.hasNext()) {
																androidjava .append(scanner.next());
															}
															editor.setText(androidjava );
														} catch (Exception rt) {
															rt.printStackTrace();
														}
														editor.setEditorLanguage(new JavaLanguage()); 
														icon.setImageResource(R.drawable.greadliconpack_10);
														editor.setColorScheme(new SchemeAndroidXml());
													}
													else {
														if (getIntent().getStringExtra("title").contains(".dart")) {
															StringBuilder androiddart = new StringBuilder();
															
															try {
																
																Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
																while (scanner.hasNext()) {
																	androiddart .append(scanner.next());
																}
																editor.setText(androiddart );
															} catch (Exception rt) {
																rt.printStackTrace();
															}
															editor.setColorScheme(new SchemeAndroidXml());
															icon.setImageResource(R.drawable.dart);
															editor.setEditorLanguage(new UniversalLanguage(new DartDescription()));	
														}
														else {
															if (getIntent().getStringExtra("title").contains(".vue")) {
																StringBuilder androidvue = new StringBuilder();
																
																try {
																	
																	Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
																	while (scanner.hasNext()) {
																		androidvue .append(scanner.next());
																	}
																	editor.setText(androidvue );
																} catch (Exception rt) {
																	rt.printStackTrace();
																}
																editor.setColorScheme(new HtmlDrak());
																icon.setImageResource(R.drawable.greadliconpack_3);
																editor.setEditorLanguage(new VueLanguage());
															}
															else {
																if (getIntent().getStringExtra("title").contains(".fun")) {
																	StringBuilder androidvue = new StringBuilder();
																	
																	try {
																		
																		Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
																		while (scanner.hasNext()) {
																			androidvue .append(scanner.next());
																		}
																		editor.setText(androidvue );
																	} catch (Exception rt) {
																		rt.printStackTrace();
																	}
																	editor.setColorScheme(new SchemeAndroidXml());
																	icon.setImageResource(R.drawable.greadliconpack_1);
																	editor.setEditorLanguage(new UniversalLanguage(new FuntomDescription()));	
																}
																else {
																	if (getIntent().getStringExtra("title").contains(".c")) {
																		StringBuilder androidc = new StringBuilder();
																		
																		try {
																			
																			Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
																			while (scanner.hasNext()) {
																				androidc .append(scanner.next());
																			}
																			editor.setText(androidc );
																		} catch (Exception rt) {
																			rt.printStackTrace();
																		}
																		editor.setColorScheme(new SchemeAndroidXml());
																		icon.setImageResource(R.drawable.languacroz);
																		editor.setEditorLanguage(new UniversalLanguage(new CDescription()));	
																	}
																	else {
																		if (getIntent().getStringExtra("title").contains(".go")) {
																			StringBuilder androidgo = new StringBuilder();
																			
																			try {
																				
																				Scanner scanner = new Scanner(new java.io.File(getIntent().getStringExtra("path"))).useDelimiter("\\Z");
																				while (scanner.hasNext()) {
																					androidgo .append(scanner.next());
																				}
																				editor.setText(androidgo );
																			} catch (Exception rt) {
																				rt.printStackTrace();
																			}
																			editor.setColorScheme(new SchemeAndroidXml());
																			icon.setImageResource(R.drawable.greadliconpack_6);
																			editor.setEditorLanguage(new UniversalLanguage(new GoDescription()));	
																		}
																		else {
																			
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
	
	
	public void _themedrak() {
		linear1.setBackgroundColor(0xFF212121);
		panel.setBackgroundColor(0xFF212121);
		linear4.setBackgroundColor(0xFF212121);
		undo.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		cut.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		copy.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		setall.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		redo.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		more.setColorFilter(0xFFFF9800, PorterDuff.Mode.MULTIPLY);
		_fab.setBackgroundTintList(android.content.res.ColorStateList.valueOf(Color.parseColor("0xFF2196F3".replace("0xFF" , "#"))));
		_fab.setColorFilter(0xFFFF5722, PorterDuff.Mode.MULTIPLY);
	}
	
	
	public void _cil() {
	}
		 private Button btnCopy;
		 private EditText hex;
		 private EditText hex2;
		 private boolean isSimleDialog = false;
		 public static interface OnColorChangedListener
		 {
				 public void onColorChanged(ColorPicker picker, int color);
			 }
		 class ColorPicker extends LinearLayout
		 {
				 private SeekBar r;
				 private SeekBar g;
				 private SeekBar b;
				 private TextView colorShow;
				 private SeekBar.OnSeekBarChangeListener listener;
				 private OnColorChangedListener l;
				 public ColorPicker(Context c)
				 {
						 super(c);
						 init();
					 }
		
				 private void init(){
						 setPadding(16, 16, 16, 16);
						 setGravity(Gravity.CENTER);
						 setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
						 colorShow = new TextView(getContext());
						 colorShow.setLayoutParams(new ViewGroup.LayoutParams(60, 60));
						 addView(colorShow);
						 listener = new SeekBar.OnSeekBarChangeListener(){
								 @Override
								 public void onProgressChanged(SeekBar p1, int p2, boolean p3)
								 {
										 int color = Color.rgb(r.getProgress(), g.getProgress(), b.getProgress());
										 String temp = String.format("0x%08X", color);
										 String result = temp.substring(2);
										 hex.setText("#" + result);
										 hex2.setText("0x" + result);
										 hex.getBackground().setColorFilter(color, PorterDuff.Mode.SRC_IN);
										 colorShow.setBackgroundColor(color);
										 btnCopy.setBackgroundColor(color);
					
										 double darkness = 1-(0.299*Color.red(color) + 0.587*Color.green(color) + 0.114*Color.blue(color))/255;
					
										 if(darkness<0.5){
												 btnCopy.setTextColor(Color.BLACK);
											 }else{
												 btnCopy.setTextColor(Color.WHITE);
											 }
					
					
					
										 if(l != null) l.onColorChanged(ColorPicker.this, color);
									 }
								 @Override public void onStartTrackingTouch(SeekBar p1){}
								 @Override public void onStopTrackingTouch(SeekBar p1){}
							 };
						 LinearLayout lay2 = new LinearLayout(getContext());
						 lay2.setOrientation(VERTICAL);
						 lay2.setPadding(8, 0, 8, 8);
						 lay2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
						 hex = new EditText(getContext());
						 hex2 = new EditText(getContext());
						 ViewGroup.MarginLayoutParams params = new ViewGroup.MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
						 params.setMargins(16, 0, 16, 0);
						 hex.setLayoutParams(params);
						 hex2.setLayoutParams(params);
						 hex.setCursorVisible(false);
			
						 hex.setImeOptions(android.view.inputmethod.EditorInfo.IME_ACTION_DONE);
						 hex.setText("#000000");
						 hex2.setText("0xFF000000");
						 hex.setOnEditorActionListener(new TextView.OnEditorActionListener(){
								 @Override
								 public boolean onEditorAction(TextView text, int code, KeyEvent event)
								 {
										 try {
												 int color = Color.parseColor(text.getText().toString());
												 r.setProgress(Color.red(color));
												 g.setProgress(Color.green(color));
												 b.setProgress(Color.blue(color));
											 } catch(Exception e){
												 Toast.makeText(getContext(), "Color code is wrong", Toast.LENGTH_SHORT).show();
											 }
										 return true;
									 }
							 });
			
						 btnCopy = new Button(getApplicationContext());
			
						 btnCopy.setTextSize(15);
			
			if (isSimleDialog) {
							 if (Locale.getDefault().getDisplayLanguage().equals("العربية")){
									 btnCopy.setText("نسخ");
								 } else {
									 btnCopy.setText("Copy");
								 }
							     btnCopy.setClickable(true);
							 } if (! isSimleDialog) {
								 btnCopy.setText("");
								 btnCopy.setClickable(false);
							 }
			
						 btnCopy.setTypeface(Typeface.MONOSPACE);
			
						 btnCopy.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
						 
						 btnCopy.setPadding(0,0,0,0);
						 
						 btnCopy.setBackgroundColor(Color.BLACK);
						 
						 btnCopy.setTextColor(Color.WHITE);
			
						 btnCopy.setOnClickListener(new View.OnClickListener() {
								 @Override
								 public void onClick(View view) {
										 try {
												 android.content.ClipboardManager clipboard = (android.content.ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
												 ClipData clip = ClipData.newPlainText("label", hex.getText().toString());
												 clipboard.setPrimaryClip(clip);
												 Toast.makeText(getApplicationContext(), "✓", Toast.LENGTH_SHORT).show();
											 } catch (Exception e) {
												 e.printStackTrace();
											 }
									 }
							 });
			
						 lay2.addView(hex);
						 lay2.addView(hex2);
						 r = new SeekBar(getContext());
						 setProgressColor(r, 0xffcc5577);
						 r.setMax(255);
						 r.setOnSeekBarChangeListener(listener);
						 lay2.addView(r);
						 g = new SeekBar(getContext());
						 setProgressColor(g, 0xff339977);
						 g.setMax(255);
						 g.setOnSeekBarChangeListener(listener);
						 lay2.addView(g);
						 b = new SeekBar(getContext());
						 setProgressColor(b, 0xff6077bb);
						 b.setMax(255);
						 b.setOnSeekBarChangeListener(listener);
						 lay2.addView(b);
						 addView(lay2);
						 int color = Color.parseColor(hex.getText().toString());
						 r.setProgress(Color.red(color));
						 g.setProgress(Color.green(color));
						 b.setProgress(Color.blue(color));
						 colorShow.setBackgroundColor(color);
						 lay2.addView(btnCopy);
					 }
				 public void setColor(int color)
				 {
						 hex.setText("#" + String.format("0x%08X", color).substring(2));
						 hex2.setText("0x" + String.format("0x%08X", color).substring(2));
						 r.setProgress(Color.red(color));
						 g.setProgress(Color.green(color));
						 b.setProgress(Color.blue(color));
			
			
			
					 }
				 public int getColor(boolean refreshFromSlider)
				 {
						 if(refreshFromSlider)
							 listener.onProgressChanged(null, 0, false);
						 return Color.parseColor(hex.getText().toString());
					 }
				 public int getColor()
				 {
						 return getColor(true);
					 }
				 public void setOnColorChangedListener(OnColorChangedListener l)
				 {
						 this.l = l;
					 }
				 private void setProgressColor(AbsSeekBar bar, int color)
				 {
						 bar.getProgressDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN); bar.getThumb().setColorFilter(color, PorterDuff.Mode.SRC_IN);
					 }
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