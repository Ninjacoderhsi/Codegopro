package org.codego.ninjacoder;


////import org.codego.ninjacoder.SchemeHtmlDrak;

/*
 *    sora-editor - the awesome code editor for Android
 *    https://github.com/Rosemoe/CodeEditor
 *    Copyright (C) 2020-2021  Rosemoe
 *
 *     This library is free software; you can redistribute it and/or
 *     modify it under the terms of the GNU Lesser General Public
 *     License as published by the Free Software Foundation; either
 *     version 2.1 of the License, or (at your option) any later version.
 *
 *     This library is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public
 *     License along with this library; if not, write to the Free Software
 *     Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 *     USA
 *
 *     Please contact Rosemoe by email 2073412493@qq.com if you need
 *     additional information or have any questions
 */
////package io.github.rosemoe.sora.widget.schemes;

import io.github.rosemoe.sora.widget.EditorColorScheme;

/**
 * ColorScheme for HTML Language for editor
 */
public class HtmlDrak extends EditorColorScheme {

    @Override
    public void applyDefault() {
        super.applyDefault();
        setColor(OPERATOR, 0xff4fc3f7);
        setColor(BLOCK_LINE, 0xff717171);
        setColor(BLOCK_LINE_CURRENT, 0xffffffff);
        setColor(NON_PRINTABLE_CHAR, 0xffdddddd);
        setColor(CURRENT_LINE, 0xff464646);
        setColor(SELECTION_INSERT, 0xffffffff);
        setColor(SELECTION_HANDLE, 0xffffffff);
        setColor(LINE_NUMBER, 0xff2b9eaf);
        setColor(LINE_DIVIDER, 0xff2b9eaf);
        setColor(LINE_NUMBER_BACKGROUND, 0xFF212121);
        setColor(WHOLE_BACKGROUND, 0xFF212121);
        setColor(ATTRIBUTE_VALUE, 0xff8bc34a);
        setColor(ATTRIBUTE_NAME, 0x7A000000);
        setColor(HTML_TAG, 0xFFFF004C);
        setColor(TEXT_NORMAL, 0xFF0ECAFF);
        setColor(IDENTIFIER_NAME, 0xfff0be4b);
        setColor(COMMENT, 0xFFFFC800);
        setColor(TEXT_SELECTED, 0xffffffff);
        setColor(SELECTED_TEXT_BACKGROUND, 0xFF9E9E9E);
    }

}
