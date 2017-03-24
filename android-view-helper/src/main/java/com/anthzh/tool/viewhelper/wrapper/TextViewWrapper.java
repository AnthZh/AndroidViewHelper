/*
* Copyright (C) 2017 anthzh89@gmail.com
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.anthzh.tool.viewhelper.wrapper;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.MovementMethod;
import android.text.method.TransformationMethod;
import android.view.ActionMode.Callback;
import android.view.inputmethod.ExtractedText;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import android.widget.TextView.OnEditorActionListener;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

@SuppressWarnings("unchecked")
public class TextViewWrapper<W extends TextViewWrapper<W>> extends ViewWrapper<W> {
    protected TextView mView;

    public TextViewWrapper(TextView view) {
        super(view);
        mView = view;
    }

    /**
    * @see TextView#append(CharSequence, int, int)
    */
     public W append(CharSequence text, int start, int end) {
         mView.append(text, start, end);
         return (W) this;
     }

    /**
    * @see TextView#append(CharSequence)
    */
     public  W append(CharSequence text) {
         mView.append(text);
         return (W) this;
     }

    /**
    * @see TextView#debug(int)
    */
     public W debug(int depth) {
         mView.debug(depth);
         return (W) this;
     }

    /**
    * @see TextView#setError(CharSequence)
    */
     public W setError(CharSequence error) {
         mView.setError(error);
         return (W) this;
     }

    /**
    * @see TextView#setError(CharSequence, Drawable)
    */
     public W setError(CharSequence error, Drawable icon) {
         mView.setError(error, icon);
         return (W) this;
     }

    /**
    * @see TextView#setShadowLayer(float, float, float, int)
    */
     public W setShadowLayer(float radius, float dx, float dy, int color) {
         mView.setShadowLayer(radius, dx, dy, color);
         return (W) this;
     }

    /**
    * @see TextView#setEllipsize(TruncateAt)
    */
     public W setEllipsize(TruncateAt where) {
         mView.setEllipsize(where);
         return (W) this;
     }

    /**
    * @see TextView#beginBatchEdit()
    */
     public W beginBatchEdit() {
         mView.beginBatchEdit();
         return (W) this;
     }

    /**
    * @see TextView#setCursorVisible(boolean)
    */
     public W setCursorVisible(boolean visible) {
         mView.setCursorVisible(visible);
         return (W) this;
     }

    /**
    * @see TextView#setFilters(InputFilter[])
    */
     public W setFilters(InputFilter[] filters) {
         mView.setFilters(filters);
         return (W) this;
     }

    /**
    * @see TextView#endBatchEdit()
    */
     public W endBatchEdit() {
         mView.endBatchEdit();
         return (W) this;
     }

    /**
    * @see TextView#setAllCaps(boolean)
    */
     public W setAllCaps(boolean allCaps) {
         mView.setAllCaps(allCaps);
         return (W) this;
     }

    /**
    * @see TextView#setExtractedText(ExtractedText)
    */
     public W setExtractedText(ExtractedText text) {
         mView.setExtractedText(text);
         return (W) this;
     }

    /**
    * @see TextView#setScroller(Scroller)
    */
     public W setScroller(Scroller s) {
         mView.setScroller(s);
         return (W) this;
     }

    /**
    * @see TextView#setSingleLine(boolean)
    */
     public W setSingleLine(boolean singleLine) {
         mView.setSingleLine(singleLine);
         return (W) this;
     }

    /**
    * @see TextView#setSingleLine()
    */
     public W setSingleLine() {
         mView.setSingleLine();
         return (W) this;
     }

    /**
    * @see TextView#setMaxEms(int)
    */
     public W setMaxEms(int maxems) {
         mView.setMaxEms(maxems);
         return (W) this;
     }

    /**
    * @see TextView#setEms(int)
    */
     public W setEms(int ems) {
         mView.setEms(ems);
         return (W) this;
     }

    /**
    * @see TextView#setWidth(int)
    */
     public W setWidth(int pixels) {
         mView.setWidth(pixels);
         return (W) this;
     }

    /**
    * @see TextView#setHintTextColor(ColorStateList)
    */
     public  W setHintTextColor(ColorStateList colors) {
         mView.setHintTextColor(colors);
         return (W) this;
     }

    /**
    * @see TextView#setHintTextColor(int)
    */
     public  W setHintTextColor(int color) {
         mView.setHintTextColor(color);
         return (W) this;
     }

    /**
    * @see TextView#setLinkTextColor(int)
    */
     public  W setLinkTextColor(int color) {
         mView.setLinkTextColor(color);
         return (W) this;
     }

    /**
    * @see TextView#setLinkTextColor(ColorStateList)
    */
     public  W setLinkTextColor(ColorStateList colors) {
         mView.setLinkTextColor(colors);
         return (W) this;
     }

    /**
    * @see TextView#setMaxHeight(int)
    */
     public W setMaxHeight(int maxHeight) {
         mView.setMaxHeight(maxHeight);
         return (W) this;
     }

    /**
    * @see TextView#setHeight(int)
    */
     public W setHeight(int pixels) {
         mView.setHeight(pixels);
         return (W) this;
     }

    /**
    * @see TextView#setLines(int)
    */
     public W setLines(int lines) {
         mView.setLines(lines);
         return (W) this;
     }

    /**
    * @see TextView#setText(int, BufferType)
    */
     public  W setText(int resid, BufferType type) {
         mView.setText(resid, type);
         return (W) this;
     }

    /**
    * @see TextView#setText(CharSequence)
    */
     public  W setText(CharSequence text) {
         mView.setText(text);
         return (W) this;
     }

    /**
    * @see TextView#setText(int)
    */
     public  W setText(int resid) {
         mView.setText(resid);
         return (W) this;
     }

    /**
    * @see TextView#setText(char[], int, int)
    */
     public  W setText(char[] text, int start, int len) {
         mView.setText(text, start, len);
         return (W) this;
     }

    /**
    * @see TextView#setText(CharSequence, BufferType)
    */
     public W setText(CharSequence text, BufferType type) {
         mView.setText(text, type);
         return (W) this;
     }

    /**
    * @see TextView#setHint(CharSequence)
    */
     public  W setHint(CharSequence hint) {
         mView.setHint(hint);
         return (W) this;
     }

    /**
    * @see TextView#setHint(int)
    */
     public  W setHint(int resid) {
         mView.setHint(resid);
         return (W) this;
     }

    /**
    * @see TextView#setLineSpacing(float, float)
    */
     public W setLineSpacing(float add, float mult) {
         mView.setLineSpacing(add, mult);
         return (W) this;
     }

    /**
    * @see TextView#setRawInputType(int)
    */
     public W setRawInputType(int type) {
         mView.setRawInputType(type);
         return (W) this;
     }

    /**
    * @see TextView#setImeOptions(int)
    */
     public W setImeOptions(int imeOptions) {
         mView.setImeOptions(imeOptions);
         return (W) this;
     }

    /**
    * @see TextView#setMaxWidth(int)
    */
     public W setMaxWidth(int maxpixels) {
         mView.setMaxWidth(maxpixels);
         return (W) this;
     }

    /**
    * @see TextView#setInputType(int)
    */
     public W setInputType(int type) {
         mView.setInputType(type);
         return (W) this;
     }

    /**
    * @see TextView#setAutoLinkMask(int)
    */
     public  W setAutoLinkMask(int mask) {
         mView.setAutoLinkMask(mask);
         return (W) this;
     }

    /**
    * @see TextView#setMaxLines(int)
    */
     public W setMaxLines(int maxlines) {
         mView.setMaxLines(maxlines);
         return (W) this;
     }

    /**
    * @see TextView#setTextKeepState(CharSequence)
    */
     public  W setTextKeepState(CharSequence text) {
         mView.setTextKeepState(text);
         return (W) this;
     }

    /**
    * @see TextView#setTextKeepState(CharSequence, BufferType)
    */
     public  W setTextKeepState(CharSequence text, BufferType type) {
         mView.setTextKeepState(text, type);
         return (W) this;
     }

    /**
    * @see TextView#setMinWidth(int)
    */
     public W setMinWidth(int minpixels) {
         mView.setMinWidth(minpixels);
         return (W) this;
     }

    /**
    * @see TextView#setInputExtras(int)
    */
     public W setInputExtras(int xmlResId) {
         try {
             mView.setInputExtras(xmlResId);
         } catch (XmlPullParserException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         return (W) this;
     }

    /**
    * @see TextView#setMinHeight(int)
    */
     public W setMinHeight(int minHeight) {
         mView.setMinHeight(minHeight);
         return (W) this;
     }

    /**
    * @see TextView#setMinEms(int)
    */
     public W setMinEms(int minems) {
         mView.setMinEms(minems);
         return (W) this;
     }

    /**
    * @see TextView#setFreezesText(boolean)
    */
     public W setFreezesText(boolean freezesText) {
         mView.setFreezesText(freezesText);
         return (W) this;
     }

    /**
    * @see TextView#setMinLines(int)
    */
     public W setMinLines(int minlines) {
         mView.setMinLines(minlines);
         return (W) this;
     }

    /**
    * @see TextView#setGravity(int)
    */
     public W setGravity(int gravity) {
         mView.setGravity(gravity);
         return (W) this;
     }

    /**
    * @see TextView#setPaintFlags(int)
    */
     public W setPaintFlags(int flags) {
         mView.setPaintFlags(flags);
         return (W) this;
     }

    /**
    * @see TextView#setTextIsSelectable(boolean)
    */
     public W setTextIsSelectable(boolean selectable) {
         mView.setTextIsSelectable(selectable);
         return (W) this;
     }

    /**
    * @see TextView#setIncludeFontPadding(boolean)
    */
     public W setIncludeFontPadding(boolean includepad) {
         mView.setIncludeFontPadding(includepad);
         return (W) this;
     }

    /**
    * @see TextView#setTextAppearance(Context, int)
    */
     public W setTextAppearance(Context context, int resid) {
         mView.setTextAppearance(context, resid);
         return (W) this;
     }

    /**
    * @see TextView#setLinksClickable(boolean)
    */
     public  W setLinksClickable(boolean whether) {
         mView.setLinksClickable(whether);
         return (W) this;
     }

    /**
    * @see TextView#setEditableFactory(Editable.Factory)
    */
     public  W setEditableFactory(Editable.Factory factory) {
         mView.setEditableFactory(factory);
         return (W) this;
     }

    /**
    * @see TextView#setMovementMethod(MovementMethod)
    */
     public  W setMovementMethod(MovementMethod movement) {
         mView.setMovementMethod(movement);
         return (W) this;
     }

    /**
    * @see TextView#setCompoundDrawablePadding(int)
    */
     public W setCompoundDrawablePadding(int pad) {
         mView.setCompoundDrawablePadding(pad);
         return (W) this;
     }

    /**
    * @see TextView#setHighlightColor(int)
    */
     public W setHighlightColor(int color) {
         mView.setHighlightColor(color);
         return (W) this;
     }

    /**
    * @see TextView#setSpannableFactory(Spannable.Factory)
    */
     public  W setSpannableFactory(Spannable.Factory factory) {
         mView.setSpannableFactory(factory);
         return (W) this;
     }

    /**
    * @see TextView#setOnEditorActionListener(OnEditorActionListener)
    */
     public W setOnEditorActionListener(OnEditorActionListener l) {
         mView.setOnEditorActionListener(l);
         return (W) this;
     }

    /**
    * @see TextView#setTransformationMethod(TransformationMethod)
    */
     public  W setTransformationMethod(TransformationMethod method) {
         mView.setTransformationMethod(method);
         return (W) this;
     }

    /**
    * @see TextView#setImeActionLabel(CharSequence, int)
    */
     public W setImeActionLabel(CharSequence label, int actionId) {
         mView.setImeActionLabel(label, actionId);
         return (W) this;
     }

    /**
    * @see TextView#setHorizontallyScrolling(boolean)
    */
     public W setHorizontallyScrolling(boolean whether) {
         mView.setHorizontallyScrolling(whether);
         return (W) this;
     }

    /**
    * @see TextView#setPrivateImeOptions(String)
    */
     public W setPrivateImeOptions(String type) {
         mView.setPrivateImeOptions(type);
         return (W) this;
     }

    /**
    * @see TextView#setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)
    */
     public W setCompoundDrawables(Drawable left, Drawable top, Drawable right, Drawable bottom) {
         mView.setCompoundDrawables(left, top, right, bottom);
         return (W) this;
     }

    /**
    * @see TextView#addTextChangedListener(TextWatcher)
    */
     public W addTextChangedListener(TextWatcher watcher) {
         mView.addTextChangedListener(watcher);
         return (W) this;
     }

    /**
    * @see TextView#setMarqueeRepeatLimit(int)
    */
     public W setMarqueeRepeatLimit(int marqueeLimit) {
         mView.setMarqueeRepeatLimit(marqueeLimit);
         return (W) this;
     }

    /**
    * @see TextView#clearComposingText()
    */
     public W clearComposingText() {
         mView.clearComposingText();
         return (W) this;
     }

    /**
    * @see TextView#removeTextChangedListener(TextWatcher)
    */
     public W removeTextChangedListener(TextWatcher watcher) {
         mView.removeTextChangedListener(watcher);
         return (W) this;
     }

    /**
    * @see TextView#setSelectAllOnFocus(boolean)
    */
     public W setSelectAllOnFocus(boolean selectAllOnFocus) {
         mView.setSelectAllOnFocus(selectAllOnFocus);
         return (W) this;
     }

    /**
    * @see TextView#setTextScaleX(float)
    */
     public W setTextScaleX(float size) {
         mView.setTextScaleX(size);
         return (W) this;
     }

    /**
    * @see TextView#setTextColor(ColorStateList)
    */
     public W setTextColor(ColorStateList colors) {
         mView.setTextColor(colors);
         return (W) this;
     }

    /**
    * @see TextView#setTextColor(int)
    */
     public W setTextColor(int color) {
         mView.setTextColor(color);
         return (W) this;
     }

    /**
    * @see TextView#setTypeface(Typeface)
    */
     public W setTypeface(Typeface tf) {
         mView.setTypeface(tf);
         return (W) this;
     }

    /**
    * @see TextView#setTypeface(Typeface, int)
    */
     public W setTypeface(Typeface tf, int style) {
         mView.setTypeface(tf, style);
         return (W) this;
     }

    /**
    * @see TextView#setKeyListener(KeyListener)
    */
     public W setKeyListener(KeyListener input) {
         mView.setKeyListener(input);
         return (W) this;
     }

    /**
    * @see TextView#setTextSize(int, float)
    */
     public W setTextSize(int unit, float size) {
         mView.setTextSize(unit, size);
         return (W) this;
     }

    /**
    * @see TextView#setTextSize(float)
    */
     public W setTextSize(float size) {
         mView.setTextSize(size);
         return (W) this;
     }

    /**
    * @see TextView#setCustomSelectionActionModeCallback(Callback)
    */
     public W setCustomSelectionActionModeCallback(Callback actionModeCallback) {
         mView.setCustomSelectionActionModeCallback(actionModeCallback);
         return (W) this;
     }

    /**
    * @see TextView#setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)
    */
     public W setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {
         mView.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
         return (W) this;
     }

    /**
    * @see TextView#setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)
    */
     public W setCompoundDrawablesWithIntrinsicBounds(int left, int top, int right, int bottom) {
         mView.setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
         return (W) this;
     }

}