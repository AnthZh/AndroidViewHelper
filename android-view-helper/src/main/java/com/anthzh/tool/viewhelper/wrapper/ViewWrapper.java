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

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnDragListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnGenericMotionListener;
import android.view.View.OnHoverListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Animation;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class ViewWrapper
<W extends ViewWrapper
<W>> {
    protected View mView;

    public ViewWrapper(View view) {
        mView = view;
    }

    /**
    * @see View#removeOnAttachStateChangeListener(OnAttachStateChangeListener)
    */
     public W removeOnAttachStateChangeListener(OnAttachStateChangeListener listener) {
         mView.removeOnAttachStateChangeListener(listener);
         return (W)this;
     }

    /**
    * @see View#setOnSystemUiVisibilityChangeListener(OnSystemUiVisibilityChangeListener)
    */
     public W setOnSystemUiVisibilityChangeListener(OnSystemUiVisibilityChangeListener l) {
         mView.setOnSystemUiVisibilityChangeListener(l);
         return (W)this;
     }

    /**
    * @see View#dispatchSystemUiVisibilityChanged(int)
    */
     public W dispatchSystemUiVisibilityChanged(int visibility) {
         mView.dispatchSystemUiVisibilityChanged(visibility);
         return (W)this;
     }

    /**
    * @see View#sendAccessibilityEvent(int)
    */
     public W sendAccessibilityEvent(int eventType) {
         mView.sendAccessibilityEvent(eventType);
         return (W)this;
     }

    /**
    * @see View#setScrollContainer(boolean)
    */
     public W setScrollContainer(boolean isScrollContainer) {
         mView.setScrollContainer(isScrollContainer);
         return (W)this;
     }

    /**
    * @see View#setOnHoverListener(OnHoverListener)
    */
     public W setOnHoverListener(OnHoverListener l) {
         mView.setOnHoverListener(l);
         return (W)this;
     }

    /**
    * @see View#setContentDescription(CharSequence)
    */
     public W setContentDescription(CharSequence contentDescription) {
         mView.setContentDescription(contentDescription);
         return (W)this;
     }

    /**
    * @see View#setNextFocusRightId(int)
    */
     public W setNextFocusRightId(int nextFocusRightId) {
         mView.setNextFocusRightId(nextFocusRightId);
         return (W)this;
     }

    /**
    * @see View#sendAccessibilityEventUnchecked(AccessibilityEvent)
    */
     public W sendAccessibilityEventUnchecked(AccessibilityEvent event) {
         mView.sendAccessibilityEventUnchecked(event);
         return (W)this;
     }

    /**
    * @see View#setFocusableInTouchMode(boolean)
    */
     public W setFocusableInTouchMode(boolean focusableInTouchMode) {
         mView.setFocusableInTouchMode(focusableInTouchMode);
         return (W)this;
     }

    /**
    * @see View#setWillNotCacheDrawing(boolean)
    */
     public W setWillNotCacheDrawing(boolean willNotCacheDrawing) {
         mView.setWillNotCacheDrawing(willNotCacheDrawing);
         return (W)this;
     }

    /**
    * @see View#setFilterTouchesWhenObscured(boolean)
    */
     public W setFilterTouchesWhenObscured(boolean enabled) {
         mView.setFilterTouchesWhenObscured(enabled);
         return (W)this;
     }

    /**
    * @see View#setSaveFromParentEnabled(boolean)
    */
     public W setSaveFromParentEnabled(boolean enabled) {
         mView.setSaveFromParentEnabled(enabled);
         return (W)this;
     }

    /**
    * @see View#findViewsWithText(ArrayList, CharSequence, int)
    */
     public W findViewsWithText(ArrayList outViews, CharSequence searched, int flags) {
         mView.findViewsWithText(outViews, searched, flags);
         return (W)this;
     }

    /**
    * @see View#setFitsSystemWindows(boolean)
    */
     public W setFitsSystemWindows(boolean fitSystemWindows) {
         mView.setFitsSystemWindows(fitSystemWindows);
         return (W)this;
     }

    /**
    * @see View#setNextFocusForwardId(int)
    */
     public W setNextFocusForwardId(int nextFocusForwardId) {
         mView.setNextFocusForwardId(nextFocusForwardId);
         return (W)this;
     }

    /**
    * @see View#setOnDragListener(OnDragListener)
    */
     public W setOnDragListener(OnDragListener l) {
         mView.setOnDragListener(l);
         return (W)this;
     }

    /**
    * @see View#setAccessibilityDelegate(AccessibilityDelegate)
    */
     public W setAccessibilityDelegate(AccessibilityDelegate delegate) {
         mView.setAccessibilityDelegate(delegate);
         return (W)this;
     }

    /**
    * @see View#setDrawingCacheQuality(int)
    */
     public W setDrawingCacheQuality(int quality) {
         mView.setDrawingCacheQuality(quality);
         return (W)this;
     }

    /**
    * @see View#setNextFocusLeftId(int)
    */
     public W setNextFocusLeftId(int nextFocusLeftId) {
         mView.setNextFocusLeftId(nextFocusLeftId);
         return (W)this;
     }

    /**
    * @see View#setNextFocusDownId(int)
    */
     public W setNextFocusDownId(int nextFocusDownId) {
         mView.setNextFocusDownId(nextFocusDownId);
         return (W)this;
     }

    /**
    * @see View#setSoundEffectsEnabled(boolean)
    */
     public W setSoundEffectsEnabled(boolean soundEffectsEnabled) {
         mView.setSoundEffectsEnabled(soundEffectsEnabled);
         return (W)this;
     }

    /**
    * @see View#setHapticFeedbackEnabled(boolean)
    */
     public W setHapticFeedbackEnabled(boolean hapticFeedbackEnabled) {
         mView.setHapticFeedbackEnabled(hapticFeedbackEnabled);
         return (W)this;
     }

    /**
    * @see View#dispatchWindowFocusChanged(boolean)
    */
     public W dispatchWindowFocusChanged(boolean hasFocus) {
         mView.dispatchWindowFocusChanged(hasFocus);
         return (W)this;
     }

    /**
    * @see View#dispatchDisplayHint(int)
    */
     public W dispatchDisplayHint(int hint) {
         mView.dispatchDisplayHint(hint);
         return (W)this;
     }

    /**
    * @see View#addOnAttachStateChangeListener(OnAttachStateChangeListener)
    */
     public W addOnAttachStateChangeListener(OnAttachStateChangeListener listener) {
         mView.addOnAttachStateChangeListener(listener);
         return (W)this;
     }

    /**
    * @see View#setFadingEdgeLength(int)
    */
     public W setFadingEdgeLength(int length) {
         mView.setFadingEdgeLength(length);
         return (W)this;
     }

    /**
    * @see View#setOnTouchListener(OnTouchListener)
    */
     public W setOnTouchListener(OnTouchListener l) {
         mView.setOnTouchListener(l);
         return (W)this;
     }

    /**
    * @see View#setOnGenericMotionListener(OnGenericMotionListener)
    */
     public W setOnGenericMotionListener(OnGenericMotionListener l) {
         mView.setOnGenericMotionListener(l);
         return (W)this;
     }

    /**
    * @see View#setOnFocusChangeListener(OnFocusChangeListener)
    */
     public W setOnFocusChangeListener(OnFocusChangeListener l) {
         mView.setOnFocusChangeListener(l);
         return (W)this;
     }

    /**
    * @see View#addOnLayoutChangeListener(OnLayoutChangeListener)
    */
     public W addOnLayoutChangeListener(OnLayoutChangeListener listener) {
         mView.addOnLayoutChangeListener(listener);
         return (W)this;
     }

    /**
    * @see View#removeOnLayoutChangeListener(OnLayoutChangeListener)
    */
     public W removeOnLayoutChangeListener(OnLayoutChangeListener listener) {
         mView.removeOnLayoutChangeListener(listener);
         return (W)this;
     }

    /**
    * @see View#setVerticalScrollbarPosition(int)
    */
     public W setVerticalScrollbarPosition(int position) {
         mView.setVerticalScrollbarPosition(position);
         return (W)this;
     }

    /**
    * @see View#setOnClickListener(OnClickListener)
    */
     public W setOnClickListener(OnClickListener l) {
         mView.setOnClickListener(l);
         return (W)this;
     }

    /**
    * @see View#setOnLongClickListener(OnLongClickListener)
    */
     public W setOnLongClickListener(OnLongClickListener l) {
         mView.setOnLongClickListener(l);
         return (W)this;
     }

    /**
    * @see View#setOnCreateContextMenuListener(OnCreateContextMenuListener)
    */
     public W setOnCreateContextMenuListener(OnCreateContextMenuListener l) {
         mView.setOnCreateContextMenuListener(l);
         return (W)this;
     }

    /**
    * @see View#clearFocus()
    */
     public W clearFocus() {
         mView.clearFocus();
         return (W)this;
     }

    /**
    * @see View#setOnKeyListener(OnKeyListener)
    */
     public W setOnKeyListener(OnKeyListener l) {
         mView.setOnKeyListener(l);
         return (W)this;
     }

    /**
    * @see View#setSaveEnabled(boolean)
    */
     public W setSaveEnabled(boolean enabled) {
         mView.setSaveEnabled(enabled);
         return (W)this;
     }

    /**
    * @see View#addFocusables(ArrayList, int)
    */
     public W addFocusables(ArrayList views, int direction) {
         mView.addFocusables(views, direction);
         return (W)this;
     }

    /**
    * @see View#addFocusables(ArrayList, int, int)
    */
     public W addFocusables(ArrayList views, int direction, int focusableMode) {
         mView.addFocusables(views, direction, focusableMode);
         return (W)this;
     }

    /**
    * @see View#setLongClickable(boolean)
    */
     public W setLongClickable(boolean longClickable) {
         mView.setLongClickable(longClickable);
         return (W)this;
     }

    /**
    * @see View#setKeepScreenOn(boolean)
    */
     public W setKeepScreenOn(boolean keepScreenOn) {
         mView.setKeepScreenOn(keepScreenOn);
         return (W)this;
     }

    /**
    * @see View#setPressed(boolean)
    */
     public W setPressed(boolean pressed) {
         mView.setPressed(pressed);
         return (W)this;
     }

    /**
    * @see View#addTouchables(ArrayList)
    */
     public W addTouchables(ArrayList views) {
         mView.addTouchables(views);
         return (W)this;
     }

    /**
    * @see View#setNextFocusUpId(int)
    */
     public W setNextFocusUpId(int nextFocusUpId) {
         mView.setNextFocusUpId(nextFocusUpId);
         return (W)this;
     }

    /**
    * @see View#setWillNotDraw(boolean)
    */
     public W setWillNotDraw(boolean willNotDraw) {
         mView.setWillNotDraw(willNotDraw);
         return (W)this;
     }

    /**
    * @see View#setEnabled(boolean)
    */
     public W setEnabled(boolean enabled) {
         mView.setEnabled(enabled);
         return (W)this;
     }

    /**
    * @see View#setFocusable(boolean)
    */
     public W setFocusable(boolean focusable) {
         mView.setFocusable(focusable);
         return (W)this;
     }

    /**
    * @see View#setClickable(boolean)
    */
     public W setClickable(boolean clickable) {
         mView.setClickable(clickable);
         return (W)this;
     }

    /**
    * @see View#setVisibility(int)
    */
     public W setVisibility(int visibility) {
         mView.setVisibility(visibility);
         return (W)this;
     }

    /**
    * @see View#setHorizontalFadingEdgeEnabled(boolean)
    */
     public W setHorizontalFadingEdgeEnabled(boolean horizontalFadingEdgeEnabled) {
         mView.setHorizontalFadingEdgeEnabled(horizontalFadingEdgeEnabled);
         return (W)this;
     }

    /**
    * @see View#setVerticalFadingEdgeEnabled(boolean)
    */
     public W setVerticalFadingEdgeEnabled(boolean verticalFadingEdgeEnabled) {
         mView.setVerticalFadingEdgeEnabled(verticalFadingEdgeEnabled);
         return (W)this;
     }

    /**
    * @see View#createContextMenu(ContextMenu)
    */
     public W createContextMenu(ContextMenu menu) {
         mView.createContextMenu(menu);
         return (W)this;
     }

    /**
    * @see View#offsetTopAndBottom(int)
    */
     public W offsetTopAndBottom(int offset) {
         mView.offsetTopAndBottom(offset);
         return (W)this;
     }

    /**
    * @see View#setCameraDistance(float)
    */
     public W setCameraDistance(float distance) {
         mView.setCameraDistance(distance);
         return (W)this;
     }

    /**
    * @see View#setVerticalScrollBarEnabled(boolean)
    */
     public W setVerticalScrollBarEnabled(boolean verticalScrollBarEnabled) {
         mView.setVerticalScrollBarEnabled(verticalScrollBarEnabled);
         return (W)this;
     }

    /**
    * @see View#dispatchConfigurationChanged(Configuration)
    */
     public W dispatchConfigurationChanged(Configuration newConfig) {
         mView.dispatchConfigurationChanged(newConfig);
         return (W)this;
     }

    /**
    * @see View#setScrollbarFadingEnabled(boolean)
    */
     public W setScrollbarFadingEnabled(boolean fadeScrollbars) {
         mView.setScrollbarFadingEnabled(fadeScrollbars);
         return (W)this;
     }

    /**
    * @see View#setScrollBarStyle(int)
    */
     public W setScrollBarStyle(int style) {
         mView.setScrollBarStyle(style);
         return (W)this;
     }

    /**
    * @see View#dispatchWindowVisibilityChanged(int)
    */
     public W dispatchWindowVisibilityChanged(int visibility) {
         mView.dispatchWindowVisibilityChanged(visibility);
         return (W)this;
     }

    /**
    * @see View#postInvalidateDelayed(long)
    */
     public W postInvalidateDelayed(long delayMilliseconds) {
         mView.postInvalidateDelayed(delayMilliseconds);
         return (W)this;
     }

    /**
    * @see View#postInvalidateDelayed(long, int, int, int, int)
    */
     public W postInvalidateDelayed(long delayMilliseconds, int left, int top, int right, int bottom) {
         mView.postInvalidateDelayed(delayMilliseconds, left, top, right, bottom);
         return (W)this;
     }

    /**
    * @see View#setHorizontalScrollBarEnabled(boolean)
    */
     public W setHorizontalScrollBarEnabled(boolean horizontalScrollBarEnabled) {
         mView.setHorizontalScrollBarEnabled(horizontalScrollBarEnabled);
         return (W)this;
     }

    /**
    * @see View#offsetLeftAndRight(int)
    */
     public W offsetLeftAndRight(int offset) {
         mView.offsetLeftAndRight(offset);
         return (W)this;
     }

    /**
    * @see View#saveHierarchyState(SparseArray)
    */
     public W saveHierarchyState(SparseArray container) {
         mView.saveHierarchyState(container);
         return (W)this;
     }

    /**
    * @see View#restoreHierarchyState(SparseArray)
    */
     public W restoreHierarchyState(SparseArray container) {
         mView.restoreHierarchyState(container);
         return (W)this;
     }

    /**
    * @see View#setTop(int)
    */
     public  W setTop(int top) {
         mView.setTop(top);
         return (W)this;
     }

    /**
    * @see View#setScrollY(int)
    */
     public W setScrollY(int value) {
         mView.setScrollY(value);
         return (W)this;
     }

    /**
    * @see View#setScaleX(float)
    */
     public W setScaleX(float scaleX) {
         mView.setScaleX(scaleX);
         return (W)this;
     }

    /**
    * @see View#setTouchDelegate(TouchDelegate)
    */
     public W setTouchDelegate(TouchDelegate delegate) {
         mView.setTouchDelegate(delegate);
         return (W)this;
     }

    /**
    * @see View#setHovered(boolean)
    */
     public W setHovered(boolean hovered) {
         mView.setHovered(hovered);
         return (W)this;
     }

    /**
    * @see View#setRotationY(float)
    */
     public W setRotationY(float rotationY) {
         mView.setRotationY(rotationY);
         return (W)this;
     }

    /**
    * @see View#setAlpha(float)
    */
     public W setAlpha(float alpha) {
         mView.setAlpha(alpha);
         return (W)this;
     }

    /**
    * @see View#setRotation(float)
    */
     public W setRotation(float rotation) {
         mView.setRotation(rotation);
         return (W)this;
     }

    /**
    * @see View#setRotationX(float)
    */
     public W setRotationX(float rotationX) {
         mView.setRotationX(rotationX);
         return (W)this;
     }

    /**
    * @see View#bringToFront()
    */
     public W bringToFront() {
         mView.bringToFront();
         return (W)this;
     }

    /**
    * @see View#setScaleY(float)
    */
     public W setScaleY(float scaleY) {
         mView.setScaleY(scaleY);
         return (W)this;
     }

    /**
    * @see View#setScrollX(int)
    */
     public W setScrollX(int value) {
         mView.setScrollX(value);
         return (W)this;
     }

    /**
    * @see View#setPivotX(float)
    */
     public W setPivotX(float pivotX) {
         mView.setPivotX(pivotX);
         return (W)this;
     }

    /**
    * @see View#cancelLongPress()
    */
     public W cancelLongPress() {
         mView.cancelLongPress();
         return (W)this;
     }

    /**
    * @see View#setPivotY(float)
    */
     public W setPivotY(float pivotY) {
         mView.setPivotY(pivotY);
         return (W)this;
     }

    /**
    * @see View#layout(int, int, int, int)
    */
     public W layout(int l, int t, int r, int b) {
         mView.layout(l, t, r, b);
         return (W)this;
     }

    /**
    * @see View#setBottom(int)
    */
     public  W setBottom(int bottom) {
         mView.setBottom(bottom);
         return (W)this;
     }

    /**
    * @see View#scrollBy(int, int)
    */
     public W scrollBy(int x, int y) {
         mView.scrollBy(x, y);
         return (W)this;
     }

    /**
    * @see View#setX(float)
    */
     public W setX(float x) {
         mView.setX(x);
         return (W)this;
     }

    /**
    * @see View#setTranslationX(float)
    */
     public W setTranslationX(float translationX) {
         mView.setTranslationX(translationX);
         return (W)this;
     }

    /**
    * @see View#scrollTo(int, int)
    */
     public W scrollTo(int x, int y) {
         mView.scrollTo(x, y);
         return (W)this;
     }

    /**
    * @see View#setLeft(int)
    */
     public  W setLeft(int left) {
         mView.setLeft(left);
         return (W)this;
     }

    /**
    * @see View#postInvalidate()
    */
     public W postInvalidate() {
         mView.postInvalidate();
         return (W)this;
     }

    /**
    * @see View#postInvalidate(int, int, int, int)
    */
     public W postInvalidate(int left, int top, int right, int bottom) {
         mView.postInvalidate(left, top, right, bottom);
         return (W)this;
     }

    /**
    * @see View#computeScroll()
    */
     public W computeScroll() {
         mView.computeScroll();
         return (W)this;
     }

    /**
    * @see View#setTranslationY(float)
    */
     public W setTranslationY(float translationY) {
         mView.setTranslationY(translationY);
         return (W)this;
     }

    /**
    * @see View#setLayoutParams(LayoutParams)
    */
     public W setLayoutParams(LayoutParams params) {
         mView.setLayoutParams(params);
         return (W)this;
     }

    /**
    * @see View#buildLayer()
    */
     public W buildLayer() {
         mView.buildLayer();
         return (W)this;
     }

    /**
    * @see View#invalidate(int, int, int, int)
    */
     public W invalidate(int l, int t, int r, int b) {
         mView.invalidate(l, t, r, b);
         return (W)this;
     }

    /**
    * @see View#invalidate()
    */
     public W invalidate() {
         mView.invalidate();
         return (W)this;
     }

    /**
    * @see View#invalidate(Rect)
    */
     public W invalidate(Rect dirty) {
         mView.invalidate(dirty);
         return (W)this;
     }

    /**
    * @see View#draw(Canvas)
    */
     public W draw(Canvas canvas) {
         mView.draw(canvas);
         return (W)this;
     }

    /**
    * @see View#setRight(int)
    */
     public  W setRight(int right) {
         mView.setRight(right);
         return (W)this;
     }

    /**
    * @see View#setY(float)
    */
     public W setY(float y) {
         mView.setY(y);
         return (W)this;
     }

    /**
    * @see View#setLayerType(int, Paint)
    */
     public W setLayerType(int layerType, Paint paint) {
         mView.setLayerType(layerType, paint);
         return (W)this;
     }

    /**
    * @see View#setDuplicateParentStateEnabled(boolean)
    */
     public W setDuplicateParentStateEnabled(boolean enabled) {
         mView.setDuplicateParentStateEnabled(enabled);
         return (W)this;
     }

    /**
    * @see View#setBackgroundDrawable(Drawable)
    */
     public W setBackgroundDrawable(Drawable d) {
         mView.setBackgroundDrawable(d);
         return (W)this;
     }

    /**
    * @see View#setDrawingCacheBackgroundColor(int)
    */
     public W setDrawingCacheBackgroundColor(int color) {
         mView.setDrawingCacheBackgroundColor(color);
         return (W)this;
     }

    /**
    * @see View#buildDrawingCache()
    */
     public W buildDrawingCache() {
         mView.buildDrawingCache();
         return (W)this;
     }

    /**
    * @see View#buildDrawingCache(boolean)
    */
     public W buildDrawingCache(boolean autoScale) {
         mView.buildDrawingCache(autoScale);
         return (W)this;
     }

    /**
    * @see View#destroyDrawingCache()
    */
     public W destroyDrawingCache() {
         mView.destroyDrawingCache();
         return (W)this;
     }

    /**
    * @see View#refreshDrawableState()
    */
     public W refreshDrawableState() {
         mView.refreshDrawableState();
         return (W)this;
     }

    /**
    * @see View#setSystemUiVisibility(int)
    */
     public W setSystemUiVisibility(int visibility) {
         mView.setSystemUiVisibility(visibility);
         return (W)this;
     }

    /**
    * @see View#unscheduleDrawable(Drawable, Runnable)
    */
     public W unscheduleDrawable(Drawable who, Runnable what) {
         mView.unscheduleDrawable(who, what);
         return (W)this;
     }

    /**
    * @see View#unscheduleDrawable(Drawable)
    */
     public W unscheduleDrawable(Drawable who) {
         mView.unscheduleDrawable(who);
         return (W)this;
     }

    /**
    * @see View#jumpDrawablesToCurrentState()
    */
     public W jumpDrawablesToCurrentState() {
         mView.jumpDrawablesToCurrentState();
         return (W)this;
     }

    /**
    * @see View#setOverScrollMode(int)
    */
     public W setOverScrollMode(int overScrollMode) {
         mView.setOverScrollMode(overScrollMode);
         return (W)this;
     }

    /**
    * @see View#setBackgroundColor(int)
    */
     public W setBackgroundColor(int color) {
         mView.setBackgroundColor(color);
         return (W)this;
     }

    /**
    * @see View#setBackgroundResource(int)
    */
     public W setBackgroundResource(int resid) {
         mView.setBackgroundResource(resid);
         return (W)this;
     }

    /**
    * @see View#invalidateDrawable(Drawable)
    */
     public W invalidateDrawable(Drawable drawable) {
         mView.invalidateDrawable(drawable);
         return (W)this;
     }

    /**
    * @see View#setDrawingCacheEnabled(boolean)
    */
     public W setDrawingCacheEnabled(boolean enabled) {
         mView.setDrawingCacheEnabled(enabled);
         return (W)this;
     }

    /**
    * @see View#playSoundEffect(int)
    */
     public W playSoundEffect(int soundConstant) {
         mView.playSoundEffect(soundConstant);
         return (W)this;
     }

    /**
    * @see View#setMinimumHeight(int)
    */
     public W setMinimumHeight(int minHeight) {
         mView.setMinimumHeight(minHeight);
         return (W)this;
     }

    /**
    * @see View#setPadding(int, int, int, int)
    */
     public W setPadding(int left, int top, int right, int bottom) {
         mView.setPadding(left, top, right, bottom);
         return (W)this;
     }

    /**
    * @see View#scheduleDrawable(Drawable, Runnable, long)
    */
     public W scheduleDrawable(Drawable who, Runnable what, long when) {
         mView.scheduleDrawable(who, what, when);
         return (W)this;
     }

    /**
    * @see View#forceLayout()
    */
     public W forceLayout() {
         mView.forceLayout();
         return (W)this;
     }

    /**
    * @see View#setSelected(boolean)
    */
     public W setSelected(boolean selected) {
         mView.setSelected(selected);
         return (W)this;
     }

    /**
    * @see View#requestLayout()
    */
     public W requestLayout() {
         mView.requestLayout();
         return (W)this;
     }

    /**
    * @see View#setTag(int, Object)
    */
     public W setTag(int key, Object tag) {
         mView.setTag(key, tag);
         return (W)this;
     }

    /**
    * @see View#setTag(Object)
    */
     public W setTag(Object tag) {
         mView.setTag(tag);
         return (W)this;
     }

    /**
    * @see View#measure(int, int)
    */
     public  W measure(int widthMeasureSpec, int heightMeasureSpec) {
         mView.measure(widthMeasureSpec, heightMeasureSpec);
         return (W)this;
     }

    /**
    * @see View#setActivated(boolean)
    */
     public W setActivated(boolean activated) {
         mView.setActivated(activated);
         return (W)this;
     }

    /**
    * @see View#setMinimumWidth(int)
    */
     public W setMinimumWidth(int minWidth) {
         mView.setMinimumWidth(minWidth);
         return (W)this;
     }

    /**
    * @see View#startAnimation(Animation)
    */
     public W startAnimation(Animation animation) {
         mView.startAnimation(animation);
         return (W)this;
     }

    /**
    * @see View#setId(int)
    */
     public W setId(int id) {
         mView.setId(id);
         return (W)this;
     }

    /**
    * @see View#clearAnimation()
    */
     public W clearAnimation() {
         mView.clearAnimation();
         return (W)this;
     }

    /**
    * @see View#setAnimation(Animation)
    */
     public W setAnimation(Animation animation) {
         mView.setAnimation(animation);
         return (W)this;
     }

}