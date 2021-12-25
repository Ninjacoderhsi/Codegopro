package org.codego.ninjacoder;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;

public class KibMi extends InputMethodService
implements KeyboardView.OnKeyboardActionListener {

	private KeyboardView kv;
    private Keyboard en , fa ;
    private boolean caps = false;
    
	public View onCreateInputView() {
		kv = (KeyboardView)getLayoutInflater().
		inflate(R.layout.keyboard_view, null);
       		fa= new Keyboard(this, R.xml.fa);
            en=new Keyboard(this,R.xml.en);
			kv.setKeyboard(en);
			kv.setOnKeyboardActionListener(this);
			return kv;}
            
    public void onKey(int primaryCode, int[] keyCodes) {
        InputConnection ic = getCurrentInputConnection();
          switch (primaryCode) {         
            case 3 :
                kv.setKeyboard(fa);
                return;
            case -3 :
                kv.setKeyboard(en);
                return;
            case -1:
                caps = !caps;
                fa.setShifted(caps);
                en.setShifted(caps);
                kv.invalidateAllKeys();
                break;
            case -5:
                ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DEL));
				break;
                
            case-10:
                ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER));
				break;
                
              default:
                  char code = (char) primaryCode;
                  if (Character.isLetter(code) && caps) {
                      code = Character.toUpperCase(code);
                  }
                  ic.commitText(String.valueOf(code), 1);
                  }}

    
    public void onRelease(int hsi ) {
    }
    public void onPress(int r1){     
    }
    public void onText(CharSequence text)
	{ getCurrentInputConnection().commitText(text, 1);
    }
    public void swipeLeft() {
    }
    public void swipeRight() {
    }
    public void swipeDown() {
    }
    public void swipeUp() {
    }
    
	}
