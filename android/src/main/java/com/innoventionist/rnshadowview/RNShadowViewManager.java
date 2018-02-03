package com.innoventionist.rnshadowview;

import android.graphics.Color;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.gigamole.library.ShadowLayout;

public class RNShadowViewManager extends ViewGroupManager<ShadowLayout> {

    public static final String REACT_CLASS = "ShadowView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public ShadowLayout createViewInstance(ThemedReactContext context) {
        return new ShadowLayout(context);
    }

    @ReactProp(name = "shadowAngle", defaultInt = 0)
    public void setShadowAngle(ShadowLayout view, int shadowAngle) {
        view.setShadowAngle(shadowAngle);
    }

    @ReactProp(name = "shadowRadius", defaultInt = 0)
    public void setShadowRadius(ShadowLayout view, int shadowRadius) {
        view.setShadowRadius(shadowRadius);
    }

    @ReactProp(name = "shadowDistance", defaultInt = 0)
    public void setShadowDistance(ShadowLayout view, int shadowDistance) {
        view.setShadowDistance(shadowDistance);
    }

    @ReactProp(name = "shadowColor")
    public void setShadowColor(ShadowLayout view, String shadowColor) {
        if(shadowColor.equals("")){
            shadowColor = "black";
        }
        view.setShadowColor(Color.parseColor(shadowColor));
    }
}