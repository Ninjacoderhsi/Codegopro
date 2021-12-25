package org.codego.ninjacoder;


////import org.codego.ninjacoder.Htmlday;

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
public class Htmlday extends EditorColorScheme {

    @Override
    public void applyDefault() {
        super.applyDefault();
        setColor(OPERATOR, 0xFF000082);
        setColor(BLOCK_LINE, 0xFFADF300);
        setColor(BLOCK_LINE_CURRENT, 0xFFED0000);
        setColor(NON_PRINTABLE_CHAR, 0xFFE23370);
        setColor(CURRENT_LINE, 0x8AFFFFFF);
        setColor(SELECTION_INSERT, 0xFFDC8900);
        setColor(SELECTION_HANDLE, 0xFFFA6740);
        setColor(LINE_NUMBER, 0xFF000082);
        setColor(LINE_DIVIDER, 0xFF000082);
        setColor(LINE_NUMBER_BACKGROUND, 0xFFFFFFFF);
        setColor(WHOLE_BACKGROUND, 0xFFFFFFFF);
        setColor(ATTRIBUTE_VALUE, 0xFFFF7D2D);
        setColor(ATTRIBUTE_NAME, 0xFF000082);
        setColor(HTML_TAG, 0xFFFD00CE);
        setColor(TEXT_NORMAL, 0xFF000082);
        setColor(IDENTIFIER_NAME, 0xfff0be4b);
        setColor(COMMENT, 0xFFFFC800);
        setColor(TEXT_SELECTED, 0xffffffff);
        setColor(SELECTED_TEXT_BACKGROUND, 0xFFC715A7);
    }

}
